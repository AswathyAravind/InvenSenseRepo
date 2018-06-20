package com.gapblue.salesdashboard.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.gapblue.web.stubs.salescustomobject.ForecastCustomC;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 *
 */
public class LoggingForecastProcessor implements ItemProcessor<ForecastCustomC, ForecastCustomC> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingForecastProcessor.class);

    @Override
    public ForecastCustomC process(ForecastCustomC item) throws Exception {
        LOGGER.info("Processing ForecastCustomC information: {}", item.getRecordName());
        return item;
    }
}
