package com.gapblue.salesdashboard.db;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.gapblue.web.stubs.opportunity.Revenue;

/**
 * This class is used to set the actual parameter values of a
 * prepared statement.
 */
public final class RevenuePreparedStatementSetter implements ItemPreparedStatementSetter<Revenue> {
	private static final Logger LOGGER = LoggerFactory.getLogger(RevenuePreparedStatementSetter.class);
	
  
	@Override
	public void setValues(Revenue item, PreparedStatement ps) throws SQLException {
		LOGGER.debug("Start of revenue mapping for : " + item.getRevnId() + " :: for opportunity " + item.getOptyId());
		try {
			ps.setString(1, item.getRevnId().toString());
			if (item.getBUOrgId() != null) {
				ps.setString(2, item.getBUOrgId().toString());
			} else {
				ps.setString(2, null);
			}
			if (item.getCostAmount() != null && item.getCostAmount().getValue() != null) {
				ps.setString(3, item.getCostAmount().getValue().getValue().toString());
			} else {
				ps.setString(3, null);
			}
			if (item.getDownsideAmount() != null && item.getDownsideAmount().getValue() != null) {
				ps.setString(4, item.getDownsideAmount().getValue().getValue().toString());
			} else {
				ps.setString(4, null);
			}
			if (item.getExpectAmount() != null && item.getExpectAmount().getValue() != null) {
				ps.setString(5, item.getExpectAmount().getValue().getValue().toString());
			} else {
				ps.setString(5, null);
			}
			if (item.getMarginAmount() != null && item.getMarginAmount().getValue() != null) {
				ps.setString(6, item.getMarginAmount().getValue().getValue().toString());
			} else {
				ps.setString(6, null);
			}
			if (item.getOptyId() != null) {
				ps.setString(7, item.getOptyId().getValue().toString());
			} else {
				ps.setString(7, null);
			}
			if (item.getUnitPrice() != null && item.getUnitPrice().getValue() != null) {
				ps.setString(8, item.getUnitPrice().getValue().getValue().toString());
			} else {
				ps.setString(8, null);
			}
			if (item.getQuantity() != null && item.getQuantity().getValue() != null) {
				ps.setString(9, item.getQuantity().getValue().getValue().toString());
			} else {
				ps.setString(9, null);
			}
			if (item.getRevnAmount() != null && item.getRevnAmount().getValue() != null) {
				ps.setString(10, item.getRevnAmount().getValue().getValue().toString());
			} else {
				ps.setString(10, null);
			}
			if (item.getRevnAmountCurcyCode() != null) {
				ps.setString(11, item.getRevnAmountCurcyCode());
			} else {
				ps.setString(11, null);
			}
			if (item.getUpsideAmount() != null && item.getUpsideAmount().getValue() != null) {
				ps.setString(12, item.getUpsideAmount().getValue().getValue().toString());
			} else {
				ps.setString(12, null);
			}
			ps.setString(13, item.getPartyName());
			ps.setString(14, item.getDescription());
			ps.setString(15, item.getName());
			ps.setString(16, item.getRevnNumber());

			if (item.getStatusCode() != null) {
				ps.setString(17, item.getStatusCode().getValue());
			} else {
				ps.setString(17, null);
			}
			if (item.getEffectiveDate() != null && item.getEffectiveDate().getValue() != null) {
				ps.setString(18, item.getEffectiveDate().getValue().toString());
				GregorianCalendar cal = new GregorianCalendar();
				XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
				java.util.Date date = xmlCalendar.toGregorianCalendar().getTime();
				LOGGER.debug("Date in Opps : "+date);
				java.sql.Date sqlDt = new java.sql.Date(date.getTime());
				ps.setDate(18,sqlDt);
			} else {
				ps.setString(18, null);
			}
			if (item.getActualCloseDate() != null && item.getActualCloseDate().getValue() != null) {
				ps.setString(19, item.getActualCloseDate().getValue().toString());
			} else {
				ps.setString(19, null);
			}
			if (item.getAttachmentEntityName() != null) {
				ps.setString(20, item.getAttachmentEntityName().getValue());
			}
			ps.setString(21, item.getItemNumber());
			ps.setString(22, item.getItemNumberInternal());
			ps.setString(23, item.getOptyNumber());
			if (item.getProductType() != null) {
				ps.setString(24, item.getProductType().getValue());
			} else {
				ps.setString(24, null);
			}
			if (item.getSalesCreditTypeCode() != null) {
				ps.setString(25, item.getSalesChannelCd().getValue());
			}
			if (item.getRevnLineTypeCode() != null) {
				ps.setString(26, item.getRevnLineTypeCode().getValue());
			}
			if (item.getSalesAccountUniqueName() != null) {
				ps.setString(27, item.getSalesAccountUniqueName().getValue());
			}
			if (item.getBUC() != null) {
				ps.setString(28, item.getBUC().getValue());
			}
			if (item.getASPC() != null) {
				ps.setString(29, item.getASPC().getValue());
			}
			if (item.getAnnualUnitVolumeC() != null && item.getAnnualUnitVolumeC().getValue() != null) {
				ps.setString(30, item.getAnnualUnitVolumeC().getValue().toString());
			} else {
				ps.setString(30, null);
			}
			if (item.getExpectedRevenueC() != null && item.getExpectedRevenueC().getValue() != null
					&& item.getExpectedRevenueC().getValue().getValue().toString() != null) {
				ps.setString(31, item.getExpectedRevenueC().getValue().getValue().toString());
			} else {
				ps.setString(31, null);
			}
			if (item.getBUOwnerNameC() != null) {
				ps.setString(32, item.getBUOwnerNameC().getValue());
			}
			if (item.getOpportunitySalesStageC() != null) {
				ps.setString(33, item.getOpportunitySalesStageC().getValue());
			} else {
				ps.setString(33, null);
			}
			if (item.getASPCustomC() != null) {
				ps.setString(34, item.getASPCustomC().toString());
			} else {
				ps.setString(34, null);
			}
			if (item.getProductIdC() != null && item.getProductIdC().getValue() != null) {
				ps.setString(35, item.getProductIdC().getValue().toString());
			} else {
				ps.setString(35, null);
			}
			if (item.getProductC() != null && item.getProductC().getValue() != null) {
				ps.setString(36, item.getProductC().getValue().toString());
			} else {
				ps.setString(36, null);
			}
			if (item.getPartIdC() != null && item.getPartIdC().getValue() != null) {
				ps.setString(37, item.getPartIdC().getValue().toString());
			} else {
				ps.setString(37, null);
			}
			if (item.getPartC() != null && item.getPartC().getValue() != null) {
				ps.setString(38, item.getPartC().getValue().toString());
			} else {
				ps.setString(38, null);
			}
			LOGGER.debug(
					"Completed revenue mapping for : " + item.getRevnId() + " :: for opportunity " + item.getOptyId());
		} catch (Exception e) {
			LOGGER.error("Mapping failed for " + item.getRevnId());
			e.printStackTrace();
		}

	}
		
	

}
