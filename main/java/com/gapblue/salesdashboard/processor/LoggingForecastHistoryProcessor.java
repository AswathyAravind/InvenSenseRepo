package com.gapblue.salesdashboard.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.gapblue.web.stubs.salescustomobject.ForecastHistoryC;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 *
 */
public class LoggingForecastHistoryProcessor implements ItemProcessor<ForecastHistoryC, ForecastHistoryC> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingForecastHistoryProcessor.class);

    @Override
    public ForecastHistoryC process(ForecastHistoryC item) throws Exception {
        LOGGER.info("Processing ForecastHistoryC information: {}", item.getRecordName());
        return item;
    }
}
