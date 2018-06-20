
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
 * <p>Java class for Billing_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billing_c">
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
 *         &lt;element name="SubMarket_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesrepName_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesrepName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrder_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PartNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemFamily_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revenue_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="LineType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerAddress1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerAddress2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerAddress3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerCity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerCountry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesOrderDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="BillCustomerNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerAddress1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerAddress2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerAddress3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerCity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerCountry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShippingQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoicedQty_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WaybillNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderLineNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceLineType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuncAmount_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDueRemaining_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="DueDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InvoiceDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GLDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CustomerTrxLineId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderSalesrep_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicedateMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicedateQuarter_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicedateYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipdateMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipdatedateQuarter_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipdatedateYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchSourceName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PromiseDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ScheduleShipDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualShipmentDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PullIn_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fob_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountDueOriginal_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ItemType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Backend_ASP_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CRMRowID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepNameMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumberMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarket1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillCustomerState_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipCustomerState_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INCOTERM_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnReason_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineSalesrep_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldFromInventoryOrg_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HarmonizedCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineStatus1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceLineType1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PullIn1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicedateQuarter_RPT_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSegment2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSubSegment2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}BillingTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Billing_c", namespace = "/oracle/apps/sales/custExtn/views/common/", propOrder = {
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
    "subMarketC",
    "salesrepNameIdC",
    "salesrepNameC",
    "quoteNumberC",
    "purchaseOrderC",
    "orderNumberC",
    "partNumberIdC",
    "partNumberC",
    "itemFamilyC",
    "unitPriceC",
    "revenueC",
    "lineTypeC",
    "lineStatusC",
    "parentCustomerIdC",
    "parentCustomerC",
    "shipCustomerNameC",
    "shipCustomerAddress1C",
    "shipCustomerAddress2C",
    "shipCustomerAddress3C",
    "shipCustomerCityC",
    "shipCustomerCountryC",
    "salesOrderDateC",
    "billCustomerNumberC",
    "endCustomerC",
    "billToCustomerC",
    "billCustomerAddress1C",
    "billCustomerAddress2C",
    "billCustomerAddress3C",
    "billCustomerCityC",
    "billCustomerCountryC",
    "shipCustomerNumberC",
    "classC",
    "orderedQuantityC",
    "shippingQuantityC",
    "invoicedQtyC",
    "waybillNumberC",
    "invoiceNumberC",
    "orderLineNumberC",
    "deliveryNameC",
    "accountC",
    "invoiceLineTypeC",
    "funcAmountC",
    "amountDueRemainingC",
    "dueDateC",
    "invoiceDateC",
    "glDateC",
    "customerTrxLineIdC",
    "headerSalesrepC",
    "invoicedateMonthC",
    "invoicedateQuarterC",
    "invoicedateYearC",
    "shipdateMonthC",
    "shipdatedateQuarterC",
    "shipdatedateYearC",
    "batchSourceNameC",
    "requestDateC",
    "promiseDateC",
    "scheduleShipDateC",
    "actualShipmentDateC",
    "pullInC",
    "fobC",
    "amountDueOriginalC",
    "itemTypeC",
    "typeC",
    "backendASPC",
    "crmRowIDC",
    "salesRepNameMobileC",
    "partNumberMobileC",
    "marketSegment1C",
    "subMarket1C",
    "billCustomerStateC",
    "shipCustomerStateC",
    "incotermc",
    "returnReasonC",
    "lineSalesrepC",
    "soldFromInventoryOrgC",
    "harmonizedCodeC",
    "lineType1C",
    "lineStatus1C",
    "orderType1C",
    "class1C",
    "invoiceLineType1C",
    "pullIn1C",
    "type1C",
    "intgc",
    "invoicedateQuarterRPTC",
    "marketSegment2C",
    "marketSubSegment2C",
    "billingTeamCollectionC"
})
public class BillingC {

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
    @XmlElementRef(name = "SubMarket_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarketC;
    @XmlElementRef(name = "SalesrepName_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesrepNameIdC;
    @XmlElementRef(name = "SalesrepName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesrepNameC;
    @XmlElementRef(name = "QuoteNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteNumberC;
    @XmlElementRef(name = "PurchaseOrder_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purchaseOrderC;
    @XmlElementRef(name = "OrderNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumberC;
    @XmlElementRef(name = "PartNumber_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> partNumberIdC;
    @XmlElementRef(name = "PartNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumberC;
    @XmlElementRef(name = "ItemFamily_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemFamilyC;
    @XmlElementRef(name = "UnitPrice_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitPriceC;
    @XmlElementRef(name = "Revenue_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revenueC;
    @XmlElementRef(name = "LineType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineTypeC;
    @XmlElementRef(name = "LineStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineStatusC;
    @XmlElement(name = "ParentCustomer_Id_c")
    protected BigDecimal parentCustomerIdC;
    @XmlElement(name = "ParentCustomer_c")
    protected String parentCustomerC;
    @XmlElementRef(name = "ShipCustomerName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerNameC;
    @XmlElementRef(name = "ShipCustomerAddress1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerAddress1C;
    @XmlElementRef(name = "ShipCustomerAddress2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerAddress2C;
    @XmlElementRef(name = "ShipCustomerAddress3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerAddress3C;
    @XmlElementRef(name = "ShipCustomerCity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerCityC;
    @XmlElementRef(name = "ShipCustomerCountry_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerCountryC;
    @XmlElementRef(name = "SalesOrderDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> salesOrderDateC;
    @XmlElementRef(name = "BillCustomerNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerNumberC;
    @XmlElementRef(name = "EndCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerC;
    @XmlElementRef(name = "BillToCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billToCustomerC;
    @XmlElementRef(name = "BillCustomerAddress1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerAddress1C;
    @XmlElementRef(name = "BillCustomerAddress2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerAddress2C;
    @XmlElementRef(name = "BillCustomerAddress3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerAddress3C;
    @XmlElementRef(name = "BillCustomerCity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerCityC;
    @XmlElementRef(name = "BillCustomerCountry_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerCountryC;
    @XmlElementRef(name = "ShipCustomerNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerNumberC;
    @XmlElementRef(name = "Class_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classC;
    @XmlElementRef(name = "OrderedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> orderedQuantityC;
    @XmlElementRef(name = "ShippingQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shippingQuantityC;
    @XmlElementRef(name = "InvoicedQty_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> invoicedQtyC;
    @XmlElementRef(name = "WaybillNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> waybillNumberC;
    @XmlElementRef(name = "InvoiceNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceNumberC;
    @XmlElementRef(name = "OrderLineNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderLineNumberC;
    @XmlElementRef(name = "DeliveryName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryNameC;
    @XmlElementRef(name = "Account_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountC;
    @XmlElementRef(name = "InvoiceLineType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceLineTypeC;
    @XmlElementRef(name = "FuncAmount_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> funcAmountC;
    @XmlElementRef(name = "AmountDueRemaining_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> amountDueRemainingC;
    @XmlElementRef(name = "DueDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDateC;
    @XmlElementRef(name = "InvoiceDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> invoiceDateC;
    @XmlElementRef(name = "GLDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> glDateC;
    @XmlElementRef(name = "CustomerTrxLineId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerTrxLineIdC;
    @XmlElementRef(name = "HeaderSalesrep_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerSalesrepC;
    @XmlElementRef(name = "InvoicedateMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicedateMonthC;
    @XmlElementRef(name = "InvoicedateQuarter_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicedateQuarterC;
    @XmlElementRef(name = "InvoicedateYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicedateYearC;
    @XmlElementRef(name = "ShipdateMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipdateMonthC;
    @XmlElementRef(name = "ShipdatedateQuarter_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipdatedateQuarterC;
    @XmlElementRef(name = "ShipdatedateYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipdatedateYearC;
    @XmlElementRef(name = "BatchSourceName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> batchSourceNameC;
    @XmlElementRef(name = "RequestDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestDateC;
    @XmlElementRef(name = "PromiseDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> promiseDateC;
    @XmlElementRef(name = "ScheduleShipDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleShipDateC;
    @XmlElementRef(name = "ActualShipmentDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualShipmentDateC;
    @XmlElementRef(name = "PullIn_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pullInC;
    @XmlElementRef(name = "Fob_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fobC;
    @XmlElementRef(name = "AmountDueOriginal_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> amountDueOriginalC;
    @XmlElementRef(name = "ItemType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemTypeC;
    @XmlElementRef(name = "Type_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeC;
    @XmlElementRef(name = "Backend_ASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> backendASPC;
    @XmlElementRef(name = "CRMRowID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmRowIDC;
    @XmlElementRef(name = "SalesRepNameMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesRepNameMobileC;
    @XmlElementRef(name = "PartNumberMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partNumberMobileC;
    @XmlElementRef(name = "MarketSegment1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegment1C;
    @XmlElementRef(name = "SubMarket1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarket1C;
    @XmlElementRef(name = "BillCustomerState_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billCustomerStateC;
    @XmlElementRef(name = "ShipCustomerState_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipCustomerStateC;
    @XmlElementRef(name = "INCOTERM_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incotermc;
    @XmlElementRef(name = "ReturnReason_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnReasonC;
    @XmlElementRef(name = "LineSalesrep_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineSalesrepC;
    @XmlElementRef(name = "SoldFromInventoryOrg_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soldFromInventoryOrgC;
    @XmlElementRef(name = "HarmonizedCode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> harmonizedCodeC;
    @XmlElementRef(name = "LineType1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineType1C;
    @XmlElementRef(name = "LineStatus1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineStatus1C;
    @XmlElementRef(name = "OrderType1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType1C;
    @XmlElementRef(name = "Class1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> class1C;
    @XmlElementRef(name = "InvoiceLineType1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceLineType1C;
    @XmlElementRef(name = "PullIn1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pullIn1C;
    @XmlElementRef(name = "Type1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type1C;
    @XmlElementRef(name = "INTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElementRef(name = "InvoicedateQuarter_RPT_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoicedateQuarterRPTC;
    @XmlElementRef(name = "MarketSegment2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegment2C;
    @XmlElementRef(name = "MarketSubSegment2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSubSegment2C;
    @XmlElement(name = "BillingTeamCollection_c")
    protected List<BillingTeamC> billingTeamCollectionC;

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
     * Gets the value of the subMarketC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMarketC() {
        return subMarketC;
    }

    /**
     * Sets the value of the subMarketC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMarketC(JAXBElement<String> value) {
        this.subMarketC = value;
    }

    /**
     * Gets the value of the salesrepNameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesrepNameIdC() {
        return salesrepNameIdC;
    }

    /**
     * Sets the value of the salesrepNameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesrepNameIdC(JAXBElement<BigDecimal> value) {
        this.salesrepNameIdC = value;
    }

    /**
     * Gets the value of the salesrepNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesrepNameC() {
        return salesrepNameC;
    }

    /**
     * Sets the value of the salesrepNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesrepNameC(JAXBElement<String> value) {
        this.salesrepNameC = value;
    }

    /**
     * Gets the value of the quoteNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteNumberC() {
        return quoteNumberC;
    }

    /**
     * Sets the value of the quoteNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteNumberC(JAXBElement<String> value) {
        this.quoteNumberC = value;
    }

    /**
     * Gets the value of the purchaseOrderC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPurchaseOrderC() {
        return purchaseOrderC;
    }

    /**
     * Sets the value of the purchaseOrderC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPurchaseOrderC(JAXBElement<String> value) {
        this.purchaseOrderC = value;
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
     * Gets the value of the partNumberIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPartNumberIdC() {
        return partNumberIdC;
    }

    /**
     * Sets the value of the partNumberIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPartNumberIdC(JAXBElement<BigDecimal> value) {
        this.partNumberIdC = value;
    }

    /**
     * Gets the value of the partNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumberC() {
        return partNumberC;
    }

    /**
     * Sets the value of the partNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumberC(JAXBElement<String> value) {
        this.partNumberC = value;
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
     * Gets the value of the unitPriceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitPriceC() {
        return unitPriceC;
    }

    /**
     * Sets the value of the unitPriceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitPriceC(JAXBElement<String> value) {
        this.unitPriceC = value;
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
     * Gets the value of the shipCustomerNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerNameC() {
        return shipCustomerNameC;
    }

    /**
     * Sets the value of the shipCustomerNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerNameC(JAXBElement<String> value) {
        this.shipCustomerNameC = value;
    }

    /**
     * Gets the value of the shipCustomerAddress1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerAddress1C() {
        return shipCustomerAddress1C;
    }

    /**
     * Sets the value of the shipCustomerAddress1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerAddress1C(JAXBElement<String> value) {
        this.shipCustomerAddress1C = value;
    }

    /**
     * Gets the value of the shipCustomerAddress2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerAddress2C() {
        return shipCustomerAddress2C;
    }

    /**
     * Sets the value of the shipCustomerAddress2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerAddress2C(JAXBElement<String> value) {
        this.shipCustomerAddress2C = value;
    }

    /**
     * Gets the value of the shipCustomerAddress3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerAddress3C() {
        return shipCustomerAddress3C;
    }

    /**
     * Sets the value of the shipCustomerAddress3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerAddress3C(JAXBElement<String> value) {
        this.shipCustomerAddress3C = value;
    }

    /**
     * Gets the value of the shipCustomerCityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerCityC() {
        return shipCustomerCityC;
    }

    /**
     * Sets the value of the shipCustomerCityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerCityC(JAXBElement<String> value) {
        this.shipCustomerCityC = value;
    }

    /**
     * Gets the value of the shipCustomerCountryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerCountryC() {
        return shipCustomerCountryC;
    }

    /**
     * Sets the value of the shipCustomerCountryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerCountryC(JAXBElement<String> value) {
        this.shipCustomerCountryC = value;
    }

    /**
     * Gets the value of the salesOrderDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSalesOrderDateC() {
        return salesOrderDateC;
    }

    /**
     * Sets the value of the salesOrderDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSalesOrderDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.salesOrderDateC = value;
    }

    /**
     * Gets the value of the billCustomerNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerNumberC() {
        return billCustomerNumberC;
    }

    /**
     * Sets the value of the billCustomerNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerNumberC(JAXBElement<String> value) {
        this.billCustomerNumberC = value;
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
     * Gets the value of the billCustomerAddress1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerAddress1C() {
        return billCustomerAddress1C;
    }

    /**
     * Sets the value of the billCustomerAddress1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerAddress1C(JAXBElement<String> value) {
        this.billCustomerAddress1C = value;
    }

    /**
     * Gets the value of the billCustomerAddress2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerAddress2C() {
        return billCustomerAddress2C;
    }

    /**
     * Sets the value of the billCustomerAddress2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerAddress2C(JAXBElement<String> value) {
        this.billCustomerAddress2C = value;
    }

    /**
     * Gets the value of the billCustomerAddress3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerAddress3C() {
        return billCustomerAddress3C;
    }

    /**
     * Sets the value of the billCustomerAddress3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerAddress3C(JAXBElement<String> value) {
        this.billCustomerAddress3C = value;
    }

    /**
     * Gets the value of the billCustomerCityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerCityC() {
        return billCustomerCityC;
    }

    /**
     * Sets the value of the billCustomerCityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerCityC(JAXBElement<String> value) {
        this.billCustomerCityC = value;
    }

    /**
     * Gets the value of the billCustomerCountryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerCountryC() {
        return billCustomerCountryC;
    }

    /**
     * Sets the value of the billCustomerCountryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerCountryC(JAXBElement<String> value) {
        this.billCustomerCountryC = value;
    }

    /**
     * Gets the value of the shipCustomerNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerNumberC() {
        return shipCustomerNumberC;
    }

    /**
     * Sets the value of the shipCustomerNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerNumberC(JAXBElement<String> value) {
        this.shipCustomerNumberC = value;
    }

    /**
     * Gets the value of the classC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassC() {
        return classC;
    }

    /**
     * Sets the value of the classC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassC(JAXBElement<String> value) {
        this.classC = value;
    }

    /**
     * Gets the value of the orderedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrderedQuantityC() {
        return orderedQuantityC;
    }

    /**
     * Sets the value of the orderedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrderedQuantityC(JAXBElement<BigDecimal> value) {
        this.orderedQuantityC = value;
    }

    /**
     * Gets the value of the shippingQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShippingQuantityC() {
        return shippingQuantityC;
    }

    /**
     * Sets the value of the shippingQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShippingQuantityC(JAXBElement<BigDecimal> value) {
        this.shippingQuantityC = value;
    }

    /**
     * Gets the value of the invoicedQtyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInvoicedQtyC() {
        return invoicedQtyC;
    }

    /**
     * Sets the value of the invoicedQtyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInvoicedQtyC(JAXBElement<BigDecimal> value) {
        this.invoicedQtyC = value;
    }

    /**
     * Gets the value of the waybillNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWaybillNumberC() {
        return waybillNumberC;
    }

    /**
     * Sets the value of the waybillNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWaybillNumberC(JAXBElement<String> value) {
        this.waybillNumberC = value;
    }

    /**
     * Gets the value of the invoiceNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceNumberC() {
        return invoiceNumberC;
    }

    /**
     * Sets the value of the invoiceNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceNumberC(JAXBElement<String> value) {
        this.invoiceNumberC = value;
    }

    /**
     * Gets the value of the orderLineNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderLineNumberC() {
        return orderLineNumberC;
    }

    /**
     * Sets the value of the orderLineNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderLineNumberC(JAXBElement<String> value) {
        this.orderLineNumberC = value;
    }

    /**
     * Gets the value of the deliveryNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryNameC() {
        return deliveryNameC;
    }

    /**
     * Sets the value of the deliveryNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryNameC(JAXBElement<String> value) {
        this.deliveryNameC = value;
    }

    /**
     * Gets the value of the accountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountC() {
        return accountC;
    }

    /**
     * Sets the value of the accountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountC(JAXBElement<String> value) {
        this.accountC = value;
    }

    /**
     * Gets the value of the invoiceLineTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceLineTypeC() {
        return invoiceLineTypeC;
    }

    /**
     * Sets the value of the invoiceLineTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceLineTypeC(JAXBElement<String> value) {
        this.invoiceLineTypeC = value;
    }

    /**
     * Gets the value of the funcAmountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getFuncAmountC() {
        return funcAmountC;
    }

    /**
     * Sets the value of the funcAmountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setFuncAmountC(JAXBElement<AmountType> value) {
        this.funcAmountC = value;
    }

    /**
     * Gets the value of the amountDueRemainingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAmountDueRemainingC() {
        return amountDueRemainingC;
    }

    /**
     * Sets the value of the amountDueRemainingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAmountDueRemainingC(JAXBElement<AmountType> value) {
        this.amountDueRemainingC = value;
    }

    /**
     * Gets the value of the dueDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDateC() {
        return dueDateC;
    }

    /**
     * Sets the value of the dueDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDateC = value;
    }

    /**
     * Gets the value of the invoiceDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInvoiceDateC() {
        return invoiceDateC;
    }

    /**
     * Sets the value of the invoiceDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInvoiceDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.invoiceDateC = value;
    }

    /**
     * Gets the value of the glDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getGLDateC() {
        return glDateC;
    }

    /**
     * Sets the value of the glDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setGLDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.glDateC = value;
    }

    /**
     * Gets the value of the customerTrxLineIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerTrxLineIdC() {
        return customerTrxLineIdC;
    }

    /**
     * Sets the value of the customerTrxLineIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerTrxLineIdC(JAXBElement<String> value) {
        this.customerTrxLineIdC = value;
    }

    /**
     * Gets the value of the headerSalesrepC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderSalesrepC() {
        return headerSalesrepC;
    }

    /**
     * Sets the value of the headerSalesrepC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderSalesrepC(JAXBElement<String> value) {
        this.headerSalesrepC = value;
    }

    /**
     * Gets the value of the invoicedateMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicedateMonthC() {
        return invoicedateMonthC;
    }

    /**
     * Sets the value of the invoicedateMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicedateMonthC(JAXBElement<String> value) {
        this.invoicedateMonthC = value;
    }

    /**
     * Gets the value of the invoicedateQuarterC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicedateQuarterC() {
        return invoicedateQuarterC;
    }

    /**
     * Sets the value of the invoicedateQuarterC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicedateQuarterC(JAXBElement<String> value) {
        this.invoicedateQuarterC = value;
    }

    /**
     * Gets the value of the invoicedateYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicedateYearC() {
        return invoicedateYearC;
    }

    /**
     * Sets the value of the invoicedateYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicedateYearC(JAXBElement<String> value) {
        this.invoicedateYearC = value;
    }

    /**
     * Gets the value of the shipdateMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipdateMonthC() {
        return shipdateMonthC;
    }

    /**
     * Sets the value of the shipdateMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipdateMonthC(JAXBElement<String> value) {
        this.shipdateMonthC = value;
    }

    /**
     * Gets the value of the shipdatedateQuarterC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipdatedateQuarterC() {
        return shipdatedateQuarterC;
    }

    /**
     * Sets the value of the shipdatedateQuarterC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipdatedateQuarterC(JAXBElement<String> value) {
        this.shipdatedateQuarterC = value;
    }

    /**
     * Gets the value of the shipdatedateYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipdatedateYearC() {
        return shipdatedateYearC;
    }

    /**
     * Sets the value of the shipdatedateYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipdatedateYearC(JAXBElement<String> value) {
        this.shipdatedateYearC = value;
    }

    /**
     * Gets the value of the batchSourceNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatchSourceNameC() {
        return batchSourceNameC;
    }

    /**
     * Sets the value of the batchSourceNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatchSourceNameC(JAXBElement<String> value) {
        this.batchSourceNameC = value;
    }

    /**
     * Gets the value of the requestDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRequestDateC() {
        return requestDateC;
    }

    /**
     * Sets the value of the requestDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRequestDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.requestDateC = value;
    }

    /**
     * Gets the value of the promiseDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPromiseDateC() {
        return promiseDateC;
    }

    /**
     * Sets the value of the promiseDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPromiseDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.promiseDateC = value;
    }

    /**
     * Gets the value of the scheduleShipDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleShipDateC() {
        return scheduleShipDateC;
    }

    /**
     * Sets the value of the scheduleShipDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleShipDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleShipDateC = value;
    }

    /**
     * Gets the value of the actualShipmentDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualShipmentDateC() {
        return actualShipmentDateC;
    }

    /**
     * Sets the value of the actualShipmentDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualShipmentDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.actualShipmentDateC = value;
    }

    /**
     * Gets the value of the pullInC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPullInC() {
        return pullInC;
    }

    /**
     * Sets the value of the pullInC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPullInC(JAXBElement<String> value) {
        this.pullInC = value;
    }

    /**
     * Gets the value of the fobC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFobC() {
        return fobC;
    }

    /**
     * Sets the value of the fobC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFobC(JAXBElement<String> value) {
        this.fobC = value;
    }

    /**
     * Gets the value of the amountDueOriginalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAmountDueOriginalC() {
        return amountDueOriginalC;
    }

    /**
     * Sets the value of the amountDueOriginalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAmountDueOriginalC(JAXBElement<AmountType> value) {
        this.amountDueOriginalC = value;
    }

    /**
     * Gets the value of the itemTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemTypeC() {
        return itemTypeC;
    }

    /**
     * Sets the value of the itemTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemTypeC(JAXBElement<String> value) {
        this.itemTypeC = value;
    }

    /**
     * Gets the value of the typeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeC() {
        return typeC;
    }

    /**
     * Sets the value of the typeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeC(JAXBElement<String> value) {
        this.typeC = value;
    }

    /**
     * Gets the value of the backendASPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBackendASPC() {
        return backendASPC;
    }

    /**
     * Sets the value of the backendASPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBackendASPC(JAXBElement<AmountType> value) {
        this.backendASPC = value;
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
     * Gets the value of the salesRepNameMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesRepNameMobileC() {
        return salesRepNameMobileC;
    }

    /**
     * Sets the value of the salesRepNameMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesRepNameMobileC(JAXBElement<String> value) {
        this.salesRepNameMobileC = value;
    }

    /**
     * Gets the value of the partNumberMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartNumberMobileC() {
        return partNumberMobileC;
    }

    /**
     * Sets the value of the partNumberMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartNumberMobileC(JAXBElement<String> value) {
        this.partNumberMobileC = value;
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
     * Gets the value of the subMarket1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMarket1C() {
        return subMarket1C;
    }

    /**
     * Sets the value of the subMarket1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMarket1C(JAXBElement<String> value) {
        this.subMarket1C = value;
    }

    /**
     * Gets the value of the billCustomerStateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillCustomerStateC() {
        return billCustomerStateC;
    }

    /**
     * Sets the value of the billCustomerStateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillCustomerStateC(JAXBElement<String> value) {
        this.billCustomerStateC = value;
    }

    /**
     * Gets the value of the shipCustomerStateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipCustomerStateC() {
        return shipCustomerStateC;
    }

    /**
     * Sets the value of the shipCustomerStateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipCustomerStateC(JAXBElement<String> value) {
        this.shipCustomerStateC = value;
    }

    /**
     * Gets the value of the incotermc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINCOTERMC() {
        return incotermc;
    }

    /**
     * Sets the value of the incotermc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINCOTERMC(JAXBElement<String> value) {
        this.incotermc = value;
    }

    /**
     * Gets the value of the returnReasonC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnReasonC() {
        return returnReasonC;
    }

    /**
     * Sets the value of the returnReasonC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnReasonC(JAXBElement<String> value) {
        this.returnReasonC = value;
    }

    /**
     * Gets the value of the lineSalesrepC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineSalesrepC() {
        return lineSalesrepC;
    }

    /**
     * Sets the value of the lineSalesrepC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineSalesrepC(JAXBElement<String> value) {
        this.lineSalesrepC = value;
    }

    /**
     * Gets the value of the soldFromInventoryOrgC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoldFromInventoryOrgC() {
        return soldFromInventoryOrgC;
    }

    /**
     * Sets the value of the soldFromInventoryOrgC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoldFromInventoryOrgC(JAXBElement<String> value) {
        this.soldFromInventoryOrgC = value;
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
     * Gets the value of the class1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClass1C() {
        return class1C;
    }

    /**
     * Sets the value of the class1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClass1C(JAXBElement<String> value) {
        this.class1C = value;
    }

    /**
     * Gets the value of the invoiceLineType1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceLineType1C() {
        return invoiceLineType1C;
    }

    /**
     * Sets the value of the invoiceLineType1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceLineType1C(JAXBElement<String> value) {
        this.invoiceLineType1C = value;
    }

    /**
     * Gets the value of the pullIn1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPullIn1C() {
        return pullIn1C;
    }

    /**
     * Sets the value of the pullIn1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPullIn1C(JAXBElement<String> value) {
        this.pullIn1C = value;
    }

    /**
     * Gets the value of the type1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType1C() {
        return type1C;
    }

    /**
     * Sets the value of the type1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType1C(JAXBElement<String> value) {
        this.type1C = value;
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
     * Gets the value of the invoicedateQuarterRPTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoicedateQuarterRPTC() {
        return invoicedateQuarterRPTC;
    }

    /**
     * Sets the value of the invoicedateQuarterRPTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoicedateQuarterRPTC(JAXBElement<String> value) {
        this.invoicedateQuarterRPTC = value;
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
     * Gets the value of the billingTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTeamC }
     * 
     * 
     */
    public List<BillingTeamC> getBillingTeamCollectionC() {
        if (billingTeamCollectionC == null) {
            billingTeamCollectionC = new ArrayList<BillingTeamC>();
        }
        return this.billingTeamCollectionC;
    }

}
