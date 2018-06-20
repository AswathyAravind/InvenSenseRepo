package com.gapblue.salesdashboard.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.gapblue.web.stubs.salescustomobject.QuoteLineItemC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class is used to set the actual parameter values of a prepared
 * statement.
 */
public final class QuotePreparedStatementSetter implements ItemPreparedStatementSetter<QuoteLineItemC> {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuotePreparedStatementSetter.class);

	@Override
	public void setValues(QuoteLineItemC quoteLine, PreparedStatement preparedStatement) throws SQLException {
		try {

			if (quoteLine.getEndCustomerC() != null) {
				preparedStatement.setString(1, quoteLine.getEndCustomerC().toString());
			} else {
				preparedStatement.setString(1, null);
			}

			if (quoteLine.getDistributorNameINTGC() != null) {
				preparedStatement.setString(2, quoteLine.getDistributorNameINTGC().getValue());
			} else {
				preparedStatement.setString(2, null);
			}
			if (quoteLine.getQuoteSourceC() != null) {
				preparedStatement.setString(3, quoteLine.getQuoteSourceC().getValue());
			} else {
				preparedStatement.setString(3, null);
			}

			if (quoteLine.getApprovalStatusC() != null) {
				preparedStatement.setString(4, quoteLine.getApprovalStatusC().getValue());
			} else {
				preparedStatement.setString(4, null);
			}
			preparedStatement.setString(5, quoteLine.getPartC());
			if (quoteLine.getProductFamilyC() != null) {
				preparedStatement.setString(6, quoteLine.getProductFamilyC().getValue());
			} else {
				preparedStatement.setString(6, null);
			}
			preparedStatement.setString(7, quoteLine.getMarketSegment1C());
			preparedStatement.setString(8, quoteLine.getMarketSubSegment1C());

			if (quoteLine.getMarketSubSegment1C() != null) {

			} else {
				preparedStatement.setString(8, null);
			}

			if (quoteLine.getBUC() != null) {
				preparedStatement.setString(9, quoteLine.getBUC().getValue());
			} else {
				preparedStatement.setString(9, null);
			}
			preparedStatement.setString(10, quoteLine.getPriceListTypeC());

			if (quoteLine.getInvenSenseRepC() != null) {
				preparedStatement.setString(11, quoteLine.getInvenSenseRepC().getValue());
			} else {
				preparedStatement.setString(11, null);
			}
			if (quoteLine.getAnnualQuantityC() != null && quoteLine.getAnnualQuantityC().getValue() != null) {
				preparedStatement.setString(12, quoteLine.getAnnualQuantityC().getValue().toString());
			} else {
				preparedStatement.setString(12, null);
			}
			if (quoteLine.getMinimumQuarterlyVolumeMQV1C() != null) {
				preparedStatement.setString(13, quoteLine.getMinimumQuarterlyVolumeMQV1C().toString());
			} else {
				preparedStatement.setString(13, null);
			}
			if (quoteLine.getCompetitorNameC() != null) {
				preparedStatement.setString(14, quoteLine.getCompetitorNameC().getValue());
			} else {
				preparedStatement.setString(14, null);
			}
			if (quoteLine.getCompetitorPriceC() != null && quoteLine.getCompetitorPriceC().getValue() != null
					&& quoteLine.getCompetitorPriceC().getValue().getValue() != null) {
				preparedStatement.setString(15, quoteLine.getCompetitorPriceC().getValue().getValue().toString());
			} else {
				preparedStatement.setString(15, null);
			}
			if (quoteLine.getCurrentASP1C() != null) {
				preparedStatement.setString(16, quoteLine.getCurrentASP1C().toString());
			} else {
				preparedStatement.setString(16, null);
			}

			if (quoteLine.getRequestedASP1C() != null) {
				preparedStatement.setString(17, quoteLine.getRequestedASP1C().toString());
			} else {
				preparedStatement.setString(17, null);
			}

			if (quoteLine.getDistiMarginC() != null) {
				preparedStatement.setString(18, quoteLine.getDistiMarginC().toString());
			} else {
				preparedStatement.setString(18, null);
			}
			if (quoteLine.getNetASP1C() != null) {
				preparedStatement.setString(19, quoteLine.getNetASP1C().getValue().toString());
			} else {
				preparedStatement.setString(19, null);
			}

			if (quoteLine.getPriceStartDateC() != null) {
				preparedStatement.setString(20, quoteLine.getPriceStartDateC().toString());
			} else {
				preparedStatement.setString(20, null);
			}
			if (quoteLine.getPriceEndDateC() != null) {
				preparedStatement.setString(21, quoteLine.getPriceEndDateC().toString());
			} else {
				preparedStatement.setString(21, null);
			}
			if (quoteLine.getOverrideQuoteLineStartDateC() != null
					&& quoteLine.getOverrideQuoteLineStartDateC().getValue() != null) {
				preparedStatement.setString(22, quoteLine.getOverrideQuoteLineStartDateC().getValue().toString());
			} else {
				preparedStatement.setString(22, null);
			}
			if (quoteLine.getOverrideQuoteLineEndDateC() != null
					&& quoteLine.getOverrideQuoteLineEndDateC().getValue() != null) {
				preparedStatement.setString(23, quoteLine.getOverrideQuoteLineEndDateC().getValue().toString());
			} else {
				preparedStatement.setString(23, null);
			}
			if (quoteLine.getId() != null) {
				preparedStatement.setString(24, quoteLine.getId().toString());
			} else {
				preparedStatement.setString(24, null);
			}

		} catch (Exception e) {
			LOGGER.debug("Mapping failed for " + quoteLine.getId());
			e.printStackTrace();
		}

	}
}
