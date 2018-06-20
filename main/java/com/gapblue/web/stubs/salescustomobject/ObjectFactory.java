
package com.gapblue.web.stubs.salescustomobject;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gapblue.web.stubs.salescustomobject package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SampleRequestTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "sampleRequestTeam_c");
    private final static QName _QuoteLineItemTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "quoteLineItemTeam_c");
    private final static QName _OrdersC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "orders_c");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _PriceListC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "priceList_c");
    private final static QName _RevenuePlanC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "revenuePlan_c");
    private final static QName _BillingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "billing_c");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _OrdersTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ordersTeam_c");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _BacklogTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "backlogTeam_c");
    private final static QName _QuoteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "quote_c");
    private final static QName _ForecastHistoryTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "forecastHistoryTeam_c");
    private final static QName _ForecastCustomC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "forecast_Custom_c");
    private final static QName _QuoteTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "quoteTeam_c");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _BacklogC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "backlog_c");
    private final static QName _SampleRequestC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "sampleRequest_c");
    private final static QName _QuoteLineItemC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "quoteLineItem_c");
    private final static QName _ForecastTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "forecastTeam_c");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _ForecastHistoryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "forecastHistory_c");
    private final static QName _BillingTeamC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "billingTeam_c");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _ForecastTeamCIsOwner_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IsOwner");
    private final static QName _ForecastTeamCTeamMemberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TeamMember_c");
    private final static QName _ForecastTeamCAccessLevelC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AccessLevel_c");
    private final static QName _ForecastTeamCUserNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UserName_c");
    private final static QName _ForecastTeamCForecastCustomIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Forecast_Custom_Id_c");
    private final static QName _ForecastTeamCRequestId_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RequestId");
    private final static QName _ForecastTeamCUserLastUpdateDate_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UserLastUpdateDate");
    private final static QName _ForecastTeamCJobDefinitionName_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "JobDefinitionName");
    private final static QName _ForecastTeamCCorpCurrencyCode_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CorpCurrencyCode");
    private final static QName _ForecastTeamCJobDefinitionPackage_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "JobDefinitionPackage");
    private final static QName _ForecastTeamCCpdrfVerPillar_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfVerPillar");
    private final static QName _ForecastTeamCCurcyConvRateType_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CurcyConvRateType");
    private final static QName _ForecastTeamCTeamMemberIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TeamMember_Id_c");
    private final static QName _ForecastTeamCCpdrfVerSor_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfVerSor");
    private final static QName _ForecastTeamCLastUpdateLogin_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateLogin");
    private final static QName _ForecastTeamCCurrencyCode_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CurrencyCode");
    private final static QName _ForecastTeamCObjectVersionNumber_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ObjectVersionNumber");
    private final static QName _ForecastTeamCCpdrfLastUpd_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfLastUpd");
    private final static QName _BacklogTeamCBacklogIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Backlog_Id_c");
    private final static QName _QuoteLineItemTeamCQuoteLineItemIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteLineItem_Id_c");
    private final static QName _SampleRequestTeamCUsernameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Username_c");
    private final static QName _SampleRequestTeamCSampleRequestIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SampleRequest_Id_c");
    private final static QName _SampleRequestCSalesBranchC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesBranch_c");
    private final static QName _SampleRequestCBUMicrophoneDCLIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMicrophoneDCL_Id_c");
    private final static QName _SampleRequestCProduct1NameMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product1NameMobile_c");
    private final static QName _SampleRequestCProduct2NameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2Name_Id_c");
    private final static QName _SampleRequestCProduct1TrackingNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product1TrackingNumber_c");
    private final static QName _SampleRequestCProduct1SONumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product1SONumber_c");
    private final static QName _SampleRequestCTRC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TR_c");
    private final static QName _SampleRequestCParentCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentCustomer_c");
    private final static QName _SampleRequestCRegion1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Region1_c");
    private final static QName _SampleRequestCRequestedByMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RequestedByMobile_c");
    private final static QName _SampleRequestCOwnerIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OwnerID_c");
    private final static QName _SampleRequestCDistributorAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorAddress_c");
    private final static QName _SampleRequestCProd3EmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Prod3Email_c");
    private final static QName _SampleRequestCBUC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BU_c");
    private final static QName _SampleRequestCPKProxy_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PKProxy");
    private final static QName _SampleRequestCApprovalStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ApprovalStatus_c");
    private final static QName _SampleRequestCProduct3NameMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3NameMobile_c");
    private final static QName _SampleRequestCProduct3RequestedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3RequestedQuantity_c");
    private final static QName _SampleRequestCProduct3NameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3Name_Id_c");
    private final static QName _SampleRequestCDistributorAccountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorAccount_c");
    private final static QName _SampleRequestCCustomerContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerContact_c");
    private final static QName _SampleRequestCShipToAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToAddress_c");
    private final static QName _SampleRequestCBUMotionDCLIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotionDCL_Id_c");
    private final static QName _SampleRequestCNPIProd1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPIProd1_c");
    private final static QName _SampleRequestCNPIProd2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPIProd2_c");
    private final static QName _SampleRequestCProduct2TrackingNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2TrackingNumber_c");
    private final static QName _SampleRequestCBUMotionDCLC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotionDCL_c");
    private final static QName _SampleRequestCShipToContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToContact_c");
    private final static QName _SampleRequestCProduct3TrackingNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3TrackingNumber_c");
    private final static QName _SampleRequestCProduct2NameMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2NameMobile_c");
    private final static QName _SampleRequestCSalesRepContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesRepContact_c");
    private final static QName _SampleRequestCDistributorAccountIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorAccount_Id_c");
    private final static QName _SampleRequestCBUMicrophoneIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMicrophoneID_c");
    private final static QName _SampleRequestCEndCustomerReportC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomerReport_c");
    private final static QName _SampleRequestCNPITeamApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPITeamApproval_c");
    private final static QName _SampleRequestCProduct2RequestedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2RequestedQuantity_c");
    private final static QName _SampleRequestCINTGC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "INTG_c");
    private final static QName _SampleRequestCNPICommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPIComments_c");
    private final static QName _SampleRequestCCRMRowIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRMRowID_c");
    private final static QName _SampleRequestCSourceType_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SourceType");
    private final static QName _SampleRequestCVPOfSalesApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesApproval_c");
    private final static QName _SampleRequestCDistributorContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorContact_c");
    private final static QName _SampleRequestCProduct2NameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2Name_c");
    private final static QName _SampleRequestCRegionalManagerApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerApproval_c");
    private final static QName _SampleRequestCProduct2ShippedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2ShippedQuantity_c");
    private final static QName _SampleRequestCOrderCheckC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderCheck_c");
    private final static QName _SampleRequestCAttachmentEntityName_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AttachmentEntityName");
    private final static QName _SampleRequestCCustomerContactIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerContact_Id_c");
    private final static QName _SampleRequestCProd3ApproverC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Prod3Approver_c");
    private final static QName _SampleRequestCProd3DCLIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Prod3DCL_Id_c");
    private final static QName _SampleRequestCBUMotionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotion_c");
    private final static QName _SampleRequestCProd3IdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Prod3Id_c");
    private final static QName _SampleRequestCSampleRequestDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SampleRequestDate_c");
    private final static QName _SampleRequestCProduct2SONumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2SONumber_c");
    private final static QName _SampleRequestCShipToEmailAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToEmailAddress_c");
    private final static QName _SampleRequestCParentCustomerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentCustomer_Id_c");
    private final static QName _SampleRequestCVPOfSalesNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesName_c");
    private final static QName _SampleRequestCBUMicrophoneApproverC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMicrophoneApprover_c");
    private final static QName _SampleRequestCRMDCLC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RMDCL_c");
    private final static QName _SampleRequestCRegionalManagerNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerName_c");
    private final static QName _SampleRequestCRegionalManagerEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerEmail_c");
    private final static QName _SampleRequestCProduct3ShippedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3ShippedQuantity_c");
    private final static QName _SampleRequestCNPIProd3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPIProd3_c");
    private final static QName _SampleRequestCProduct3NameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3Name_c");
    private final static QName _SampleRequestCProduct1ShippedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product1ShippedQuantity_c");
    private final static QName _SampleRequestCBUProd3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUProd3_c");
    private final static QName _SampleRequestCShipToIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipTo_Id_c");
    private final static QName _SampleRequestCProduct3ShippedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3ShippedDate_c");
    private final static QName _SampleRequestCNPIC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NPI_c");
    private final static QName _SampleRequestCRMDCLIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RMDCL_Id_c");
    private final static QName _SampleRequestCBUMotionEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotionEmail_c");
    private final static QName _SampleRequestCBUMicrophoneEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMicrophoneEmail_c");
    private final static QName _SampleRequestCRegionalManagerIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerID_c");
    private final static QName _SampleRequestCProduct3SONumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product3SONumber_c");
    private final static QName _SampleRequestCShipmentStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipmentStatus_c");
    private final static QName _SampleRequestCProduct2ShippedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product2ShippedDate_c");
    private final static QName _SampleRequestCBUMicrophoneDCLC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMicrophoneDCL_c");
    private final static QName _SampleRequestCVPOfSalesEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesEmail_c");
    private final static QName _SampleRequestCDistributorEmailAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorEmailAddress_c");
    private final static QName _SampleRequestCProd3DCLC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Prod3DCL_c");
    private final static QName _SampleRequestCVPOfSalesIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesID_c");
    private final static QName _SampleRequestCProjectNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName_c");
    private final static QName _SampleRequestCProduct1ShippedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Product1ShippedDate_c");
    private final static QName _SampleRequestCBUMotionApproverC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotionApprover_c");
    private final static QName _SampleRequestCBUMotionIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BUMotionID_c");
    private final static QName _SampleRequestCShipToC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipTo_c");
    private final static QName _PriceListCStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Status_c");
    private final static QName _PriceListCPriceListIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListID_c");
    private final static QName _OrdersCShipQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipQuantity_c");
    private final static QName _OrdersCOwnerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Owner_c");
    private final static QName _OrdersCOrderNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderNumber_c");
    private final static QName _OrdersCOrderLineStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderLineStatus_c");
    private final static QName _OrdersCOrderedQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderedQuantity_c");
    private final static QName _OrdersCOrderDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderDate_c");
    private final static QName _OrdersCLineIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineID_c");
    private final static QName _OrdersCMarketC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Market_c");
    private final static QName _OrdersCSampleRequestC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SampleRequest_c");
    private final static QName _OrdersCInvoicedateQuarterC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoicedateQuarter_c");
    private final static QName _OrdersCTrackingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Tracking_c");
    private final static QName _OrdersCCRDFiscalQtrRPTC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRDFiscalQtr_RPT_c");
    private final static QName _OrdersCOrderTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderType_c");
    private final static QName _OrdersCSubMarketC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubMarket_c");
    private final static QName _OrdersCPartMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PartMobile_c");
    private final static QName _OrdersCOrderLineNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderLineNumber_c");
    private final static QName _OrdersCInvoiceDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoiceDate_c");
    private final static QName _OrdersCPartIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Part_Id_c");
    private final static QName _OrdersCCSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CSD_c");
    private final static QName _OrdersCOwnerMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OwnerMobile_c");
    private final static QName _OrdersCCRDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRD_c");
    private final static QName _OrdersCInvoicedateQuarterRPTC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoicedateQuarter_RPT_c");
    private final static QName _OrdersCCarrierNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CarrierName_c");
    private final static QName _OrdersCShippingDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShippingDate_c");
    private final static QName _OrdersCOwnerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Owner_Id_c");
    private final static QName _OrdersCCRDFiscalQtrC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRDFiscalQtr_c");
    private final static QName _OrdersCOrderLineType1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderLineType1_c");
    private final static QName _OrdersCOrderLineStatus1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderLineStatus1_c");
    private final static QName _OrdersCEndCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomer_c");
    private final static QName _OrdersCPartC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Part_c");
    private final static QName _OrdersCOrderLineTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderLineType_c");
    private final static QName _OrdersCRevenueC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Revenue_c");
    private final static QName _RevenuePlanCRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RequestId");
    private final static QName _RevenuePlanCIsOwner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IsOwner");
    private final static QName _RevenuePlanCJobDefinitionName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionName");
    private final static QName _RevenuePlanCUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UserLastUpdateDate");
    private final static QName _RevenuePlanCJobDefinitionPackage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionPackage");
    private final static QName _RevenuePlanCEstimatedRevenueRampYearC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EstimatedRevenueRampYear_c");
    private final static QName _RevenuePlanCCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CorpCurrencyCode");
    private final static QName _RevenuePlanCCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurcyConvRateType");
    private final static QName _RevenuePlanCCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerPillar");
    private final static QName _RevenuePlanCEstimatedPercentRampYearC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EstimatedPercentRampYear_c");
    private final static QName _RevenuePlanCLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateLogin");
    private final static QName _RevenuePlanCYearC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Year_c");
    private final static QName _RevenuePlanCCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerSor");
    private final static QName _RevenuePlanCOpportunityVOIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityVO_Id_c");
    private final static QName _RevenuePlanCObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ObjectVersionNumber");
    private final static QName _RevenuePlanCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrencyCode");
    private final static QName _RevenuePlanCCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfLastUpd");
    private final static QName _QuoteLineItemCProductBUManagerMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductBUManagerMobile_c");
    private final static QName _QuoteLineItemCNewLineExtensionIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NewLineExtensionId_c");
    private final static QName _QuoteLineItemCIIINameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIName_c");
    private final static QName _QuoteLineItemCIIIReviewAndApprovedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIReviewAndApproved_c");
    private final static QName _QuoteLineItemCGrossMarginC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GrossMargin_c");
    private final static QName _QuoteLineItemCProductBUManagerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductBUManager_Id_c");
    private final static QName _QuoteLineItemCNetASP1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NetASP1_c");
    private final static QName _QuoteLineItemCEndCustomerNumberINTGC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomerNumberINTG_c");
    private final static QName _QuoteLineItemCBackendNetASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendNetASP_c");
    private final static QName _QuoteLineItemCExtendedFromQLIIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExtendedFromQLI_Id_c");
    private final static QName _QuoteLineItemCCurrentASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CurrentASP_c");
    private final static QName _QuoteLineItemCBackendRequestedASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendRequestedASP_c");
    private final static QName _QuoteLineItemCOverrideQuoteLineEndDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OverrideQuoteLineEndDate_c");
    private final static QName _QuoteLineItemCBackendCurrentASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendCurrentASP_c");
    private final static QName _QuoteLineItemCVPOfMarketingReviewerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingReviewer_c");
    private final static QName _QuoteLineItemCQuoteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quote_c");
    private final static QName _QuoteLineItemCStLevelGMC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "stLevelGM_c");
    private final static QName _QuoteLineItemCExtendedFromQLIC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExtendedFromQLI_c");
    private final static QName _QuoteLineItemCInvenSenseRepC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvenSenseRep_c");
    private final static QName _QuoteLineItemCRequestedASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RequestedASP_c");
    private final static QName _QuoteLineItemCMarketingManagerNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingManagerName_c");
    private final static QName _QuoteLineItemCVPOfMarketingIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingId_c");
    private final static QName _QuoteLineItemCOverrideQuoteLineStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OverrideQuoteLineStartDate_c");
    private final static QName _QuoteLineItemCRegionalManagerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerId_c");
    private final static QName _QuoteLineItemCPriceListNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListName_Id_c");
    private final static QName _QuoteLineItemCVPOfMarketingReviewedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingReviewedDate_c");
    private final static QName _QuoteLineItemCInvenSenseRepMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvenSenseRepMobile_c");
    private final static QName _QuoteLineItemCPriceListNameINTGIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListNameINTG_Id_c");
    private final static QName _QuoteLineItemCDistributorNumberINTGC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorNumberINTG_c");
    private final static QName _QuoteLineItemCRegionalManagerReviewerMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerReviewerMobile_c");
    private final static QName _QuoteLineItemCSecondLevelGMC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SecondLevelGM_c");
    private final static QName _QuoteLineItemCIIIReviewedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIReviewedDate_c");
    private final static QName _QuoteLineItemCProductBUManagerReviewedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductBUManagerReviewedDate_c");
    private final static QName _QuoteLineItemCCEOGMC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CEOGM_c");
    private final static QName _QuoteLineItemCBackendCostC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendCost_c");
    private final static QName _QuoteLineItemCRMFinalApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RMFinalApproval_c");
    private final static QName _QuoteLineItemCReviewerCommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReviewerComments_c");
    private final static QName _QuoteLineItemCVPOfSalesReviewerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesReviewer_Id_c");
    private final static QName _QuoteLineItemCStandardPriceBookASP1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StandardPriceBookASP1_c");
    private final static QName _QuoteLineItemCRegionalManagerReviewAndAgreedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerReviewAndAgreed_c");
    private final static QName _QuoteLineItemCCustomerApprovedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerApproved_c");
    private final static QName _QuoteLineItemCPriceListNameMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListNameMobile_c");
    private final static QName _QuoteLineItemCSalesRepFloorPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesRepFloorPrice_c");
    private final static QName _QuoteLineItemCVPOfMarketingReviewerMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingReviewerMobile_c");
    private final static QName _QuoteLineItemCVPOfMarketingNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingName_c");
    private final static QName _QuoteLineItemCVPOfSalesReviewAndAgreedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesReviewAndAgreed_c");
    private final static QName _QuoteLineItemCVPOfSalesReviewedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesReviewedDate_c");
    private final static QName _QuoteLineItemCVPOfSalesIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesId_c");
    private final static QName _QuoteLineItemCBackendPartC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendPart_c");
    private final static QName _QuoteLineItemCAnnualQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AnnualQuantity_c");
    private final static QName _QuoteLineItemCCostC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Cost_c");
    private final static QName _QuoteLineItemCMarketSubSegmentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSubSegment_c");
    private final static QName _QuoteLineItemCVPOfMarketingEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingEmail_c");
    private final static QName _QuoteLineItemCProductBUManagerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductBUManager_c");
    private final static QName _QuoteLineItemCPriceListIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListId_c");
    private final static QName _QuoteLineItemCProductFamilyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductFamily_c");
    private final static QName _QuoteLineItemCManualApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ManualApproval_c");
    private final static QName _QuoteLineItemCVPOfSalesFinalApprovalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesFinalApproval_c");
    private final static QName _QuoteLineItemCQuoteLineSubmissionDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteLineSubmissionDate_c");
    private final static QName _QuoteLineItemCMarketingManagerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingManagerId_c");
    private final static QName _QuoteLineItemCIIIDCLC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIDCL_c");
    private final static QName _QuoteLineItemCNetASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NetASP_c");
    private final static QName _QuoteLineItemCApprovedASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ApprovedASP_c");
    private final static QName _QuoteLineItemCCompetitorPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompetitorPrice_c");
    private final static QName _QuoteLineItemCVPOfSalesReviewerMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesReviewerMobile_c");
    private final static QName _QuoteLineItemCExtensionPeriodDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExtensionPeriodDate_c");
    private final static QName _QuoteLineItemCQuoteIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quote_Id_c");
    private final static QName _QuoteLineItemCPriceListNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListName_c");
    private final static QName _QuoteLineItemCVPOfMarketingReviewerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingReviewer_Id_c");
    private final static QName _QuoteLineItemCApprovalCounterC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ApprovalCounter_c");
    private final static QName _QuoteLineItemCExtensionPeriodC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExtensionPeriod_c");
    private final static QName _QuoteLineItemCQuoteTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteType_c");
    private final static QName _QuoteLineItemCCopiedQuoteLineIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CopiedQuoteLineId_c");
    private final static QName _QuoteLineItemCIIIDCLIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIDCL_Id_c");
    private final static QName _QuoteLineItemCCost1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Cost1_c");
    private final static QName _QuoteLineItemCProductBUManagerReviewedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductBUManagerReviewed_c");
    private final static QName _QuoteLineItemCRegionalManagerReviewedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerReviewedDate_c");
    private final static QName _QuoteLineItemCQuoteSourceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteSource_c");
    private final static QName _QuoteLineItemCMinimumQuarterlyVolumeMQVC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MinimumQuarterlyVolumeMQV_c");
    private final static QName _QuoteLineItemCIIIIEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIIEmail_c");
    private final static QName _QuoteLineItemCMarketSegmentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSegment_c");
    private final static QName _QuoteLineItemCVPOfMarketingReviewAndAgreedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfMarketingReviewAndAgreed_c");
    private final static QName _QuoteLineItemCVPOfSalesReviewerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesReviewer_c");
    private final static QName _QuoteLineItemCDistributorNameINTGC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorNameINTG_c");
    private final static QName _QuoteLineItemCApprovedASP1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ApprovedASP1_c");
    private final static QName _QuoteLineItemCIIIIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIId_c");
    private final static QName _QuoteLineItemCMarketingManagerEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingManagerEmail_c");
    private final static QName _QuoteLineItemCRegionalManagerReviewerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerReviewer_c");
    private final static QName _QuoteLineItemCVPOfSalesListPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VPOfSalesListPrice_c");
    private final static QName _QuoteLineItemCCompetitorNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompetitorName_c");
    private final static QName _QuoteLineItemCPriceListNameINTGC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PriceListNameINTG_c");
    private final static QName _QuoteLineItemCAutoApprovedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AutoApprovedDate_c");
    private final static QName _QuoteLineItemCCommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Comments_c");
    private final static QName _QuoteLineItemCRegionaManagerFloorPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionaManagerFloorPrice_c");
    private final static QName _QuoteLineItemCStandardPriceBookASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StandardPriceBookASP_c");
    private final static QName _QuoteLineItemCExtensionApprovedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExtensionApproved_c");
    private final static QName _QuoteLineItemCRegionalManagerReviewerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegionalManagerReviewer_Id_c");
    private final static QName _QuoteLineItemCInvenSenseRepIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvenSenseRep_Id_c");
    private final static QName _OrdersTeamCOrdersIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Orders_Id_c");
    private final static QName _ForecastHistoryTeamCForecastHistoryIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ForecastHistory_Id_c");
    private final static QName _BacklogCCRDFiscalYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRDFiscalYear_c");
    private final static QName _BacklogCCRDFiscalMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CRDFiscalMonth_c");
    private final static QName _BacklogCShipFromC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipFrom_c");
    private final static QName _BacklogCDateOrderedQuarterC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateOrderedQuarter_c");
    private final static QName _BacklogCHoldYNC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoldYN_c");
    private final static QName _BacklogCShipToCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToCustomer_c");
    private final static QName _BacklogCBillToSiteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillToSite_c");
    private final static QName _BacklogCDeliveryLineStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryLineStatus_c");
    private final static QName _BacklogCGradeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Grade_c");
    private final static QName _BacklogCMarketSubSegment1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSubSegment1_c");
    private final static QName _BacklogCDateOrderedYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateOrderedYear_c");
    private final static QName _BacklogCHoldYN1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoldYN1_c");
    private final static QName _BacklogCQuoteIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteID_c");
    private final static QName _BacklogCShippingMethodC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShippingMethod_c");
    private final static QName _BacklogCCustomerPOC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerPO_c");
    private final static QName _BacklogCLineShippingInstructionsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineShippingInstructions_c");
    private final static QName _BacklogCItemNumberMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ItemNumberMobile_c");
    private final static QName _BacklogCDeliveryAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryAddress_c");
    private final static QName _BacklogCPromiseDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PromiseDate_c");
    private final static QName _BacklogCDeliveryShipToCtyStZipCtryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryShipToCtyStZipCtry_c");
    private final static QName _BacklogCLineStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineStatus_c");
    private final static QName _BacklogCCSDFiscalMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CSDFiscalMonth_c");
    private final static QName _BacklogCEndCustomerSiteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomerSite_c");
    private final static QName _BacklogCSOCreationDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SOCreationDate_c");
    private final static QName _BacklogCSoldToCustomerEBSIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SoldToCustomerEBSID_c");
    private final static QName _BacklogCIncoTermsFOB1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IncoTermsFOB1_c");
    private final static QName _BacklogCITWHKAWBC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ITWHKAWB_c");
    private final static QName _BacklogCShockIndicatorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShockIndicator_c");
    private final static QName _BacklogCShipToLocationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToLocation_c");
    private final static QName _BacklogCHarmonizedCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HarmonizedCode_c");
    private final static QName _BacklogCItemNumberIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ItemNumber_Id_c");
    private final static QName _BacklogCTerritoryNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TerritoryName_c");
    private final static QName _BacklogCItemFamilyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ItemFamily_c");
    private final static QName _BacklogCCustomerItemC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerItem_c");
    private final static QName _BacklogCSalesPersonIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesPerson_Id_c");
    private final static QName _BacklogCRemainingQtyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RemainingQty_c");
    private final static QName _BacklogCLineType1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineType1_c");
    private final static QName _BacklogCSalesPersonC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesPerson_c");
    private final static QName _BacklogCLineIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineId_c");
    private final static QName _BacklogCFreightACC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FreightAC_c");
    private final static QName _BacklogCBillToCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillToCustomer_c");
    private final static QName _BacklogCIncoTermsFOBC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IncoTermsFOB_c");
    private final static QName _BacklogCMarketSubSegment2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSubSegment2_c");
    private final static QName _BacklogCLineStatus1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineStatus1_c");
    private final static QName _BacklogCDateOrderedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateOrdered_c");
    private final static QName _BacklogCCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Customer_c");
    private final static QName _BacklogCCSDFiscalQtrC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CSDFiscalQtr_c");
    private final static QName _BacklogCShipToCountryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToCountry_c");
    private final static QName _BacklogCEndCustomerNoC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomerNo_c");
    private final static QName _BacklogCLineNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineNumber_c");
    private final static QName _BacklogCOPSCommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OPSComments_c");
    private final static QName _BacklogCShipToSiteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipToSite_c");
    private final static QName _BacklogCInventoryItemStatusCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InventoryItemStatusCode_c");
    private final static QName _BacklogCBillToLocationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillToLocation_c");
    private final static QName _BacklogCDateOrderedMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateOrderedMonth_c");
    private final static QName _BacklogCSpecialLabelC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SpecialLabel_c");
    private final static QName _BacklogCItemNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ItemNumber_c");
    private final static QName _BacklogCDeliveryAddress4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryAddress4_c");
    private final static QName _BacklogCLinePackingInstructionsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LinePackingInstructions_c");
    private final static QName _BacklogCITWHKDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ITWHKDate_c");
    private final static QName _BacklogCMarketSegment1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSegment1_c");
    private final static QName _BacklogCDeliveryAddress3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryAddress3_c");
    private final static QName _BacklogCPlannerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Planner_c");
    private final static QName _BacklogCSalesPersonMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesPersonMobile_c");
    private final static QName _BacklogCDeliveryLineStatus1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryLineStatus1_c");
    private final static QName _BacklogCLineTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineType_c");
    private final static QName _BacklogCUnitSellingPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UnitSellingPrice_c");
    private final static QName _BacklogCMarketSegment2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSegment2_c");
    private final static QName _BacklogCPackingInstructionsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PackingInstructions_c");
    private final static QName _BacklogCCSDFiscalYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CSDFiscalYear_c");
    private final static QName _BacklogCShippingInstructionsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShippingInstructions_c");
    private final static QName _BacklogCOrderType1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrderType1_c");
    private final static QName _BillingCSalesrepNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesrepName_c");
    private final static QName _BillingCInvoiceNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoiceNumber_c");
    private final static QName _BillingCShipCustomerAddress3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerAddress3_c");
    private final static QName _BillingCBillCustomerCountryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerCountry_c");
    private final static QName _BillingCSubMarket1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubMarket1_c");
    private final static QName _BillingCPullIn1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PullIn1_c");
    private final static QName _BillingCPullInC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PullIn_c");
    private final static QName _BillingCType1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Type1_c");
    private final static QName _BillingCBillCustomerCityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerCity_c");
    private final static QName _BillingCBillCustomerStateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerState_c");
    private final static QName _BillingCCustomerTrxLineIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerTrxLineId_c");
    private final static QName _BillingCActualShipmentDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualShipmentDate_c");
    private final static QName _BillingCSalesOrderDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesOrderDate_c");
    private final static QName _BillingCPartNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PartNumber_c");
    private final static QName _BillingCAmountDueRemainingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AmountDueRemaining_c");
    private final static QName _BillingCShipCustomerCountryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerCountry_c");
    private final static QName _BillingCDeliveryNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryName_c");
    private final static QName _BillingCClass1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Class1_c");
    private final static QName _BillingCTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Type_c");
    private final static QName _BillingCBillCustomerAddress3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerAddress3_c");
    private final static QName _BillingCBillCustomerAddress1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerAddress1_c");
    private final static QName _BillingCLineSalesrepC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LineSalesrep_c");
    private final static QName _BillingCINCOTERMC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "INCOTERM_c");
    private final static QName _BillingCItemTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ItemType_c");
    private final static QName _BillingCBillCustomerAddress2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerAddress2_c");
    private final static QName _BillingCReturnReasonC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReturnReason_c");
    private final static QName _BillingCShipCustomerNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerNumber_c");
    private final static QName _BillingCBillCustomerNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillCustomerNumber_c");
    private final static QName _BillingCPurchaseOrderC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PurchaseOrder_c");
    private final static QName _BillingCClassC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Class_c");
    private final static QName _BillingCSalesrepNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesrepName_Id_c");
    private final static QName _BillingCQuoteNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteNumber_c");
    private final static QName _BillingCInvoiceLineType1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoiceLineType1_c");
    private final static QName _BillingCSoldFromInventoryOrgC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SoldFromInventoryOrg_c");
    private final static QName _BillingCShipdateMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipdateMonth_c");
    private final static QName _BillingCShipCustomerCityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerCity_c");
    private final static QName _BillingCShipCustomerNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerName_c");
    private final static QName _BillingCBackendASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Backend_ASP_c");
    private final static QName _BillingCInvoicedateYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoicedateYear_c");
    private final static QName _BillingCShipCustomerStateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerState_c");
    private final static QName _BillingCInvoicedQtyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoicedQty_c");
    private final static QName _BillingCFuncAmountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FuncAmount_c");
    private final static QName _BillingCScheduleShipDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ScheduleShipDate_c");
    private final static QName _BillingCShipCustomerAddress2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerAddress2_c");
    private final static QName _BillingCRequestDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RequestDate_c");
    private final static QName _BillingCShipdatedateQuarterC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipdatedateQuarter_c");
    private final static QName _BillingCUnitPriceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UnitPrice_c");
    private final static QName _BillingCGLDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GLDate_c");
    private final static QName _BillingCHeaderSalesrepC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HeaderSalesrep_c");
    private final static QName _BillingCInvoicedateMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoicedateMonth_c");
    private final static QName _BillingCAccountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Account_c");
    private final static QName _BillingCBatchSourceNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BatchSourceName_c");
    private final static QName _BillingCAmountDueOriginalC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AmountDueOriginal_c");
    private final static QName _BillingCFobC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Fob_c");
    private final static QName _BillingCDueDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DueDate_c");
    private final static QName _BillingCPartNumberMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PartNumberMobile_c");
    private final static QName _BillingCWaybillNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "WaybillNumber_c");
    private final static QName _BillingCShipCustomerAddress1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipCustomerAddress1_c");
    private final static QName _BillingCShippingQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShippingQuantity_c");
    private final static QName _BillingCSalesRepNameMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SalesRepNameMobile_c");
    private final static QName _BillingCShipdatedateYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ShipdatedateYear_c");
    private final static QName _BillingCPartNumberIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PartNumber_Id_c");
    private final static QName _BillingCInvoiceLineTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvoiceLineType_c");
    private final static QName _ForecastHistoryCLockedYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LockedYear_c");
    private final static QName _ForecastHistoryCForecastDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ForecastDate_c");
    private final static QName _ForecastHistoryCOpportunityIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_Id_c");
    private final static QName _ForecastHistoryCASPQ1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ1_c");
    private final static QName _ForecastHistoryCQuantity2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity2_c");
    private final static QName _ForecastHistoryCASPQ3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ3_c");
    private final static QName _ForecastHistoryCASP1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP1_c");
    private final static QName _ForecastHistoryCQuantity12C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity12_c");
    private final static QName _ForecastHistoryCASP601C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP601_c");
    private final static QName _ForecastHistoryCASP3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP3_c");
    private final static QName _ForecastHistoryCForecastIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Forecast_Id_c");
    private final static QName _ForecastHistoryCQuantity10C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity10_c");
    private final static QName _ForecastHistoryCASPQ44C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ44_c");
    private final static QName _ForecastHistoryCASP701C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP701_c");
    private final static QName _ForecastHistoryCASP801C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP801_c");
    private final static QName _ForecastHistoryCQuantity11C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity11_c");
    private final static QName _ForecastHistoryCRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Role_c");
    private final static QName _ForecastHistoryCASP122C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP122_c");
    private final static QName _ForecastHistoryCQuantity7C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity7_c");
    private final static QName _ForecastHistoryCASP201C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP201_c");
    private final static QName _ForecastHistoryCCreationDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CreationDate_c");
    private final static QName _ForecastHistoryCLockedByUserNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LockedByUserName_c");
    private final static QName _ForecastHistoryCASPQ4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ4_c");
    private final static QName _ForecastHistoryCForecastRecordTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ForecastRecordType_c");
    private final static QName _ForecastHistoryCEndCustomerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomer_Id_c");
    private final static QName _ForecastHistoryCForecastTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ForecastType_c");
    private final static QName _ForecastHistoryCREV2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV2_c");
    private final static QName _ForecastHistoryCASPQ33C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ33_c");
    private final static QName _ForecastHistoryCQuantity9C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity9_c");
    private final static QName _ForecastHistoryCQTYQ3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QTYQ3_c");
    private final static QName _ForecastHistoryCASPC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP_c");
    private final static QName _ForecastHistoryCQuantity5C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity5_c");
    private final static QName _ForecastHistoryCOpportunityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_c");
    private final static QName _ForecastHistoryCMarket1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Market1_c");
    private final static QName _ForecastHistoryCQTYQ1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QTYQ1_c");
    private final static QName _ForecastHistoryCASP101C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP101_c");
    private final static QName _ForecastHistoryCLockedMonthC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LockedMonth_c");
    private final static QName _ForecastHistoryCREV4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV4_c");
    private final static QName _ForecastHistoryCQuantity3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity3_c");
    private final static QName _ForecastHistoryCQuantity1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity1_c");
    private final static QName _ForecastHistoryCREV12C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV12_c");
    private final static QName _ForecastHistoryCREV3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV3_c");
    private final static QName _ForecastHistoryCASPQ2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ2_c");
    private final static QName _ForecastHistoryCQTYQ4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QTYQ4_c");
    private final static QName _ForecastHistoryCASP100C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP100_c");
    private final static QName _ForecastHistoryCREV11C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV11_c");
    private final static QName _ForecastHistoryCREVQ3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REVQ3_c");
    private final static QName _ForecastHistoryCASP901C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP901_c");
    private final static QName _ForecastHistoryCForecastC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Forecast_c");
    private final static QName _ForecastHistoryCBU1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BU1_c");
    private final static QName _ForecastHistoryCREVQ4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REVQ4_c");
    private final static QName _ForecastHistoryCASP2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP2_c");
    private final static QName _ForecastHistoryCREV10C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV10_c");
    private final static QName _ForecastHistoryCYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Year_c");
    private final static QName _ForecastHistoryCQuarterCYC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuarterCY_c");
    private final static QName _ForecastHistoryCASP401C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP401_c");
    private final static QName _ForecastHistoryCASP5C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP5_c");
    private final static QName _ForecastHistoryCASPQ22C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ22_c");
    private final static QName _ForecastHistoryCASP4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP4_c");
    private final static QName _ForecastHistoryCREV9C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV9_c");
    private final static QName _ForecastHistoryCProgramNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProgramName_c");
    private final static QName _ForecastHistoryCLockedByIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LockedByID_c");
    private final static QName _ForecastHistoryCASP111C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP111_c");
    private final static QName _ForecastHistoryCREVQ1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REVQ1_c");
    private final static QName _ForecastHistoryCProductCategoryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProductCategory_c");
    private final static QName _ForecastHistoryCREVQ2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REVQ2_c");
    private final static QName _ForecastHistoryCASPQ11C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASPQ11_c");
    private final static QName _ForecastHistoryCQTYQ2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QTYQ2_c");
    private final static QName _ForecastHistoryCASP301C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP301_c");
    private final static QName _ForecastHistoryCQuantity6C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity6_c");
    private final static QName _ForecastHistoryCASP11C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP11_c");
    private final static QName _ForecastHistoryCQuantityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity_c");
    private final static QName _ForecastHistoryCASP12C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP12_c");
    private final static QName _ForecastHistoryCREV1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV1_c");
    private final static QName _ForecastHistoryCASP501C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP501_c");
    private final static QName _ForecastHistoryCASP10C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP10_c");
    private final static QName _ForecastHistoryCREV7C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV7_c");
    private final static QName _ForecastHistoryCASP9C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP9_c");
    private final static QName _ForecastHistoryCREV5C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV5_c");
    private final static QName _ForecastHistoryCQuantity8C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity8_c");
    private final static QName _ForecastHistoryCASP6C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP6_c");
    private final static QName _ForecastHistoryCREV6C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV6_c");
    private final static QName _ForecastHistoryCASP7C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP7_c");
    private final static QName _ForecastHistoryCREV8C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "REV8_c");
    private final static QName _ForecastHistoryCASP8C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ASP8_c");
    private final static QName _ForecastHistoryCQuantity4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Quantity4_c");
    private final static QName _ForecastCustomCDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Description_c");
    private final static QName _BillingTeamCBillingIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Billing_Id_c");
    private final static QName _QuoteCUSAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "USAddress_c");
    private final static QName _QuoteCCarrierC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Carrier_c");
    private final static QName _QuoteCConversionDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConversionDate_c");
    private final static QName _QuoteCPOC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PO_c");
    private final static QName _QuoteCDistributorNameReportC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DistributorNameReport_c");
    private final static QName _QuoteCIIIAddress1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IIIAddress1_c");
    private final static QName _QuoteCECContactNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ECContactName_Id_c");
    private final static QName _QuoteCCMODMNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CMODMName_Id_c");
    private final static QName _QuoteCCMODMNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CMODMName_c");
    private final static QName _QuoteCCMODMNameReportC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CMODMNameReport_c");
    private final static QName _QuoteCEndCustomerNameReportC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndCustomerNameReport_c");
    private final static QName _QuoteCQuoteApprovalDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteApprovalDate_c");
    private final static QName _QuoteCNoteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Note_c");
    private final static QName _QuoteCQuoteStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteStartDate_c");
    private final static QName _QuoteCRegionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Region_c");
    private final static QName _QuoteCInvensenseRepMobileC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InvensenseRepMobile_c");
    private final static QName _QuoteCAdditionalDistribuitionNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalDistribuitionNames_c");
    private final static QName _QuoteCECContactNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ECContactName_c");
    private final static QName _QuoteCCustomerApprovedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerApprovedDate_c");
    private final static QName _QuoteCQuoteRequestDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteRequestDate_c");
    private final static QName _QuoteCQuoteApprovalStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteApprovalStatus_c");
    private final static QName _QuoteCQuoteExpirationDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "QuoteExpirationDate_c");
    private final static QName _QuoteCCMODMAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CMODMAddress_c");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gapblue.web.stubs.salescustomobject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessEntityResponse }
     * 
     */
    public ProcessEntityResponse createProcessEntityResponse() {
        return new ProcessEntityResponse();
    }

    /**
     * Create an instance of {@link DeleteEntityResponse }
     * 
     */
    public DeleteEntityResponse createDeleteEntityResponse() {
        return new DeleteEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntityResponse }
     * 
     */
    public CreateEntityResponse createCreateEntityResponse() {
        return new CreateEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateEntity }
     * 
     */
    public UpdateEntity createUpdateEntity() {
        return new UpdateEntity();
    }

    /**
     * Create an instance of {@link GetEntity }
     * 
     */
    public GetEntity createGetEntity() {
        return new GetEntity();
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link MergeEntityResponse }
     * 
     */
    public MergeEntityResponse createMergeEntityResponse() {
        return new MergeEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntity }
     * 
     */
    public CreateEntity createCreateEntity() {
        return new CreateEntity();
    }

    /**
     * Create an instance of {@link UpdateEntityResponse }
     * 
     */
    public UpdateEntityResponse createUpdateEntityResponse() {
        return new UpdateEntityResponse();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link ProcessEntity }
     * 
     */
    public ProcessEntity createProcessEntity() {
        return new ProcessEntity();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link FindEntity }
     * 
     */
    public FindEntity createFindEntity() {
        return new FindEntity();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link FindEntityResponse }
     * 
     */
    public FindEntityResponse createFindEntityResponse() {
        return new FindEntityResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link GetEntityResponse }
     * 
     */
    public GetEntityResponse createGetEntityResponse() {
        return new GetEntityResponse();
    }

    /**
     * Create an instance of {@link MergeEntity }
     * 
     */
    public MergeEntity createMergeEntity() {
        return new MergeEntity();
    }

    /**
     * Create an instance of {@link QuoteLineItemC }
     * 
     */
    public QuoteLineItemC createQuoteLineItemC() {
        return new QuoteLineItemC();
    }

    /**
     * Create an instance of {@link ForecastTeamC }
     * 
     */
    public ForecastTeamC createForecastTeamC() {
        return new ForecastTeamC();
    }

    /**
     * Create an instance of {@link BillingC }
     * 
     */
    public BillingC createBillingC() {
        return new BillingC();
    }

    /**
     * Create an instance of {@link PriceListC }
     * 
     */
    public PriceListC createPriceListC() {
        return new PriceListC();
    }

    /**
     * Create an instance of {@link SampleRequestC }
     * 
     */
    public SampleRequestC createSampleRequestC() {
        return new SampleRequestC();
    }

    /**
     * Create an instance of {@link QuoteC }
     * 
     */
    public QuoteC createQuoteC() {
        return new QuoteC();
    }

    /**
     * Create an instance of {@link BacklogTeamC }
     * 
     */
    public BacklogTeamC createBacklogTeamC() {
        return new BacklogTeamC();
    }

    /**
     * Create an instance of {@link OrdersTeamC }
     * 
     */
    public OrdersTeamC createOrdersTeamC() {
        return new OrdersTeamC();
    }

    /**
     * Create an instance of {@link ForecastHistoryC }
     * 
     */
    public ForecastHistoryC createForecastHistoryC() {
        return new ForecastHistoryC();
    }

    /**
     * Create an instance of {@link BillingTeamC }
     * 
     */
    public BillingTeamC createBillingTeamC() {
        return new BillingTeamC();
    }

    /**
     * Create an instance of {@link QuoteTeamC }
     * 
     */
    public QuoteTeamC createQuoteTeamC() {
        return new QuoteTeamC();
    }

    /**
     * Create an instance of {@link SampleRequestTeamC }
     * 
     */
    public SampleRequestTeamC createSampleRequestTeamC() {
        return new SampleRequestTeamC();
    }

    /**
     * Create an instance of {@link ForecastHistoryTeamC }
     * 
     */
    public ForecastHistoryTeamC createForecastHistoryTeamC() {
        return new ForecastHistoryTeamC();
    }

    /**
     * Create an instance of {@link ForecastCustomC }
     * 
     */
    public ForecastCustomC createForecastCustomC() {
        return new ForecastCustomC();
    }

    /**
     * Create an instance of {@link BacklogC }
     * 
     */
    public BacklogC createBacklogC() {
        return new BacklogC();
    }

    /**
     * Create an instance of {@link QuoteLineItemTeamC }
     * 
     */
    public QuoteLineItemTeamC createQuoteLineItemTeamC() {
        return new QuoteLineItemTeamC();
    }

    /**
     * Create an instance of {@link OrdersC }
     * 
     */
    public OrdersC createOrdersC() {
        return new OrdersC();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link RevenuePlanC }
     * 
     */
    public RevenuePlanC createRevenuePlanC() {
        return new RevenuePlanC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleRequestTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "sampleRequestTeam_c")
    public JAXBElement<SampleRequestTeamC> createSampleRequestTeamC(SampleRequestTeamC value) {
        return new JAXBElement<SampleRequestTeamC>(_SampleRequestTeamC_QNAME, SampleRequestTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "quoteLineItemTeam_c")
    public JAXBElement<QuoteLineItemTeamC> createQuoteLineItemTeamC(QuoteLineItemTeamC value) {
        return new JAXBElement<QuoteLineItemTeamC>(_QuoteLineItemTeamC_QNAME, QuoteLineItemTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "orders_c")
    public JAXBElement<OrdersC> createOrdersC(OrdersC value) {
        return new JAXBElement<OrdersC>(_OrdersC_QNAME, OrdersC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "priceList_c")
    public JAXBElement<PriceListC> createPriceListC(PriceListC value) {
        return new JAXBElement<PriceListC>(_PriceListC_QNAME, PriceListC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenuePlanC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "revenuePlan_c")
    public JAXBElement<RevenuePlanC> createRevenuePlanC(RevenuePlanC value) {
        return new JAXBElement<RevenuePlanC>(_RevenuePlanC_QNAME, RevenuePlanC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "billing_c")
    public JAXBElement<BillingC> createBillingC(BillingC value) {
        return new JAXBElement<BillingC>(_BillingC_QNAME, BillingC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ordersTeam_c")
    public JAXBElement<OrdersTeamC> createOrdersTeamC(OrdersTeamC value) {
        return new JAXBElement<OrdersTeamC>(_OrdersTeamC_QNAME, OrdersTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacklogTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "backlogTeam_c")
    public JAXBElement<BacklogTeamC> createBacklogTeamC(BacklogTeamC value) {
        return new JAXBElement<BacklogTeamC>(_BacklogTeamC_QNAME, BacklogTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "quote_c")
    public JAXBElement<QuoteC> createQuoteC(QuoteC value) {
        return new JAXBElement<QuoteC>(_QuoteC_QNAME, QuoteC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastHistoryTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "forecastHistoryTeam_c")
    public JAXBElement<ForecastHistoryTeamC> createForecastHistoryTeamC(ForecastHistoryTeamC value) {
        return new JAXBElement<ForecastHistoryTeamC>(_ForecastHistoryTeamC_QNAME, ForecastHistoryTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastCustomC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "forecast_Custom_c")
    public JAXBElement<ForecastCustomC> createForecastCustomC(ForecastCustomC value) {
        return new JAXBElement<ForecastCustomC>(_ForecastCustomC_QNAME, ForecastCustomC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "quoteTeam_c")
    public JAXBElement<QuoteTeamC> createQuoteTeamC(QuoteTeamC value) {
        return new JAXBElement<QuoteTeamC>(_QuoteTeamC_QNAME, QuoteTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacklogC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "backlog_c")
    public JAXBElement<BacklogC> createBacklogC(BacklogC value) {
        return new JAXBElement<BacklogC>(_BacklogC_QNAME, BacklogC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleRequestC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "sampleRequest_c")
    public JAXBElement<SampleRequestC> createSampleRequestC(SampleRequestC value) {
        return new JAXBElement<SampleRequestC>(_SampleRequestC_QNAME, SampleRequestC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "quoteLineItem_c")
    public JAXBElement<QuoteLineItemC> createQuoteLineItemC(QuoteLineItemC value) {
        return new JAXBElement<QuoteLineItemC>(_QuoteLineItemC_QNAME, QuoteLineItemC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "forecastTeam_c")
    public JAXBElement<ForecastTeamC> createForecastTeamC(ForecastTeamC value) {
        return new JAXBElement<ForecastTeamC>(_ForecastTeamC_QNAME, ForecastTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastHistoryC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "forecastHistory_c")
    public JAXBElement<ForecastHistoryC> createForecastHistoryC(ForecastHistoryC value) {
        return new JAXBElement<ForecastHistoryC>(_ForecastHistoryC_QNAME, ForecastHistoryC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingTeamC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "billingTeam_c")
    public JAXBElement<BillingTeamC> createBillingTeamC(BillingTeamC value) {
        return new JAXBElement<BillingTeamC>(_BillingTeamC_QNAME, BillingTeamC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Forecast_Custom_Id_c", scope = ForecastTeamC.class)
    public JAXBElement<BigDecimal> createForecastTeamCForecastCustomIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCForecastCustomIdC_QNAME, BigDecimal.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ForecastTeamC.class)
    public JAXBElement<Long> createForecastTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ForecastTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ForecastTeamC.class)
    public JAXBElement<Integer> createForecastTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = ForecastTeamC.class)
    public JAXBElement<BigDecimal> createForecastTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ForecastTeamC.class)
    public JAXBElement<Integer> createForecastTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ForecastTeamC.class)
    public JAXBElement<BigDecimal> createForecastTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ForecastTeamC.class)
    public JAXBElement<String> createForecastTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, ForecastTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = BacklogTeamC.class)
    public JAXBElement<Long> createBacklogTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = BacklogTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createBacklogTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Backlog_Id_c", scope = BacklogTeamC.class)
    public JAXBElement<BigDecimal> createBacklogTeamCBacklogIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BacklogTeamCBacklogIdC_QNAME, BigDecimal.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = BacklogTeamC.class)
    public JAXBElement<Integer> createBacklogTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = BacklogTeamC.class)
    public JAXBElement<BigDecimal> createBacklogTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = BacklogTeamC.class)
    public JAXBElement<Integer> createBacklogTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = BacklogTeamC.class)
    public JAXBElement<BigDecimal> createBacklogTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = BacklogTeamC.class)
    public JAXBElement<String> createBacklogTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, BacklogTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = QuoteLineItemTeamC.class)
    public JAXBElement<Long> createQuoteLineItemTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = QuoteLineItemTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = QuoteLineItemTeamC.class)
    public JAXBElement<Integer> createQuoteLineItemTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteLineItem_Id_c", scope = QuoteLineItemTeamC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemTeamCQuoteLineItemIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemTeamCQuoteLineItemIdC_QNAME, BigDecimal.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = QuoteLineItemTeamC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = QuoteLineItemTeamC.class)
    public JAXBElement<Integer> createQuoteLineItemTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = QuoteLineItemTeamC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = QuoteLineItemTeamC.class)
    public JAXBElement<String> createQuoteLineItemTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, QuoteLineItemTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = SampleRequestTeamC.class)
    public JAXBElement<Long> createSampleRequestTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = SampleRequestTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = SampleRequestTeamC.class)
    public JAXBElement<Integer> createSampleRequestTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = SampleRequestTeamC.class)
    public JAXBElement<BigDecimal> createSampleRequestTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = SampleRequestTeamC.class)
    public JAXBElement<Integer> createSampleRequestTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Username_c", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCUsernameC(String value) {
        return new JAXBElement<String>(_SampleRequestTeamCUsernameC_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SampleRequest_Id_c", scope = SampleRequestTeamC.class)
    public JAXBElement<BigDecimal> createSampleRequestTeamCSampleRequestIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestTeamCSampleRequestIdC_QNAME, BigDecimal.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = SampleRequestTeamC.class)
    public JAXBElement<BigDecimal> createSampleRequestTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = SampleRequestTeamC.class)
    public JAXBElement<String> createSampleRequestTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, SampleRequestTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesBranch_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCSalesBranchC(String value) {
        return new JAXBElement<String>(_SampleRequestCSalesBranchC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMicrophoneDCL_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCBUMicrophoneDCLIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCBUMicrophoneDCLIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product1NameMobile_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct1NameMobileC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct1NameMobileC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2Name_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct2NameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct2NameIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = SampleRequestC.class)
    public JAXBElement<Integer> createSampleRequestCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product1TrackingNumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct1TrackingNumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct1TrackingNumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product1SONumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct1SONumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct1SONumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TR_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCTRC(String value) {
        return new JAXBElement<String>(_SampleRequestCTRC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentCustomer_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCParentCustomerC(String value) {
        return new JAXBElement<String>(_SampleRequestCParentCustomerC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Region1_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRegion1C(String value) {
        return new JAXBElement<String>(_SampleRequestCRegion1C_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestedByMobile_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRequestedByMobileC(String value) {
        return new JAXBElement<String>(_SampleRequestCRequestedByMobileC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCOwnerIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCOwnerIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorAddress_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCDistributorAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCDistributorAddressC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Prod3Email_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProd3EmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCProd3EmailC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ApprovalStatus_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCApprovalStatusC(String value) {
        return new JAXBElement<String>(_SampleRequestCApprovalStatusC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3NameMobile_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct3NameMobileC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct3NameMobileC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3RequestedQuantity_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct3RequestedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct3RequestedQuantityC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3Name_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct3NameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct3NameIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorAccount_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCDistributorAccountC(String value) {
        return new JAXBElement<String>(_SampleRequestCDistributorAccountC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerContact_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCustomerContactC(String value) {
        return new JAXBElement<String>(_SampleRequestCCustomerContactC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToAddress_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCShipToAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipToAddressC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotionDCL_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCBUMotionDCLIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCBUMotionDCLIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPIProd1_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPIProd1C(String value) {
        return new JAXBElement<String>(_SampleRequestCNPIProd1C_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPIProd2_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPIProd2C(String value) {
        return new JAXBElement<String>(_SampleRequestCNPIProd2C_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2TrackingNumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct2TrackingNumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct2TrackingNumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotionDCL_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMotionDCLC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMotionDCLC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToContact_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCShipToContactC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipToContactC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3TrackingNumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct3TrackingNumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct3TrackingNumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2NameMobile_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct2NameMobileC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct2NameMobileC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesRepContact_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCSalesRepContactC(String value) {
        return new JAXBElement<String>(_SampleRequestCSalesRepContactC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorAccount_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCDistributorAccountIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCDistributorAccountIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMicrophoneID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMicrophoneIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMicrophoneIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomerReport_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCEndCustomerReportC(String value) {
        return new JAXBElement<String>(_SampleRequestCEndCustomerReportC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPITeamApproval_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPITeamApprovalC(String value) {
        return new JAXBElement<String>(_SampleRequestCNPITeamApprovalC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2RequestedQuantity_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct2RequestedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct2RequestedQuantityC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPIComments_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPICommentsC(String value) {
        return new JAXBElement<String>(_SampleRequestCNPICommentsC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = SampleRequestC.class, defaultValue = "SampleRequest_c")
    public JAXBElement<String> createSampleRequestCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesApproval_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCVPOfSalesApprovalC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesApprovalC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorContact_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCDistributorContactC(String value) {
        return new JAXBElement<String>(_SampleRequestCDistributorContactC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2Name_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct2NameC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct2NameC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerApproval_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRegionalManagerApprovalC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerApprovalC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2ShippedQuantity_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct2ShippedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct2ShippedQuantityC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderCheck_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCOrderCheckC(String value) {
        return new JAXBElement<String>(_SampleRequestCOrderCheckC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = SampleRequestC.class, defaultValue = "SampleRequest_c")
    public JAXBElement<String> createSampleRequestCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerContact_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCCustomerContactIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCCustomerContactIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Prod3Approver_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProd3ApproverC(String value) {
        return new JAXBElement<String>(_SampleRequestCProd3ApproverC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Prod3DCL_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProd3DCLIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProd3DCLIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotion_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMotionC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMotionC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Prod3Id_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProd3IdC(String value) {
        return new JAXBElement<String>(_SampleRequestCProd3IdC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SampleRequestDate_c", scope = SampleRequestC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestCSampleRequestDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleRequestCSampleRequestDateC_QNAME, XMLGregorianCalendar.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2SONumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct2SONumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct2SONumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToEmailAddress_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCShipToEmailAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipToEmailAddressC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentCustomer_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCParentCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCParentCustomerIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = SampleRequestC.class)
    public JAXBElement<Long> createSampleRequestCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesName_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCVPOfSalesNameC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesNameC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMicrophoneApprover_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMicrophoneApproverC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMicrophoneApproverC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RMDCL_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRMDCLC(String value) {
        return new JAXBElement<String>(_SampleRequestCRMDCLC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = SampleRequestC.class)
    public JAXBElement<Integer> createSampleRequestCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerName_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRegionalManagerNameC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerNameC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerEmail_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRegionalManagerEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerEmailC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3ShippedQuantity_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct3ShippedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct3ShippedQuantityC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPIProd3_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPIProd3C(String value) {
        return new JAXBElement<String>(_SampleRequestCNPIProd3C_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3Name_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct3NameC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct3NameC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product1ShippedQuantity_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCProduct1ShippedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCProduct1ShippedQuantityC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUProd3_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUProd3C(String value) {
        return new JAXBElement<String>(_SampleRequestCBUProd3C_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipTo_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCShipToIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCShipToIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3ShippedDate_c", scope = SampleRequestC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestCProduct3ShippedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleRequestCProduct3ShippedDateC_QNAME, XMLGregorianCalendar.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NPI_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCNPIC(String value) {
        return new JAXBElement<String>(_SampleRequestCNPIC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RMDCL_Id_c", scope = SampleRequestC.class)
    public JAXBElement<BigDecimal> createSampleRequestCRMDCLIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestCRMDCLIdC_QNAME, BigDecimal.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotionEmail_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMotionEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMotionEmailC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMicrophoneEmail_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMicrophoneEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMicrophoneEmailC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCRegionalManagerIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product3SONumber_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProduct3SONumberC(String value) {
        return new JAXBElement<String>(_SampleRequestCProduct3SONumberC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipmentStatus_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCShipmentStatusC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipmentStatusC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product2ShippedDate_c", scope = SampleRequestC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestCProduct2ShippedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleRequestCProduct2ShippedDateC_QNAME, XMLGregorianCalendar.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMicrophoneDCL_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMicrophoneDCLC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMicrophoneDCLC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = SampleRequestC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesEmail_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCVPOfSalesEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesEmailC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorEmailAddress_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCDistributorEmailAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCDistributorEmailAddressC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Prod3DCL_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProd3DCLC(String value) {
        return new JAXBElement<String>(_SampleRequestCProd3DCLC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCVPOfSalesIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCProjectNameC(String value) {
        return new JAXBElement<String>(_SampleRequestCProjectNameC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Product1ShippedDate_c", scope = SampleRequestC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleRequestCProduct1ShippedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleRequestCProduct1ShippedDateC_QNAME, XMLGregorianCalendar.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotionApprover_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMotionApproverC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMotionApproverC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BUMotionID_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCBUMotionIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUMotionIDC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipTo_c", scope = SampleRequestC.class)
    public JAXBElement<String> createSampleRequestCShipToC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipToC_QNAME, String.class, SampleRequestC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = PriceListC.class)
    public JAXBElement<Long> createPriceListCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = PriceListC.class)
    public JAXBElement<XMLGregorianCalendar> createPriceListCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = PriceListC.class, defaultValue = "PriceList_c")
    public JAXBElement<String> createPriceListCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCStatusC(String value) {
        return new JAXBElement<String>(_PriceListCStatusC_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = PriceListC.class)
    public JAXBElement<Integer> createPriceListCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = PriceListC.class)
    public JAXBElement<Integer> createPriceListCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = PriceListC.class, defaultValue = "PriceList_c")
    public JAXBElement<String> createPriceListCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListID_c", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCPriceListIDC(String value) {
        return new JAXBElement<String>(_PriceListCPriceListIDC_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = PriceListC.class)
    public JAXBElement<BigDecimal> createPriceListCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = PriceListC.class)
    public JAXBElement<String> createPriceListCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, PriceListC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = OrdersC.class, defaultValue = "Orders_c")
    public JAXBElement<String> createOrdersCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipQuantity_c", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCShipQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCShipQuantityC_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOwnerC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderNumber_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderNumberC(String value) {
        return new JAXBElement<String>(_OrdersCOrderNumberC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = OrdersC.class)
    public JAXBElement<Integer> createOrdersCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineStatus_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderLineStatusC(String value) {
        return new JAXBElement<String>(_OrdersCOrderLineStatusC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderedQuantity_c", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCOrderedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCOrderedQuantityC_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderDate_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCOrderDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCOrderDateC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineID_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCLineIDC(String value) {
        return new JAXBElement<String>(_OrdersCLineIDC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Market_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCMarketC(String value) {
        return new JAXBElement<String>(_OrdersCMarketC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SampleRequest_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCSampleRequestC(String value) {
        return new JAXBElement<String>(_OrdersCSampleRequestC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = OrdersC.class)
    public JAXBElement<Long> createOrdersCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateQuarter_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCInvoicedateQuarterC(String value) {
        return new JAXBElement<String>(_OrdersCInvoicedateQuarterC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Tracking_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCTrackingC(String value) {
        return new JAXBElement<String>(_OrdersCTrackingC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalQtr_RPT_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCRDFiscalQtrRPTC(String value) {
        return new JAXBElement<String>(_OrdersCCRDFiscalQtrRPTC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderType_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderTypeC(String value) {
        return new JAXBElement<String>(_OrdersCOrderTypeC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = OrdersC.class)
    public JAXBElement<Integer> createOrdersCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SampleRequest_Id_c", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCSampleRequestIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleRequestTeamCSampleRequestIdC_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCSubMarketC(String value) {
        return new JAXBElement<String>(_OrdersCSubMarketC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartMobile_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCPartMobileC(String value) {
        return new JAXBElement<String>(_OrdersCPartMobileC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToAddress_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCShipToAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCShipToAddressC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineNumber_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderLineNumberC(String value) {
        return new JAXBElement<String>(_OrdersCOrderLineNumberC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoiceDate_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCInvoiceDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCInvoiceDateC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_Id_c", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCPartIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCPartIdC_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CSD_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCCSDC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCCSDC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerMobile_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOwnerMobileC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerMobileC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRD_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCCRDC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCCRDC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateQuarter_RPT_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCInvoicedateQuarterRPTC(String value) {
        return new JAXBElement<String>(_OrdersCInvoicedateQuarterRPTC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CarrierName_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCarrierNameC(String value) {
        return new JAXBElement<String>(_OrdersCCarrierNameC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShippingDate_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCShippingDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCShippingDateC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_Id_c", scope = OrdersC.class)
    public JAXBElement<BigDecimal> createOrdersCOwnerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCOwnerIdC_QNAME, BigDecimal.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalQtr_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCRDFiscalQtrC(String value) {
        return new JAXBElement<String>(_OrdersCCRDFiscalQtrC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineType1_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderLineType1C(String value) {
        return new JAXBElement<String>(_OrdersCOrderLineType1C_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineStatus1_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCOrderLineStatus1C(String value) {
        return new JAXBElement<String>(_OrdersCOrderLineStatus1C_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCEndCustomerC(String value) {
        return new JAXBElement<String>(_OrdersCEndCustomerC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCPartC(String value) {
        return new JAXBElement<String>(_OrdersCPartC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = OrdersC.class, defaultValue = "Orders_c")
    public JAXBElement<String> createOrdersCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineType_c", scope = OrdersC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersCOrderLineTypeC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCOrderLineTypeC_QNAME, XMLGregorianCalendar.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = OrdersC.class)
    public JAXBElement<String> createOrdersCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Revenue_c", scope = OrdersC.class)
    public JAXBElement<AmountType> createOrdersCRevenueC(AmountType value) {
        return new JAXBElement<AmountType>(_OrdersCRevenueC_QNAME, AmountType.class, OrdersC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = RevenuePlanC.class)
    public JAXBElement<Long> createRevenuePlanCRequestId(Long value) {
        return new JAXBElement<Long>(_RevenuePlanCRequestId_QNAME, Long.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCIsOwner(String value) {
        return new JAXBElement<String>(_RevenuePlanCIsOwner_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RevenuePlanCJobDefinitionName_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = RevenuePlanC.class)
    public JAXBElement<XMLGregorianCalendar> createRevenuePlanCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenuePlanCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RevenuePlanCJobDefinitionPackage_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EstimatedRevenueRampYear_c", scope = RevenuePlanC.class)
    public JAXBElement<AmountType> createRevenuePlanCEstimatedRevenueRampYearC(AmountType value) {
        return new JAXBElement<AmountType>(_RevenuePlanCEstimatedRevenueRampYearC_QNAME, AmountType.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RevenuePlanCCorpCurrencyCode_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RevenuePlanCCurcyConvRateType_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = RevenuePlanC.class)
    public JAXBElement<Integer> createRevenuePlanCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RevenuePlanCCpdrfVerPillar_QNAME, Integer.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EstimatedPercentRampYear_c", scope = RevenuePlanC.class)
    public JAXBElement<BigDecimal> createRevenuePlanCEstimatedPercentRampYearC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenuePlanCEstimatedPercentRampYearC_QNAME, BigDecimal.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_RevenuePlanCLastUpdateLogin_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Year_c", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCYearC(String value) {
        return new JAXBElement<String>(_RevenuePlanCYearC_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = RevenuePlanC.class)
    public JAXBElement<Integer> createRevenuePlanCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RevenuePlanCCpdrfVerSor_QNAME, Integer.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = RevenuePlanC.class)
    public JAXBElement<BigDecimal> createRevenuePlanCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenuePlanCOpportunityVOIdC_QNAME, BigDecimal.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = RevenuePlanC.class)
    public JAXBElement<BigDecimal> createRevenuePlanCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenuePlanCObjectVersionNumber_QNAME, BigDecimal.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCCurrencyCode(String value) {
        return new JAXBElement<String>(_RevenuePlanCCurrencyCode_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = RevenuePlanC.class)
    public JAXBElement<String> createRevenuePlanCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RevenuePlanCCpdrfLastUpd_QNAME, String.class, RevenuePlanC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductBUManagerMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCProductBUManagerMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCProductBUManagerMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NewLineExtensionId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCNewLineExtensionIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCNewLineExtensionIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIIINameC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCIIINameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIReviewAndApproved_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIIIReviewAndApprovedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCIIIReviewAndApprovedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GrossMargin_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCGrossMarginC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCGrossMarginC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductBUManager_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCProductBUManagerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCProductBUManagerIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NetASP1_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCNetASP1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCNetASP1C_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomerNumberINTG_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCEndCustomerNumberINTGC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCEndCustomerNumberINTGC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendNetASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCBackendNetASPC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCBackendNetASPC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExtendedFromQLI_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCExtendedFromQLIIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCExtendedFromQLIIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrentASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCurrentASPC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCurrentASPC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = QuoteLineItemC.class)
    public JAXBElement<Integer> createQuoteLineItemCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendRequestedASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCBackendRequestedASPC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCBackendRequestedASPC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OverrideQuoteLineEndDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCOverrideQuoteLineEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCOverrideQuoteLineEndDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerID_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCOwnerIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCOwnerIDC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendCurrentASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCBackendCurrentASPC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCBackendCurrentASPC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingReviewer_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingReviewerC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingReviewerC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quote_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCQuoteC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCQuoteC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "stLevelGM_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCStLevelGMC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCStLevelGMC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExtendedFromQLI_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCExtendedFromQLIC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCExtendedFromQLIC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvenSenseRep_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCInvenSenseRepC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCInvenSenseRepC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestedASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRequestedASPC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRequestedASPC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingManagerName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMarketingManagerNameC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketingManagerNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OverrideQuoteLineStartDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCOverrideQuoteLineStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCOverrideQuoteLineStartDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRegionalManagerIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCBUC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ApprovalStatus_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCApprovalStatusC(String value) {
        return new JAXBElement<String>(_SampleRequestCApprovalStatusC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListName_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCPriceListNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCPriceListNameIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingReviewedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCVPOfMarketingReviewedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCVPOfMarketingReviewedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvenSenseRepMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCInvenSenseRepMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCInvenSenseRepMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListNameINTG_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCPriceListNameINTGIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCPriceListNameINTGIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorNumberINTG_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCDistributorNumberINTGC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCDistributorNumberINTGC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerReviewerMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerReviewerMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRegionalManagerReviewerMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SecondLevelGM_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCSecondLevelGMC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCSecondLevelGMC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIReviewedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCIIIReviewedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCIIIReviewedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductBUManagerReviewedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCProductBUManagerReviewedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCProductBUManagerReviewedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CEOGM_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCCEOGMC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCCEOGMC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendCost_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCBackendCostC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCBackendCostC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RMFinalApproval_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRMFinalApprovalC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRMFinalApprovalC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReviewerComments_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCReviewerCommentsC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCReviewerCommentsC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesReviewer_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCVPOfSalesReviewerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCVPOfSalesReviewerIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StandardPriceBookASP1_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCStandardPriceBookASP1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCStandardPriceBookASP1C_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerReviewAndAgreed_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerReviewAndAgreedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRegionalManagerReviewAndAgreedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerApproved_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCustomerApprovedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCustomerApprovedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListNameMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPriceListNameMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCPriceListNameMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesRepFloorPrice_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCSalesRepFloorPriceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCSalesRepFloorPriceC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingReviewerMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingReviewerMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingReviewerMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingNameC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesReviewAndAgreed_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesReviewAndAgreedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfSalesReviewAndAgreedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesReviewedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCVPOfSalesReviewedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCVPOfSalesReviewedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfSalesIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = QuoteLineItemC.class, defaultValue = "QuoteLineItem_c")
    public JAXBElement<String> createQuoteLineItemCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendPart_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCBackendPartC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCBackendPartC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AnnualQuantity_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCAnnualQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCAnnualQuantityC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Cost_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCostC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCostC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSubSegment_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMarketSubSegmentC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketSubSegmentC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingEmail_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingEmailC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingEmailC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductBUManager_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCProductBUManagerC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCProductBUManagerC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPriceListIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCPriceListIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductFamily_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCProductFamilyC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCProductFamilyC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = QuoteLineItemC.class, defaultValue = "QuoteLineItem_c")
    public JAXBElement<String> createQuoteLineItemCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ManualApproval_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCManualApprovalC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCManualApprovalC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesFinalApproval_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesFinalApprovalC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfSalesFinalApprovalC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteLineSubmissionDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCQuoteLineSubmissionDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCQuoteLineSubmissionDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingManagerId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMarketingManagerIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketingManagerIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIDCL_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIIIDCLC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCIIIDCLC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NetASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCNetASPC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCNetASPC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ApprovedASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCApprovedASPC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCApprovedASPC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompetitorPrice_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCCompetitorPriceC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCCompetitorPriceC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesReviewerMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesReviewerMobileC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfSalesReviewerMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExtensionPeriodDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCExtensionPeriodDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCExtensionPeriodDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = QuoteLineItemC.class)
    public JAXBElement<Long> createQuoteLineItemCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quote_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCQuoteIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCQuoteIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPriceListNameC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCPriceListNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingReviewer_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCVPOfMarketingReviewerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCVPOfMarketingReviewerIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesNameC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ApprovalCounter_c", scope = QuoteLineItemC.class)
    public JAXBElement<AmountType> createQuoteLineItemCApprovalCounterC(AmountType value) {
        return new JAXBElement<AmountType>(_QuoteLineItemCApprovalCounterC_QNAME, AmountType.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = QuoteLineItemC.class)
    public JAXBElement<Integer> createQuoteLineItemCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerNameC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExtensionPeriod_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCExtensionPeriodC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCExtensionPeriodC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerEmail_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCRegionalManagerEmailC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteType_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCQuoteTypeC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCQuoteTypeC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CopiedQuoteLineId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCopiedQuoteLineIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCopiedQuoteLineIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIDCL_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCIIIDCLIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCIIIDCLIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartMobile_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPartMobileC(String value) {
        return new JAXBElement<String>(_OrdersCPartMobileC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Cost1_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCCost1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCCost1C_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductBUManagerReviewed_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCProductBUManagerReviewedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCProductBUManagerReviewedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerReviewedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCRegionalManagerReviewedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCRegionalManagerReviewedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteSource_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCQuoteSourceC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCQuoteSourceC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MinimumQuarterlyVolumeMQV_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMinimumQuarterlyVolumeMQVC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMinimumQuarterlyVolumeMQVC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIIEmail_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIIIIEmailC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCIIIIEmailC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMarketSegmentC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketSegmentC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfMarketingReviewAndAgreed_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfMarketingReviewAndAgreedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfMarketingReviewAndAgreedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesReviewer_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesReviewerC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCVPOfSalesReviewerC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorNameINTG_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCDistributorNameINTGC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCDistributorNameINTGC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ApprovedASP1_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCApprovedASP1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCApprovedASP1C_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIId_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCIIIIdC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCIIIIdC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingManagerEmail_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCMarketingManagerEmailC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketingManagerEmailC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerReviewer_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCRegionalManagerReviewerC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCRegionalManagerReviewerC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesListPrice_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCVPOfSalesListPriceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCVPOfSalesListPriceC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompetitorName_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCompetitorNameC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCompetitorNameC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VPOfSalesEmail_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCVPOfSalesEmailC(String value) {
        return new JAXBElement<String>(_SampleRequestCVPOfSalesEmailC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PriceListNameINTG_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCPriceListNameINTGC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCPriceListNameINTGC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AutoApprovedDate_c", scope = QuoteLineItemC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteLineItemCAutoApprovedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteLineItemCAutoApprovedDateC_QNAME, XMLGregorianCalendar.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCCommentsC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCCommentsC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionaManagerFloorPrice_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCRegionaManagerFloorPriceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCRegionaManagerFloorPriceC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StandardPriceBookASP_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCStandardPriceBookASPC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCStandardPriceBookASPC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExtensionApproved_c", scope = QuoteLineItemC.class)
    public JAXBElement<String> createQuoteLineItemCExtensionApprovedC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCExtensionApprovedC_QNAME, String.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegionalManagerReviewer_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCRegionalManagerReviewerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCRegionalManagerReviewerIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvenSenseRep_Id_c", scope = QuoteLineItemC.class)
    public JAXBElement<BigDecimal> createQuoteLineItemCInvenSenseRepIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCInvenSenseRepIdC_QNAME, BigDecimal.class, QuoteLineItemC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = QuoteTeamC.class)
    public JAXBElement<Long> createQuoteTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quote_Id_c", scope = QuoteTeamC.class)
    public JAXBElement<BigDecimal> createQuoteTeamCQuoteIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCQuoteIdC_QNAME, BigDecimal.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = QuoteTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = QuoteTeamC.class)
    public JAXBElement<Integer> createQuoteTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = QuoteTeamC.class)
    public JAXBElement<BigDecimal> createQuoteTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = QuoteTeamC.class)
    public JAXBElement<Integer> createQuoteTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = QuoteTeamC.class)
    public JAXBElement<BigDecimal> createQuoteTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = QuoteTeamC.class)
    public JAXBElement<String> createQuoteTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, QuoteTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Orders_Id_c", scope = OrdersTeamC.class)
    public JAXBElement<BigDecimal> createOrdersTeamCOrdersIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersTeamCOrdersIdC_QNAME, BigDecimal.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = OrdersTeamC.class)
    public JAXBElement<Long> createOrdersTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = OrdersTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createOrdersTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = OrdersTeamC.class)
    public JAXBElement<Integer> createOrdersTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = OrdersTeamC.class)
    public JAXBElement<BigDecimal> createOrdersTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = OrdersTeamC.class)
    public JAXBElement<Integer> createOrdersTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = OrdersTeamC.class)
    public JAXBElement<BigDecimal> createOrdersTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = OrdersTeamC.class)
    public JAXBElement<String> createOrdersTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, OrdersTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ForecastHistoryTeamC.class)
    public JAXBElement<Long> createForecastHistoryTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ForecastHistoryTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastHistoryTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ForecastHistoryTeamC.class)
    public JAXBElement<Integer> createForecastHistoryTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = ForecastHistoryTeamC.class)
    public JAXBElement<BigDecimal> createForecastHistoryTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ForecastHistoryTeamC.class)
    public JAXBElement<Integer> createForecastHistoryTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastHistory_Id_c", scope = ForecastHistoryTeamC.class)
    public JAXBElement<BigDecimal> createForecastHistoryTeamCForecastHistoryIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryTeamCForecastHistoryIdC_QNAME, BigDecimal.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ForecastHistoryTeamC.class)
    public JAXBElement<BigDecimal> createForecastHistoryTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ForecastHistoryTeamC.class)
    public JAXBElement<String> createForecastHistoryTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, ForecastHistoryTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalYear_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCRDFiscalYearC(String value) {
        return new JAXBElement<String>(_BacklogCCRDFiscalYearC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalMonth_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCRDFiscalMonthC(String value) {
        return new JAXBElement<String>(_BacklogCCRDFiscalMonthC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipFrom_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShipFromC(String value) {
        return new JAXBElement<String>(_BacklogCShipFromC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateOrderedQuarter_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDateOrderedQuarterC(String value) {
        return new JAXBElement<String>(_BacklogCDateOrderedQuarterC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderNumber_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCOrderNumberC(String value) {
        return new JAXBElement<String>(_OrdersCOrderNumberC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldYN_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCHoldYNC(String value) {
        return new JAXBElement<String>(_BacklogCHoldYNC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = BacklogC.class)
    public JAXBElement<Integer> createBacklogCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToCustomer_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShipToCustomerC(String value) {
        return new JAXBElement<String>(_BacklogCShipToCustomerC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillToSite_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCBillToSiteC(String value) {
        return new JAXBElement<String>(_BacklogCBillToSiteC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryLineStatus_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryLineStatusC(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryLineStatusC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Grade_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCGradeC(String value) {
        return new JAXBElement<String>(_BacklogCGradeC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSubSegment1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSubSegment1C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSubSegment1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateOrderedYear_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDateOrderedYearC(String value) {
        return new JAXBElement<String>(_BacklogCDateOrderedYearC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldYN1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCHoldYN1C(String value) {
        return new JAXBElement<String>(_BacklogCHoldYN1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalQtr_RPT_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCRDFiscalQtrRPTC(String value) {
        return new JAXBElement<String>(_OrdersCCRDFiscalQtrRPTC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteID_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCQuoteIDC(String value) {
        return new JAXBElement<String>(_BacklogCQuoteIDC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShippingMethod_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShippingMethodC(String value) {
        return new JAXBElement<String>(_BacklogCShippingMethodC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerPO_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCustomerPOC(String value) {
        return new JAXBElement<String>(_BacklogCCustomerPOC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineShippingInstructions_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineShippingInstructionsC(String value) {
        return new JAXBElement<String>(_BacklogCLineShippingInstructionsC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemNumberMobile_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCItemNumberMobileC(String value) {
        return new JAXBElement<String>(_BacklogCItemNumberMobileC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryAddress_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryAddressC(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryAddressC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PromiseDate_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCPromiseDateC(String value) {
        return new JAXBElement<String>(_BacklogCPromiseDateC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = BacklogC.class)
    public JAXBElement<BigDecimal> createBacklogCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryShipToCtyStZipCtry_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryShipToCtyStZipCtryC(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryShipToCtyStZipCtryC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineStatus_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineStatusC(String value) {
        return new JAXBElement<String>(_BacklogCLineStatusC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CSDFiscalMonth_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCSDFiscalMonthC(String value) {
        return new JAXBElement<String>(_BacklogCCSDFiscalMonthC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomerSite_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCEndCustomerSiteC(String value) {
        return new JAXBElement<String>(_BacklogCEndCustomerSiteC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SOCreationDate_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCSOCreationDateC(String value) {
        return new JAXBElement<String>(_BacklogCSOCreationDateC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SoldToCustomerEBSID_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCSoldToCustomerEBSIDC(String value) {
        return new JAXBElement<String>(_BacklogCSoldToCustomerEBSIDC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IncoTermsFOB1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCIncoTermsFOB1C(String value) {
        return new JAXBElement<String>(_BacklogCIncoTermsFOB1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ITWHKAWB_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCITWHKAWBC(String value) {
        return new JAXBElement<String>(_BacklogCITWHKAWBC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShockIndicator_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShockIndicatorC(String value) {
        return new JAXBElement<String>(_BacklogCShockIndicatorC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRD_c", scope = BacklogC.class)
    public JAXBElement<XMLGregorianCalendar> createBacklogCCRDC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCCRDC_QNAME, XMLGregorianCalendar.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToLocation_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShipToLocationC(String value) {
        return new JAXBElement<String>(_BacklogCShipToLocationC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HarmonizedCode_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCHarmonizedCodeC(String value) {
        return new JAXBElement<String>(_BacklogCHarmonizedCodeC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemNumber_Id_c", scope = BacklogC.class)
    public JAXBElement<BigDecimal> createBacklogCItemNumberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BacklogCItemNumberIdC_QNAME, BigDecimal.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRDFiscalQtr_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCRDFiscalQtrC(String value) {
        return new JAXBElement<String>(_OrdersCCRDFiscalQtrC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TerritoryName_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCTerritoryNameC(String value) {
        return new JAXBElement<String>(_BacklogCTerritoryNameC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemFamily_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCItemFamilyC(String value) {
        return new JAXBElement<String>(_BacklogCItemFamilyC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCEndCustomerC(String value) {
        return new JAXBElement<String>(_OrdersCEndCustomerC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerItem_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCustomerItemC(String value) {
        return new JAXBElement<String>(_BacklogCCustomerItemC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesPerson_Id_c", scope = BacklogC.class)
    public JAXBElement<BigDecimal> createBacklogCSalesPersonIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BacklogCSalesPersonIdC_QNAME, BigDecimal.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RemainingQty_c", scope = BacklogC.class)
    public JAXBElement<BigDecimal> createBacklogCRemainingQtyC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BacklogCRemainingQtyC_QNAME, BigDecimal.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = BacklogC.class, defaultValue = "Backlog_c")
    public JAXBElement<String> createBacklogCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSubSegment_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSubSegmentC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketSubSegmentC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineType1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineType1C(String value) {
        return new JAXBElement<String>(_BacklogCLineType1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Revenue_c", scope = BacklogC.class)
    public JAXBElement<AmountType> createBacklogCRevenueC(AmountType value) {
        return new JAXBElement<AmountType>(_OrdersCRevenueC_QNAME, AmountType.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesPerson_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCSalesPersonC(String value) {
        return new JAXBElement<String>(_BacklogCSalesPersonC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineId_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineIdC(String value) {
        return new JAXBElement<String>(_BacklogCLineIdC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FreightAC_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCFreightACC(String value) {
        return new JAXBElement<String>(_BacklogCFreightACC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = BacklogC.class, defaultValue = "Backlog_c")
    public JAXBElement<String> createBacklogCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillToCustomer_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCBillToCustomerC(String value) {
        return new JAXBElement<String>(_BacklogCBillToCustomerC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IncoTermsFOB_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCIncoTermsFOBC(String value) {
        return new JAXBElement<String>(_BacklogCIncoTermsFOBC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSubSegment2_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSubSegment2C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSubSegment2C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineStatus1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineStatus1C(String value) {
        return new JAXBElement<String>(_BacklogCLineStatus1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateOrdered_c", scope = BacklogC.class)
    public JAXBElement<XMLGregorianCalendar> createBacklogCDateOrderedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BacklogCDateOrderedC_QNAME, XMLGregorianCalendar.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCustomerC(String value) {
        return new JAXBElement<String>(_BacklogCCustomerC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CSDFiscalQtr_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCSDFiscalQtrC(String value) {
        return new JAXBElement<String>(_BacklogCCSDFiscalQtrC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToCountry_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShipToCountryC(String value) {
        return new JAXBElement<String>(_BacklogCShipToCountryC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomerNo_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCEndCustomerNoC(String value) {
        return new JAXBElement<String>(_BacklogCEndCustomerNoC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = BacklogC.class)
    public JAXBElement<Long> createBacklogCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineNumber_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineNumberC(String value) {
        return new JAXBElement<String>(_BacklogCLineNumberC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = BacklogC.class)
    public JAXBElement<Integer> createBacklogCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderType_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCOrderTypeC(String value) {
        return new JAXBElement<String>(_OrdersCOrderTypeC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OPSComments_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCOPSCommentsC(String value) {
        return new JAXBElement<String>(_BacklogCOPSCommentsC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipToSite_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShipToSiteC(String value) {
        return new JAXBElement<String>(_BacklogCShipToSiteC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InventoryItemStatusCode_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCInventoryItemStatusCodeC(String value) {
        return new JAXBElement<String>(_BacklogCInventoryItemStatusCodeC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillToLocation_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCBillToLocationC(String value) {
        return new JAXBElement<String>(_BacklogCBillToLocationC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateOrderedMonth_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDateOrderedMonthC(String value) {
        return new JAXBElement<String>(_BacklogCDateOrderedMonthC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpecialLabel_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCSpecialLabelC(String value) {
        return new JAXBElement<String>(_BacklogCSpecialLabelC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemNumber_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCItemNumberC(String value) {
        return new JAXBElement<String>(_BacklogCItemNumberC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CSD_c", scope = BacklogC.class)
    public JAXBElement<XMLGregorianCalendar> createBacklogCCSDC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCCSDC_QNAME, XMLGregorianCalendar.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryAddress4_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryAddress4C(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryAddress4C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LinePackingInstructions_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLinePackingInstructionsC(String value) {
        return new JAXBElement<String>(_BacklogCLinePackingInstructionsC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ITWHKDate_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCITWHKDateC(String value) {
        return new JAXBElement<String>(_BacklogCITWHKDateC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSegment1C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSegment1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSegmentC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketSegmentC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryAddress3_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryAddress3C(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryAddress3C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Planner_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCPlannerC(String value) {
        return new JAXBElement<String>(_BacklogCPlannerC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesPersonMobile_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCSalesPersonMobileC(String value) {
        return new JAXBElement<String>(_BacklogCSalesPersonMobileC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryLineStatus1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCDeliveryLineStatus1C(String value) {
        return new JAXBElement<String>(_BacklogCDeliveryLineStatus1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineType_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLineTypeC(String value) {
        return new JAXBElement<String>(_BacklogCLineTypeC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UnitSellingPrice_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCUnitSellingPriceC(String value) {
        return new JAXBElement<String>(_BacklogCUnitSellingPriceC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment2_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCMarketSegment2C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSegment2C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = BacklogC.class)
    public JAXBElement<XMLGregorianCalendar> createBacklogCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PackingInstructions_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCPackingInstructionsC(String value) {
        return new JAXBElement<String>(_BacklogCPackingInstructionsC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CSDFiscalYear_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCCSDFiscalYearC(String value) {
        return new JAXBElement<String>(_BacklogCCSDFiscalYearC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShippingInstructions_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCShippingInstructionsC(String value) {
        return new JAXBElement<String>(_BacklogCShippingInstructionsC_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderType1_c", scope = BacklogC.class)
    public JAXBElement<String> createBacklogCOrderType1C(String value) {
        return new JAXBElement<String>(_BacklogCOrderType1C_QNAME, String.class, BacklogC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesrepName_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCSalesrepNameC(String value) {
        return new JAXBElement<String>(_BillingCSalesrepNameC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoiceNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoiceNumberC(String value) {
        return new JAXBElement<String>(_BillingCInvoiceNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerAddress3_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerAddress3C(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerAddress3C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerCountry_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerCountryC(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerCountryC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCOrderNumberC(String value) {
        return new JAXBElement<String>(_OrdersCOrderNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCSubMarket1C(String value) {
        return new JAXBElement<String>(_BillingCSubMarket1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = BillingC.class)
    public JAXBElement<Integer> createBillingCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PullIn1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCPullIn1C(String value) {
        return new JAXBElement<String>(_BillingCPullIn1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PullIn_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCPullInC(String value) {
        return new JAXBElement<String>(_BillingCPullInC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCType1C(String value) {
        return new JAXBElement<String>(_BillingCType1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderedQuantity_c", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCOrderedQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCOrderedQuantityC_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerCity_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerCityC(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerCityC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerState_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerStateC(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerStateC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerTrxLineId_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCCustomerTrxLineIdC(String value) {
        return new JAXBElement<String>(_BillingCCustomerTrxLineIdC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateQuarter_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoicedateQuarterC(String value) {
        return new JAXBElement<String>(_OrdersCInvoicedateQuarterC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualShipmentDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCActualShipmentDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCActualShipmentDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesOrderDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCSalesOrderDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCSalesOrderDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCPartNumberC(String value) {
        return new JAXBElement<String>(_BillingCPartNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AmountDueRemaining_c", scope = BillingC.class)
    public JAXBElement<AmountType> createBillingCAmountDueRemainingC(AmountType value) {
        return new JAXBElement<AmountType>(_BillingCAmountDueRemainingC_QNAME, AmountType.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerCountry_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerCountryC(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerCountryC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = BillingC.class)
    public JAXBElement<String> createBillingCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryName_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCDeliveryNameC(String value) {
        return new JAXBElement<String>(_BillingCDeliveryNameC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCSubMarketC(String value) {
        return new JAXBElement<String>(_OrdersCSubMarketC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PromiseDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCPromiseDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BacklogCPromiseDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Class1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCClass1C(String value) {
        return new JAXBElement<String>(_BillingCClass1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineStatus_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCLineStatusC(String value) {
        return new JAXBElement<String>(_BacklogCLineStatusC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCTypeC(String value) {
        return new JAXBElement<String>(_BillingCTypeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerAddress3_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerAddress3C(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerAddress3C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerAddress1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerAddress1C(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerAddress1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineSalesrep_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCLineSalesrepC(String value) {
        return new JAXBElement<String>(_BillingCLineSalesrepC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INCOTERM_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCINCOTERMC(String value) {
        return new JAXBElement<String>(_BillingCINCOTERMC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemType_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCItemTypeC(String value) {
        return new JAXBElement<String>(_BillingCItemTypeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerAddress2_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerAddress2C(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerAddress2C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReturnReason_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCReturnReasonC(String value) {
        return new JAXBElement<String>(_BillingCReturnReasonC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HarmonizedCode_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCHarmonizedCodeC(String value) {
        return new JAXBElement<String>(_BacklogCHarmonizedCodeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerNumberC(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ItemFamily_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCItemFamilyC(String value) {
        return new JAXBElement<String>(_BacklogCItemFamilyC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillCustomerNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillCustomerNumberC(String value) {
        return new JAXBElement<String>(_BillingCBillCustomerNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PurchaseOrder_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCPurchaseOrderC(String value) {
        return new JAXBElement<String>(_BillingCPurchaseOrderC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Class_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCClassC(String value) {
        return new JAXBElement<String>(_BillingCClassC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCEndCustomerC(String value) {
        return new JAXBElement<String>(_OrdersCEndCustomerC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesrepName_Id_c", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCSalesrepNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingCSalesrepNameIdC_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = BillingC.class, defaultValue = "Billing_c")
    public JAXBElement<String> createBillingCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = BillingC.class)
    public JAXBElement<String> createBillingCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCQuoteNumberC(String value) {
        return new JAXBElement<String>(_BillingCQuoteNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoiceLineType1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoiceLineType1C(String value) {
        return new JAXBElement<String>(_BillingCInvoiceLineType1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = BillingC.class)
    public JAXBElement<String> createBillingCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineType1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCLineType1C(String value) {
        return new JAXBElement<String>(_BacklogCLineType1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Revenue_c", scope = BillingC.class)
    public JAXBElement<AmountType> createBillingCRevenueC(AmountType value) {
        return new JAXBElement<AmountType>(_OrdersCRevenueC_QNAME, AmountType.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SoldFromInventoryOrg_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCSoldFromInventoryOrgC(String value) {
        return new JAXBElement<String>(_BillingCSoldFromInventoryOrgC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillToCustomer_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBillToCustomerC(String value) {
        return new JAXBElement<String>(_BacklogCBillToCustomerC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = BillingC.class)
    public JAXBElement<String> createBillingCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = BillingC.class, defaultValue = "Billing_c")
    public JAXBElement<String> createBillingCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipdateMonth_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipdateMonthC(String value) {
        return new JAXBElement<String>(_BillingCShipdateMonthC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSubSegment2_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCMarketSubSegment2C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSubSegment2C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerCity_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerCityC(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerCityC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = BillingC.class)
    public JAXBElement<String> createBillingCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerName_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerNameC(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerNameC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Backend_ASP_c", scope = BillingC.class)
    public JAXBElement<AmountType> createBillingCBackendASPC(AmountType value) {
        return new JAXBElement<AmountType>(_BillingCBackendASPC_QNAME, AmountType.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineStatus1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCLineStatus1C(String value) {
        return new JAXBElement<String>(_BacklogCLineStatus1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateYear_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoicedateYearC(String value) {
        return new JAXBElement<String>(_BillingCInvoicedateYearC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerState_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerStateC(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerStateC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedQty_c", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCInvoicedQtyC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingCInvoicedQtyC_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FuncAmount_c", scope = BillingC.class)
    public JAXBElement<AmountType> createBillingCFuncAmountC(AmountType value) {
        return new JAXBElement<AmountType>(_BillingCFuncAmountC_QNAME, AmountType.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ScheduleShipDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCScheduleShipDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCScheduleShipDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerAddress2_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerAddress2C(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerAddress2C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCRequestDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCRequestDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = BillingC.class)
    public JAXBElement<Long> createBillingCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipdatedateQuarter_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipdatedateQuarterC(String value) {
        return new JAXBElement<String>(_BillingCShipdatedateQuarterC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UnitPrice_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCUnitPriceC(String value) {
        return new JAXBElement<String>(_BillingCUnitPriceC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = BillingC.class)
    public JAXBElement<Integer> createBillingCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderType_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCOrderTypeC(String value) {
        return new JAXBElement<String>(_OrdersCOrderTypeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GLDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCGLDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCGLDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HeaderSalesrep_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCHeaderSalesrepC(String value) {
        return new JAXBElement<String>(_BillingCHeaderSalesrepC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateMonth_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoicedateMonthC(String value) {
        return new JAXBElement<String>(_BillingCInvoicedateMonthC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Account_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCAccountC(String value) {
        return new JAXBElement<String>(_BillingCAccountC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BatchSourceName_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCBatchSourceNameC(String value) {
        return new JAXBElement<String>(_BillingCBatchSourceNameC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderLineNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCOrderLineNumberC(String value) {
        return new JAXBElement<String>(_OrdersCOrderLineNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = BillingC.class)
    public JAXBElement<String> createBillingCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoiceDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCInvoiceDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrdersCInvoiceDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AmountDueOriginal_c", scope = BillingC.class)
    public JAXBElement<AmountType> createBillingCAmountDueOriginalC(AmountType value) {
        return new JAXBElement<AmountType>(_BillingCAmountDueOriginalC_QNAME, AmountType.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCMarketSegment1C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSegment1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCMarketSegmentC(String value) {
        return new JAXBElement<String>(_QuoteLineItemCMarketSegmentC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoicedateQuarter_RPT_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoicedateQuarterRPTC(String value) {
        return new JAXBElement<String>(_OrdersCInvoicedateQuarterRPTC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LineType_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCLineTypeC(String value) {
        return new JAXBElement<String>(_BacklogCLineTypeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Fob_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCFobC(String value) {
        return new JAXBElement<String>(_BillingCFobC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DueDate_c", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCDueDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BillingCDueDateC_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSegment2_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCMarketSegment2C(String value) {
        return new JAXBElement<String>(_BacklogCMarketSegment2C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = BillingC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartNumberMobile_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCPartNumberMobileC(String value) {
        return new JAXBElement<String>(_BillingCPartNumberMobileC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "WaybillNumber_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCWaybillNumberC(String value) {
        return new JAXBElement<String>(_BillingCWaybillNumberC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipCustomerAddress1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipCustomerAddress1C(String value) {
        return new JAXBElement<String>(_BillingCShipCustomerAddress1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = BillingC.class)
    public JAXBElement<String> createBillingCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = BillingC.class)
    public JAXBElement<String> createBillingCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShippingQuantity_c", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCShippingQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingCShippingQuantityC_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = BillingC.class)
    public JAXBElement<String> createBillingCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrderType1_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCOrderType1C(String value) {
        return new JAXBElement<String>(_BacklogCOrderType1C_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SalesRepNameMobile_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCSalesRepNameMobileC(String value) {
        return new JAXBElement<String>(_BillingCSalesRepNameMobileC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ShipdatedateYear_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCShipdatedateYearC(String value) {
        return new JAXBElement<String>(_BillingCShipdatedateYearC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartNumber_Id_c", scope = BillingC.class)
    public JAXBElement<BigDecimal> createBillingCPartNumberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingCPartNumberIdC_QNAME, BigDecimal.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvoiceLineType_c", scope = BillingC.class)
    public JAXBElement<String> createBillingCInvoiceLineTypeC(String value) {
        return new JAXBElement<String>(_BillingCInvoiceLineTypeC_QNAME, String.class, BillingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LockedYear_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCLockedYearC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCLockedYearC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastDate_c", scope = ForecastHistoryC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastHistoryCForecastDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastHistoryCForecastDateC_QNAME, XMLGregorianCalendar.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCOwnerC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket1_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCSubMarket1C(String value) {
        return new JAXBElement<String>(_BillingCSubMarket1C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_Id_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCOpportunityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCOpportunityIdC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ForecastHistoryC.class)
    public JAXBElement<Integer> createForecastHistoryCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ1_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASPQ1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPQ1C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity2_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity2C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity2C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ3_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASPQ3C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPQ3C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP1_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP1C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity12_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity12C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity12C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP601_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP601C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP601C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCBUC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP3_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP3C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP3C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Forecast_Id_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCForecastIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCForecastIdC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity10_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity10C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity10C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ44_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASPQ44C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASPQ44C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCSubMarketC(String value) {
        return new JAXBElement<String>(_OrdersCSubMarketC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP701_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP701C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP701C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP801_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP801C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP801C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity11_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity11C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity11C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Role_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCRoleC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCRoleC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_Id_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCPartIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCPartIdC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP122_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP122C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP122C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity7_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity7C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity7C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP201_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP201C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP201C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate_c", scope = ForecastHistoryC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastHistoryCCreationDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastHistoryCCreationDateC_QNAME, XMLGregorianCalendar.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_Id_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCOwnerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCOwnerIdC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LockedByUserName_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCLockedByUserNameC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCLockedByUserNameC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ4_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASPQ4C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPQ4C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCEndCustomerC(String value) {
        return new JAXBElement<String>(_OrdersCEndCustomerC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastRecordType_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCForecastRecordTypeC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCForecastRecordTypeC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_Id_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCEndCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCEndCustomerIdC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastType_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCForecastTypeC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCForecastTypeC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV2_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV2C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV2C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ33_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASPQ33C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASPQ33C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = ForecastHistoryC.class, defaultValue = "ForecastHistory_c")
    public JAXBElement<String> createForecastHistoryCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity9_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity9C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity9C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QTYQ3_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQTYQ3C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQTYQ3C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASPC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity5_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity5C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity5C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCOpportunityC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCOpportunityC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Cost_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCCostC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteLineItemCCostC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Market1_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCMarket1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCMarket1C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Revenue_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCRevenueC(AmountType value) {
        return new JAXBElement<AmountType>(_OrdersCRevenueC_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QTYQ1_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQTYQ1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQTYQ1C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP101_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP101C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP101C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LockedMonth_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCLockedMonthC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCLockedMonthC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV4_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV4C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV4C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = ForecastHistoryC.class, defaultValue = "ForecastHistory_c")
    public JAXBElement<String> createForecastHistoryCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity3_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity3C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity3C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity1_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity1C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV12_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV12C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV12C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV3_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV3C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV3C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ2_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASPQ2C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPQ2C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QTYQ4_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQTYQ4C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQTYQ4C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP100_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP100C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP100C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Market_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCMarketC(String value) {
        return new JAXBElement<String>(_OrdersCMarketC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV11_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV11C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV11C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ForecastHistoryC.class)
    public JAXBElement<Long> createForecastHistoryCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REVQ3_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREVQ3C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREVQ3C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP901_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP901C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP901C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Forecast_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCForecastC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCForecastC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU1_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCBU1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCBU1C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REVQ4_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREVQ4C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREVQ4C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ForecastHistoryC.class)
    public JAXBElement<Integer> createForecastHistoryCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP2_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP2C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP2C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV10_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV10C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV10C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCYearC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCYearC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartMobile_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCPartMobileC(String value) {
        return new JAXBElement<String>(_OrdersCPartMobileC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuarterCY_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCQuarterCYC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCQuarterCYC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP401_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP401C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP401C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP5_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP5C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP5C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ22_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASPQ22C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASPQ22C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP4_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP4C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP4C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerMobile_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCOwnerMobileC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerMobileC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV9_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV9C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV9C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProgramName_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCProgramNameC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCProgramNameC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LockedByID_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCLockedByIDC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCLockedByIDC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP111_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP111C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP111C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REVQ1_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREVQ1C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREVQ1C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductCategory_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCProductCategoryC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCProductCategoryC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REVQ2_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREVQ2C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREVQ2C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASPQ11_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASPQ11C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASPQ11C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QTYQ2_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQTYQ2C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQTYQ2C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP301_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP301C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP301C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ForecastHistoryC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastHistoryCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity6_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity6C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity6C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP11_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP11C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP11C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCPartC(String value) {
        return new JAXBElement<String>(_OrdersCPartC_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantityC_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP12_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP12C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP12C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV1_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV1C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV1C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP501_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCASP501C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP501C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP10_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP10C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP10C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV7_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV7C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV7C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP9_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP9C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP9C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV5_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV5C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV5C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity8_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity8C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity8C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP6_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP6C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP6C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV6_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV6C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV6C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP7_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP7C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP7C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV8_c", scope = ForecastHistoryC.class)
    public JAXBElement<AmountType> createForecastHistoryCREV8C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV8C_QNAME, AmountType.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP8_c", scope = ForecastHistoryC.class)
    public JAXBElement<String> createForecastHistoryCASP8C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP8C_QNAME, String.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity4_c", scope = ForecastHistoryC.class)
    public JAXBElement<BigDecimal> createForecastHistoryCQuantity4C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity4C_QNAME, BigDecimal.class, ForecastHistoryC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV4_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV4C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV4C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity3_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity3C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity3C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = ForecastCustomC.class, defaultValue = "Forecast_Custom_c")
    public JAXBElement<String> createForecastCustomCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity1_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity1C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity1C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV12_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV12C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV12C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastDate_c", scope = ForecastCustomC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastCustomCForecastDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastHistoryCForecastDateC_QNAME, XMLGregorianCalendar.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV3_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV3C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV3C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCOwnerC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP100_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP100C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP100C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket1_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCSubMarket1C(String value) {
        return new JAXBElement<String>(_BillingCSubMarket1C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ForecastCustomC.class)
    public JAXBElement<Integer> createForecastCustomCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_Id_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCOpportunityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCOpportunityIdC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Backend_ASP_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCBackendASPC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingCBackendASPC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity2_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity2C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity2C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Market_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCMarketC(String value) {
        return new JAXBElement<String>(_OrdersCMarketC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV11_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV11C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV11C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ForecastCustomC.class)
    public JAXBElement<Long> createForecastCustomCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP901_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP901C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP901C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP601_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP601C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP601C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity12_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity12C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity12C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP1_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP1C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU1_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCBU1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCBU1C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BU_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCBUC(String value) {
        return new JAXBElement<String>(_SampleRequestCBUC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ForecastCustomC.class)
    public JAXBElement<Integer> createForecastCustomCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP2_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP2C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP2C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV10_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV10C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV10C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP3_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP3C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP3C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCYearC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCYearC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity10_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity10C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity10C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubMarket_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCSubMarketC(String value) {
        return new JAXBElement<String>(_OrdersCSubMarketC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP701_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP701C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP701C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartMobile_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCPartMobileC(String value) {
        return new JAXBElement<String>(_OrdersCPartMobileC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuarterCY_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCQuarterCYC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCQuarterCYC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP801_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP801C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP801C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity11_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity11C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity11C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Role_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCRoleC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCRoleC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_Id_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCPartIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCPartIdC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP401_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP401C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP401C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP122_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP122C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP122C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP5_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP5C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP5C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerMobile_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCOwnerMobileC(String value) {
        return new JAXBElement<String>(_OrdersCOwnerMobileC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP4_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP4C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP4C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity7_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity7C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity7C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV9_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV9C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV9C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProgramName_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCProgramNameC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCProgramNameC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP111_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP111C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP111C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP201_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP201C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP201C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProductCategory_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCProductCategoryC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCProductCategoryC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate_c", scope = ForecastCustomC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastCustomCCreationDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastHistoryCCreationDateC_QNAME, XMLGregorianCalendar.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_Id_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCOwnerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OrdersCOwnerIdC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP301_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP301C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP301C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity6_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity6C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity6C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ForecastCustomC.class)
    public JAXBElement<XMLGregorianCalendar> createForecastCustomCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP11_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP11C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP11C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCEndCustomerC(String value) {
        return new JAXBElement<String>(_OrdersCEndCustomerC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantityC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Part_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCPartC(String value) {
        return new JAXBElement<String>(_OrdersCPartC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomer_Id_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCEndCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCEndCustomerIdC_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ForecastType_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCForecastTypeC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCForecastTypeC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP12_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP12C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP12C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV1_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV1C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV1C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP501_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP501C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP501C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV2_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV2C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV2C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP10_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP10C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP10C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV7_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV7C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV7C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCDescriptionC(String value) {
        return new JAXBElement<String>(_ForecastCustomCDescriptionC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP9_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP9C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP9C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity9_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity9C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity9C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = ForecastCustomC.class, defaultValue = "Forecast_Custom_c")
    public JAXBElement<String> createForecastCustomCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV5_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV5C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV5C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASPC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASPC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity8_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity8C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity8C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP6_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP6C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP6C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV6_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV6C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV6C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity5_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity5C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity5C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCOpportunityC(String value) {
        return new JAXBElement<String>(_ForecastHistoryCOpportunityC_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP7_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP7C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP7C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "REV8_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCREV8C(AmountType value) {
        return new JAXBElement<AmountType>(_ForecastHistoryCREV8C_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Market1_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCMarket1C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCMarket1C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP101_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCASP101C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCASP101C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Revenue_c", scope = ForecastCustomC.class)
    public JAXBElement<AmountType> createForecastCustomCRevenueC(AmountType value) {
        return new JAXBElement<AmountType>(_OrdersCRevenueC_QNAME, AmountType.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Quantity4_c", scope = ForecastCustomC.class)
    public JAXBElement<BigDecimal> createForecastCustomCQuantity4C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastHistoryCQuantity4C_QNAME, BigDecimal.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ASP8_c", scope = ForecastCustomC.class)
    public JAXBElement<String> createForecastCustomCASP8C(String value) {
        return new JAXBElement<String>(_ForecastHistoryCASP8C_QNAME, String.class, ForecastCustomC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_c", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCTeamMemberC(String value) {
        return new JAXBElement<String>(_ForecastTeamCTeamMemberC_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AccessLevel_c", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCAccessLevelC(String value) {
        return new JAXBElement<String>(_ForecastTeamCAccessLevelC_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserName_c", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCUserNameC(String value) {
        return new JAXBElement<String>(_ForecastTeamCUserNameC_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = BillingTeamC.class)
    public JAXBElement<Long> createBillingTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = BillingTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createBillingTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = BillingTeamC.class)
    public JAXBElement<Integer> createBillingTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TeamMember_Id_c", scope = BillingTeamC.class)
    public JAXBElement<BigDecimal> createBillingTeamCTeamMemberIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCTeamMemberIdC_QNAME, BigDecimal.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = BillingTeamC.class)
    public JAXBElement<Integer> createBillingTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = BillingTeamC.class)
    public JAXBElement<BigDecimal> createBillingTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = BillingTeamC.class)
    public JAXBElement<String> createBillingTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Billing_Id_c", scope = BillingTeamC.class)
    public JAXBElement<BigDecimal> createBillingTeamCBillingIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BillingTeamCBillingIdC_QNAME, BigDecimal.class, BillingTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCIsOwner(String value) {
        return new JAXBElement<String>(_ForecastTeamCIsOwner_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "USAddress_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCUSAddressC(String value) {
        return new JAXBElement<String>(_QuoteCUSAddressC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Carrier_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCarrierC(String value) {
        return new JAXBElement<String>(_QuoteCCarrierC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConversionDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCConversionDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCConversionDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionName_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = QuoteC.class, defaultValue = "Quote_c")
    public JAXBElement<String> createQuoteCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_SampleRequestCAttachmentEntityName_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PO_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCPOC(String value) {
        return new JAXBElement<String>(_QuoteCPOC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorNameReport_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCDistributorNameReportC(String value) {
        return new JAXBElement<String>(_QuoteCDistributorNameReportC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IIIAddress1_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCIIIAddress1C(String value) {
        return new JAXBElement<String>(_QuoteCIIIAddress1C_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ECContactName_Id_c", scope = QuoteC.class)
    public JAXBElement<BigDecimal> createQuoteCECContactNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteCECContactNameIdC_QNAME, BigDecimal.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurcyConvRateType_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CMODMName_Id_c", scope = QuoteC.class)
    public JAXBElement<BigDecimal> createQuoteCCMODMNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QuoteCCMODMNameIdC_QNAME, BigDecimal.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = QuoteC.class)
    public JAXBElement<Integer> createQuoteCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerSor_QNAME, Integer.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Region1_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCRegion1C(String value) {
        return new JAXBElement<String>(_SampleRequestCRegion1C_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CMODMName_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCMODMNameC(String value) {
        return new JAXBElement<String>(_QuoteCCMODMNameC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CMODMNameReport_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCMODMNameReportC(String value) {
        return new JAXBElement<String>(_QuoteCCMODMNameReportC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndCustomerNameReport_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCEndCustomerNameReportC(String value) {
        return new JAXBElement<String>(_QuoteCEndCustomerNameReportC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteApprovalDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCQuoteApprovalDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCQuoteApprovalDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Note_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCNoteC(String value) {
        return new JAXBElement<String>(_QuoteCNoteC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteStartDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCQuoteStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCQuoteStartDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DistributorAddress_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCDistributorAddressC(String value) {
        return new JAXBElement<String>(_SampleRequestCDistributorAddressC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Region_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCRegionC(String value) {
        return new JAXBElement<String>(_QuoteCRegionC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = QuoteC.class)
    public JAXBElement<Long> createQuoteCRequestId(Long value) {
        return new JAXBElement<Long>(_ForecastTeamCRequestId_QNAME, Long.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ForecastTeamCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "INTG_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCINTGC(String value) {
        return new JAXBElement<String>(_SampleRequestCINTGC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCorpCurrencyCode_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InvensenseRepMobile_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCInvensenseRepMobileC(String value) {
        return new JAXBElement<String>(_QuoteCInvensenseRepMobileC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CRMRowID_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCRMRowIDC(String value) {
        return new JAXBElement<String>(_SampleRequestCCRMRowIDC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ForecastTeamCJobDefinitionPackage_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalDistribuitionNames_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCAdditionalDistribuitionNamesC(String value) {
        return new JAXBElement<String>(_QuoteCAdditionalDistribuitionNamesC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = QuoteC.class)
    public JAXBElement<Integer> createQuoteCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ForecastTeamCCpdrfVerPillar_QNAME, Integer.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCPKProxy(String value) {
        return new JAXBElement<String>(_SampleRequestCPKProxy_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCDescriptionC(String value) {
        return new JAXBElement<String>(_ForecastCustomCDescriptionC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ForecastTeamCLastUpdateLogin_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = QuoteC.class, defaultValue = "Quote_c")
    public JAXBElement<String> createQuoteCSourceType(String value) {
        return new JAXBElement<String>(_SampleRequestCSourceType_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ECContactName_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCECContactNameC(String value) {
        return new JAXBElement<String>(_QuoteCECContactNameC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerApprovedDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCCustomerApprovedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCCustomerApprovedDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PartMobile_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCPartMobileC(String value) {
        return new JAXBElement<String>(_OrdersCPartMobileC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCurrencyCode(String value) {
        return new JAXBElement<String>(_ForecastTeamCCurrencyCode_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteRequestDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCQuoteRequestDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCQuoteRequestDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = QuoteC.class)
    public JAXBElement<BigDecimal> createQuoteCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ForecastTeamCObjectVersionNumber_QNAME, BigDecimal.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ForecastTeamCCpdrfLastUpd_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteApprovalStatus_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCQuoteApprovalStatusC(String value) {
        return new JAXBElement<String>(_QuoteCQuoteApprovalStatusC_QNAME, String.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "QuoteExpirationDate_c", scope = QuoteC.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteCQuoteExpirationDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteCQuoteExpirationDateC_QNAME, XMLGregorianCalendar.class, QuoteC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CMODMAddress_c", scope = QuoteC.class)
    public JAXBElement<String> createQuoteCCMODMAddressC(String value) {
        return new JAXBElement<String>(_QuoteCCMODMAddressC_QNAME, String.class, QuoteC.class, value);
    }

}
