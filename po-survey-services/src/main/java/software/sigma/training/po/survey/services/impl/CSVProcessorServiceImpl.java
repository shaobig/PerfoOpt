package software.sigma.training.po.survey.services.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import software.sigma.training.po.survey.data.dao.RespondentDao;
import software.sigma.training.po.survey.data.domain.*;
import software.sigma.training.po.survey.data.domain.transformer.EntityTransformer;
import software.sigma.training.po.survey.data.domain.transformer.TotalRespondentTransformer;
import software.sigma.training.po.survey.services.api.CSVProcessorService;
import software.sigma.training.po.survey.services.transform.*;

@Service
public class CSVProcessorServiceImpl implements CSVProcessorService {

    private static final Logger LOG = LoggerFactory.getLogger(CSVProcessorServiceImpl.class);

    private TransformerFactory transformerFactory;
    private EntityTransformer<Respondent> respondentTransformer;

    @Autowired
    private RespondentDao respondentDao;

    @PostConstruct
    public void init() {
        LOG.debug("Initializing CSV parser configuration");
        respondentTransformer = new TotalRespondentTransformer();
    }

    @Override
    public void process(InputStream is) throws IOException {
        LOG.debug("Starting CSV processing");
        CSVParser parser = new CSVParser(new InputStreamReader(is), CSVFormat.DEFAULT.withFirstRecordAsHeader());
        LOG.debug("Header map: " + parser.getHeaderMap());
        try {
            parser.getRecords().forEach(csvRecord -> {
                Map<String, String> map = csvRecord.toMap();
                Respondent respondent = respondentTransformer.transform(map);
                respondentDao.save(respondent);
            });
        } catch (Exception e) {
            LOG.error("Error during transforming data", e);
        }
        parser.close();
        LOG.debug("CSV processed successfully");
    }

}
