package com.gapblue.salesdashboard.processor;


import org.springframework.batch.item.ItemProcessor;

import com.gapblue.web.stubs.accountresource.SalesAccountResource;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 *
 */
public class LoggingAccountResourceProcessor implements ItemProcessor<SalesAccountResource, SalesAccountResource> {

	@Override
	public SalesAccountResource process(SalesAccountResource item) throws Exception {

		return item;
	}
}
