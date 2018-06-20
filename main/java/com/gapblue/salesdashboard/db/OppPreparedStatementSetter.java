package com.gapblue.salesdashboard.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;


import com.gapblue.web.stubs.opportunity.Opportunity;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class is used to set the actual parameter values of a prepared
 * statement.
 */
public final class OppPreparedStatementSetter implements ItemPreparedStatementSetter<Opportunity> {
	private static final Logger LOGGER = LoggerFactory.getLogger(OppPreparedStatementSetter.class);

	@Override
	public void setValues(Opportunity opportunity, PreparedStatement preparedStatement) throws SQLException {
		try {

			if (opportunity.getCreationDate() != null) {
				preparedStatement.setString(1, opportunity.getCreationDate().toString());
			} else {
				preparedStatement.setString(1, null);
			}

			preparedStatement.setString(2, opportunity.getCurrencyCode());

			preparedStatement.setString(3, opportunity.getName());
			if (opportunity.getOptyId() != null) {
				preparedStatement.setString(4, opportunity.getOptyId().toString());
			} else {
				preparedStatement.setString(4, null);
			}
			preparedStatement.setString(5, opportunity.getOptyNumber());
			if (opportunity.getStatusCode() != null) {
				preparedStatement.setString(6, opportunity.getStatusCode().getValue());
			} else {
				preparedStatement.setString(6, null);
			}
			preparedStatement.setString(7, opportunity.getTargetPartyName());
			if (opportunity.getSalesMethod() != null) {
				preparedStatement.setString(8, opportunity.getSalesMethod().getValue());
			} else {
				preparedStatement.setString(8, null);
			}
			preparedStatement.setString(9, opportunity.getSalesStage());
		
			if (opportunity.getAverageDaysAtStage() != null && opportunity.getAverageDaysAtStage().getValue() != null) {
				preparedStatement.setString(10, opportunity.getAverageDaysAtStage().getValue().toString());
			} else {
				preparedStatement.setString(10, null);
			}
			preparedStatement.setString(11, opportunity.getPhaseCd());
			if (opportunity.getStageStatusCd() != null) {
				preparedStatement.setString(12, opportunity.getStageStatusCd().getValue());
			} else {
				preparedStatement.setString(12, null);
			}
			if (opportunity.getEffectiveDate() != null) {
				preparedStatement.setString(13, opportunity.getEffectiveDate().getValue().toString());
			} else {
				preparedStatement.setString(13, null);
			}
			if (opportunity.getRevenue() != null) {
				preparedStatement.setString(14, opportunity.getRevenue().getValue().toString());
			} else {
				preparedStatement.setString(14, null);
			}
			if (opportunity.getRevenueType() != null) {
				preparedStatement.setString(15, opportunity.getRevenueType().getValue());
			} else {
				preparedStatement.setString(15, null);
			}
			if (opportunity.getRevnId() != null) {
				preparedStatement.setString(16, opportunity.getRevnId().toString());
			} else {
				preparedStatement.setString(16, null);
			}
			preparedStatement.setString(17, opportunity.getPrimaryContactPartyName());
			if (opportunity.getAccountNumber() != null) {
				preparedStatement.setString(18, opportunity.getAccountNumber().getValue());
			} else {
				preparedStatement.setString(18, null);
			}
			preparedStatement.setString(19, opportunity.getPartyName());
			if (opportunity.getFormattedAddress() != null) {
				preparedStatement.setString(20, opportunity.getFormattedAddress().getValue());
			} else {
				preparedStatement.setString(20, null);
			}
			if (opportunity.getCity() != null) {
				preparedStatement.setString(21, opportunity.getCity().getValue());
			} else {
				preparedStatement.setString(21, null);
			}
			preparedStatement.setString(22, opportunity.getCountry());
			if (opportunity.getPostalCode() != null) {
				preparedStatement.setString(23, opportunity.getPostalCode().getValue());
			} else {
				preparedStatement.setString(23, null);
			}
			if (opportunity.getState() != null) {
				preparedStatement.setString(24, opportunity.getState().getValue());
			} else {
				preparedStatement.setString(24, null);
			}
			if (opportunity.getOptyCreationDate() != null) {
				preparedStatement.setString(25, opportunity.getOptyCreationDate().getValue().toString());
			} else {
				preparedStatement.setString(25, null);
			}
			if (opportunity.getExpectAmount() != null) {
				preparedStatement.setString(26, opportunity.getExpectAmount().getValue().getValue().toString());
			} else {
				preparedStatement.setString(26, null);
			}
			if (opportunity.getPartyUniqueName() != null) {
				preparedStatement.setString(27, opportunity.getPartyUniqueName().getValue());
			} else {
				preparedStatement.setString(27, null);
			}
			if (opportunity.getOptyCreatedBy() != null) {
				preparedStatement.setString(28, opportunity.getOptyCreatedBy().getValue());
			} else {
				preparedStatement.setString(28, null);
			}
			if (opportunity.getCrmRevenue() != null) {
				preparedStatement.setString(29, opportunity.getCrmRevenue().getValue().toString());
			} else {
				preparedStatement.setString(29, null);
			}
			preparedStatement.setString(30, opportunity.getPartyType());
			if (opportunity.getSalesChannelCd() != null) {
				preparedStatement.setString(31, opportunity.getSalesChannelCd().getValue());
			} else {
				preparedStatement.setString(31, null);
			}
			preparedStatement.setString(32, opportunity.getPrimaryOrganizationName());
			if (opportunity.getApprovalStatusC() != null) {
				preparedStatement.setString(33, opportunity.getApprovalStatusC().getValue());
			} else {
				preparedStatement.setString(33, null);
			}
			if (opportunity.getParentEndCustomerC() != null) {
				preparedStatement.setString(34, opportunity.getParentEndCustomerC().getValue());
			} else {
				preparedStatement.setString(34, null);
			}
			if (opportunity.getMarketSegmentC() != null) {
				preparedStatement.setString(35, opportunity.getMarketSegmentC().getValue());
			} else {
				preparedStatement.setString(35, null);
			}
			if (opportunity.getSubSegmentC() != null) {
				preparedStatement.setString(36, opportunity.getSubSegmentC().getValue());
			} else {
				preparedStatement.setString(36, null);
			}
			preparedStatement.setString(37, opportunity.getProjectNameC());
			if (opportunity.getProjectStartDateC() != null) {
				preparedStatement.setString(38, opportunity.getProjectStartDateC().toString());
			} else {
				preparedStatement.setString(38, null);
			}
			preparedStatement.setString(39, opportunity.getOpportunityTypeC());
			if (opportunity.getEvalPartRequestedDateC() != null) {
				preparedStatement.setString(40, opportunity.getEvalPartRequestedDateC().toString());
			} else {
				preparedStatement.setString(40, null);
			}
			if (opportunity.getTargetDesignInDateC() != null) {
				preparedStatement.setString(41, opportunity.getTargetDesignInDateC().toString());
			} else {
				preparedStatement.setString(41, null);
			}
			if (opportunity.getTargetDesignWinDateC() != null) {
				preparedStatement.setString(42, opportunity.getTargetDesignWinDateC().toString());
			} else {
				preparedStatement.setString(42, null);
			}
			if (opportunity.getTargetProductionDateC() != null) {
				preparedStatement.setString(43, opportunity.getTargetProductionDateC().toString());
			} else {
				preparedStatement.setString(43, null);
			}
			if (opportunity.getEvaluationCompleteDateC() != null
					&& opportunity.getEvaluationCompleteDateC().getValue() != null) {
				preparedStatement.setString(44, opportunity.getEvaluationCompleteDateC().getValue().toString());
			} else {
				preparedStatement.setString(44, null);
			}
			if (opportunity.getActualDesignInDateC() != null) {
				preparedStatement.setString(45, opportunity.getActualDesignInDateC().toString());
			} else {
				preparedStatement.setString(45, null);
			}
			if (opportunity.getActualDesignWinDateC() != null) {
				preparedStatement.setString(46, opportunity.getActualDesignWinDateC().toString());
			} else {
				preparedStatement.setString(46, null);
			}
			if (opportunity.getActualProductionStartDateC() != null) {
				preparedStatement.setString(47, opportunity.getActualProductionStartDateC().toString());
			} else {
				preparedStatement.setString(47, null);
			}
			if (opportunity.getOpportunityC() != null) {
				preparedStatement.setString(48, opportunity.getOpportunityC().getValue());
			} else {
				preparedStatement.setString(48, null);
			}
			if (opportunity.getLifeTimeRevenueC() != null && opportunity.getLifeTimeRevenueC().getValue() != null) {
				preparedStatement.setString(49, opportunity.getLifeTimeRevenueC().getValue().getValue().toString());
			} else {
				preparedStatement.setString(49, null);
			}
			if (opportunity.getMarketSegment1C() != null) {
				preparedStatement.setString(50, opportunity.getMarketSegment1C());
			} else {
				preparedStatement.setString(50, null);
			}

				if (opportunity.getSubSegment1C() != null) {
				preparedStatement.setString(51, opportunity.getSubSegment1C());
			} else {
				preparedStatement.setString(51, null);
			}
			if (opportunity.getEndCustomerC() != null) {
				preparedStatement.setString(52, opportunity.getEndCustomerC());
			} else {
				preparedStatement.setString(52, null);
			}
			if (opportunity.getEndCustomerRegionC() != null) {
				preparedStatement.setString(53, opportunity.getEndCustomerRegionC().getValue());
			} else {
				preparedStatement.setString(53, null);
			}
			if (opportunity.getEndCustomerStateC() != null) {
				preparedStatement.setString(54, opportunity.getEndCustomerStateC().getValue());
			} else {
				preparedStatement.setString(54, null);
			}
			if (opportunity.getEndCustomerCountryC() != null) {

				preparedStatement.setString(55, opportunity.getEndCustomerCountryC().getValue());
			} else {
				preparedStatement.setString(55, null);
			}
			preparedStatement.setString(56, "INVN");
			if(opportunity.getWinProb()!=null && opportunity.getWinProb().getValue()!=null)
			{
				preparedStatement.setString(57, opportunity.getWinProb().getValue().toString());
			}
			else
			{
				preparedStatement.setString(57, null);
			}
			if(opportunity.getMarketingProbabilityC()!=null && opportunity.getMarketingProbabilityC().getValue()!=null)
			{
				preparedStatement.setString(58, opportunity.getMarketingProbabilityC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(58, null);
			}
			if(opportunity.getClosedOrCancelledDateC()!=null)
			{
				preparedStatement.setString(59, opportunity.getClosedOrCancelledDateC().toString());
			}
			else
			{
				preparedStatement.setString(59, null);
			}
			preparedStatement.setString(60, opportunity.getReasonC());
			preparedStatement.setString(61, opportunity.getReasonDescriptionC());
			preparedStatement.setString(62, opportunity.getCompetitorInfoC());
			
			if(opportunity.isForecastC()!=null )
			{
				preparedStatement.setString(63, opportunity.isForecastC().toString());
			}
			else
			{
				preparedStatement.setString(63, null);
			}
			if(opportunity.getOpportunityOwnerC()!=null && opportunity.getOpportunityOwnerC().getValue()!=null)
			{
				preparedStatement.setString(64, opportunity.getOpportunityOwnerC().getValue());
			}
			else
			{
				preparedStatement.setString(64, null);
			}
			if(opportunity.isEvalPartReceivedC()!=null )
			{
				preparedStatement.setBoolean(65, opportunity.isEvalPartReceivedC());
			}
			else
			{
				preparedStatement.setString(65, null);
			}
			if(opportunity.isCustomerApprovedQuoteC()!=null )
			{
				preparedStatement.setBoolean(66, opportunity.isCustomerApprovedQuoteC());
			}
			else
			{
				preparedStatement.setString(66, null);
			}
			if(opportunity.isDealRegistrationC()!=null)
			{
				preparedStatement.setBoolean(67, opportunity.isDealRegistrationC());
			}
			else
			{
				preparedStatement.setString(67, null);
			}
			if(opportunity.getSelectDealRep2C()!=null && opportunity.getSelectDealRep2C().getValue()!=null)
			{
				preparedStatement.setString(68, opportunity.getSelectDealRep2C().getValue());
			}
			else
			{
				preparedStatement.setString(68, null);
			}
			if(opportunity.getDealRegID2C()!=null && opportunity.getDealRegID2C().getValue()!=null)
			{
				preparedStatement.setString(69, opportunity.getDealRegID2C().getValue());
			}
			else
			{
				preparedStatement.setString(69, null);
			}
			if(opportunity.getApplicationC()!=null && opportunity.getApplicationC().getValue()!=null)
			{
				preparedStatement.setString(70, opportunity.getApplicationC().getValue());
			}
			else
			{
				preparedStatement.setString(70, null);
			}
			if(opportunity.getOpportunityLifetimeYearsC()!=null && opportunity.getOpportunityLifetimeYearsC().getValue()!=null)
			{
				preparedStatement.setString(71, opportunity.getOpportunityLifetimeYearsC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(71, null);
			}
			preparedStatement.setString(72, opportunity.getProjectDescriptionC());
			
			if(opportunity.getSalesCommentC()!=null)
			{
				preparedStatement.setString(73, opportunity.getSalesCommentC().getValue());
			}
			else
			{
				preparedStatement.setString(73, null);
			}
			if(opportunity.getProductManagerCommentsC()!=null && opportunity.getProductManagerCommentsC().getValue()!=null)
			{
				preparedStatement.setString(74, opportunity.getProductManagerCommentsC().getValue());
			}
			else
			{
				preparedStatement.setString(74, null);
			}
			preparedStatement.setString(75, opportunity.getHelpStatusC());
			preparedStatement.setString(76,opportunity.getHelpNeededFromC());
			
			if(opportunity.getDateOfHelpRequestC()!=null && opportunity.getDateOfHelpRequestC().getValue()!=null)
			{
				preparedStatement.setString(77, opportunity.getDateOfHelpRequestC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(77, null);
			}
			preparedStatement.setString(78, opportunity.getCriticalActionItemsMilestonesC());
			preparedStatement.setString(79, opportunity.getRiskChallengesC());
			
			if(opportunity.getDesignInRegionalMgrApprovedC()!=null && opportunity.getDesignInRegionalMgrApprovedC().getValue()!=null)
			{
				preparedStatement.setString(80, opportunity.getDesignInRegionalMgrApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(80, null);
			}
			if(opportunity.getDesignInRegionalMgrApprovalDatC()!=null && opportunity.getDesignInRegionalMgrApprovalDatC().getValue()!=null)
			{
				preparedStatement.setString(81, opportunity.getDesignInRegionalMgrApprovalDatC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(81, null);
			}
			if(opportunity.getDesignWinMarketingApprovedC()!=null && opportunity.getDesignWinMarketingApprovedC().getValue()!=null)
			{
				preparedStatement.setString(82, opportunity.getDesignWinMarketingApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(82, null);
			}
			if(opportunity.getDesignWinMarketingApprovalDateC()!=null && opportunity.getDesignWinMarketingApprovalDateC().getValue()!=null)
			{
				preparedStatement.setString(83, opportunity.getDesignWinMarketingApprovalDateC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(83, null);
			}
			if(opportunity.getDesignWinVPSalesApprovedC()!=null && opportunity.getDesignWinVPSalesApprovedC().getValue()!=null)
			{
				preparedStatement.setString(84, opportunity.getDesignWinVPSalesApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(84, null);
			}
			if(opportunity.getDesignWinVPSalesApprovalDateC()!=null && opportunity.getDesignWinVPSalesApprovalDateC().getValue()!=null)
			{
				preparedStatement.setString(85, opportunity.getDesignWinVPSalesApprovalDateC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(85, null);
			}
			if(opportunity.getDesignWinMarketingApprovedC()!=null && opportunity.getDesignWinMarketingApprovedC().getValue()!=null)
			{
				preparedStatement.setString(86, opportunity.getDesignWinMarketingApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(86, null);
			}
			if(opportunity.getDesignWinMarketingApprovalDateC()!=null && opportunity.getDesignWinMarketingApprovalDateC().getValue()!=null)
			{
				preparedStatement.setString(87, opportunity.getDesignWinMarketingApprovalDateC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(87, null);
			}
			if(opportunity.getMPVPSalesApprovedC()!=null && opportunity.getMPVPSalesApprovedC().getValue()!=null)
			{
				preparedStatement.setString(88, opportunity.getMPVPSalesApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(88, null);
			}
			if(opportunity.getMPVPSalesApprovalDateC()!=null && opportunity.getMPVPSalesApprovalDateC().getValue()!=null)
			{
				preparedStatement.setString(89, opportunity.getMPVPSalesApprovalDateC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(89, null);
			}
			if(opportunity.getLostVPSalesApprovedC()!=null && opportunity.getLostVPSalesApprovedC().getValue()!=null)
			{
				preparedStatement.setString(90, opportunity.getLostVPSalesApprovedC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(90, null);
			}
			if(opportunity.getLostVPSalesApprovalDateC()!=null && opportunity.getLostVPSalesApprovalDateC().getValue()!=null)
			{
				preparedStatement.setString(91, opportunity.getLostVPSalesApprovalDateC().getValue().toString());
			}
			else
			{
				preparedStatement.setString(91, null);
			}
			
			//Placeholder for part,BU,Annual Unit Volume,ASP_c,Expected Revenue - these are revenue fields and is mapped in RevenuePreparedSatetmentSetter
			preparedStatement.setString(92, null);
			preparedStatement.setString(93, null);
			preparedStatement.setString(94, null);
			preparedStatement.setString(95, null);
			preparedStatement.setString(96, null);
			preparedStatement.setString(97, null);
		
			preparedStatement.setString(98, opportunity.getLastUpdatedBy());
			if(opportunity.getLastUpdateDate()!=null )
			{
				preparedStatement.setString(99, opportunity.getLastUpdateDate().toString());
			}
			else
			{
				preparedStatement.setString(99, null);
			}
			//Placeholder for product type
			preparedStatement.setString(100, null);
			
		} catch (Exception e) {
			LOGGER.debug("Mapping failed for " + opportunity.getOptyId());
			e.printStackTrace();
		}

	}
}
