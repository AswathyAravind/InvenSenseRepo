package com.gapblue.salesdashboard.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.gapblue.web.stubs.salescustomobject.ForecastCustomC;

/**
 * This class is used to set the actual parameter values of a prepared
 * statement.
 */
public final class ForecastPreparedStatementSetter implements ItemPreparedStatementSetter<ForecastCustomC> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ForecastPreparedStatementSetter.class);

	@Override
	public void setValues(ForecastCustomC forecastHistoryC, PreparedStatement preparedStatement) throws SQLException {
		try {
			if (forecastHistoryC.getId() != null) {
				preparedStatement.setString(1, forecastHistoryC.getId().toString());
			} else {
				preparedStatement.setString(1, null);
			}
			preparedStatement.setString(2, forecastHistoryC.getRecordName());

			if (forecastHistoryC.getObjectVersionNumber() != null
					&& forecastHistoryC.getObjectVersionNumber().getValue() != null) {
				preparedStatement.setString(3, forecastHistoryC.getObjectVersionNumber().getValue().toString());
			} else {
				preparedStatement.setString(3, null);
			}
			if (forecastHistoryC.getCpdrfVerSor() != null && forecastHistoryC.getCpdrfVerSor().getValue() != null) {
				preparedStatement.setString(4, forecastHistoryC.getCpdrfVerSor().getValue().toString());
			} else {
				preparedStatement.setString(4, null);
			}

			if (forecastHistoryC.getJobDefinitionPackage() != null) {
				preparedStatement.setString(5, forecastHistoryC.getJobDefinitionPackage().getValue());

			} else {
				preparedStatement.setString(5, null);
			}

			if (forecastHistoryC.getRequestId() != null && forecastHistoryC.getRequestId().getValue() != null) {
				preparedStatement.setString(6, forecastHistoryC.getRequestId().getValue().toString());
			} else {
				preparedStatement.setString(6, null);
			}
			if (forecastHistoryC.getJobDefinitionName() != null) {
				preparedStatement.setString(7, forecastHistoryC.getJobDefinitionName().getValue());
			} else {
				preparedStatement.setString(7, null);
			}

			if (forecastHistoryC.getCurrencyCode() != null) {
				preparedStatement.setString(8, forecastHistoryC.getCurrencyCode().getValue());
			} else {
				preparedStatement.setString(8, null);
			}

			if (forecastHistoryC.getCurcyConvRateType() != null) {
				preparedStatement.setString(9, forecastHistoryC.getCurcyConvRateType().getValue());
			} else {
				preparedStatement.setString(9, null);
			}

			if (forecastHistoryC.getCorpCurrencyCode() != null) {
				preparedStatement.setString(10, forecastHistoryC.getCorpCurrencyCode().getValue());
			} else {
				preparedStatement.setString(10, null);
			}

			if (forecastHistoryC.getSourceType() != null) {
				preparedStatement.setString(11, forecastHistoryC.getSourceType().getValue());
			} else {
				preparedStatement.setString(11, null);
			}

			if (forecastHistoryC.getAttachmentEntityName() != null) {
				preparedStatement.setString(12, forecastHistoryC.getAttachmentEntityName().getValue());
			} else {
				preparedStatement.setString(12, null);
			}

			if (forecastHistoryC.getPKProxy() != null) {
				preparedStatement.setString(13, forecastHistoryC.getPKProxy().getValue());
			} else {
				preparedStatement.setString(13, null);
			}

			if (forecastHistoryC.getIsOwner() != null) {
				preparedStatement.setString(14, forecastHistoryC.getIsOwner().getValue());
			} else {
				preparedStatement.setString(14, null);
			}

			if (forecastHistoryC.getRevenueC() != null && forecastHistoryC.getRevenueC().getValue() != null) {
				preparedStatement.setString(15, forecastHistoryC.getRevenueC().getValue().getValue().toString());
			} else {
				preparedStatement.setString(15, null);
			}

			if (forecastHistoryC.getASPC() != null) {
				preparedStatement.setString(16, forecastHistoryC.getASPC().getValue());
			} else {
				preparedStatement.setString(16, null);
			}

			if (forecastHistoryC.getQuantityC() != null && forecastHistoryC.getQuantityC().getValue() != null) {
				preparedStatement.setString(17, forecastHistoryC.getQuantityC().getValue().toString());
			} else {
				preparedStatement.setString(17, null);
			}

			if (forecastHistoryC.getOwnerIdC() != null && forecastHistoryC.getOwnerIdC().getValue() != null) {
				preparedStatement.setString(18, forecastHistoryC.getOwnerIdC().getValue().toString());
			} else {
				preparedStatement.setString(18, null);
			}

			if (forecastHistoryC.getOwnerC() != null && forecastHistoryC.getOwnerC().getValue() != null) {
				preparedStatement.setString(19, forecastHistoryC.getOwnerC().getValue());
			} else {
				preparedStatement.setString(19, null);
			}

			if (forecastHistoryC.getCurcyConvRateType() != null) {
				preparedStatement.setString(20, forecastHistoryC.getCurcyConvRateType().getValue());
			} else {
				preparedStatement.setString(20, null);
			}

			preparedStatement.setString(21, null);

			preparedStatement.setString(22, null);
			preparedStatement.setString(23,null);
			preparedStatement.setString(24, null);

			preparedStatement.setString(25, null);

			if (forecastHistoryC.getForecastTypeC() != null) {
				preparedStatement.setString(26, forecastHistoryC.getForecastTypeC().getValue());
			} else {
				preparedStatement.setString(26, null);
			}

			if (forecastHistoryC.getProgramNameC() != null) {
				preparedStatement.setString(27, forecastHistoryC.getProgramNameC().getValue());
			} else {
				preparedStatement.setString(27, null);
			}

			if (forecastHistoryC.getMarketC() != null) {
				preparedStatement.setString(28, forecastHistoryC.getMarketC().getValue());
			} else {
				preparedStatement.setString(28, null);
			}

			if (forecastHistoryC.getSubMarketC() != null) {
				preparedStatement.setString(29, forecastHistoryC.getSubMarketC().getValue());
			} else {
				preparedStatement.setString(29, null);
			}

			if (forecastHistoryC.getBUC() != null) {
				preparedStatement.setString(30, forecastHistoryC.getBUC().getValue());
			} else {
				preparedStatement.setString(30, null);
			}

			if (forecastHistoryC.getRoleC() != null) {
				preparedStatement.setString(31, forecastHistoryC.getRoleC().getValue());
			} else {
				preparedStatement.setString(31, null);
			}

			if (forecastHistoryC.getParentEndCustomerIdC() != null) {
				preparedStatement.setString(32, forecastHistoryC.getParentEndCustomerIdC().toString());
			} else {
				preparedStatement.setString(32, null);
			}

			preparedStatement.setString(33, forecastHistoryC.getParentEndCustomerC());

			if (forecastHistoryC.getOpportunityIdC() != null
					&& forecastHistoryC.getOpportunityIdC().getValue() != null) {
				preparedStatement.setString(34, forecastHistoryC.getOpportunityIdC().getValue().toString());
			} else {
				preparedStatement.setString(34, null);
			}
			if (forecastHistoryC.getOpportunityC() != null) {
				preparedStatement.setString(35, forecastHistoryC.getOpportunityC().getValue());
			} else {
				preparedStatement.setString(35, null);
			}

			if (forecastHistoryC.getPartIdC() != null && forecastHistoryC.getPartIdC().getValue() != null) {
				preparedStatement.setString(36, forecastHistoryC.getPartIdC().getValue().toString());
			} else {
				preparedStatement.setString(36, null);
			}

			if (forecastHistoryC.getPartC() != null) {
				preparedStatement.setString(37, forecastHistoryC.getPartC().getValue());
			} else {
				preparedStatement.setString(37, null);
			}

			if (forecastHistoryC.getProductCategoryC() != null) {
				preparedStatement.setString(38, forecastHistoryC.getProductCategoryC().getValue());
			} else {
				preparedStatement.setString(38, null);
			}

			if (forecastHistoryC.getYearC() != null) {
				preparedStatement.setString(39, forecastHistoryC.getYearC().getValue());
			} else {
				preparedStatement.setString(39, null);
			}

			if (forecastHistoryC.getASP1C() != null) {
				preparedStatement.setString(40, forecastHistoryC.getASP1C().getValue());
			} else {
				preparedStatement.setString(40, null);
			}

			if (forecastHistoryC.getASP2C() != null) {
				preparedStatement.setString(41, forecastHistoryC.getASP2C().getValue());
			} else {
				preparedStatement.setString(41, null);
			}

			if (forecastHistoryC.getASP3C() != null) {
				preparedStatement.setString(42, forecastHistoryC.getASP3C().getValue());
			} else {
				preparedStatement.setString(42, null);
			}

			if (forecastHistoryC.getASP4C() != null) {
				preparedStatement.setString(43, forecastHistoryC.getASP4C().getValue());
			} else {
				preparedStatement.setString(43, null);
			}

			if (forecastHistoryC.getASP5C() != null) {
				preparedStatement.setString(44, forecastHistoryC.getASP5C().getValue());
			} else {
				preparedStatement.setString(44, null);
			}

			if (forecastHistoryC.getASP6C() != null) {
				preparedStatement.setString(45, forecastHistoryC.getASP6C().getValue());
			} else {
				preparedStatement.setString(45, null);
			}

			if (forecastHistoryC.getASP7C() != null) {
				preparedStatement.setString(46, forecastHistoryC.getASP7C().getValue());
			} else {
				preparedStatement.setString(46, null);
			}

			if (forecastHistoryC.getASP8C() != null) {
				preparedStatement.setString(47, forecastHistoryC.getASP8C().getValue());
			} else {
				preparedStatement.setString(47, null);
			}

			if (forecastHistoryC.getASP9C() != null) {
				preparedStatement.setString(48, forecastHistoryC.getASP9C().getValue());
			} else {
				preparedStatement.setString(48, null);
			}

			if (forecastHistoryC.getASP10C() != null) {
				preparedStatement.setString(49, forecastHistoryC.getASP10C().getValue());
			} else {
				preparedStatement.setString(49, null);
			}

			if (forecastHistoryC.getASP11C() != null) {
				preparedStatement.setString(50, forecastHistoryC.getASP11C().getValue());
			} else {
				preparedStatement.setString(50, null);
			}

			if (forecastHistoryC.getASP12C() != null) {
				preparedStatement.setString(51, forecastHistoryC.getASP12C().getValue());
			} else {
				preparedStatement.setString(51, null);
			}

			if (forecastHistoryC.getQuarterCYC() != null) {
				preparedStatement.setString(52, forecastHistoryC.getQuarterCYC().getValue());
			} else {
				preparedStatement.setString(52, null);
			}

			if (forecastHistoryC.getQuantity1C() != null && forecastHistoryC.getQuantity1C().getValue() != null) {
				preparedStatement.setString(53, forecastHistoryC.getQuantity1C().getValue().toString());
			} else {
				preparedStatement.setString(53, null);
			}

			if (forecastHistoryC.getQuantity2C() != null && forecastHistoryC.getQuantity2C().getValue() != null) {
				preparedStatement.setString(54, forecastHistoryC.getQuantity2C().getValue().toString());
			} else {
				preparedStatement.setString(54, null);
			}

			if (forecastHistoryC.getQuantity3C() != null && forecastHistoryC.getQuantity3C().getValue() != null) {
				preparedStatement.setString(55, forecastHistoryC.getQuantity3C().getValue().toString());
			} else {
				preparedStatement.setString(55, null);
			}

			if (forecastHistoryC.getQuantity4C() != null && forecastHistoryC.getQuantity4C().getValue() != null) {
				preparedStatement.setString(56, forecastHistoryC.getQuantity4C().getValue().toString());
			} else {
				preparedStatement.setString(56, null);
			}

			if (forecastHistoryC.getQuantity5C() != null && forecastHistoryC.getQuantity5C().getValue() != null) {
				preparedStatement.setString(57, forecastHistoryC.getQuantity5C().getValue().toString());
			} else {
				preparedStatement.setString(57, null);
			}
			if (forecastHistoryC.getQuantity6C() != null && forecastHistoryC.getQuantity6C().getValue() != null) {
				preparedStatement.setString(58, forecastHistoryC.getQuantity6C().getValue().toString());
			} else {
				preparedStatement.setString(58, null);
			}

			if (forecastHistoryC.getQuantity7C() != null && forecastHistoryC.getQuantity7C().getValue() != null) {
				preparedStatement.setString(59, forecastHistoryC.getQuantity7C().getValue().toString());
			} else {
				preparedStatement.setString(59, null);
			}

			if (forecastHistoryC.getQuantity8C() != null && forecastHistoryC.getQuantity8C().getValue() != null) {
				preparedStatement.setString(60, forecastHistoryC.getQuantity8C().getValue().toString());
			} else {
				preparedStatement.setString(60, null);
			}

			if (forecastHistoryC.getQuantity9C() != null && forecastHistoryC.getQuantity9C().getValue() != null) {
				preparedStatement.setString(61, forecastHistoryC.getQuantity9C().getValue().toString());
			} else {
				preparedStatement.setString(61, null);
			}
			if (forecastHistoryC.getQuantity10C() != null && forecastHistoryC.getQuantity10C().getValue() != null) {
				preparedStatement.setString(62, forecastHistoryC.getQuantity10C().getValue().toString());
			} else {
				preparedStatement.setString(62, null);
			}
			if (forecastHistoryC.getQuantity11C() != null && forecastHistoryC.getQuantity11C().getValue() != null) {
				preparedStatement.setString(63, forecastHistoryC.getQuantity11C().getValue().toString());
			} else {
				preparedStatement.setString(63, null);
			}
			if (forecastHistoryC.getQuantity12C() != null && forecastHistoryC.getQuantity12C().getValue() != null) {
				preparedStatement.setString(64, forecastHistoryC.getQuantity12C().getValue().toString());
			} else {
				preparedStatement.setString(64, null);
			}
			if (forecastHistoryC.getEndCustomerIdC() != null
					&& forecastHistoryC.getEndCustomerIdC().getValue() != null) {
				preparedStatement.setString(65, forecastHistoryC.getEndCustomerIdC().getValue().toString());
			} else {
				preparedStatement.setString(65, null);
			}

			if (forecastHistoryC.getEndCustomerC() != null) {
				preparedStatement.setString(66, forecastHistoryC.getEndCustomerC().getValue());
			} else {
				preparedStatement.setString(66, null);
			}

			if (forecastHistoryC.getCRMRowIDC() != null) {
				preparedStatement.setString(67, forecastHistoryC.getCRMRowIDC().getValue());
			} else {
				preparedStatement.setString(67, null);
			}

			if (forecastHistoryC.getOwnerMobileC() != null) {
				preparedStatement.setString(68, forecastHistoryC.getOwnerMobileC().getValue());
			} else {
				preparedStatement.setString(68, null);
			}

			if (forecastHistoryC.getPartMobileC() != null) {
				preparedStatement.setString(69, forecastHistoryC.getPartMobileC().getValue());
			} else {
				preparedStatement.setString(69, null);
			}

			if (forecastHistoryC.getMarket1C() != null) {
				preparedStatement.setString(70, forecastHistoryC.getMarket1C().getValue());
			} else {
				preparedStatement.setString(70, null);
			}

			if (forecastHistoryC.getSubMarket1C() != null) {
				preparedStatement.setString(71, forecastHistoryC.getSubMarket1C().getValue());
			} else {
				preparedStatement.setString(71, null);
			}

			if (forecastHistoryC.getBU1C() != null) {
				preparedStatement.setString(72, forecastHistoryC.getBU1C().getValue());
			} else {
				preparedStatement.setString(72, null);
			}

			if (forecastHistoryC.getForecastDateC() != null && forecastHistoryC.getForecastDateC().getValue() != null) {
				preparedStatement.setString(73, forecastHistoryC.getForecastDateC().getValue().toString());
			} else {
				preparedStatement.setString(73, null);
			}

			if (forecastHistoryC.getForecastTypeC() != null) {
				preparedStatement.setString(74, forecastHistoryC.getForecastTypeC().getValue());
			} else {
				preparedStatement.setString(74, null);
			}
			preparedStatement.setString(75,null);
			preparedStatement.setString(76, null);

			preparedStatement.setString(77, null);

			preparedStatement.setString(78, null);

			preparedStatement.setString(79, null);

			preparedStatement.setString(80, null);

			preparedStatement.setString(81, null);

			preparedStatement.setString(82, null);

			if (forecastHistoryC.getINTGC() != null) {
				preparedStatement.setString(83, forecastHistoryC.getINTGC().getValue());
			} else {
				preparedStatement.setString(83, null);
			}

			if (forecastHistoryC.getASP101C() != null && forecastHistoryC.getASP101C().getValue() != null) {
				preparedStatement.setString(84, forecastHistoryC.getASP101C().getValue().toString());
			} else {
				preparedStatement.setString(84, null);
			}

			if (forecastHistoryC.getASP201C() != null && forecastHistoryC.getASP201C().getValue() != null) {
				preparedStatement.setString(85, forecastHistoryC.getASP201C().getValue().toString());
			} else {
				preparedStatement.setString(85, null);
			}

			if (forecastHistoryC.getASP301C() != null && forecastHistoryC.getASP301C().getValue() != null) {
				preparedStatement.setString(86, forecastHistoryC.getASP301C().getValue().toString());
			} else {
				preparedStatement.setString(86, null);
			}

			if (forecastHistoryC.getASP401C() != null && forecastHistoryC.getASP401C().getValue() != null) {
				preparedStatement.setString(87, forecastHistoryC.getASP401C().getValue().toString());
			} else {
				preparedStatement.setString(87, null);
			}

			if (forecastHistoryC.getASP501C() != null && forecastHistoryC.getASP501C().getValue() != null) {
				preparedStatement.setString(88, forecastHistoryC.getASP501C().getValue().toString());
			} else {
				preparedStatement.setString(88, null);
			}

			if (forecastHistoryC.getASP601C() != null && forecastHistoryC.getASP601C().getValue() != null) {
				preparedStatement.setString(89, forecastHistoryC.getASP601C().getValue().toString());
			} else {
				preparedStatement.setString(89, null);
			}

			if (forecastHistoryC.getASP701C() != null && forecastHistoryC.getASP701C().getValue() != null) {
				preparedStatement.setString(90, forecastHistoryC.getASP701C().getValue().toString());
			} else {
				preparedStatement.setString(90, null);
			}

			if (forecastHistoryC.getASP801C() != null && forecastHistoryC.getASP801C().getValue() != null) {
				preparedStatement.setString(91, forecastHistoryC.getASP801C().getValue().toString());
			} else {
				preparedStatement.setString(91, null);
			}

			if (forecastHistoryC.getASP901C() != null && forecastHistoryC.getASP901C().getValue() != null) {
				preparedStatement.setString(92, forecastHistoryC.getASP901C().getValue().toString());
			} else {
				preparedStatement.setString(92, null);
			}

			if (forecastHistoryC.getASP100C() != null && forecastHistoryC.getASP100C().getValue() != null) {
				preparedStatement.setString(93, forecastHistoryC.getASP100C().getValue().toString());
			} else {
				preparedStatement.setString(93, null);
			}

			if (forecastHistoryC.getASP111C() != null && forecastHistoryC.getASP111C().getValue() != null) {
				preparedStatement.setString(94, forecastHistoryC.getASP111C().getValue().toString());
			} else {
				preparedStatement.setString(94, null);
			}

			if (forecastHistoryC.getASP122C() != null && forecastHistoryC.getASP122C().getValue() != null) {
				preparedStatement.setString(95, forecastHistoryC.getASP122C().getValue().toString());
			} else {
				preparedStatement.setString(95, null);
			}

			preparedStatement.setString(96, null);

			preparedStatement.setString(97, null);

			preparedStatement.setString(98, null);

			preparedStatement.setString(99, null);

			preparedStatement.setString(100, null);

			if (forecastHistoryC.getCreationDateC() != null && forecastHistoryC.getCreationDateC().getValue() != null) {
				preparedStatement.setString(101, forecastHistoryC.getCreationDateC().getValue().toString());
			} else {
				preparedStatement.setString(101, null);
			}

			if (forecastHistoryC.getREV1C() != null && forecastHistoryC.getREV1C().getValue() != null) {
				preparedStatement.setString(102, forecastHistoryC.getREV1C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(102, null);
			}

			if (forecastHistoryC.getREV2C() != null && forecastHistoryC.getREV2C().getValue() != null) {
				preparedStatement.setString(103, forecastHistoryC.getREV2C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(103, null);
			}

			if (forecastHistoryC.getREV3C() != null && forecastHistoryC.getREV3C().getValue() != null) {
				preparedStatement.setString(104, forecastHistoryC.getREV3C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(104, null);
			}

			if (forecastHistoryC.getREV4C() != null && forecastHistoryC.getREV4C().getValue() != null) {
				preparedStatement.setString(105, forecastHistoryC.getREV4C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(105, null);
			}

			if (forecastHistoryC.getREV5C() != null && forecastHistoryC.getREV5C().getValue() != null) {
				preparedStatement.setString(106, forecastHistoryC.getREV5C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(106, null);
			}

			if (forecastHistoryC.getREV6C() != null && forecastHistoryC.getREV6C().getValue() != null) {
				preparedStatement.setString(107, forecastHistoryC.getREV6C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(107, null);
			}

			if (forecastHistoryC.getREV7C() != null && forecastHistoryC.getREV7C().getValue() != null) {
				preparedStatement.setString(108, forecastHistoryC.getREV7C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(108, null);
			}

			if (forecastHistoryC.getREV8C() != null && forecastHistoryC.getREV8C().getValue() != null) {
				preparedStatement.setString(109, forecastHistoryC.getREV8C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(109, null);
			}

			if (forecastHistoryC.getREV9C() != null && forecastHistoryC.getREV9C().getValue() != null) {
				preparedStatement.setString(110, forecastHistoryC.getREV9C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(110, null);
			}

			if (forecastHistoryC.getREV10C() != null && forecastHistoryC.getREV10C().getValue() != null) {
				preparedStatement.setString(111, forecastHistoryC.getREV10C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(111, null);
			}

			if (forecastHistoryC.getREV11C() != null && forecastHistoryC.getREV11C().getValue() != null) {
				preparedStatement.setString(112, forecastHistoryC.getREV11C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(112, null);
			}

			if (forecastHistoryC.getREV12C() != null && forecastHistoryC.getREV12C().getValue() != null) {
				preparedStatement.setString(113, forecastHistoryC.getREV12C().getValue().getValue().toString());
			} else {
				preparedStatement.setString(113, null);
			}

			preparedStatement.setString(114, null);

			preparedStatement.setString(115, null);

			preparedStatement.setString(116, null);

			preparedStatement.setString(117, null);

			preparedStatement.setString(118, "INVN");
		} catch (Exception e) {
			LOGGER.debug("Mapping failed for " + forecastHistoryC.getRecordName());
			e.printStackTrace();
		}

	}
}
