package com.gapblue.salesdashboard.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.gapblue.web.stubs.salescustomobject.QuoteLineItemC;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 *
 */
public class LoggingQuotelineProcessor implements ItemProcessor<QuoteLineItemC, QuoteLineItemC> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingQuotelineProcessor.class);

    @Override
    public QuoteLineItemC process(QuoteLineItemC item) throws Exception {
        LOGGER.info("Processing QuoteLineItemC information: {}", item.getRecordName());
        return item;
    }
}
