
package com.gapblue.web.stubs.salescustomobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuoteLineItem_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteLineItem_c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JobDefinitionPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PKProxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityName_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpportunityName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quote_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quote_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Part_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductFamily_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BU_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistiMargin_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarketSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideQuoteLineStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OverrideQuoteLineEndDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReviewerComments_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumQuarterlyVolumeMQV_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovedASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardPriceBookASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InvenSenseRep_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvenSenseRep_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossMargin_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceEndDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ToBeDeleted_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompetitorName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitorPrice_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RegionalManagerReviewAndAgreed_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerReviewedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="VPOfSalesReviewAndAgreed_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesReviewedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProductBUManagerReviewed_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductBUManagerReviewedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="IIIReviewAndApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIIReviewedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ApprovalCounter_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BackendRequestedASP_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BackendNetASP_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BackendCurrentASP_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BackendCost_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="BackendPart_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stLevelGM_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SecondLevelGM_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CEOGM_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Comments_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteSource_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmitForApproval_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingReviewAndAgreed_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingReviewedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PriceListName_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceListName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRMRowID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionPeriod_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionPeriodDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="MinimumQuarterlyVolumeMQV1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedASP1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApprovedASP1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StandardPriceBookASP1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Cost1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentASP1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetASP1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AutoApprovedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RegionalManagerReviewer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RegionalManagerReviewer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesReviewer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VPOfSalesReviewer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductBUManager_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductBUManager_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingReviewer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingReviewer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityTimeFrame_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvenSenseRepMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerReviewerMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesReviewerMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductBUManagerMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingReviewerMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteLineSubmissionDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RegionalManagerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingManagerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingManagerId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingManagerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfMarketingEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIIName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIIDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IIIDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIIId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIIIEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManualApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMFinalApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesFinalApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepFloorPrice_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RegionaManagerFloorPrice_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VPOfSalesListPrice_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Extension_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedAlready_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewLineExtensionId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToBeCancelled_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndCustomerNumberINTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorNameINTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorNumberINTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListNameINTG_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceListNameINTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListNameMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedFromQLI_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExtendedFromQLI_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopiedQuoteLineId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverridePopulated_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuoteLineItemTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}QuoteLineItemTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineItem_c", namespace = "/oracle/apps/sales/custExtn/views/common/", propOrder = {
    "id",
    "recordName",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "lastUpdateLogin",
    "cpdrfVerSor",
    "userLastUpdateDate",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "jobDefinitionPackage",
    "requestId",
    "jobDefinitionName",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "sourceType",
    "attachmentEntityName",
    "pkProxy",
    "isOwner",
    "endCustomerIdC",
    "endCustomerC",
    "priceListTypeC",
    "opportunityNameIdC",
    "opportunityNameC",
    "quoteTypeC",
    "quoteIdC",
    "quoteC",
    "partIdC",
    "partC",
    "productFamilyC",
    "buc",
    "distiMarginC",
    "marketSegmentC",
    "marketSubSegmentC",
    "overrideQuoteLineStartDateC",
    "overrideQuoteLineEndDateC",
    "projectNameC",
    "reviewerCommentsC",
    "minimumQuarterlyVolumeMQVC",
    "approvalStatusC",
    "quantityC",
    "requestedASPC",
    "approvedASPC",
    "standardPriceBookASPC",
    "priceStartDateC",
    "invenSenseRepIdC",
    "invenSenseRepC",
    "customerApprovedC",
    "costC",
    "currentASPC",
    "grossMarginC",
    "netASPC",
    "extensionApprovedC",
    "priceEndDateC",
    "toBeDeletedC",
    "competitorNameC",
    "competitorPriceC",
    "regionalManagerReviewAndAgreedC",
    "regionalManagerReviewedDateC",
    "vpOfSalesReviewAndAgreedC",
    "vpOfSalesReviewedDateC",
    "productBUManagerReviewedC",
    "productBUManagerReviewedDateC",
    "iiiReviewAndApprovedC",
    "iiiReviewedDateC",
    "approvalCounterC",
    "backendRequestedASPC",
    "backendNetASPC",
    "backendCurrentASPC",
    "backendCostC",
    "backendPartC",
    "stLevelGMC",
    "secondLevelGMC",
    "ceogmc",
    "commentsC",
    "quoteSourceC",
    "submitForApprovalC",
    "vpOfMarketingReviewAndAgreedC",
    "vpOfMarketingReviewedDateC",
    "priceListNameIdC",
    "priceListNameC",
    "crmRowIDC",
    "extensionPeriodC",
    "extensionPeriodDateC",
    "minimumQuarterlyVolumeMQV1C",
    "requestedASP1C",
    "approvedASP1C",
    "standardPriceBookASP1C",
    "cost1C",
    "currentASP1C",
    "netASP1C",
    "autoApprovedDateC",
    "regionalManagerReviewerIdC",
    "regionalManagerReviewerC",
    "vpOfSalesReviewerIdC",
    "vpOfSalesReviewerC",
    "productBUManagerIdC",
    "productBUManagerC",
    "vpOfMarketingReviewerIdC",
    "vpOfMarketingReviewerC",
    "quantityTimeFrameC",
    "annualQuantityC",
    "invenSenseRepMobileC",
    "partMobileC",
    "regionalManagerReviewerMobileC",
    "vpOfSalesReviewerMobileC",
    "productBUManagerMobileC",
    "vpOfMarketingReviewerMobileC",
    "marketSegment1C",
    "marketSubSegment1C",
    "quoteLineSubmissionDateC",
    "regionalManagerNameC",
    "regionalManagerIdC",
    "regionalManagerEmailC",
    "vpOfSalesNameC",
    "vpOfSalesIdC",
    "vpOfSalesEmailC",
    "marketingManagerNameC",
    "marketingManagerIdC",
    "marketingManagerEmailC",
    "vpOfMarketingNameC",
    "vpOfMarketingIdC",
    "vpOfMarketingEmailC",
    "iiiNameC",
    "iiidclIdC",
    "iiidclc",
    "iiiIdC",
    "iiiiEmailC",
    "manualApprovalC",
    "rmFinalApprovalC",
    "vpOfSalesFinalApprovalC",
    "salesRepFloorPriceC",
    "regionaManagerFloorPriceC",
    "vpOfSalesListPriceC",
    "extensionC",
    "extendedAlreadyC",
    "newLineExtensionIdC",
    "toBeCancelledC",
    "endCustomerNumberINTGC",
    "distributorNameINTGC",
    "distributorNumberINTGC",
    "ownerIDC",
    "priceListNameINTGIdC",
    "priceListNameINTGC",
    "priceListNameMobileC",
    "priceListIdC",
    "intgc",
    "extendedFromQLIIdC",
    "extendedFromQLIC",
    "copiedQuoteLineIdC",
    "overridePopulatedC",
    "quoteLineItemTeamCollectionC"
})
public class QuoteLineItemC {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    @XmlElement(name = "RecordName")
    protected String recordName;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> objectVersionNumber;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "JobDefinitionPackage", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionPackage;
    @XmlElementRef(name = "RequestId", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "JobDefinitionName", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionName;
    @XmlElementRef(name = "CurrencyCode", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "SourceType", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceType;
    @XmlElementRef(name = "AttachmentEntityName", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachmentEntityName;
    @XmlElementRef(name = "PKProxy", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pkProxy;
    @XmlElementRef(name = "IsOwner", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isOwner;
    @XmlElement(name = "EndCustomer_Id_c")
    protected BigDecimal endCustomerIdC;
    @XmlElement(name = "EndCustomer_c")
    protected String endCustomerC;
    @XmlElement(name = "PriceListType_c")
    protected String priceListTypeC;
    @XmlElement(name = "OpportunityName_Id_c")
    protected BigDecimal opportunityNameIdC;
    @XmlElement(name = "OpportunityName_c")
    protected String opportunityNameC;
    @XmlElementRef(name = "QuoteType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteTypeC;
    @XmlElementRef(name = "Quote_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quoteIdC;
    @XmlElementRef(name = "Quote_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteC;
    @XmlElement(name = "Part_Id_c")
    protected BigDecimal partIdC;
    @XmlElement(name = "Part_c")
    protected String partC;
    @XmlElementRef(name = "ProductFamily_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productFamilyC;
    @XmlElementRef(name = "BU_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buc;
    @XmlElement(name = "DistiMargin_c")
    protected BigDecimal distiMarginC;
    @XmlElementRef(name = "MarketSegment_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegmentC;
    @XmlElementRef(name = "MarketSubSegment_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSubSegmentC;
    @XmlElementRef(name = "OverrideQuoteLineStartDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> overrideQuoteLineStartDateC;
    @XmlElementRef(name = "OverrideQuoteLineEndDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> overrideQuoteLineEndDateC;
    @XmlElement(name = "ProjectName_c")
    protected String projectNameC;
    @XmlElementRef(name = "ReviewerComments_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reviewerCommentsC;
    @XmlElementRef(name = "MinimumQuarterlyVolumeMQV_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minimumQuarterlyVolumeMQVC;
    @XmlElementRef(name = "ApprovalStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvalStatusC;
    @XmlElement(name = "Quantity_c")
    protected BigDecimal quantityC;
    @XmlElementRef(name = "RequestedASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestedASPC;
    @XmlElementRef(name = "ApprovedASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvedASPC;
    @XmlElementRef(name = "StandardPriceBookASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standardPriceBookASPC;
    @XmlElement(name = "PriceStartDate_c")
    protected XMLGregorianCalendar priceStartDateC;
    @XmlElementRef(name = "InvenSenseRep_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> invenSenseRepIdC;
    @XmlElementRef(name = "InvenSenseRep_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invenSenseRepC;
    @XmlElementRef(name = "CustomerApproved_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerApprovedC;
    @XmlElementRef(name = "Cost_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costC;
    @XmlElementRef(name = "CurrentASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentASPC;
    @XmlElementRef(name = "GrossMargin_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> grossMarginC;
    @XmlElementRef(name = "NetASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> netASPC;
    @XmlElementRef(name = "ExtensionApproved_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extensionApprovedC;
    @XmlElement(name = "PriceEndDate_c")
    protected XMLGregorianCalendar priceEndDateC;
    @XmlElement(name = "ToBeDeleted_c")
    protected Boolean toBeDeletedC;
    @XmlElementRef(name = "CompetitorName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitorNameC;
    @XmlElementRef(name = "CompetitorPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> competitorPriceC;
    @XmlElementRef(name = "RegionalManagerReviewAndAgreed_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerReviewAndAgreedC;
    @XmlElementRef(name = "RegionalManagerReviewedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> regionalManagerReviewedDateC;
    @XmlElementRef(name = "VPOfSalesReviewAndAgreed_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesReviewAndAgreedC;
    @XmlElementRef(name = "VPOfSalesReviewedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vpOfSalesReviewedDateC;
    @XmlElementRef(name = "ProductBUManagerReviewed_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productBUManagerReviewedC;
    @XmlElementRef(name = "ProductBUManagerReviewedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> productBUManagerReviewedDateC;
    @XmlElementRef(name = "IIIReviewAndApproved_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iiiReviewAndApprovedC;
    @XmlElementRef(name = "IIIReviewedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> iiiReviewedDateC;
    @XmlElementRef(name = "ApprovalCounter_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> approvalCounterC;
    @XmlElementRef(name = "BackendRequestedASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> backendRequestedASPC;
    @XmlElementRef(name = "BackendNetASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> backendNetASPC;
    @XmlElementRef(name = "BackendCurrentASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> backendCurrentASPC;
    @XmlElementRef(name = "BackendCost_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> backendCostC;
    @XmlElementRef(name = "BackendPart_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backendPartC;
    @XmlElementRef(name = "stLevelGM_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stLevelGMC;
    @XmlElementRef(name = "SecondLevelGM_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> secondLevelGMC;
    @XmlElementRef(name = "CEOGM_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ceogmc;
    @XmlElementRef(name = "Comments_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentsC;
    @XmlElementRef(name = "QuoteSource_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteSourceC;
    @XmlElement(name = "SubmitForApproval_c")
    protected Boolean submitForApprovalC;
    @XmlElementRef(name = "VPOfMarketingReviewAndAgreed_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingReviewAndAgreedC;
    @XmlElementRef(name = "VPOfMarketingReviewedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vpOfMarketingReviewedDateC;
    @XmlElementRef(name = "PriceListName_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priceListNameIdC;
    @XmlElementRef(name = "PriceListName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListNameC;
    @XmlElementRef(name = "CRMRowID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmRowIDC;
    @XmlElementRef(name = "ExtensionPeriod_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extensionPeriodC;
    @XmlElementRef(name = "ExtensionPeriodDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> extensionPeriodDateC;
    @XmlElement(name = "MinimumQuarterlyVolumeMQV1_c")
    protected BigDecimal minimumQuarterlyVolumeMQV1C;
    @XmlElement(name = "RequestedASP1_c")
    protected BigDecimal requestedASP1C;
    @XmlElementRef(name = "ApprovedASP1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> approvedASP1C;
    @XmlElementRef(name = "StandardPriceBookASP1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> standardPriceBookASP1C;
    @XmlElementRef(name = "Cost1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cost1C;
    @XmlElement(name = "CurrentASP1_c")
    protected BigDecimal currentASP1C;
    @XmlElementRef(name = "NetASP1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> netASP1C;
    @XmlElementRef(name = "AutoApprovedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> autoApprovedDateC;
    @XmlElementRef(name = "RegionalManagerReviewer_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> regionalManagerReviewerIdC;
    @XmlElementRef(name = "RegionalManagerReviewer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerReviewerC;
    @XmlElementRef(name = "VPOfSalesReviewer_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vpOfSalesReviewerIdC;
    @XmlElementRef(name = "VPOfSalesReviewer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesReviewerC;
    @XmlElementRef(name = "ProductBUManager_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> productBUManagerIdC;
    @XmlElementRef(name = "ProductBUManager_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productBUManagerC;
    @XmlElementRef(name = "VPOfMarketingReviewer_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vpOfMarketingReviewerIdC;
    @XmlElementRef(name = "VPOfMarketingReviewer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingReviewerC;
    @XmlElement(name = "QuantityTimeFrame_c")
    protected String quantityTimeFrameC;
    @XmlElementRef(name = "AnnualQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> annualQuantityC;
    @XmlElementRef(name = "InvenSenseRepMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invenSenseRepMobileC;
    @XmlElementRef(name = "PartMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partMobileC;
    @XmlElementRef(name = "RegionalManagerReviewerMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerReviewerMobileC;
    @XmlElementRef(name = "VPOfSalesReviewerMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesReviewerMobileC;
    @XmlElementRef(name = "ProductBUManagerMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productBUManagerMobileC;
    @XmlElementRef(name = "VPOfMarketingReviewerMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingReviewerMobileC;
    @XmlElement(name = "MarketSegment1_c")
    protected String marketSegment1C;
    @XmlElement(name = "MarketSubSegment1_c")
    protected String marketSubSegment1C;
    @XmlElementRef(name = "QuoteLineSubmissionDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> quoteLineSubmissionDateC;
    @XmlElementRef(name = "RegionalManagerName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerNameC;
    @XmlElementRef(name = "RegionalManagerId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerIdC;
    @XmlElementRef(name = "RegionalManagerEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerEmailC;
    @XmlElementRef(name = "VPOfSalesName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesNameC;
    @XmlElementRef(name = "VPOfSalesId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesIdC;
    @XmlElementRef(name = "VPOfSalesEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesEmailC;
    @XmlElementRef(name = "MarketingManagerName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingManagerNameC;
    @XmlElementRef(name = "MarketingManagerId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingManagerIdC;
    @XmlElementRef(name = "MarketingManagerEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingManagerEmailC;
    @XmlElementRef(name = "VPOfMarketingName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingNameC;
    @XmlElementRef(name = "VPOfMarketingId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingIdC;
    @XmlElementRef(name = "VPOfMarketingEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfMarketingEmailC;
    @XmlElementRef(name = "IIIName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iiiNameC;
    @XmlElementRef(name = "IIIDCL_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> iiidclIdC;
    @XmlElementRef(name = "IIIDCL_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iiidclc;
    @XmlElementRef(name = "IIIId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iiiIdC;
    @XmlElementRef(name = "IIIIEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iiiiEmailC;
    @XmlElementRef(name = "ManualApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manualApprovalC;
    @XmlElementRef(name = "RMFinalApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmFinalApprovalC;
    @XmlElementRef(name = "VPOfSalesFinalApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesFinalApprovalC;
    @XmlElementRef(name = "SalesRepFloorPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesRepFloorPriceC;
    @XmlElementRef(name = "RegionaManagerFloorPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> regionaManagerFloorPriceC;
    @XmlElementRef(name = "VPOfSalesListPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vpOfSalesListPriceC;
    @XmlElement(name = "Extension_c")
    protected Boolean extensionC;
    @XmlElement(name = "ExtendedAlready_c")
    protected Boolean extendedAlreadyC;
    @XmlElementRef(name = "NewLineExtensionId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newLineExtensionIdC;
    @XmlElement(name = "ToBeCancelled_c")
    protected Boolean toBeCancelledC;
    @XmlElementRef(name = "EndCustomerNumberINTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerNumberINTGC;
    @XmlElementRef(name = "DistributorNameINTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorNameINTGC;
    @XmlElementRef(name = "DistributorNumberINTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorNumberINTGC;
    @XmlElementRef(name = "OwnerID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerIDC;
    @XmlElementRef(name = "PriceListNameINTG_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priceListNameINTGIdC;
    @XmlElementRef(name = "PriceListNameINTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListNameINTGC;
    @XmlElementRef(name = "PriceListNameMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListNameMobileC;
    @XmlElementRef(name = "PriceListId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListIdC;
    @XmlElementRef(name = "INTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElementRef(name = "ExtendedFromQLI_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> extendedFromQLIIdC;
    @XmlElementRef(name = "ExtendedFromQLI_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extendedFromQLIC;
    @XmlElementRef(name = "CopiedQuoteLineId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> copiedQuoteLineIdC;
    @XmlElement(name = "OverridePopulated_c")
    protected Boolean overridePopulatedC;
    @XmlElement(name = "QuoteLineItemTeamCollection_c")
    protected List<QuoteLineItemTeamC> quoteLineItemTeamCollectionC;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<BigDecimal> value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Gets the value of the cpdrfVerSor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerSor() {
        return cpdrfVerSor;
    }

    /**
     * Sets the value of the cpdrfVerSor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerSor(JAXBElement<Integer> value) {
        this.cpdrfVerSor = value;
    }

    /**
     * Gets the value of the userLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Sets the value of the userLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = value;
    }

    /**
     * Gets the value of the cpdrfLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpdrfLastUpd() {
        return cpdrfLastUpd;
    }

    /**
     * Sets the value of the cpdrfLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpdrfLastUpd(JAXBElement<String> value) {
        this.cpdrfLastUpd = value;
    }

    /**
     * Gets the value of the cpdrfVerPillar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerPillar() {
        return cpdrfVerPillar;
    }

    /**
     * Sets the value of the cpdrfVerPillar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerPillar(JAXBElement<Integer> value) {
        this.cpdrfVerPillar = value;
    }

    /**
     * Gets the value of the jobDefinitionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionPackage() {
        return jobDefinitionPackage;
    }

    /**
     * Sets the value of the jobDefinitionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionPackage(JAXBElement<String> value) {
        this.jobDefinitionPackage = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the jobDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Sets the value of the jobDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionName(JAXBElement<String> value) {
        this.jobDefinitionName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceType(JAXBElement<String> value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the attachmentEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentEntityName() {
        return attachmentEntityName;
    }

    /**
     * Sets the value of the attachmentEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentEntityName(JAXBElement<String> value) {
        this.attachmentEntityName = value;
    }

    /**
     * Gets the value of the pkProxy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPKProxy() {
        return pkProxy;
    }

    /**
     * Sets the value of the pkProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPKProxy(JAXBElement<String> value) {
        this.pkProxy = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOwner(JAXBElement<String> value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the endCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndCustomerIdC() {
        return endCustomerIdC;
    }

    /**
     * Sets the value of the endCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndCustomerIdC(BigDecimal value) {
        this.endCustomerIdC = value;
    }

    /**
     * Gets the value of the endCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCustomerC() {
        return endCustomerC;
    }

    /**
     * Sets the value of the endCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCustomerC(String value) {
        this.endCustomerC = value;
    }

    /**
     * Gets the value of the priceListTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListTypeC() {
        return priceListTypeC;
    }

    /**
     * Sets the value of the priceListTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListTypeC(String value) {
        this.priceListTypeC = value;
    }

    /**
     * Gets the value of the opportunityNameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpportunityNameIdC() {
        return opportunityNameIdC;
    }

    /**
     * Sets the value of the opportunityNameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpportunityNameIdC(BigDecimal value) {
        this.opportunityNameIdC = value;
    }

    /**
     * Gets the value of the opportunityNameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityNameC() {
        return opportunityNameC;
    }

    /**
     * Sets the value of the opportunityNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityNameC(String value) {
        this.opportunityNameC = value;
    }

    /**
     * Gets the value of the quoteTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteTypeC() {
        return quoteTypeC;
    }

    /**
     * Sets the value of the quoteTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteTypeC(JAXBElement<String> value) {
        this.quoteTypeC = value;
    }

    /**
     * Gets the value of the quoteIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuoteIdC() {
        return quoteIdC;
    }

    /**
     * Sets the value of the quoteIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuoteIdC(JAXBElement<BigDecimal> value) {
        this.quoteIdC = value;
    }

    /**
     * Gets the value of the quoteC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteC() {
        return quoteC;
    }

    /**
     * Sets the value of the quoteC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteC(JAXBElement<String> value) {
        this.quoteC = value;
    }

    /**
     * Gets the value of the partIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartIdC() {
        return partIdC;
    }

    /**
     * Sets the value of the partIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartIdC(BigDecimal value) {
        this.partIdC = value;
    }

    /**
     * Gets the value of the partC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartC() {
        return partC;
    }

    /**
     * Sets the value of the partC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartC(String value) {
        this.partC = value;
    }

    /**
     * Gets the value of the productFamilyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductFamilyC() {
        return productFamilyC;
    }

    /**
     * Sets the value of the productFamilyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductFamilyC(JAXBElement<String> value) {
        this.productFamilyC = value;
    }

    /**
     * Gets the value of the buc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUC() {
        return buc;
    }

    /**
     * Sets the value of the buc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUC(JAXBElement<String> value) {
        this.buc = value;
    }

    /**
     * Gets the value of the distiMarginC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistiMarginC() {
        return distiMarginC;
    }

    /**
     * Sets the value of the distiMarginC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistiMarginC(BigDecimal value) {
        this.distiMarginC = value;
    }

    /**
     * Gets the value of the marketSegmentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSegmentC() {
        return marketSegmentC;
    }

    /**
     * Sets the value of the marketSegmentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSegmentC(JAXBElement<String> value) {
        this.marketSegmentC = value;
    }

    /**
     * Gets the value of the marketSubSegmentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSubSegmentC() {
        return marketSubSegmentC;
    }

    /**
     * Sets the value of the marketSubSegmentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSubSegmentC(JAXBElement<String> value) {
        this.marketSubSegmentC = value;
    }

    /**
     * Gets the value of the overrideQuoteLineStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOverrideQuoteLineStartDateC() {
        return overrideQuoteLineStartDateC;
    }

    /**
     * Sets the value of the overrideQuoteLineStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOverrideQuoteLineStartDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.overrideQuoteLineStartDateC = value;
    }

    /**
     * Gets the value of the overrideQuoteLineEndDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOverrideQuoteLineEndDateC() {
        return overrideQuoteLineEndDateC;
    }

    /**
     * Sets the value of the overrideQuoteLineEndDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOverrideQuoteLineEndDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.overrideQuoteLineEndDateC = value;
    }

    /**
     * Gets the value of the projectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNameC() {
        return projectNameC;
    }

    /**
     * Sets the value of the projectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNameC(String value) {
        this.projectNameC = value;
    }

    /**
     * Gets the value of the reviewerCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReviewerCommentsC() {
        return reviewerCommentsC;
    }

    /**
     * Sets the value of the reviewerCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReviewerCommentsC(JAXBElement<String> value) {
        this.reviewerCommentsC = value;
    }

    /**
     * Gets the value of the minimumQuarterlyVolumeMQVC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinimumQuarterlyVolumeMQVC() {
        return minimumQuarterlyVolumeMQVC;
    }

    /**
     * Sets the value of the minimumQuarterlyVolumeMQVC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinimumQuarterlyVolumeMQVC(JAXBElement<String> value) {
        this.minimumQuarterlyVolumeMQVC = value;
    }

    /**
     * Gets the value of the approvalStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovalStatusC() {
        return approvalStatusC;
    }

    /**
     * Sets the value of the approvalStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovalStatusC(JAXBElement<String> value) {
        this.approvalStatusC = value;
    }

    /**
     * Gets the value of the quantityC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityC() {
        return quantityC;
    }

    /**
     * Sets the value of the quantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityC(BigDecimal value) {
        this.quantityC = value;
    }

    /**
     * Gets the value of the requestedASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestedASPC() {
        return requestedASPC;
    }

    /**
     * Sets the value of the requestedASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestedASPC(JAXBElement<String> value) {
        this.requestedASPC = value;
    }

    /**
     * Gets the value of the approvedASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovedASPC() {
        return approvedASPC;
    }

    /**
     * Sets the value of the approvedASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovedASPC(JAXBElement<String> value) {
        this.approvedASPC = value;
    }

    /**
     * Gets the value of the standardPriceBookASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStandardPriceBookASPC() {
        return standardPriceBookASPC;
    }

    /**
     * Sets the value of the standardPriceBookASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStandardPriceBookASPC(JAXBElement<String> value) {
        this.standardPriceBookASPC = value;
    }

    /**
     * Gets the value of the priceStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceStartDateC() {
        return priceStartDateC;
    }

    /**
     * Sets the value of the priceStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceStartDateC(XMLGregorianCalendar value) {
        this.priceStartDateC = value;
    }

    /**
     * Gets the value of the invenSenseRepIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvenSenseRepIdC() {
        return invenSenseRepIdC;
    }

    /**
     * Sets the value of the invenSenseRepIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvenSenseRepIdC(JAXBElement<BigDecimal> value) {
        this.invenSenseRepIdC = value;
    }

    /**
     * Gets the value of the invenSenseRepC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvenSenseRepC() {
        return invenSenseRepC;
    }

    /**
     * Sets the value of the invenSenseRepC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvenSenseRepC(JAXBElement<String> value) {
        this.invenSenseRepC = value;
    }

    /**
     * Gets the value of the customerApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerApprovedC() {
        return customerApprovedC;
    }

    /**
     * Sets the value of the customerApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerApprovedC(JAXBElement<String> value) {
        this.customerApprovedC = value;
    }

    /**
     * Gets the value of the costC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostC() {
        return costC;
    }

    /**
     * Sets the value of the costC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostC(JAXBElement<String> value) {
        this.costC = value;
    }

    /**
     * Gets the value of the currentASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentASPC() {
        return currentASPC;
    }

    /**
     * Sets the value of the currentASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentASPC(JAXBElement<String> value) {
        this.currentASPC = value;
    }

    /**
     * Gets the value of the grossMarginC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossMarginC() {
        return grossMarginC;
    }

    /**
     * Sets the value of the grossMarginC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossMarginC(JAXBElement<BigDecimal> value) {
        this.grossMarginC = value;
    }

    /**
     * Gets the value of the netASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetASPC() {
        return netASPC;
    }

    /**
     * Sets the value of the netASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetASPC(JAXBElement<String> value) {
        this.netASPC = value;
    }

    /**
     * Gets the value of the extensionApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtensionApprovedC() {
        return extensionApprovedC;
    }

    /**
     * Sets the value of the extensionApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtensionApprovedC(JAXBElement<String> value) {
        this.extensionApprovedC = value;
    }

    /**
     * Gets the value of the priceEndDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceEndDateC() {
        return priceEndDateC;
    }

    /**
     * Sets the value of the priceEndDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceEndDateC(XMLGregorianCalendar value) {
        this.priceEndDateC = value;
    }

    /**
     * Gets the value of the toBeDeletedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeDeletedC() {
        return toBeDeletedC;
    }

    /**
     * Sets the value of the toBeDeletedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeDeletedC(Boolean value) {
        this.toBeDeletedC = value;
    }

    /**
     * Gets the value of the competitorNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompetitorNameC() {
        return competitorNameC;
    }

    /**
     * Sets the value of the competitorNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompetitorNameC(JAXBElement<String> value) {
        this.competitorNameC = value;
    }

    /**
     * Gets the value of the competitorPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCompetitorPriceC() {
        return competitorPriceC;
    }

    /**
     * Sets the value of the competitorPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCompetitorPriceC(JAXBElement<AmountType> value) {
        this.competitorPriceC = value;
    }

    /**
     * Gets the value of the regionalManagerReviewAndAgreedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerReviewAndAgreedC() {
        return regionalManagerReviewAndAgreedC;
    }

    /**
     * Sets the value of the regionalManagerReviewAndAgreedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerReviewAndAgreedC(JAXBElement<String> value) {
        this.regionalManagerReviewAndAgreedC = value;
    }

    /**
     * Gets the value of the regionalManagerReviewedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegionalManagerReviewedDateC() {
        return regionalManagerReviewedDateC;
    }

    /**
     * Sets the value of the regionalManagerReviewedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegionalManagerReviewedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.regionalManagerReviewedDateC = value;
    }

    /**
     * Gets the value of the vpOfSalesReviewAndAgreedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesReviewAndAgreedC() {
        return vpOfSalesReviewAndAgreedC;
    }

    /**
     * Sets the value of the vpOfSalesReviewAndAgreedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesReviewAndAgreedC(JAXBElement<String> value) {
        this.vpOfSalesReviewAndAgreedC = value;
    }

    /**
     * Gets the value of the vpOfSalesReviewedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVPOfSalesReviewedDateC() {
        return vpOfSalesReviewedDateC;
    }

    /**
     * Sets the value of the vpOfSalesReviewedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVPOfSalesReviewedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.vpOfSalesReviewedDateC = value;
    }

    /**
     * Gets the value of the productBUManagerReviewedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductBUManagerReviewedC() {
        return productBUManagerReviewedC;
    }

    /**
     * Sets the value of the productBUManagerReviewedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductBUManagerReviewedC(JAXBElement<String> value) {
        this.productBUManagerReviewedC = value;
    }

    /**
     * Gets the value of the productBUManagerReviewedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProductBUManagerReviewedDateC() {
        return productBUManagerReviewedDateC;
    }

    /**
     * Sets the value of the productBUManagerReviewedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProductBUManagerReviewedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.productBUManagerReviewedDateC = value;
    }

    /**
     * Gets the value of the iiiReviewAndApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIIReviewAndApprovedC() {
        return iiiReviewAndApprovedC;
    }

    /**
     * Sets the value of the iiiReviewAndApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIIReviewAndApprovedC(JAXBElement<String> value) {
        this.iiiReviewAndApprovedC = value;
    }

    /**
     * Gets the value of the iiiReviewedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIIIReviewedDateC() {
        return iiiReviewedDateC;
    }

    /**
     * Sets the value of the iiiReviewedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIIIReviewedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.iiiReviewedDateC = value;
    }

    /**
     * Gets the value of the approvalCounterC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getApprovalCounterC() {
        return approvalCounterC;
    }

    /**
     * Sets the value of the approvalCounterC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setApprovalCounterC(JAXBElement<AmountType> value) {
        this.approvalCounterC = value;
    }

    /**
     * Gets the value of the backendRequestedASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBackendRequestedASPC() {
        return backendRequestedASPC;
    }

    /**
     * Sets the value of the backendRequestedASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBackendRequestedASPC(JAXBElement<AmountType> value) {
        this.backendRequestedASPC = value;
    }

    /**
     * Gets the value of the backendNetASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBackendNetASPC() {
        return backendNetASPC;
    }

    /**
     * Sets the value of the backendNetASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBackendNetASPC(JAXBElement<AmountType> value) {
        this.backendNetASPC = value;
    }

    /**
     * Gets the value of the backendCurrentASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBackendCurrentASPC() {
        return backendCurrentASPC;
    }

    /**
     * Sets the value of the backendCurrentASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBackendCurrentASPC(JAXBElement<AmountType> value) {
        this.backendCurrentASPC = value;
    }

    /**
     * Gets the value of the backendCostC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBackendCostC() {
        return backendCostC;
    }

    /**
     * Sets the value of the backendCostC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBackendCostC(JAXBElement<AmountType> value) {
        this.backendCostC = value;
    }

    /**
     * Gets the value of the backendPartC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackendPartC() {
        return backendPartC;
    }

    /**
     * Sets the value of the backendPartC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackendPartC(JAXBElement<String> value) {
        this.backendPartC = value;
    }

    /**
     * Gets the value of the stLevelGMC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStLevelGMC() {
        return stLevelGMC;
    }

    /**
     * Sets the value of the stLevelGMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStLevelGMC(JAXBElement<BigDecimal> value) {
        this.stLevelGMC = value;
    }

    /**
     * Gets the value of the secondLevelGMC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSecondLevelGMC() {
        return secondLevelGMC;
    }

    /**
     * Sets the value of the secondLevelGMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSecondLevelGMC(JAXBElement<BigDecimal> value) {
        this.secondLevelGMC = value;
    }

    /**
     * Gets the value of the ceogmc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCEOGMC() {
        return ceogmc;
    }

    /**
     * Sets the value of the ceogmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCEOGMC(JAXBElement<BigDecimal> value) {
        this.ceogmc = value;
    }

    /**
     * Gets the value of the commentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentsC() {
        return commentsC;
    }

    /**
     * Sets the value of the commentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentsC(JAXBElement<String> value) {
        this.commentsC = value;
    }

    /**
     * Gets the value of the quoteSourceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteSourceC() {
        return quoteSourceC;
    }

    /**
     * Sets the value of the quoteSourceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteSourceC(JAXBElement<String> value) {
        this.quoteSourceC = value;
    }

    /**
     * Gets the value of the submitForApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApprovalC() {
        return submitForApprovalC;
    }

    /**
     * Sets the value of the submitForApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApprovalC(Boolean value) {
        this.submitForApprovalC = value;
    }

    /**
     * Gets the value of the vpOfMarketingReviewAndAgreedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingReviewAndAgreedC() {
        return vpOfMarketingReviewAndAgreedC;
    }

    /**
     * Sets the value of the vpOfMarketingReviewAndAgreedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingReviewAndAgreedC(JAXBElement<String> value) {
        this.vpOfMarketingReviewAndAgreedC = value;
    }

    /**
     * Gets the value of the vpOfMarketingReviewedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVPOfMarketingReviewedDateC() {
        return vpOfMarketingReviewedDateC;
    }

    /**
     * Sets the value of the vpOfMarketingReviewedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVPOfMarketingReviewedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.vpOfMarketingReviewedDateC = value;
    }

    /**
     * Gets the value of the priceListNameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceListNameIdC() {
        return priceListNameIdC;
    }

    /**
     * Sets the value of the priceListNameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceListNameIdC(JAXBElement<BigDecimal> value) {
        this.priceListNameIdC = value;
    }

    /**
     * Gets the value of the priceListNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListNameC() {
        return priceListNameC;
    }

    /**
     * Sets the value of the priceListNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListNameC(JAXBElement<String> value) {
        this.priceListNameC = value;
    }

    /**
     * Gets the value of the crmRowIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRMRowIDC() {
        return crmRowIDC;
    }

    /**
     * Sets the value of the crmRowIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRMRowIDC(JAXBElement<String> value) {
        this.crmRowIDC = value;
    }

    /**
     * Gets the value of the extensionPeriodC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtensionPeriodC() {
        return extensionPeriodC;
    }

    /**
     * Sets the value of the extensionPeriodC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtensionPeriodC(JAXBElement<String> value) {
        this.extensionPeriodC = value;
    }

    /**
     * Gets the value of the extensionPeriodDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExtensionPeriodDateC() {
        return extensionPeriodDateC;
    }

    /**
     * Sets the value of the extensionPeriodDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExtensionPeriodDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.extensionPeriodDateC = value;
    }

    /**
     * Gets the value of the minimumQuarterlyVolumeMQV1C property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumQuarterlyVolumeMQV1C() {
        return minimumQuarterlyVolumeMQV1C;
    }

    /**
     * Sets the value of the minimumQuarterlyVolumeMQV1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumQuarterlyVolumeMQV1C(BigDecimal value) {
        this.minimumQuarterlyVolumeMQV1C = value;
    }

    /**
     * Gets the value of the requestedASP1C property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedASP1C() {
        return requestedASP1C;
    }

    /**
     * Sets the value of the requestedASP1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedASP1C(BigDecimal value) {
        this.requestedASP1C = value;
    }

    /**
     * Gets the value of the approvedASP1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getApprovedASP1C() {
        return approvedASP1C;
    }

    /**
     * Sets the value of the approvedASP1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setApprovedASP1C(JAXBElement<BigDecimal> value) {
        this.approvedASP1C = value;
    }

    /**
     * Gets the value of the standardPriceBookASP1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStandardPriceBookASP1C() {
        return standardPriceBookASP1C;
    }

    /**
     * Sets the value of the standardPriceBookASP1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStandardPriceBookASP1C(JAXBElement<BigDecimal> value) {
        this.standardPriceBookASP1C = value;
    }

    /**
     * Gets the value of the cost1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCost1C() {
        return cost1C;
    }

    /**
     * Sets the value of the cost1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCost1C(JAXBElement<BigDecimal> value) {
        this.cost1C = value;
    }

    /**
     * Gets the value of the currentASP1C property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentASP1C() {
        return currentASP1C;
    }

    /**
     * Sets the value of the currentASP1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentASP1C(BigDecimal value) {
        this.currentASP1C = value;
    }

    /**
     * Gets the value of the netASP1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNetASP1C() {
        return netASP1C;
    }

    /**
     * Sets the value of the netASP1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNetASP1C(JAXBElement<BigDecimal> value) {
        this.netASP1C = value;
    }

    /**
     * Gets the value of the autoApprovedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAutoApprovedDateC() {
        return autoApprovedDateC;
    }

    /**
     * Sets the value of the autoApprovedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAutoApprovedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.autoApprovedDateC = value;
    }

    /**
     * Gets the value of the regionalManagerReviewerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRegionalManagerReviewerIdC() {
        return regionalManagerReviewerIdC;
    }

    /**
     * Sets the value of the regionalManagerReviewerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRegionalManagerReviewerIdC(JAXBElement<BigDecimal> value) {
        this.regionalManagerReviewerIdC = value;
    }

    /**
     * Gets the value of the regionalManagerReviewerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerReviewerC() {
        return regionalManagerReviewerC;
    }

    /**
     * Sets the value of the regionalManagerReviewerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerReviewerC(JAXBElement<String> value) {
        this.regionalManagerReviewerC = value;
    }

    /**
     * Gets the value of the vpOfSalesReviewerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVPOfSalesReviewerIdC() {
        return vpOfSalesReviewerIdC;
    }

    /**
     * Sets the value of the vpOfSalesReviewerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVPOfSalesReviewerIdC(JAXBElement<BigDecimal> value) {
        this.vpOfSalesReviewerIdC = value;
    }

    /**
     * Gets the value of the vpOfSalesReviewerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesReviewerC() {
        return vpOfSalesReviewerC;
    }

    /**
     * Sets the value of the vpOfSalesReviewerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesReviewerC(JAXBElement<String> value) {
        this.vpOfSalesReviewerC = value;
    }

    /**
     * Gets the value of the productBUManagerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProductBUManagerIdC() {
        return productBUManagerIdC;
    }

    /**
     * Sets the value of the productBUManagerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProductBUManagerIdC(JAXBElement<BigDecimal> value) {
        this.productBUManagerIdC = value;
    }

    /**
     * Gets the value of the productBUManagerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductBUManagerC() {
        return productBUManagerC;
    }

    /**
     * Sets the value of the productBUManagerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductBUManagerC(JAXBElement<String> value) {
        this.productBUManagerC = value;
    }

    /**
     * Gets the value of the vpOfMarketingReviewerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVPOfMarketingReviewerIdC() {
        return vpOfMarketingReviewerIdC;
    }

    /**
     * Sets the value of the vpOfMarketingReviewerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVPOfMarketingReviewerIdC(JAXBElement<BigDecimal> value) {
        this.vpOfMarketingReviewerIdC = value;
    }

    /**
     * Gets the value of the vpOfMarketingReviewerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingReviewerC() {
        return vpOfMarketingReviewerC;
    }

    /**
     * Sets the value of the vpOfMarketingReviewerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingReviewerC(JAXBElement<String> value) {
        this.vpOfMarketingReviewerC = value;
    }

    /**
     * Gets the value of the quantityTimeFrameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityTimeFrameC() {
        return quantityTimeFrameC;
    }

    /**
     * Sets the value of the quantityTimeFrameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityTimeFrameC(String value) {
        this.quantityTimeFrameC = value;
    }

    /**
     * Gets the value of the annualQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAnnualQuantityC() {
        return annualQuantityC;
    }

    /**
     * Sets the value of the annualQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAnnualQuantityC(JAXBElement<BigDecimal> value) {
        this.annualQuantityC = value;
    }

    /**
     * Gets the value of the invenSenseRepMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvenSenseRepMobileC() {
        return invenSenseRepMobileC;
    }

    /**
     * Sets the value of the invenSenseRepMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvenSenseRepMobileC(JAXBElement<String> value) {
        this.invenSenseRepMobileC = value;
    }

    /**
     * Gets the value of the partMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartMobileC() {
        return partMobileC;
    }

    /**
     * Sets the value of the partMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartMobileC(JAXBElement<String> value) {
        this.partMobileC = value;
    }

    /**
     * Gets the value of the regionalManagerReviewerMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerReviewerMobileC() {
        return regionalManagerReviewerMobileC;
    }

    /**
     * Sets the value of the regionalManagerReviewerMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerReviewerMobileC(JAXBElement<String> value) {
        this.regionalManagerReviewerMobileC = value;
    }

    /**
     * Gets the value of the vpOfSalesReviewerMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesReviewerMobileC() {
        return vpOfSalesReviewerMobileC;
    }

    /**
     * Sets the value of the vpOfSalesReviewerMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesReviewerMobileC(JAXBElement<String> value) {
        this.vpOfSalesReviewerMobileC = value;
    }

    /**
     * Gets the value of the productBUManagerMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductBUManagerMobileC() {
        return productBUManagerMobileC;
    }

    /**
     * Sets the value of the productBUManagerMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductBUManagerMobileC(JAXBElement<String> value) {
        this.productBUManagerMobileC = value;
    }

    /**
     * Gets the value of the vpOfMarketingReviewerMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingReviewerMobileC() {
        return vpOfMarketingReviewerMobileC;
    }

    /**
     * Sets the value of the vpOfMarketingReviewerMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingReviewerMobileC(JAXBElement<String> value) {
        this.vpOfMarketingReviewerMobileC = value;
    }

    /**
     * Gets the value of the marketSegment1C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegment1C() {
        return marketSegment1C;
    }

    /**
     * Sets the value of the marketSegment1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegment1C(String value) {
        this.marketSegment1C = value;
    }

    /**
     * Gets the value of the marketSubSegment1C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSubSegment1C() {
        return marketSubSegment1C;
    }

    /**
     * Sets the value of the marketSubSegment1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSubSegment1C(String value) {
        this.marketSubSegment1C = value;
    }

    /**
     * Gets the value of the quoteLineSubmissionDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getQuoteLineSubmissionDateC() {
        return quoteLineSubmissionDateC;
    }

    /**
     * Sets the value of the quoteLineSubmissionDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setQuoteLineSubmissionDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.quoteLineSubmissionDateC = value;
    }

    /**
     * Gets the value of the regionalManagerNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerNameC() {
        return regionalManagerNameC;
    }

    /**
     * Sets the value of the regionalManagerNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerNameC(JAXBElement<String> value) {
        this.regionalManagerNameC = value;
    }

    /**
     * Gets the value of the regionalManagerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerIdC() {
        return regionalManagerIdC;
    }

    /**
     * Sets the value of the regionalManagerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerIdC(JAXBElement<String> value) {
        this.regionalManagerIdC = value;
    }

    /**
     * Gets the value of the regionalManagerEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerEmailC() {
        return regionalManagerEmailC;
    }

    /**
     * Sets the value of the regionalManagerEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerEmailC(JAXBElement<String> value) {
        this.regionalManagerEmailC = value;
    }

    /**
     * Gets the value of the vpOfSalesNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesNameC() {
        return vpOfSalesNameC;
    }

    /**
     * Sets the value of the vpOfSalesNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesNameC(JAXBElement<String> value) {
        this.vpOfSalesNameC = value;
    }

    /**
     * Gets the value of the vpOfSalesIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesIdC() {
        return vpOfSalesIdC;
    }

    /**
     * Sets the value of the vpOfSalesIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesIdC(JAXBElement<String> value) {
        this.vpOfSalesIdC = value;
    }

    /**
     * Gets the value of the vpOfSalesEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesEmailC() {
        return vpOfSalesEmailC;
    }

    /**
     * Sets the value of the vpOfSalesEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesEmailC(JAXBElement<String> value) {
        this.vpOfSalesEmailC = value;
    }

    /**
     * Gets the value of the marketingManagerNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingManagerNameC() {
        return marketingManagerNameC;
    }

    /**
     * Sets the value of the marketingManagerNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingManagerNameC(JAXBElement<String> value) {
        this.marketingManagerNameC = value;
    }

    /**
     * Gets the value of the marketingManagerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingManagerIdC() {
        return marketingManagerIdC;
    }

    /**
     * Sets the value of the marketingManagerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingManagerIdC(JAXBElement<String> value) {
        this.marketingManagerIdC = value;
    }

    /**
     * Gets the value of the marketingManagerEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingManagerEmailC() {
        return marketingManagerEmailC;
    }

    /**
     * Sets the value of the marketingManagerEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingManagerEmailC(JAXBElement<String> value) {
        this.marketingManagerEmailC = value;
    }

    /**
     * Gets the value of the vpOfMarketingNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingNameC() {
        return vpOfMarketingNameC;
    }

    /**
     * Sets the value of the vpOfMarketingNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingNameC(JAXBElement<String> value) {
        this.vpOfMarketingNameC = value;
    }

    /**
     * Gets the value of the vpOfMarketingIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingIdC() {
        return vpOfMarketingIdC;
    }

    /**
     * Sets the value of the vpOfMarketingIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingIdC(JAXBElement<String> value) {
        this.vpOfMarketingIdC = value;
    }

    /**
     * Gets the value of the vpOfMarketingEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfMarketingEmailC() {
        return vpOfMarketingEmailC;
    }

    /**
     * Sets the value of the vpOfMarketingEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfMarketingEmailC(JAXBElement<String> value) {
        this.vpOfMarketingEmailC = value;
    }

    /**
     * Gets the value of the iiiNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIINameC() {
        return iiiNameC;
    }

    /**
     * Sets the value of the iiiNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIINameC(JAXBElement<String> value) {
        this.iiiNameC = value;
    }

    /**
     * Gets the value of the iiidclIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIIIDCLIdC() {
        return iiidclIdC;
    }

    /**
     * Sets the value of the iiidclIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIIIDCLIdC(JAXBElement<BigDecimal> value) {
        this.iiidclIdC = value;
    }

    /**
     * Gets the value of the iiidclc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIIDCLC() {
        return iiidclc;
    }

    /**
     * Sets the value of the iiidclc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIIDCLC(JAXBElement<String> value) {
        this.iiidclc = value;
    }

    /**
     * Gets the value of the iiiIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIIIdC() {
        return iiiIdC;
    }

    /**
     * Sets the value of the iiiIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIIIdC(JAXBElement<String> value) {
        this.iiiIdC = value;
    }

    /**
     * Gets the value of the iiiiEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIIIEmailC() {
        return iiiiEmailC;
    }

    /**
     * Sets the value of the iiiiEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIIIEmailC(JAXBElement<String> value) {
        this.iiiiEmailC = value;
    }

    /**
     * Gets the value of the manualApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManualApprovalC() {
        return manualApprovalC;
    }

    /**
     * Sets the value of the manualApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManualApprovalC(JAXBElement<String> value) {
        this.manualApprovalC = value;
    }

    /**
     * Gets the value of the rmFinalApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRMFinalApprovalC() {
        return rmFinalApprovalC;
    }

    /**
     * Sets the value of the rmFinalApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRMFinalApprovalC(JAXBElement<String> value) {
        this.rmFinalApprovalC = value;
    }

    /**
     * Gets the value of the vpOfSalesFinalApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesFinalApprovalC() {
        return vpOfSalesFinalApprovalC;
    }

    /**
     * Sets the value of the vpOfSalesFinalApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesFinalApprovalC(JAXBElement<String> value) {
        this.vpOfSalesFinalApprovalC = value;
    }

    /**
     * Gets the value of the salesRepFloorPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesRepFloorPriceC() {
        return salesRepFloorPriceC;
    }

    /**
     * Sets the value of the salesRepFloorPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesRepFloorPriceC(JAXBElement<BigDecimal> value) {
        this.salesRepFloorPriceC = value;
    }

    /**
     * Gets the value of the regionaManagerFloorPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRegionaManagerFloorPriceC() {
        return regionaManagerFloorPriceC;
    }

    /**
     * Sets the value of the regionaManagerFloorPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRegionaManagerFloorPriceC(JAXBElement<BigDecimal> value) {
        this.regionaManagerFloorPriceC = value;
    }

    /**
     * Gets the value of the vpOfSalesListPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVPOfSalesListPriceC() {
        return vpOfSalesListPriceC;
    }

    /**
     * Sets the value of the vpOfSalesListPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVPOfSalesListPriceC(JAXBElement<BigDecimal> value) {
        this.vpOfSalesListPriceC = value;
    }

    /**
     * Gets the value of the extensionC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtensionC() {
        return extensionC;
    }

    /**
     * Sets the value of the extensionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtensionC(Boolean value) {
        this.extensionC = value;
    }

    /**
     * Gets the value of the extendedAlreadyC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedAlreadyC() {
        return extendedAlreadyC;
    }

    /**
     * Sets the value of the extendedAlreadyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedAlreadyC(Boolean value) {
        this.extendedAlreadyC = value;
    }

    /**
     * Gets the value of the newLineExtensionIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewLineExtensionIdC() {
        return newLineExtensionIdC;
    }

    /**
     * Sets the value of the newLineExtensionIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewLineExtensionIdC(JAXBElement<String> value) {
        this.newLineExtensionIdC = value;
    }

    /**
     * Gets the value of the toBeCancelledC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeCancelledC() {
        return toBeCancelledC;
    }

    /**
     * Sets the value of the toBeCancelledC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeCancelledC(Boolean value) {
        this.toBeCancelledC = value;
    }

    /**
     * Gets the value of the endCustomerNumberINTGC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerNumberINTGC() {
        return endCustomerNumberINTGC;
    }

    /**
     * Sets the value of the endCustomerNumberINTGC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerNumberINTGC(JAXBElement<String> value) {
        this.endCustomerNumberINTGC = value;
    }

    /**
     * Gets the value of the distributorNameINTGC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorNameINTGC() {
        return distributorNameINTGC;
    }

    /**
     * Sets the value of the distributorNameINTGC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorNameINTGC(JAXBElement<String> value) {
        this.distributorNameINTGC = value;
    }

    /**
     * Gets the value of the distributorNumberINTGC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorNumberINTGC() {
        return distributorNumberINTGC;
    }

    /**
     * Sets the value of the distributorNumberINTGC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorNumberINTGC(JAXBElement<String> value) {
        this.distributorNumberINTGC = value;
    }

    /**
     * Gets the value of the ownerIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerIDC() {
        return ownerIDC;
    }

    /**
     * Sets the value of the ownerIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerIDC(JAXBElement<String> value) {
        this.ownerIDC = value;
    }

    /**
     * Gets the value of the priceListNameINTGIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceListNameINTGIdC() {
        return priceListNameINTGIdC;
    }

    /**
     * Sets the value of the priceListNameINTGIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceListNameINTGIdC(JAXBElement<BigDecimal> value) {
        this.priceListNameINTGIdC = value;
    }

    /**
     * Gets the value of the priceListNameINTGC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListNameINTGC() {
        return priceListNameINTGC;
    }

    /**
     * Sets the value of the priceListNameINTGC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListNameINTGC(JAXBElement<String> value) {
        this.priceListNameINTGC = value;
    }

    /**
     * Gets the value of the priceListNameMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListNameMobileC() {
        return priceListNameMobileC;
    }

    /**
     * Sets the value of the priceListNameMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListNameMobileC(JAXBElement<String> value) {
        this.priceListNameMobileC = value;
    }

    /**
     * Gets the value of the priceListIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListIdC() {
        return priceListIdC;
    }

    /**
     * Sets the value of the priceListIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListIdC(JAXBElement<String> value) {
        this.priceListIdC = value;
    }

    /**
     * Gets the value of the intgc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTGC() {
        return intgc;
    }

    /**
     * Sets the value of the intgc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTGC(JAXBElement<String> value) {
        this.intgc = value;
    }

    /**
     * Gets the value of the extendedFromQLIIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getExtendedFromQLIIdC() {
        return extendedFromQLIIdC;
    }

    /**
     * Sets the value of the extendedFromQLIIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setExtendedFromQLIIdC(JAXBElement<BigDecimal> value) {
        this.extendedFromQLIIdC = value;
    }

    /**
     * Gets the value of the extendedFromQLIC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtendedFromQLIC() {
        return extendedFromQLIC;
    }

    /**
     * Sets the value of the extendedFromQLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtendedFromQLIC(JAXBElement<String> value) {
        this.extendedFromQLIC = value;
    }

    /**
     * Gets the value of the copiedQuoteLineIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopiedQuoteLineIdC() {
        return copiedQuoteLineIdC;
    }

    /**
     * Sets the value of the copiedQuoteLineIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopiedQuoteLineIdC(JAXBElement<String> value) {
        this.copiedQuoteLineIdC = value;
    }

    /**
     * Gets the value of the overridePopulatedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverridePopulatedC() {
        return overridePopulatedC;
    }

    /**
     * Sets the value of the overridePopulatedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridePopulatedC(Boolean value) {
        this.overridePopulatedC = value;
    }

    /**
     * Gets the value of the quoteLineItemTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteLineItemTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteLineItemTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteLineItemTeamC }
     * 
     * 
     */
    public List<QuoteLineItemTeamC> getQuoteLineItemTeamCollectionC() {
        if (quoteLineItemTeamCollectionC == null) {
            quoteLineItemTeamCollectionC = new ArrayList<QuoteLineItemTeamC>();
        }
        return this.quoteLineItemTeamCollectionC;
    }

}
