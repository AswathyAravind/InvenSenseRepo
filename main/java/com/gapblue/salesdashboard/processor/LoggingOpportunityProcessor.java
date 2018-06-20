package com.gapblue.salesdashboard.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.gapblue.web.stubs.opportunity.Opportunity;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 *
 */
public class LoggingOpportunityProcessor implements ItemProcessor<Opportunity, Opportunity> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingOpportunityProcessor.class);

    @Override
    public Opportunity process(Opportunity item) throws Exception {
        LOGGER.info("Processing Opportunity information: {}", item.getOptyId());
        return item;
    }
}
