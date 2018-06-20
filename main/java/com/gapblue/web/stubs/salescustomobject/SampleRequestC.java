
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
 * <p>Java class for SampleRequest_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleRequest_c">
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
 *         &lt;element name="SampleRequestDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Type_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Opportunity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesBranch_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerContact_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentsJustification_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedBy_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedBy_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product1Name_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product1Name_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product1RequestedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product1SONumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product2Name_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product2Name_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product2RequestedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product2SONumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product3Name_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product3Name_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product3RequestedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product3SONumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product1ShippedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product1ShippedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Product1TrackingNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product2ShippedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product2ShippedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Product2TrackingNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product3ShippedQuantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product3ShippedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Product3TrackingNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipTo_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShipTo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorAccount_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DistributorAccount_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPITeamApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesApproval_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPI_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToEmailAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributorEmailAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPIComments_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ParentCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRMRowID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BU_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMotion_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMicrophoneApprover_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMotionApprover_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMotionEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMicrophoneEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMicrophoneID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMotionID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMotionDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BUMotionDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUMicrophoneDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BUMicrophoneDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUProd3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPIProd1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPIProd2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPIProd3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prod3Approver_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prod3DCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Prod3DCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prod3Email_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prod3Id_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderCheck_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedByMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product1NameMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product2NameMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product3NameMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RMDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerReport_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarket_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SampleRequestTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}SampleRequestTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleRequest_c", namespace = "/oracle/apps/sales/custExtn/views/common/", propOrder = {
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
    "sampleRequestDateC",
    "requestedShipDateC",
    "typeC",
    "opportunityIdC",
    "opportunityC",
    "salesBranchC",
    "endCustomerIdC",
    "endCustomerC",
    "approvalStatusC",
    "projectNameC",
    "salesRepContactC",
    "customerContactIdC",
    "customerContactC",
    "commentsJustificationC",
    "requestedByIdC",
    "requestedByC",
    "product1NameIdC",
    "product1NameC",
    "product1RequestedQuantityC",
    "product1SONumberC",
    "product2NameIdC",
    "product2NameC",
    "product2RequestedQuantityC",
    "product2SONumberC",
    "product3NameIdC",
    "product3NameC",
    "product3RequestedQuantityC",
    "product3SONumberC",
    "product1ShippedQuantityC",
    "product1ShippedDateC",
    "product1TrackingNumberC",
    "product2ShippedQuantityC",
    "product2ShippedDateC",
    "product2TrackingNumberC",
    "product3ShippedQuantityC",
    "product3ShippedDateC",
    "product3TrackingNumberC",
    "shipmentStatusC",
    "shipToIdC",
    "shipToC",
    "shipToAddressC",
    "phoneNumberC",
    "distributorAccountIdC",
    "distributorAccountC",
    "distributorContactC",
    "trc",
    "npiTeamApprovalC",
    "regionalManagerApprovalC",
    "vpOfSalesApprovalC",
    "npic",
    "shipToEmailAddressC",
    "distributorAddressC",
    "distributorEmailAddressC",
    "npiCommentsC",
    "parentCustomerIdC",
    "parentCustomerC",
    "crmRowIDC",
    "buc",
    "buMotionC",
    "regionalManagerEmailC",
    "vpOfSalesEmailC",
    "regionalManagerIDC",
    "vpOfSalesIDC",
    "regionalManagerNameC",
    "vpOfSalesNameC",
    "buMicrophoneApproverC",
    "buMotionApproverC",
    "buMotionEmailC",
    "buMicrophoneEmailC",
    "buMicrophoneIDC",
    "buMotionIDC",
    "buMotionDCLIdC",
    "buMotionDCLC",
    "buMicrophoneDCLIdC",
    "buMicrophoneDCLC",
    "buProd3C",
    "npiProd1C",
    "npiProd2C",
    "npiProd3C",
    "prod3ApproverC",
    "prod3DCLIdC",
    "prod3DCLC",
    "prod3EmailC",
    "prod3IdC",
    "orderCheckC",
    "requestedByMobileC",
    "product1NameMobileC",
    "product2NameMobileC",
    "product3NameMobileC",
    "region1C",
    "rmdclIdC",
    "rmdclc",
    "ownerIDC",
    "shipToContactC",
    "endCustomerReportC",
    "intgc",
    "marketC",
    "subMarketC",
    "sampleRequestTeamCollectionC"
})
public class SampleRequestC {

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
    @XmlElementRef(name = "SampleRequestDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sampleRequestDateC;
    @XmlElement(name = "RequestedShipDate_c")
    protected XMLGregorianCalendar requestedShipDateC;
    @XmlElement(name = "Type_c")
    protected String typeC;
    @XmlElement(name = "Opportunity_Id_c")
    protected BigDecimal opportunityIdC;
    @XmlElement(name = "Opportunity_c")
    protected String opportunityC;
    @XmlElementRef(name = "SalesBranch_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesBranchC;
    @XmlElement(name = "EndCustomer_Id_c")
    protected BigDecimal endCustomerIdC;
    @XmlElement(name = "EndCustomer_c")
    protected String endCustomerC;
    @XmlElementRef(name = "ApprovalStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvalStatusC;
    @XmlElementRef(name = "ProjectName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectNameC;
    @XmlElementRef(name = "SalesRepContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesRepContactC;
    @XmlElementRef(name = "CustomerContact_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> customerContactIdC;
    @XmlElementRef(name = "CustomerContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerContactC;
    @XmlElement(name = "CommentsJustification_c")
    protected String commentsJustificationC;
    @XmlElement(name = "RequestedBy_Id_c")
    protected BigDecimal requestedByIdC;
    @XmlElement(name = "RequestedBy_c")
    protected String requestedByC;
    @XmlElement(name = "Product1Name_Id_c")
    protected BigDecimal product1NameIdC;
    @XmlElement(name = "Product1Name_c")
    protected String product1NameC;
    @XmlElement(name = "Product1RequestedQuantity_c")
    protected BigDecimal product1RequestedQuantityC;
    @XmlElementRef(name = "Product1SONumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product1SONumberC;
    @XmlElementRef(name = "Product2Name_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product2NameIdC;
    @XmlElementRef(name = "Product2Name_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product2NameC;
    @XmlElementRef(name = "Product2RequestedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product2RequestedQuantityC;
    @XmlElementRef(name = "Product2SONumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product2SONumberC;
    @XmlElementRef(name = "Product3Name_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product3NameIdC;
    @XmlElementRef(name = "Product3Name_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product3NameC;
    @XmlElementRef(name = "Product3RequestedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product3RequestedQuantityC;
    @XmlElementRef(name = "Product3SONumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product3SONumberC;
    @XmlElementRef(name = "Product1ShippedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product1ShippedQuantityC;
    @XmlElementRef(name = "Product1ShippedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> product1ShippedDateC;
    @XmlElementRef(name = "Product1TrackingNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product1TrackingNumberC;
    @XmlElementRef(name = "Product2ShippedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product2ShippedQuantityC;
    @XmlElementRef(name = "Product2ShippedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> product2ShippedDateC;
    @XmlElementRef(name = "Product2TrackingNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product2TrackingNumberC;
    @XmlElementRef(name = "Product3ShippedQuantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> product3ShippedQuantityC;
    @XmlElementRef(name = "Product3ShippedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> product3ShippedDateC;
    @XmlElementRef(name = "Product3TrackingNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product3TrackingNumberC;
    @XmlElementRef(name = "ShipmentStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipmentStatusC;
    @XmlElementRef(name = "ShipTo_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shipToIdC;
    @XmlElementRef(name = "ShipTo_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToC;
    @XmlElementRef(name = "ShipToAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToAddressC;
    @XmlElement(name = "PhoneNumber_c")
    protected String phoneNumberC;
    @XmlElementRef(name = "DistributorAccount_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> distributorAccountIdC;
    @XmlElementRef(name = "DistributorAccount_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorAccountC;
    @XmlElementRef(name = "DistributorContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorContactC;
    @XmlElementRef(name = "TR_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trc;
    @XmlElementRef(name = "NPITeamApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npiTeamApprovalC;
    @XmlElementRef(name = "RegionalManagerApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerApprovalC;
    @XmlElementRef(name = "VPOfSalesApproval_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesApprovalC;
    @XmlElementRef(name = "NPI_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npic;
    @XmlElementRef(name = "ShipToEmailAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToEmailAddressC;
    @XmlElementRef(name = "DistributorAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorAddressC;
    @XmlElementRef(name = "DistributorEmailAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributorEmailAddressC;
    @XmlElementRef(name = "NPIComments_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npiCommentsC;
    @XmlElementRef(name = "ParentCustomer_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> parentCustomerIdC;
    @XmlElementRef(name = "ParentCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentCustomerC;
    @XmlElementRef(name = "CRMRowID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmRowIDC;
    @XmlElementRef(name = "BU_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buc;
    @XmlElementRef(name = "BUMotion_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMotionC;
    @XmlElementRef(name = "RegionalManagerEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerEmailC;
    @XmlElementRef(name = "VPOfSalesEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesEmailC;
    @XmlElementRef(name = "RegionalManagerID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerIDC;
    @XmlElementRef(name = "VPOfSalesID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesIDC;
    @XmlElementRef(name = "RegionalManagerName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerNameC;
    @XmlElementRef(name = "VPOfSalesName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesNameC;
    @XmlElementRef(name = "BUMicrophoneApprover_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMicrophoneApproverC;
    @XmlElementRef(name = "BUMotionApprover_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMotionApproverC;
    @XmlElementRef(name = "BUMotionEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMotionEmailC;
    @XmlElementRef(name = "BUMicrophoneEmail_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMicrophoneEmailC;
    @XmlElementRef(name = "BUMicrophoneID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMicrophoneIDC;
    @XmlElementRef(name = "BUMotionID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMotionIDC;
    @XmlElementRef(name = "BUMotionDCL_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> buMotionDCLIdC;
    @XmlElementRef(name = "BUMotionDCL_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMotionDCLC;
    @XmlElementRef(name = "BUMicrophoneDCL_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> buMicrophoneDCLIdC;
    @XmlElementRef(name = "BUMicrophoneDCL_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buMicrophoneDCLC;
    @XmlElementRef(name = "BUProd3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buProd3C;
    @XmlElementRef(name = "NPIProd1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npiProd1C;
    @XmlElementRef(name = "NPIProd2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npiProd2C;
    @XmlElementRef(name = "NPIProd3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> npiProd3C;
    @XmlElementRef(name = "Prod3Approver_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prod3ApproverC;
    @XmlElementRef(name = "Prod3DCL_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> prod3DCLIdC;
    @XmlElementRef(name = "Prod3DCL_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prod3DCLC;
    @XmlElementRef(name = "Prod3Email_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prod3EmailC;
    @XmlElementRef(name = "Prod3Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prod3IdC;
    @XmlElementRef(name = "OrderCheck_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderCheckC;
    @XmlElementRef(name = "RequestedByMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestedByMobileC;
    @XmlElementRef(name = "Product1NameMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product1NameMobileC;
    @XmlElementRef(name = "Product2NameMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product2NameMobileC;
    @XmlElementRef(name = "Product3NameMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product3NameMobileC;
    @XmlElementRef(name = "Region1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region1C;
    @XmlElementRef(name = "RMDCL_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rmdclIdC;
    @XmlElementRef(name = "RMDCL_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmdclc;
    @XmlElementRef(name = "OwnerID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerIDC;
    @XmlElementRef(name = "ShipToContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipToContactC;
    @XmlElementRef(name = "EndCustomerReport_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerReportC;
    @XmlElementRef(name = "INTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElement(name = "Market_c")
    protected String marketC;
    @XmlElement(name = "SubMarket_c")
    protected String subMarketC;
    @XmlElement(name = "SampleRequestTeamCollection_c")
    protected List<SampleRequestTeamC> sampleRequestTeamCollectionC;

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
     * Gets the value of the sampleRequestDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSampleRequestDateC() {
        return sampleRequestDateC;
    }

    /**
     * Sets the value of the sampleRequestDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSampleRequestDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.sampleRequestDateC = value;
    }

    /**
     * Gets the value of the requestedShipDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipDateC() {
        return requestedShipDateC;
    }

    /**
     * Sets the value of the requestedShipDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipDateC(XMLGregorianCalendar value) {
        this.requestedShipDateC = value;
    }

    /**
     * Gets the value of the typeC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeC() {
        return typeC;
    }

    /**
     * Sets the value of the typeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeC(String value) {
        this.typeC = value;
    }

    /**
     * Gets the value of the opportunityIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpportunityIdC() {
        return opportunityIdC;
    }

    /**
     * Sets the value of the opportunityIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpportunityIdC(BigDecimal value) {
        this.opportunityIdC = value;
    }

    /**
     * Gets the value of the opportunityC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityC() {
        return opportunityC;
    }

    /**
     * Sets the value of the opportunityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityC(String value) {
        this.opportunityC = value;
    }

    /**
     * Gets the value of the salesBranchC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesBranchC() {
        return salesBranchC;
    }

    /**
     * Sets the value of the salesBranchC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesBranchC(JAXBElement<String> value) {
        this.salesBranchC = value;
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
     * Gets the value of the projectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectNameC() {
        return projectNameC;
    }

    /**
     * Sets the value of the projectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectNameC(JAXBElement<String> value) {
        this.projectNameC = value;
    }

    /**
     * Gets the value of the salesRepContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesRepContactC() {
        return salesRepContactC;
    }

    /**
     * Sets the value of the salesRepContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesRepContactC(JAXBElement<String> value) {
        this.salesRepContactC = value;
    }

    /**
     * Gets the value of the customerContactIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCustomerContactIdC() {
        return customerContactIdC;
    }

    /**
     * Sets the value of the customerContactIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCustomerContactIdC(JAXBElement<BigDecimal> value) {
        this.customerContactIdC = value;
    }

    /**
     * Gets the value of the customerContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerContactC() {
        return customerContactC;
    }

    /**
     * Sets the value of the customerContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerContactC(JAXBElement<String> value) {
        this.customerContactC = value;
    }

    /**
     * Gets the value of the commentsJustificationC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsJustificationC() {
        return commentsJustificationC;
    }

    /**
     * Sets the value of the commentsJustificationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsJustificationC(String value) {
        this.commentsJustificationC = value;
    }

    /**
     * Gets the value of the requestedByIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedByIdC() {
        return requestedByIdC;
    }

    /**
     * Sets the value of the requestedByIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedByIdC(BigDecimal value) {
        this.requestedByIdC = value;
    }

    /**
     * Gets the value of the requestedByC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedByC() {
        return requestedByC;
    }

    /**
     * Sets the value of the requestedByC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedByC(String value) {
        this.requestedByC = value;
    }

    /**
     * Gets the value of the product1NameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProduct1NameIdC() {
        return product1NameIdC;
    }

    /**
     * Sets the value of the product1NameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProduct1NameIdC(BigDecimal value) {
        this.product1NameIdC = value;
    }

    /**
     * Gets the value of the product1NameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct1NameC() {
        return product1NameC;
    }

    /**
     * Sets the value of the product1NameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct1NameC(String value) {
        this.product1NameC = value;
    }

    /**
     * Gets the value of the product1RequestedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProduct1RequestedQuantityC() {
        return product1RequestedQuantityC;
    }

    /**
     * Sets the value of the product1RequestedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProduct1RequestedQuantityC(BigDecimal value) {
        this.product1RequestedQuantityC = value;
    }

    /**
     * Gets the value of the product1SONumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct1SONumberC() {
        return product1SONumberC;
    }

    /**
     * Sets the value of the product1SONumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct1SONumberC(JAXBElement<String> value) {
        this.product1SONumberC = value;
    }

    /**
     * Gets the value of the product2NameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct2NameIdC() {
        return product2NameIdC;
    }

    /**
     * Sets the value of the product2NameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct2NameIdC(JAXBElement<BigDecimal> value) {
        this.product2NameIdC = value;
    }

    /**
     * Gets the value of the product2NameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct2NameC() {
        return product2NameC;
    }

    /**
     * Sets the value of the product2NameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct2NameC(JAXBElement<String> value) {
        this.product2NameC = value;
    }

    /**
     * Gets the value of the product2RequestedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct2RequestedQuantityC() {
        return product2RequestedQuantityC;
    }

    /**
     * Sets the value of the product2RequestedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct2RequestedQuantityC(JAXBElement<BigDecimal> value) {
        this.product2RequestedQuantityC = value;
    }

    /**
     * Gets the value of the product2SONumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct2SONumberC() {
        return product2SONumberC;
    }

    /**
     * Sets the value of the product2SONumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct2SONumberC(JAXBElement<String> value) {
        this.product2SONumberC = value;
    }

    /**
     * Gets the value of the product3NameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct3NameIdC() {
        return product3NameIdC;
    }

    /**
     * Sets the value of the product3NameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct3NameIdC(JAXBElement<BigDecimal> value) {
        this.product3NameIdC = value;
    }

    /**
     * Gets the value of the product3NameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct3NameC() {
        return product3NameC;
    }

    /**
     * Sets the value of the product3NameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct3NameC(JAXBElement<String> value) {
        this.product3NameC = value;
    }

    /**
     * Gets the value of the product3RequestedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct3RequestedQuantityC() {
        return product3RequestedQuantityC;
    }

    /**
     * Sets the value of the product3RequestedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct3RequestedQuantityC(JAXBElement<BigDecimal> value) {
        this.product3RequestedQuantityC = value;
    }

    /**
     * Gets the value of the product3SONumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct3SONumberC() {
        return product3SONumberC;
    }

    /**
     * Sets the value of the product3SONumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct3SONumberC(JAXBElement<String> value) {
        this.product3SONumberC = value;
    }

    /**
     * Gets the value of the product1ShippedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct1ShippedQuantityC() {
        return product1ShippedQuantityC;
    }

    /**
     * Sets the value of the product1ShippedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct1ShippedQuantityC(JAXBElement<BigDecimal> value) {
        this.product1ShippedQuantityC = value;
    }

    /**
     * Gets the value of the product1ShippedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProduct1ShippedDateC() {
        return product1ShippedDateC;
    }

    /**
     * Sets the value of the product1ShippedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProduct1ShippedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.product1ShippedDateC = value;
    }

    /**
     * Gets the value of the product1TrackingNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct1TrackingNumberC() {
        return product1TrackingNumberC;
    }

    /**
     * Sets the value of the product1TrackingNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct1TrackingNumberC(JAXBElement<String> value) {
        this.product1TrackingNumberC = value;
    }

    /**
     * Gets the value of the product2ShippedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct2ShippedQuantityC() {
        return product2ShippedQuantityC;
    }

    /**
     * Sets the value of the product2ShippedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct2ShippedQuantityC(JAXBElement<BigDecimal> value) {
        this.product2ShippedQuantityC = value;
    }

    /**
     * Gets the value of the product2ShippedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProduct2ShippedDateC() {
        return product2ShippedDateC;
    }

    /**
     * Sets the value of the product2ShippedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProduct2ShippedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.product2ShippedDateC = value;
    }

    /**
     * Gets the value of the product2TrackingNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct2TrackingNumberC() {
        return product2TrackingNumberC;
    }

    /**
     * Sets the value of the product2TrackingNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct2TrackingNumberC(JAXBElement<String> value) {
        this.product2TrackingNumberC = value;
    }

    /**
     * Gets the value of the product3ShippedQuantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProduct3ShippedQuantityC() {
        return product3ShippedQuantityC;
    }

    /**
     * Sets the value of the product3ShippedQuantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProduct3ShippedQuantityC(JAXBElement<BigDecimal> value) {
        this.product3ShippedQuantityC = value;
    }

    /**
     * Gets the value of the product3ShippedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProduct3ShippedDateC() {
        return product3ShippedDateC;
    }

    /**
     * Sets the value of the product3ShippedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProduct3ShippedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.product3ShippedDateC = value;
    }

    /**
     * Gets the value of the product3TrackingNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct3TrackingNumberC() {
        return product3TrackingNumberC;
    }

    /**
     * Sets the value of the product3TrackingNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct3TrackingNumberC(JAXBElement<String> value) {
        this.product3TrackingNumberC = value;
    }

    /**
     * Gets the value of the shipmentStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipmentStatusC() {
        return shipmentStatusC;
    }

    /**
     * Sets the value of the shipmentStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipmentStatusC(JAXBElement<String> value) {
        this.shipmentStatusC = value;
    }

    /**
     * Gets the value of the shipToIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getShipToIdC() {
        return shipToIdC;
    }

    /**
     * Sets the value of the shipToIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setShipToIdC(JAXBElement<BigDecimal> value) {
        this.shipToIdC = value;
    }

    /**
     * Gets the value of the shipToC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToC() {
        return shipToC;
    }

    /**
     * Sets the value of the shipToC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToC(JAXBElement<String> value) {
        this.shipToC = value;
    }

    /**
     * Gets the value of the shipToAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToAddressC() {
        return shipToAddressC;
    }

    /**
     * Sets the value of the shipToAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToAddressC(JAXBElement<String> value) {
        this.shipToAddressC = value;
    }

    /**
     * Gets the value of the phoneNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberC() {
        return phoneNumberC;
    }

    /**
     * Sets the value of the phoneNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberC(String value) {
        this.phoneNumberC = value;
    }

    /**
     * Gets the value of the distributorAccountIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDistributorAccountIdC() {
        return distributorAccountIdC;
    }

    /**
     * Sets the value of the distributorAccountIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDistributorAccountIdC(JAXBElement<BigDecimal> value) {
        this.distributorAccountIdC = value;
    }

    /**
     * Gets the value of the distributorAccountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorAccountC() {
        return distributorAccountC;
    }

    /**
     * Sets the value of the distributorAccountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorAccountC(JAXBElement<String> value) {
        this.distributorAccountC = value;
    }

    /**
     * Gets the value of the distributorContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorContactC() {
        return distributorContactC;
    }

    /**
     * Sets the value of the distributorContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorContactC(JAXBElement<String> value) {
        this.distributorContactC = value;
    }

    /**
     * Gets the value of the trc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRC() {
        return trc;
    }

    /**
     * Sets the value of the trc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRC(JAXBElement<String> value) {
        this.trc = value;
    }

    /**
     * Gets the value of the npiTeamApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPITeamApprovalC() {
        return npiTeamApprovalC;
    }

    /**
     * Sets the value of the npiTeamApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPITeamApprovalC(JAXBElement<String> value) {
        this.npiTeamApprovalC = value;
    }

    /**
     * Gets the value of the regionalManagerApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerApprovalC() {
        return regionalManagerApprovalC;
    }

    /**
     * Sets the value of the regionalManagerApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerApprovalC(JAXBElement<String> value) {
        this.regionalManagerApprovalC = value;
    }

    /**
     * Gets the value of the vpOfSalesApprovalC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesApprovalC() {
        return vpOfSalesApprovalC;
    }

    /**
     * Sets the value of the vpOfSalesApprovalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesApprovalC(JAXBElement<String> value) {
        this.vpOfSalesApprovalC = value;
    }

    /**
     * Gets the value of the npic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPIC() {
        return npic;
    }

    /**
     * Sets the value of the npic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPIC(JAXBElement<String> value) {
        this.npic = value;
    }

    /**
     * Gets the value of the shipToEmailAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToEmailAddressC() {
        return shipToEmailAddressC;
    }

    /**
     * Sets the value of the shipToEmailAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToEmailAddressC(JAXBElement<String> value) {
        this.shipToEmailAddressC = value;
    }

    /**
     * Gets the value of the distributorAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorAddressC() {
        return distributorAddressC;
    }

    /**
     * Sets the value of the distributorAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorAddressC(JAXBElement<String> value) {
        this.distributorAddressC = value;
    }

    /**
     * Gets the value of the distributorEmailAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributorEmailAddressC() {
        return distributorEmailAddressC;
    }

    /**
     * Sets the value of the distributorEmailAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributorEmailAddressC(JAXBElement<String> value) {
        this.distributorEmailAddressC = value;
    }

    /**
     * Gets the value of the npiCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPICommentsC() {
        return npiCommentsC;
    }

    /**
     * Sets the value of the npiCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPICommentsC(JAXBElement<String> value) {
        this.npiCommentsC = value;
    }

    /**
     * Gets the value of the parentCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getParentCustomerIdC() {
        return parentCustomerIdC;
    }

    /**
     * Sets the value of the parentCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setParentCustomerIdC(JAXBElement<BigDecimal> value) {
        this.parentCustomerIdC = value;
    }

    /**
     * Gets the value of the parentCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentCustomerC() {
        return parentCustomerC;
    }

    /**
     * Sets the value of the parentCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentCustomerC(JAXBElement<String> value) {
        this.parentCustomerC = value;
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
     * Gets the value of the buMotionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMotionC() {
        return buMotionC;
    }

    /**
     * Sets the value of the buMotionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMotionC(JAXBElement<String> value) {
        this.buMotionC = value;
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
     * Gets the value of the regionalManagerIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionalManagerIDC() {
        return regionalManagerIDC;
    }

    /**
     * Sets the value of the regionalManagerIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionalManagerIDC(JAXBElement<String> value) {
        this.regionalManagerIDC = value;
    }

    /**
     * Gets the value of the vpOfSalesIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesIDC() {
        return vpOfSalesIDC;
    }

    /**
     * Sets the value of the vpOfSalesIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesIDC(JAXBElement<String> value) {
        this.vpOfSalesIDC = value;
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
     * Gets the value of the buMicrophoneApproverC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMicrophoneApproverC() {
        return buMicrophoneApproverC;
    }

    /**
     * Sets the value of the buMicrophoneApproverC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMicrophoneApproverC(JAXBElement<String> value) {
        this.buMicrophoneApproverC = value;
    }

    /**
     * Gets the value of the buMotionApproverC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMotionApproverC() {
        return buMotionApproverC;
    }

    /**
     * Sets the value of the buMotionApproverC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMotionApproverC(JAXBElement<String> value) {
        this.buMotionApproverC = value;
    }

    /**
     * Gets the value of the buMotionEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMotionEmailC() {
        return buMotionEmailC;
    }

    /**
     * Sets the value of the buMotionEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMotionEmailC(JAXBElement<String> value) {
        this.buMotionEmailC = value;
    }

    /**
     * Gets the value of the buMicrophoneEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMicrophoneEmailC() {
        return buMicrophoneEmailC;
    }

    /**
     * Sets the value of the buMicrophoneEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMicrophoneEmailC(JAXBElement<String> value) {
        this.buMicrophoneEmailC = value;
    }

    /**
     * Gets the value of the buMicrophoneIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMicrophoneIDC() {
        return buMicrophoneIDC;
    }

    /**
     * Sets the value of the buMicrophoneIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMicrophoneIDC(JAXBElement<String> value) {
        this.buMicrophoneIDC = value;
    }

    /**
     * Gets the value of the buMotionIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMotionIDC() {
        return buMotionIDC;
    }

    /**
     * Sets the value of the buMotionIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMotionIDC(JAXBElement<String> value) {
        this.buMotionIDC = value;
    }

    /**
     * Gets the value of the buMotionDCLIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBUMotionDCLIdC() {
        return buMotionDCLIdC;
    }

    /**
     * Sets the value of the buMotionDCLIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBUMotionDCLIdC(JAXBElement<BigDecimal> value) {
        this.buMotionDCLIdC = value;
    }

    /**
     * Gets the value of the buMotionDCLC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMotionDCLC() {
        return buMotionDCLC;
    }

    /**
     * Sets the value of the buMotionDCLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMotionDCLC(JAXBElement<String> value) {
        this.buMotionDCLC = value;
    }

    /**
     * Gets the value of the buMicrophoneDCLIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBUMicrophoneDCLIdC() {
        return buMicrophoneDCLIdC;
    }

    /**
     * Sets the value of the buMicrophoneDCLIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBUMicrophoneDCLIdC(JAXBElement<BigDecimal> value) {
        this.buMicrophoneDCLIdC = value;
    }

    /**
     * Gets the value of the buMicrophoneDCLC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUMicrophoneDCLC() {
        return buMicrophoneDCLC;
    }

    /**
     * Sets the value of the buMicrophoneDCLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUMicrophoneDCLC(JAXBElement<String> value) {
        this.buMicrophoneDCLC = value;
    }

    /**
     * Gets the value of the buProd3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUProd3C() {
        return buProd3C;
    }

    /**
     * Sets the value of the buProd3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUProd3C(JAXBElement<String> value) {
        this.buProd3C = value;
    }

    /**
     * Gets the value of the npiProd1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPIProd1C() {
        return npiProd1C;
    }

    /**
     * Sets the value of the npiProd1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPIProd1C(JAXBElement<String> value) {
        this.npiProd1C = value;
    }

    /**
     * Gets the value of the npiProd2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPIProd2C() {
        return npiProd2C;
    }

    /**
     * Sets the value of the npiProd2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPIProd2C(JAXBElement<String> value) {
        this.npiProd2C = value;
    }

    /**
     * Gets the value of the npiProd3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNPIProd3C() {
        return npiProd3C;
    }

    /**
     * Sets the value of the npiProd3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNPIProd3C(JAXBElement<String> value) {
        this.npiProd3C = value;
    }

    /**
     * Gets the value of the prod3ApproverC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProd3ApproverC() {
        return prod3ApproverC;
    }

    /**
     * Sets the value of the prod3ApproverC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProd3ApproverC(JAXBElement<String> value) {
        this.prod3ApproverC = value;
    }

    /**
     * Gets the value of the prod3DCLIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProd3DCLIdC() {
        return prod3DCLIdC;
    }

    /**
     * Sets the value of the prod3DCLIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProd3DCLIdC(JAXBElement<BigDecimal> value) {
        this.prod3DCLIdC = value;
    }

    /**
     * Gets the value of the prod3DCLC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProd3DCLC() {
        return prod3DCLC;
    }

    /**
     * Sets the value of the prod3DCLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProd3DCLC(JAXBElement<String> value) {
        this.prod3DCLC = value;
    }

    /**
     * Gets the value of the prod3EmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProd3EmailC() {
        return prod3EmailC;
    }

    /**
     * Sets the value of the prod3EmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProd3EmailC(JAXBElement<String> value) {
        this.prod3EmailC = value;
    }

    /**
     * Gets the value of the prod3IdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProd3IdC() {
        return prod3IdC;
    }

    /**
     * Sets the value of the prod3IdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProd3IdC(JAXBElement<String> value) {
        this.prod3IdC = value;
    }

    /**
     * Gets the value of the orderCheckC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderCheckC() {
        return orderCheckC;
    }

    /**
     * Sets the value of the orderCheckC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderCheckC(JAXBElement<String> value) {
        this.orderCheckC = value;
    }

    /**
     * Gets the value of the requestedByMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestedByMobileC() {
        return requestedByMobileC;
    }

    /**
     * Sets the value of the requestedByMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestedByMobileC(JAXBElement<String> value) {
        this.requestedByMobileC = value;
    }

    /**
     * Gets the value of the product1NameMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct1NameMobileC() {
        return product1NameMobileC;
    }

    /**
     * Sets the value of the product1NameMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct1NameMobileC(JAXBElement<String> value) {
        this.product1NameMobileC = value;
    }

    /**
     * Gets the value of the product2NameMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct2NameMobileC() {
        return product2NameMobileC;
    }

    /**
     * Sets the value of the product2NameMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct2NameMobileC(JAXBElement<String> value) {
        this.product2NameMobileC = value;
    }

    /**
     * Gets the value of the product3NameMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct3NameMobileC() {
        return product3NameMobileC;
    }

    /**
     * Sets the value of the product3NameMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct3NameMobileC(JAXBElement<String> value) {
        this.product3NameMobileC = value;
    }

    /**
     * Gets the value of the region1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion1C() {
        return region1C;
    }

    /**
     * Sets the value of the region1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion1C(JAXBElement<String> value) {
        this.region1C = value;
    }

    /**
     * Gets the value of the rmdclIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRMDCLIdC() {
        return rmdclIdC;
    }

    /**
     * Sets the value of the rmdclIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRMDCLIdC(JAXBElement<BigDecimal> value) {
        this.rmdclIdC = value;
    }

    /**
     * Gets the value of the rmdclc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRMDCLC() {
        return rmdclc;
    }

    /**
     * Sets the value of the rmdclc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRMDCLC(JAXBElement<String> value) {
        this.rmdclc = value;
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
     * Gets the value of the shipToContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipToContactC() {
        return shipToContactC;
    }

    /**
     * Sets the value of the shipToContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipToContactC(JAXBElement<String> value) {
        this.shipToContactC = value;
    }

    /**
     * Gets the value of the endCustomerReportC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerReportC() {
        return endCustomerReportC;
    }

    /**
     * Sets the value of the endCustomerReportC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerReportC(JAXBElement<String> value) {
        this.endCustomerReportC = value;
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
     * Gets the value of the marketC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketC() {
        return marketC;
    }

    /**
     * Sets the value of the marketC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketC(String value) {
        this.marketC = value;
    }

    /**
     * Gets the value of the subMarketC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMarketC() {
        return subMarketC;
    }

    /**
     * Sets the value of the subMarketC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMarketC(String value) {
        this.subMarketC = value;
    }

    /**
     * Gets the value of the sampleRequestTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleRequestTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleRequestTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SampleRequestTeamC }
     * 
     * 
     */
    public List<SampleRequestTeamC> getSampleRequestTeamCollectionC() {
        if (sampleRequestTeamCollectionC == null) {
            sampleRequestTeamCollectionC = new ArrayList<SampleRequestTeamC>();
        }
        return this.sampleRequestTeamCollectionC;
    }

}
