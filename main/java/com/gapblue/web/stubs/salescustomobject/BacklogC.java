
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
 * <p>Java class for Backlog_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Backlog_c">
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
 *         &lt;element name="OrderType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPerson_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPerson_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingMethod_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPO_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumber_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemFamily_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemainingQty_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitSellingPrice_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revenue_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="DateOrdered_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CRD_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CRDFiscalMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRDFiscalQtr_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRDFiscalYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CSDFiscalMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSDFiscalQtr_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSDFiscalYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerritoryName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryShipToCtyStZipCtry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldToCustomerEBSID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLocation_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToLocation_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAddress4_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToSite_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipFrom_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineShippingInstructions_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingInstructions_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryLineStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOrderedYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOrderedQuarter_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOrderedMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToSite_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightAC_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackingInstructions_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinePackingInstructions_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerItem_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldYN_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncoTermsFOB_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRMRowID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPersonMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumberMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromiseDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerNo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerSite_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPSComments_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOCreationDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ITWHKDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ITWHKAWB_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HarmonizedCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShockIndicator_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialLabel_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Planner_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryItemStatusCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineStatus1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryLineStatus1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldYN1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncoTermsFOB1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRDFiscalQtr_RPT_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BacklogTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}BacklogTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Backlog_c", namespace = "/oracle/apps/sales/custExtn/views/common/", propOrder = {
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
    "orderTypeC",
    "marketSegmentC",
    "marketSubSegmentC",
    "salesPersonIdC",
    "salesPersonC",
    "shippingMethodC",
    "quoteIDC",
    "customerPOC",
    "orderNumberC",
    "itemNumberIdC",
    "itemNumberC",
    "itemFamilyC",
    "remainingQtyC",
    "unitSellingPriceC",
    "revenueC",
    "dateOrderedC",
    "crdc",
    "crdFiscalMonthC",
    "crdFiscalQtrC",
    "crdFiscalYearC",
    "csdc",
    "csdFiscalMonthC",
    "csdFiscalQtrC",
    "csdFiscalYearC",
    "lineNumberC",
    "lineStatusC",
    "territoryNameC",
    "deliveryShipToCtyStZipCtryC",
    "shipToCountryC",
    "soldToCustomerEBSIDC",
    "endCustomerC",
    "shipToCustomerC",
    "shipToLocationC",
    "billToCustomerC",
    "billToLocationC",
    "parentCustomerIdC",
    "parentCustomerC",
    "deliveryAddressC",
    "deliveryAddress3C",
    "deliveryAddress4C",
    "shipToSiteC",
    "shipFromC",
    "lineShippingInstructionsC",
    "shippingInstructionsC",
    "deliveryLineStatusC",
    "dateOrderedYearC",
    "dateOrderedQuarterC",
    "dateOrderedMonthC",
    "lineIdC",
    "customerC",
    "billToSiteC",
    "freightACC",
    "packingInstructionsC",
    "linePackingInstructionsC",
    "customerItemC",
    "holdYNC",
    "lineTypeC",
    "incoTermsFOBC",
    "crmRowIDC",
    "salesPersonMobileC",
    "itemNumberMobileC",
    "marketSegment1C",
    "marketSubSegment1C",
    "promiseDateC",
    "endCustomerNoC",
    "endCustomerSiteC",
    "opsCommentsC",
    "soCreationDateC",
    "itwhkDateC",
    "itwhkawbc",
    "harmonizedCodeC",
    "shockIndicatorC",
    "specialLabelC",
    "gradeC",
    "plannerC",
    "inventoryItemStatusCodeC",
    "orderType1C",
    "lineStatus1C",
    "deliveryLineStatus1C",
    "holdYN1C",
    "lineType1C",
    "incoTermsFOB1C",
    "intgc",
    "crdFiscalQtrRPTC",
    "marketSegment2C",
    "marketSubSegment2C",
    "backlogTeamCollectionC"
})
public class BacklogC {

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
    @XmlElementRef(name = "OrderType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderTypeC;
    @XmlElementRef(name = "MarketSegment_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegmentC;
    @XmlElementRef(name = "MarketSubSegment_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSubSegmentC;
    @XmlElementRef(name = "SalesPerson_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesPersonIdC;
    @XmlElementRef(name = "SalesPerson_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesPersonC;
    @XmlElementRef(name = "ShippingMethod_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shippingMethodC;
    @XmlElementRef(name = "QuoteID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteIDC;
    @XmlElementRef(name = "CustomerPO_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerPOC;
    @XmlElementRef(name = "OrderNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumberC;
    @XmlElementRef(name = "ItemNumber_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> itemNumberIdC;
    @XmlElementRef(name = "ItemNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumberC;
    @XmlElementRef(name = "ItemFamily_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemFamilyC;
    @XmlElementRef(name = "RemainingQty_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> remainingQtyC;
    @XmlElementRef(name = "UnitSellingPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitSellingPriceC;
    @XmlElementRef(name = "Revenue_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revenueC;
    @XmlElementRef(name = "DateOrdered_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOrderedC;
    @XmlElementRef(name = "CRD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> crdc;
    @XmlElementRef(name = "CRDFiscalMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdFiscalMonthC;
    @XmlElementRef(name = "CRDFiscalQtr_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdFiscalQtrC;
    @XmlElementRef(name = "CRDFiscalYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdFiscalYearC;
    @XmlElementRef(name = "CSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> csdc;
    @XmlElementRef(name = "CSDFiscalMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csdFiscalMonthC;
    @XmlElementRef(name = "CSDFiscalQtr_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csdFiscalQtrC;
    @XmlElementRef(name = "CSDFiscalYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csdFiscalYearC;
    @XmlElementRef(name = "LineNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineNumberC;
    @XmlElementRef(name = "LineStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineStatusC;
    @XmlElementRef(name = "TerritoryName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryNameC;
    @XmlElementRef(name = "DeliveryShipToCtyStZipCtry_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryShipToCtyStZipCtryC;
    @XmlElementRef(name = "ShipToCountry_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToCountryC;
    @XmlElementRef(name = "SoldToCustomerEBSID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soldToCustomerEBSIDC;
    @XmlElementRef(name = "EndCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerC;
    @XmlElementRef(name = "ShipToCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToCustomerC;
    @XmlElementRef(name = "ShipToLocation_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToLocationC;
    @XmlElementRef(name = "BillToCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToCustomerC;
    @XmlElementRef(name = "BillToLocation_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToLocationC;
    @XmlElement(name = "ParentCustomer_Id_c")
    protected BigDecimal parentCustomerIdC;
    @XmlElement(name = "ParentCustomer_c")
    protected String parentCustomerC;
    @XmlElementRef(name = "DeliveryAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddressC;
    @XmlElementRef(name = "DeliveryAddress3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddress3C;
    @XmlElementRef(name = "DeliveryAddress4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddress4C;
    @XmlElementRef(name = "ShipToSite_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToSiteC;
    @XmlElementRef(name = "ShipFrom_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipFromC;
    @XmlElementRef(name = "LineShippingInstructions_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineShippingInstructionsC;
    @XmlElementRef(name = "ShippingInstructions_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shippingInstructionsC;
    @XmlElementRef(name = "DeliveryLineStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryLineStatusC;
    @XmlElementRef(name = "DateOrderedYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOrderedYearC;
    @XmlElementRef(name = "DateOrderedQuarter_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOrderedQuarterC;
    @XmlElementRef(name = "DateOrderedMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOrderedMonthC;
    @XmlElementRef(name = "LineId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineIdC;
    @XmlElementRef(name = "Customer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerC;
    @XmlElementRef(name = "BillToSite_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToSiteC;
    @XmlElementRef(name = "FreightAC_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightACC;
    @XmlElementRef(name = "PackingInstructions_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packingInstructionsC;
    @XmlElementRef(name = "LinePackingInstructions_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linePackingInstructionsC;
    @XmlElementRef(name = "CustomerItem_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerItemC;
    @XmlElementRef(name = "HoldYN_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdYNC;
    @XmlElementRef(name = "LineType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineTypeC;
    @XmlElementRef(name = "IncoTermsFOB_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incoTermsFOBC;
    @XmlElementRef(name = "CRMRowID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmRowIDC;
    @XmlElementRef(name = "SalesPersonMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesPersonMobileC;
    @XmlElementRef(name = "ItemNumberMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumberMobileC;
    @XmlElementRef(name = "MarketSegment1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegment1C;
    @XmlElementRef(name = "MarketSubSegment1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSubSegment1C;
    @XmlElementRef(name = "PromiseDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promiseDateC;
    @XmlElementRef(name = "EndCustomerNo_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerNoC;
    @XmlElementRef(name = "EndCustomerSite_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerSiteC;
    @XmlElementRef(name = "OPSComments_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opsCommentsC;
    @XmlElementRef(name = "SOCreationDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soCreationDateC;
    @XmlElementRef(name = "ITWHKDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itwhkDateC;
    @XmlElementRef(name = "ITWHKAWB_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itwhkawbc;
    @XmlElementRef(name = "HarmonizedCode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> harmonizedCodeC;
    @XmlElementRef(name = "ShockIndicator_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shockIndicatorC;
    @XmlElementRef(name = "SpecialLabel_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialLabelC;
    @XmlElementRef(name = "Grade_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gradeC;
    @XmlElementRef(name = "Planner_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plannerC;
    @XmlElementRef(name = "InventoryItemStatusCode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inventoryItemStatusCodeC;
    @XmlElementRef(name = "OrderType1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType1C;
    @XmlElementRef(name = "LineStatus1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineStatus1C;
    @XmlElementRef(name = "DeliveryLineStatus1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryLineStatus1C;
    @XmlElementRef(name = "HoldYN1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdYN1C;
    @XmlElementRef(name = "LineType1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineType1C;
    @XmlElementRef(name = "IncoTermsFOB1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incoTermsFOB1C;
    @XmlElementRef(name = "INTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElementRef(name = "CRDFiscalQtr_RPT_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdFiscalQtrRPTC;
    @XmlElementRef(name = "MarketSegment2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegment2C;
    @XmlElementRef(name = "MarketSubSegment2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSubSegment2C;
    @XmlElement(name = "BacklogTeamCollection_c")
    protected List<BacklogTeamC> backlogTeamCollectionC;

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
     * Gets the value of the orderTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderTypeC() {
        return orderTypeC;
    }

    /**
     * Sets the value of the orderTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderTypeC(JAXBElement<String> value) {
        this.orderTypeC = value;
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
     * Gets the value of the salesPersonIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPersonIdC() {
        return salesPersonIdC;
    }

    /**
     * Sets the value of the salesPersonIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPersonIdC(JAXBElement<BigDecimal> value) {
        this.salesPersonIdC = value;
    }

    /**
     * Gets the value of the salesPersonC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPersonC() {
        return salesPersonC;
    }

    /**
     * Sets the value of the salesPersonC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPersonC(JAXBElement<String> value) {
        this.salesPersonC = value;
    }

    /**
     * Gets the value of the shippingMethodC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingMethodC() {
        return shippingMethodC;
    }

    /**
     * Sets the value of the shippingMethodC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingMethodC(JAXBElement<String> value) {
        this.shippingMethodC = value;
    }

    /**
     * Gets the value of the quoteIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteIDC() {
        return quoteIDC;
    }

    /**
     * Sets the value of the quoteIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteIDC(JAXBElement<String> value) {
        this.quoteIDC = value;
    }

    /**
     * Gets the value of the customerPOC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerPOC() {
        return customerPOC;
    }

    /**
     * Sets the value of the customerPOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerPOC(JAXBElement<String> value) {
        this.customerPOC = value;
    }

    /**
     * Gets the value of the orderNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumberC() {
        return orderNumberC;
    }

    /**
     * Sets the value of the orderNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumberC(JAXBElement<String> value) {
        this.orderNumberC = value;
    }

    /**
     * Gets the value of the itemNumberIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getItemNumberIdC() {
        return itemNumberIdC;
    }

    /**
     * Sets the value of the itemNumberIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setItemNumberIdC(JAXBElement<BigDecimal> value) {
        this.itemNumberIdC = value;
    }

    /**
     * Gets the value of the itemNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumberC() {
        return itemNumberC;
    }

    /**
     * Sets the value of the itemNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumberC(JAXBElement<String> value) {
        this.itemNumberC = value;
    }

    /**
     * Gets the value of the itemFamilyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemFamilyC() {
        return itemFamilyC;
    }

    /**
     * Sets the value of the itemFamilyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemFamilyC(JAXBElement<String> value) {
        this.itemFamilyC = value;
    }

    /**
     * Gets the value of the remainingQtyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRemainingQtyC() {
        return remainingQtyC;
    }

    /**
     * Sets the value of the remainingQtyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRemainingQtyC(JAXBElement<BigDecimal> value) {
        this.remainingQtyC = value;
    }

    /**
     * Gets the value of the unitSellingPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitSellingPriceC() {
        return unitSellingPriceC;
    }

    /**
     * Sets the value of the unitSellingPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitSellingPriceC(JAXBElement<String> value) {
        this.unitSellingPriceC = value;
    }

    /**
     * Gets the value of the revenueC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRevenueC() {
        return revenueC;
    }

    /**
     * Sets the value of the revenueC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRevenueC(JAXBElement<AmountType> value) {
        this.revenueC = value;
    }

    /**
     * Gets the value of the dateOrderedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOrderedC() {
        return dateOrderedC;
    }

    /**
     * Sets the value of the dateOrderedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOrderedC(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOrderedC = value;
    }

    /**
     * Gets the value of the crdc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCRDC() {
        return crdc;
    }

    /**
     * Sets the value of the crdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCRDC(JAXBElement<XMLGregorianCalendar> value) {
        this.crdc = value;
    }

    /**
     * Gets the value of the crdFiscalMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRDFiscalMonthC() {
        return crdFiscalMonthC;
    }

    /**
     * Sets the value of the crdFiscalMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRDFiscalMonthC(JAXBElement<String> value) {
        this.crdFiscalMonthC = value;
    }

    /**
     * Gets the value of the crdFiscalQtrC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRDFiscalQtrC() {
        return crdFiscalQtrC;
    }

    /**
     * Sets the value of the crdFiscalQtrC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRDFiscalQtrC(JAXBElement<String> value) {
        this.crdFiscalQtrC = value;
    }

    /**
     * Gets the value of the crdFiscalYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRDFiscalYearC() {
        return crdFiscalYearC;
    }

    /**
     * Sets the value of the crdFiscalYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRDFiscalYearC(JAXBElement<String> value) {
        this.crdFiscalYearC = value;
    }

    /**
     * Gets the value of the csdc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCSDC() {
        return csdc;
    }

    /**
     * Sets the value of the csdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCSDC(JAXBElement<XMLGregorianCalendar> value) {
        this.csdc = value;
    }

    /**
     * Gets the value of the csdFiscalMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCSDFiscalMonthC() {
        return csdFiscalMonthC;
    }

    /**
     * Sets the value of the csdFiscalMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCSDFiscalMonthC(JAXBElement<String> value) {
        this.csdFiscalMonthC = value;
    }

    /**
     * Gets the value of the csdFiscalQtrC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCSDFiscalQtrC() {
        return csdFiscalQtrC;
    }

    /**
     * Sets the value of the csdFiscalQtrC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCSDFiscalQtrC(JAXBElement<String> value) {
        this.csdFiscalQtrC = value;
    }

    /**
     * Gets the value of the csdFiscalYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCSDFiscalYearC() {
        return csdFiscalYearC;
    }

    /**
     * Sets the value of the csdFiscalYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCSDFiscalYearC(JAXBElement<String> value) {
        this.csdFiscalYearC = value;
    }

    /**
     * Gets the value of the lineNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineNumberC() {
        return lineNumberC;
    }

    /**
     * Sets the value of the lineNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineNumberC(JAXBElement<String> value) {
        this.lineNumberC = value;
    }

    /**
     * Gets the value of the lineStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineStatusC() {
        return lineStatusC;
    }

    /**
     * Sets the value of the lineStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineStatusC(JAXBElement<String> value) {
        this.lineStatusC = value;
    }

    /**
     * Gets the value of the territoryNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryNameC() {
        return territoryNameC;
    }

    /**
     * Sets the value of the territoryNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryNameC(JAXBElement<String> value) {
        this.territoryNameC = value;
    }

    /**
     * Gets the value of the deliveryShipToCtyStZipCtryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryShipToCtyStZipCtryC() {
        return deliveryShipToCtyStZipCtryC;
    }

    /**
     * Sets the value of the deliveryShipToCtyStZipCtryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryShipToCtyStZipCtryC(JAXBElement<String> value) {
        this.deliveryShipToCtyStZipCtryC = value;
    }

    /**
     * Gets the value of the shipToCountryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToCountryC() {
        return shipToCountryC;
    }

    /**
     * Sets the value of the shipToCountryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToCountryC(JAXBElement<String> value) {
        this.shipToCountryC = value;
    }

    /**
     * Gets the value of the soldToCustomerEBSIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoldToCustomerEBSIDC() {
        return soldToCustomerEBSIDC;
    }

    /**
     * Sets the value of the soldToCustomerEBSIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoldToCustomerEBSIDC(JAXBElement<String> value) {
        this.soldToCustomerEBSIDC = value;
    }

    /**
     * Gets the value of the endCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerC() {
        return endCustomerC;
    }

    /**
     * Sets the value of the endCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerC(JAXBElement<String> value) {
        this.endCustomerC = value;
    }

    /**
     * Gets the value of the shipToCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToCustomerC() {
        return shipToCustomerC;
    }

    /**
     * Sets the value of the shipToCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToCustomerC(JAXBElement<String> value) {
        this.shipToCustomerC = value;
    }

    /**
     * Gets the value of the shipToLocationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToLocationC() {
        return shipToLocationC;
    }

    /**
     * Sets the value of the shipToLocationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToLocationC(JAXBElement<String> value) {
        this.shipToLocationC = value;
    }

    /**
     * Gets the value of the billToCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToCustomerC() {
        return billToCustomerC;
    }

    /**
     * Sets the value of the billToCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToCustomerC(JAXBElement<String> value) {
        this.billToCustomerC = value;
    }

    /**
     * Gets the value of the billToLocationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToLocationC() {
        return billToLocationC;
    }

    /**
     * Sets the value of the billToLocationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToLocationC(JAXBElement<String> value) {
        this.billToLocationC = value;
    }

    /**
     * Gets the value of the parentCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentCustomerIdC() {
        return parentCustomerIdC;
    }

    /**
     * Sets the value of the parentCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentCustomerIdC(BigDecimal value) {
        this.parentCustomerIdC = value;
    }

    /**
     * Gets the value of the parentCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCustomerC() {
        return parentCustomerC;
    }

    /**
     * Sets the value of the parentCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCustomerC(String value) {
        this.parentCustomerC = value;
    }

    /**
     * Gets the value of the deliveryAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddressC() {
        return deliveryAddressC;
    }

    /**
     * Sets the value of the deliveryAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddressC(JAXBElement<String> value) {
        this.deliveryAddressC = value;
    }

    /**
     * Gets the value of the deliveryAddress3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddress3C() {
        return deliveryAddress3C;
    }

    /**
     * Sets the value of the deliveryAddress3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddress3C(JAXBElement<String> value) {
        this.deliveryAddress3C = value;
    }

    /**
     * Gets the value of the deliveryAddress4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddress4C() {
        return deliveryAddress4C;
    }

    /**
     * Sets the value of the deliveryAddress4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddress4C(JAXBElement<String> value) {
        this.deliveryAddress4C = value;
    }

    /**
     * Gets the value of the shipToSiteC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToSiteC() {
        return shipToSiteC;
    }

    /**
     * Sets the value of the shipToSiteC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToSiteC(JAXBElement<String> value) {
        this.shipToSiteC = value;
    }

    /**
     * Gets the value of the shipFromC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipFromC() {
        return shipFromC;
    }

    /**
     * Sets the value of the shipFromC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipFromC(JAXBElement<String> value) {
        this.shipFromC = value;
    }

    /**
     * Gets the value of the lineShippingInstructionsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineShippingInstructionsC() {
        return lineShippingInstructionsC;
    }

    /**
     * Sets the value of the lineShippingInstructionsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineShippingInstructionsC(JAXBElement<String> value) {
        this.lineShippingInstructionsC = value;
    }

    /**
     * Gets the value of the shippingInstructionsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingInstructionsC() {
        return shippingInstructionsC;
    }

    /**
     * Sets the value of the shippingInstructionsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingInstructionsC(JAXBElement<String> value) {
        this.shippingInstructionsC = value;
    }

    /**
     * Gets the value of the deliveryLineStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryLineStatusC() {
        return deliveryLineStatusC;
    }

    /**
     * Sets the value of the deliveryLineStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryLineStatusC(JAXBElement<String> value) {
        this.deliveryLineStatusC = value;
    }

    /**
     * Gets the value of the dateOrderedYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOrderedYearC() {
        return dateOrderedYearC;
    }

    /**
     * Sets the value of the dateOrderedYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOrderedYearC(JAXBElement<String> value) {
        this.dateOrderedYearC = value;
    }

    /**
     * Gets the value of the dateOrderedQuarterC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOrderedQuarterC() {
        return dateOrderedQuarterC;
    }

    /**
     * Sets the value of the dateOrderedQuarterC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOrderedQuarterC(JAXBElement<String> value) {
        this.dateOrderedQuarterC = value;
    }

    /**
     * Gets the value of the dateOrderedMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOrderedMonthC() {
        return dateOrderedMonthC;
    }

    /**
     * Sets the value of the dateOrderedMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOrderedMonthC(JAXBElement<String> value) {
        this.dateOrderedMonthC = value;
    }

    /**
     * Gets the value of the lineIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineIdC() {
        return lineIdC;
    }

    /**
     * Sets the value of the lineIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineIdC(JAXBElement<String> value) {
        this.lineIdC = value;
    }

    /**
     * Gets the value of the customerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerC() {
        return customerC;
    }

    /**
     * Sets the value of the customerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerC(JAXBElement<String> value) {
        this.customerC = value;
    }

    /**
     * Gets the value of the billToSiteC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillToSiteC() {
        return billToSiteC;
    }

    /**
     * Sets the value of the billToSiteC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillToSiteC(JAXBElement<String> value) {
        this.billToSiteC = value;
    }

    /**
     * Gets the value of the freightACC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreightACC() {
        return freightACC;
    }

    /**
     * Sets the value of the freightACC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreightACC(JAXBElement<String> value) {
        this.freightACC = value;
    }

    /**
     * Gets the value of the packingInstructionsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackingInstructionsC() {
        return packingInstructionsC;
    }

    /**
     * Sets the value of the packingInstructionsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackingInstructionsC(JAXBElement<String> value) {
        this.packingInstructionsC = value;
    }

    /**
     * Gets the value of the linePackingInstructionsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinePackingInstructionsC() {
        return linePackingInstructionsC;
    }

    /**
     * Sets the value of the linePackingInstructionsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinePackingInstructionsC(JAXBElement<String> value) {
        this.linePackingInstructionsC = value;
    }

    /**
     * Gets the value of the customerItemC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerItemC() {
        return customerItemC;
    }

    /**
     * Sets the value of the customerItemC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerItemC(JAXBElement<String> value) {
        this.customerItemC = value;
    }

    /**
     * Gets the value of the holdYNC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldYNC() {
        return holdYNC;
    }

    /**
     * Sets the value of the holdYNC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldYNC(JAXBElement<String> value) {
        this.holdYNC = value;
    }

    /**
     * Gets the value of the lineTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineTypeC() {
        return lineTypeC;
    }

    /**
     * Sets the value of the lineTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineTypeC(JAXBElement<String> value) {
        this.lineTypeC = value;
    }

    /**
     * Gets the value of the incoTermsFOBC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncoTermsFOBC() {
        return incoTermsFOBC;
    }

    /**
     * Sets the value of the incoTermsFOBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncoTermsFOBC(JAXBElement<String> value) {
        this.incoTermsFOBC = value;
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
     * Gets the value of the salesPersonMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPersonMobileC() {
        return salesPersonMobileC;
    }

    /**
     * Sets the value of the salesPersonMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPersonMobileC(JAXBElement<String> value) {
        this.salesPersonMobileC = value;
    }

    /**
     * Gets the value of the itemNumberMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumberMobileC() {
        return itemNumberMobileC;
    }

    /**
     * Sets the value of the itemNumberMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumberMobileC(JAXBElement<String> value) {
        this.itemNumberMobileC = value;
    }

    /**
     * Gets the value of the marketSegment1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSegment1C() {
        return marketSegment1C;
    }

    /**
     * Sets the value of the marketSegment1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSegment1C(JAXBElement<String> value) {
        this.marketSegment1C = value;
    }

    /**
     * Gets the value of the marketSubSegment1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSubSegment1C() {
        return marketSubSegment1C;
    }

    /**
     * Sets the value of the marketSubSegment1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSubSegment1C(JAXBElement<String> value) {
        this.marketSubSegment1C = value;
    }

    /**
     * Gets the value of the promiseDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromiseDateC() {
        return promiseDateC;
    }

    /**
     * Sets the value of the promiseDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromiseDateC(JAXBElement<String> value) {
        this.promiseDateC = value;
    }

    /**
     * Gets the value of the endCustomerNoC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerNoC() {
        return endCustomerNoC;
    }

    /**
     * Sets the value of the endCustomerNoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerNoC(JAXBElement<String> value) {
        this.endCustomerNoC = value;
    }

    /**
     * Gets the value of the endCustomerSiteC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerSiteC() {
        return endCustomerSiteC;
    }

    /**
     * Sets the value of the endCustomerSiteC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerSiteC(JAXBElement<String> value) {
        this.endCustomerSiteC = value;
    }

    /**
     * Gets the value of the opsCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOPSCommentsC() {
        return opsCommentsC;
    }

    /**
     * Sets the value of the opsCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOPSCommentsC(JAXBElement<String> value) {
        this.opsCommentsC = value;
    }

    /**
     * Gets the value of the soCreationDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOCreationDateC() {
        return soCreationDateC;
    }

    /**
     * Sets the value of the soCreationDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOCreationDateC(JAXBElement<String> value) {
        this.soCreationDateC = value;
    }

    /**
     * Gets the value of the itwhkDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getITWHKDateC() {
        return itwhkDateC;
    }

    /**
     * Sets the value of the itwhkDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setITWHKDateC(JAXBElement<String> value) {
        this.itwhkDateC = value;
    }

    /**
     * Gets the value of the itwhkawbc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getITWHKAWBC() {
        return itwhkawbc;
    }

    /**
     * Sets the value of the itwhkawbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setITWHKAWBC(JAXBElement<String> value) {
        this.itwhkawbc = value;
    }

    /**
     * Gets the value of the harmonizedCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHarmonizedCodeC() {
        return harmonizedCodeC;
    }

    /**
     * Sets the value of the harmonizedCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHarmonizedCodeC(JAXBElement<String> value) {
        this.harmonizedCodeC = value;
    }

    /**
     * Gets the value of the shockIndicatorC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShockIndicatorC() {
        return shockIndicatorC;
    }

    /**
     * Sets the value of the shockIndicatorC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShockIndicatorC(JAXBElement<String> value) {
        this.shockIndicatorC = value;
    }

    /**
     * Gets the value of the specialLabelC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialLabelC() {
        return specialLabelC;
    }

    /**
     * Sets the value of the specialLabelC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialLabelC(JAXBElement<String> value) {
        this.specialLabelC = value;
    }

    /**
     * Gets the value of the gradeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradeC() {
        return gradeC;
    }

    /**
     * Sets the value of the gradeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradeC(JAXBElement<String> value) {
        this.gradeC = value;
    }

    /**
     * Gets the value of the plannerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlannerC() {
        return plannerC;
    }

    /**
     * Sets the value of the plannerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlannerC(JAXBElement<String> value) {
        this.plannerC = value;
    }

    /**
     * Gets the value of the inventoryItemStatusCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventoryItemStatusCodeC() {
        return inventoryItemStatusCodeC;
    }

    /**
     * Sets the value of the inventoryItemStatusCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventoryItemStatusCodeC(JAXBElement<String> value) {
        this.inventoryItemStatusCodeC = value;
    }

    /**
     * Gets the value of the orderType1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderType1C() {
        return orderType1C;
    }

    /**
     * Sets the value of the orderType1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderType1C(JAXBElement<String> value) {
        this.orderType1C = value;
    }

    /**
     * Gets the value of the lineStatus1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineStatus1C() {
        return lineStatus1C;
    }

    /**
     * Sets the value of the lineStatus1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineStatus1C(JAXBElement<String> value) {
        this.lineStatus1C = value;
    }

    /**
     * Gets the value of the deliveryLineStatus1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryLineStatus1C() {
        return deliveryLineStatus1C;
    }

    /**
     * Sets the value of the deliveryLineStatus1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryLineStatus1C(JAXBElement<String> value) {
        this.deliveryLineStatus1C = value;
    }

    /**
     * Gets the value of the holdYN1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldYN1C() {
        return holdYN1C;
    }

    /**
     * Sets the value of the holdYN1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldYN1C(JAXBElement<String> value) {
        this.holdYN1C = value;
    }

    /**
     * Gets the value of the lineType1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineType1C() {
        return lineType1C;
    }

    /**
     * Sets the value of the lineType1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineType1C(JAXBElement<String> value) {
        this.lineType1C = value;
    }

    /**
     * Gets the value of the incoTermsFOB1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncoTermsFOB1C() {
        return incoTermsFOB1C;
    }

    /**
     * Sets the value of the incoTermsFOB1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncoTermsFOB1C(JAXBElement<String> value) {
        this.incoTermsFOB1C = value;
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
     * Gets the value of the crdFiscalQtrRPTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRDFiscalQtrRPTC() {
        return crdFiscalQtrRPTC;
    }

    /**
     * Sets the value of the crdFiscalQtrRPTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRDFiscalQtrRPTC(JAXBElement<String> value) {
        this.crdFiscalQtrRPTC = value;
    }

    /**
     * Gets the value of the marketSegment2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSegment2C() {
        return marketSegment2C;
    }

    /**
     * Sets the value of the marketSegment2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSegment2C(JAXBElement<String> value) {
        this.marketSegment2C = value;
    }

    /**
     * Gets the value of the marketSubSegment2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSubSegment2C() {
        return marketSubSegment2C;
    }

    /**
     * Sets the value of the marketSubSegment2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSubSegment2C(JAXBElement<String> value) {
        this.marketSubSegment2C = value;
    }

    /**
     * Gets the value of the backlogTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backlogTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBacklogTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BacklogTeamC }
     * 
     * 
     */
    public List<BacklogTeamC> getBacklogTeamCollectionC() {
        if (backlogTeamCollectionC == null) {
            backlogTeamCollectionC = new ArrayList<BacklogTeamC>();
        }
        return this.backlogTeamCollectionC;
    }

}
