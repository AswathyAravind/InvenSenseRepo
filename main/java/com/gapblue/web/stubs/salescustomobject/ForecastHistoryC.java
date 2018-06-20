
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
 * <p>Java class for ForecastHistory_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastHistory_c">
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
 *         &lt;element name="Revenue_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Owner_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Owner_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forecast_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Forecast_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockedMonth_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockedYear_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockedByID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockedByUserName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarket_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BU_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentEndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ParentEndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Opportunity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Part_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCategory_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP4_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP5_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP6_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP7_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP8_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP9_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP10_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP11_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP12_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterCY_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity2_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity3_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity4_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity5_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity6_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity7_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity8_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity9_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity10_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity11_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Quantity12_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRMRowID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartMobile_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarket1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BU1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ForecastRecordType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASPQ1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASPQ2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASPQ3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASPQ4_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QTYQ1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QTYQ2_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QTYQ3_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QTYQ4_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP101_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP201_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP301_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP401_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP501_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP601_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP701_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP801_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP901_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP100_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP111_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASP122_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASPQ11_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASPQ22_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASPQ33_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ASPQ44_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Cost_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreationDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="REV1_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV2_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV3_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV4_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV5_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV6_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV7_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV8_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV9_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV10_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV11_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REV12_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REVQ1_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REVQ2_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REVQ3_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="REVQ4_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ForecastHistoryTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ForecastHistoryTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastHistory_c", namespace = "/oracle/apps/sales/custExtn/views/common/", propOrder = {
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
    "revenueC",
    "aspc",
    "quantityC",
    "ownerIdC",
    "ownerC",
    "forecastIdC",
    "forecastC",
    "lockedMonthC",
    "lockedYearC",
    "lockedByIDC",
    "lockedByUserNameC",
    "forecastTypeC",
    "programNameC",
    "marketC",
    "subMarketC",
    "buc",
    "roleC",
    "parentEndCustomerIdC",
    "parentEndCustomerC",
    "opportunityIdC",
    "opportunityC",
    "partIdC",
    "partC",
    "productCategoryC",
    "yearC",
    "asp1C",
    "asp2C",
    "asp3C",
    "asp4C",
    "asp5C",
    "asp6C",
    "asp7C",
    "asp8C",
    "asp9C",
    "asp10C",
    "asp11C",
    "asp12C",
    "quarterCYC",
    "quantity1C",
    "quantity2C",
    "quantity3C",
    "quantity4C",
    "quantity5C",
    "quantity6C",
    "quantity7C",
    "quantity8C",
    "quantity9C",
    "quantity10C",
    "quantity11C",
    "quantity12C",
    "endCustomerIdC",
    "endCustomerC",
    "crmRowIDC",
    "ownerMobileC",
    "partMobileC",
    "market1C",
    "subMarket1C",
    "bu1C",
    "forecastDateC",
    "forecastRecordTypeC",
    "aspq1C",
    "aspq2C",
    "aspq3C",
    "aspq4C",
    "qtyq1C",
    "qtyq2C",
    "qtyq3C",
    "qtyq4C",
    "intgc",
    "asp101C",
    "asp201C",
    "asp301C",
    "asp401C",
    "asp501C",
    "asp601C",
    "asp701C",
    "asp801C",
    "asp901C",
    "asp100C",
    "asp111C",
    "asp122C",
    "aspq11C",
    "aspq22C",
    "aspq33C",
    "aspq44C",
    "costC",
    "creationDateC",
    "rev1C",
    "rev2C",
    "rev3C",
    "rev4C",
    "rev5C",
    "rev6C",
    "rev7C",
    "rev8C",
    "rev9C",
    "rev10C",
    "rev11C",
    "rev12C",
    "revq1C",
    "revq2C",
    "revq3C",
    "revq4C",
    "forecastHistoryTeamCollectionC"
})
public class ForecastHistoryC {

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
    @XmlElementRef(name = "Revenue_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revenueC;
    @XmlElementRef(name = "ASP_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspc;
    @XmlElementRef(name = "Quantity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantityC;
    @XmlElementRef(name = "Owner_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ownerIdC;
    @XmlElementRef(name = "Owner_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerC;
    @XmlElementRef(name = "Forecast_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> forecastIdC;
    @XmlElementRef(name = "Forecast_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastC;
    @XmlElementRef(name = "LockedMonth_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockedMonthC;
    @XmlElementRef(name = "LockedYear_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockedYearC;
    @XmlElementRef(name = "LockedByID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockedByIDC;
    @XmlElementRef(name = "LockedByUserName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockedByUserNameC;
    @XmlElementRef(name = "ForecastType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastTypeC;
    @XmlElementRef(name = "ProgramName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programNameC;
    @XmlElementRef(name = "Market_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketC;
    @XmlElementRef(name = "SubMarket_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarketC;
    @XmlElementRef(name = "BU_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buc;
    @XmlElementRef(name = "Role_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleC;
    @XmlElement(name = "ParentEndCustomer_Id_c")
    protected BigDecimal parentEndCustomerIdC;
    @XmlElement(name = "ParentEndCustomer_c")
    protected String parentEndCustomerC;
    @XmlElementRef(name = "Opportunity_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> opportunityIdC;
    @XmlElementRef(name = "Opportunity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityC;
    @XmlElementRef(name = "Part_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> partIdC;
    @XmlElementRef(name = "Part_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partC;
    @XmlElementRef(name = "ProductCategory_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCategoryC;
    @XmlElementRef(name = "Year_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearC;
    @XmlElementRef(name = "ASP1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp1C;
    @XmlElementRef(name = "ASP2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp2C;
    @XmlElementRef(name = "ASP3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp3C;
    @XmlElementRef(name = "ASP4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp4C;
    @XmlElementRef(name = "ASP5_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp5C;
    @XmlElementRef(name = "ASP6_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp6C;
    @XmlElementRef(name = "ASP7_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp7C;
    @XmlElementRef(name = "ASP8_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp8C;
    @XmlElementRef(name = "ASP9_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp9C;
    @XmlElementRef(name = "ASP10_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp10C;
    @XmlElementRef(name = "ASP11_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp11C;
    @XmlElementRef(name = "ASP12_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> asp12C;
    @XmlElementRef(name = "QuarterCY_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quarterCYC;
    @XmlElementRef(name = "Quantity1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity1C;
    @XmlElementRef(name = "Quantity2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity2C;
    @XmlElementRef(name = "Quantity3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity3C;
    @XmlElementRef(name = "Quantity4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity4C;
    @XmlElementRef(name = "Quantity5_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity5C;
    @XmlElementRef(name = "Quantity6_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity6C;
    @XmlElementRef(name = "Quantity7_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity7C;
    @XmlElementRef(name = "Quantity8_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity8C;
    @XmlElementRef(name = "Quantity9_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity9C;
    @XmlElementRef(name = "Quantity10_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity10C;
    @XmlElementRef(name = "Quantity11_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity11C;
    @XmlElementRef(name = "Quantity12_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity12C;
    @XmlElementRef(name = "EndCustomer_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> endCustomerIdC;
    @XmlElementRef(name = "EndCustomer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerC;
    @XmlElementRef(name = "CRMRowID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmRowIDC;
    @XmlElementRef(name = "OwnerMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerMobileC;
    @XmlElementRef(name = "PartMobile_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partMobileC;
    @XmlElementRef(name = "Market1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> market1C;
    @XmlElementRef(name = "SubMarket1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarket1C;
    @XmlElementRef(name = "BU1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bu1C;
    @XmlElementRef(name = "ForecastDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> forecastDateC;
    @XmlElementRef(name = "ForecastRecordType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastRecordTypeC;
    @XmlElementRef(name = "ASPQ1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspq1C;
    @XmlElementRef(name = "ASPQ2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspq2C;
    @XmlElementRef(name = "ASPQ3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspq3C;
    @XmlElementRef(name = "ASPQ4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspq4C;
    @XmlElementRef(name = "QTYQ1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> qtyq1C;
    @XmlElementRef(name = "QTYQ2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> qtyq2C;
    @XmlElementRef(name = "QTYQ3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> qtyq3C;
    @XmlElementRef(name = "QTYQ4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> qtyq4C;
    @XmlElementRef(name = "INTG_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElementRef(name = "ASP101_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp101C;
    @XmlElementRef(name = "ASP201_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp201C;
    @XmlElementRef(name = "ASP301_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp301C;
    @XmlElementRef(name = "ASP401_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp401C;
    @XmlElementRef(name = "ASP501_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp501C;
    @XmlElementRef(name = "ASP601_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp601C;
    @XmlElementRef(name = "ASP701_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp701C;
    @XmlElementRef(name = "ASP801_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp801C;
    @XmlElementRef(name = "ASP901_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp901C;
    @XmlElementRef(name = "ASP100_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp100C;
    @XmlElementRef(name = "ASP111_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp111C;
    @XmlElementRef(name = "ASP122_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> asp122C;
    @XmlElementRef(name = "ASPQ11_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> aspq11C;
    @XmlElementRef(name = "ASPQ22_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> aspq22C;
    @XmlElementRef(name = "ASPQ33_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> aspq33C;
    @XmlElementRef(name = "ASPQ44_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> aspq44C;
    @XmlElementRef(name = "Cost_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> costC;
    @XmlElementRef(name = "CreationDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDateC;
    @XmlElementRef(name = "REV1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev1C;
    @XmlElementRef(name = "REV2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev2C;
    @XmlElementRef(name = "REV3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev3C;
    @XmlElementRef(name = "REV4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev4C;
    @XmlElementRef(name = "REV5_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev5C;
    @XmlElementRef(name = "REV6_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev6C;
    @XmlElementRef(name = "REV7_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev7C;
    @XmlElementRef(name = "REV8_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev8C;
    @XmlElementRef(name = "REV9_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev9C;
    @XmlElementRef(name = "REV10_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev10C;
    @XmlElementRef(name = "REV11_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev11C;
    @XmlElementRef(name = "REV12_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> rev12C;
    @XmlElementRef(name = "REVQ1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revq1C;
    @XmlElementRef(name = "REVQ2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revq2C;
    @XmlElementRef(name = "REVQ3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revq3C;
    @XmlElementRef(name = "REVQ4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revq4C;
    @XmlElement(name = "ForecastHistoryTeamCollection_c")
    protected List<ForecastHistoryTeamC> forecastHistoryTeamCollectionC;

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
     * Gets the value of the aspc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASPC() {
        return aspc;
    }

    /**
     * Sets the value of the aspc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASPC(JAXBElement<String> value) {
        this.aspc = value;
    }

    /**
     * Gets the value of the quantityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantityC() {
        return quantityC;
    }

    /**
     * Sets the value of the quantityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantityC(JAXBElement<BigDecimal> value) {
        this.quantityC = value;
    }

    /**
     * Gets the value of the ownerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOwnerIdC() {
        return ownerIdC;
    }

    /**
     * Sets the value of the ownerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOwnerIdC(JAXBElement<BigDecimal> value) {
        this.ownerIdC = value;
    }

    /**
     * Gets the value of the ownerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerC() {
        return ownerC;
    }

    /**
     * Sets the value of the ownerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerC(JAXBElement<String> value) {
        this.ownerC = value;
    }

    /**
     * Gets the value of the forecastIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getForecastIdC() {
        return forecastIdC;
    }

    /**
     * Sets the value of the forecastIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setForecastIdC(JAXBElement<BigDecimal> value) {
        this.forecastIdC = value;
    }

    /**
     * Gets the value of the forecastC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastC() {
        return forecastC;
    }

    /**
     * Sets the value of the forecastC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastC(JAXBElement<String> value) {
        this.forecastC = value;
    }

    /**
     * Gets the value of the lockedMonthC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockedMonthC() {
        return lockedMonthC;
    }

    /**
     * Sets the value of the lockedMonthC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockedMonthC(JAXBElement<String> value) {
        this.lockedMonthC = value;
    }

    /**
     * Gets the value of the lockedYearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockedYearC() {
        return lockedYearC;
    }

    /**
     * Sets the value of the lockedYearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockedYearC(JAXBElement<String> value) {
        this.lockedYearC = value;
    }

    /**
     * Gets the value of the lockedByIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockedByIDC() {
        return lockedByIDC;
    }

    /**
     * Sets the value of the lockedByIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockedByIDC(JAXBElement<String> value) {
        this.lockedByIDC = value;
    }

    /**
     * Gets the value of the lockedByUserNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockedByUserNameC() {
        return lockedByUserNameC;
    }

    /**
     * Sets the value of the lockedByUserNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockedByUserNameC(JAXBElement<String> value) {
        this.lockedByUserNameC = value;
    }

    /**
     * Gets the value of the forecastTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastTypeC() {
        return forecastTypeC;
    }

    /**
     * Sets the value of the forecastTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastTypeC(JAXBElement<String> value) {
        this.forecastTypeC = value;
    }

    /**
     * Gets the value of the programNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramNameC() {
        return programNameC;
    }

    /**
     * Sets the value of the programNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramNameC(JAXBElement<String> value) {
        this.programNameC = value;
    }

    /**
     * Gets the value of the marketC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketC() {
        return marketC;
    }

    /**
     * Sets the value of the marketC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketC(JAXBElement<String> value) {
        this.marketC = value;
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
     * Gets the value of the roleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleC() {
        return roleC;
    }

    /**
     * Sets the value of the roleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleC(JAXBElement<String> value) {
        this.roleC = value;
    }

    /**
     * Gets the value of the parentEndCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentEndCustomerIdC() {
        return parentEndCustomerIdC;
    }

    /**
     * Sets the value of the parentEndCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentEndCustomerIdC(BigDecimal value) {
        this.parentEndCustomerIdC = value;
    }

    /**
     * Gets the value of the parentEndCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEndCustomerC() {
        return parentEndCustomerC;
    }

    /**
     * Sets the value of the parentEndCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEndCustomerC(String value) {
        this.parentEndCustomerC = value;
    }

    /**
     * Gets the value of the opportunityIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOpportunityIdC() {
        return opportunityIdC;
    }

    /**
     * Sets the value of the opportunityIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOpportunityIdC(JAXBElement<BigDecimal> value) {
        this.opportunityIdC = value;
    }

    /**
     * Gets the value of the opportunityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityC() {
        return opportunityC;
    }

    /**
     * Sets the value of the opportunityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityC(JAXBElement<String> value) {
        this.opportunityC = value;
    }

    /**
     * Gets the value of the partIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPartIdC() {
        return partIdC;
    }

    /**
     * Sets the value of the partIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPartIdC(JAXBElement<BigDecimal> value) {
        this.partIdC = value;
    }

    /**
     * Gets the value of the partC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartC() {
        return partC;
    }

    /**
     * Sets the value of the partC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartC(JAXBElement<String> value) {
        this.partC = value;
    }

    /**
     * Gets the value of the productCategoryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCategoryC() {
        return productCategoryC;
    }

    /**
     * Sets the value of the productCategoryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCategoryC(JAXBElement<String> value) {
        this.productCategoryC = value;
    }

    /**
     * Gets the value of the yearC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearC() {
        return yearC;
    }

    /**
     * Sets the value of the yearC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearC(JAXBElement<String> value) {
        this.yearC = value;
    }

    /**
     * Gets the value of the asp1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP1C() {
        return asp1C;
    }

    /**
     * Sets the value of the asp1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP1C(JAXBElement<String> value) {
        this.asp1C = value;
    }

    /**
     * Gets the value of the asp2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP2C() {
        return asp2C;
    }

    /**
     * Sets the value of the asp2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP2C(JAXBElement<String> value) {
        this.asp2C = value;
    }

    /**
     * Gets the value of the asp3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP3C() {
        return asp3C;
    }

    /**
     * Sets the value of the asp3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP3C(JAXBElement<String> value) {
        this.asp3C = value;
    }

    /**
     * Gets the value of the asp4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP4C() {
        return asp4C;
    }

    /**
     * Sets the value of the asp4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP4C(JAXBElement<String> value) {
        this.asp4C = value;
    }

    /**
     * Gets the value of the asp5C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP5C() {
        return asp5C;
    }

    /**
     * Sets the value of the asp5C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP5C(JAXBElement<String> value) {
        this.asp5C = value;
    }

    /**
     * Gets the value of the asp6C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP6C() {
        return asp6C;
    }

    /**
     * Sets the value of the asp6C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP6C(JAXBElement<String> value) {
        this.asp6C = value;
    }

    /**
     * Gets the value of the asp7C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP7C() {
        return asp7C;
    }

    /**
     * Sets the value of the asp7C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP7C(JAXBElement<String> value) {
        this.asp7C = value;
    }

    /**
     * Gets the value of the asp8C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP8C() {
        return asp8C;
    }

    /**
     * Sets the value of the asp8C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP8C(JAXBElement<String> value) {
        this.asp8C = value;
    }

    /**
     * Gets the value of the asp9C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP9C() {
        return asp9C;
    }

    /**
     * Sets the value of the asp9C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP9C(JAXBElement<String> value) {
        this.asp9C = value;
    }

    /**
     * Gets the value of the asp10C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP10C() {
        return asp10C;
    }

    /**
     * Sets the value of the asp10C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP10C(JAXBElement<String> value) {
        this.asp10C = value;
    }

    /**
     * Gets the value of the asp11C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP11C() {
        return asp11C;
    }

    /**
     * Sets the value of the asp11C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP11C(JAXBElement<String> value) {
        this.asp11C = value;
    }

    /**
     * Gets the value of the asp12C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASP12C() {
        return asp12C;
    }

    /**
     * Sets the value of the asp12C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASP12C(JAXBElement<String> value) {
        this.asp12C = value;
    }

    /**
     * Gets the value of the quarterCYC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuarterCYC() {
        return quarterCYC;
    }

    /**
     * Sets the value of the quarterCYC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuarterCYC(JAXBElement<String> value) {
        this.quarterCYC = value;
    }

    /**
     * Gets the value of the quantity1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity1C() {
        return quantity1C;
    }

    /**
     * Sets the value of the quantity1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity1C(JAXBElement<BigDecimal> value) {
        this.quantity1C = value;
    }

    /**
     * Gets the value of the quantity2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity2C() {
        return quantity2C;
    }

    /**
     * Sets the value of the quantity2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity2C(JAXBElement<BigDecimal> value) {
        this.quantity2C = value;
    }

    /**
     * Gets the value of the quantity3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity3C() {
        return quantity3C;
    }

    /**
     * Sets the value of the quantity3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity3C(JAXBElement<BigDecimal> value) {
        this.quantity3C = value;
    }

    /**
     * Gets the value of the quantity4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity4C() {
        return quantity4C;
    }

    /**
     * Sets the value of the quantity4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity4C(JAXBElement<BigDecimal> value) {
        this.quantity4C = value;
    }

    /**
     * Gets the value of the quantity5C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity5C() {
        return quantity5C;
    }

    /**
     * Sets the value of the quantity5C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity5C(JAXBElement<BigDecimal> value) {
        this.quantity5C = value;
    }

    /**
     * Gets the value of the quantity6C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity6C() {
        return quantity6C;
    }

    /**
     * Sets the value of the quantity6C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity6C(JAXBElement<BigDecimal> value) {
        this.quantity6C = value;
    }

    /**
     * Gets the value of the quantity7C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity7C() {
        return quantity7C;
    }

    /**
     * Sets the value of the quantity7C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity7C(JAXBElement<BigDecimal> value) {
        this.quantity7C = value;
    }

    /**
     * Gets the value of the quantity8C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity8C() {
        return quantity8C;
    }

    /**
     * Sets the value of the quantity8C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity8C(JAXBElement<BigDecimal> value) {
        this.quantity8C = value;
    }

    /**
     * Gets the value of the quantity9C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity9C() {
        return quantity9C;
    }

    /**
     * Sets the value of the quantity9C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity9C(JAXBElement<BigDecimal> value) {
        this.quantity9C = value;
    }

    /**
     * Gets the value of the quantity10C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity10C() {
        return quantity10C;
    }

    /**
     * Sets the value of the quantity10C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity10C(JAXBElement<BigDecimal> value) {
        this.quantity10C = value;
    }

    /**
     * Gets the value of the quantity11C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity11C() {
        return quantity11C;
    }

    /**
     * Sets the value of the quantity11C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity11C(JAXBElement<BigDecimal> value) {
        this.quantity11C = value;
    }

    /**
     * Gets the value of the quantity12C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity12C() {
        return quantity12C;
    }

    /**
     * Sets the value of the quantity12C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity12C(JAXBElement<BigDecimal> value) {
        this.quantity12C = value;
    }

    /**
     * Gets the value of the endCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEndCustomerIdC() {
        return endCustomerIdC;
    }

    /**
     * Sets the value of the endCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEndCustomerIdC(JAXBElement<BigDecimal> value) {
        this.endCustomerIdC = value;
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
     * Gets the value of the ownerMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerMobileC() {
        return ownerMobileC;
    }

    /**
     * Sets the value of the ownerMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerMobileC(JAXBElement<String> value) {
        this.ownerMobileC = value;
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
     * Gets the value of the market1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarket1C() {
        return market1C;
    }

    /**
     * Sets the value of the market1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarket1C(JAXBElement<String> value) {
        this.market1C = value;
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
     * Gets the value of the bu1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBU1C() {
        return bu1C;
    }

    /**
     * Sets the value of the bu1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBU1C(JAXBElement<String> value) {
        this.bu1C = value;
    }

    /**
     * Gets the value of the forecastDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getForecastDateC() {
        return forecastDateC;
    }

    /**
     * Sets the value of the forecastDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setForecastDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.forecastDateC = value;
    }

    /**
     * Gets the value of the forecastRecordTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastRecordTypeC() {
        return forecastRecordTypeC;
    }

    /**
     * Sets the value of the forecastRecordTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastRecordTypeC(JAXBElement<String> value) {
        this.forecastRecordTypeC = value;
    }

    /**
     * Gets the value of the aspq1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASPQ1C() {
        return aspq1C;
    }

    /**
     * Sets the value of the aspq1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASPQ1C(JAXBElement<String> value) {
        this.aspq1C = value;
    }

    /**
     * Gets the value of the aspq2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASPQ2C() {
        return aspq2C;
    }

    /**
     * Sets the value of the aspq2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASPQ2C(JAXBElement<String> value) {
        this.aspq2C = value;
    }

    /**
     * Gets the value of the aspq3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASPQ3C() {
        return aspq3C;
    }

    /**
     * Sets the value of the aspq3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASPQ3C(JAXBElement<String> value) {
        this.aspq3C = value;
    }

    /**
     * Gets the value of the aspq4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASPQ4C() {
        return aspq4C;
    }

    /**
     * Sets the value of the aspq4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASPQ4C(JAXBElement<String> value) {
        this.aspq4C = value;
    }

    /**
     * Gets the value of the qtyq1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQTYQ1C() {
        return qtyq1C;
    }

    /**
     * Sets the value of the qtyq1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQTYQ1C(JAXBElement<BigDecimal> value) {
        this.qtyq1C = value;
    }

    /**
     * Gets the value of the qtyq2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQTYQ2C() {
        return qtyq2C;
    }

    /**
     * Sets the value of the qtyq2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQTYQ2C(JAXBElement<BigDecimal> value) {
        this.qtyq2C = value;
    }

    /**
     * Gets the value of the qtyq3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQTYQ3C() {
        return qtyq3C;
    }

    /**
     * Sets the value of the qtyq3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQTYQ3C(JAXBElement<BigDecimal> value) {
        this.qtyq3C = value;
    }

    /**
     * Gets the value of the qtyq4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQTYQ4C() {
        return qtyq4C;
    }

    /**
     * Sets the value of the qtyq4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQTYQ4C(JAXBElement<BigDecimal> value) {
        this.qtyq4C = value;
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
     * Gets the value of the asp101C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP101C() {
        return asp101C;
    }

    /**
     * Sets the value of the asp101C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP101C(JAXBElement<BigDecimal> value) {
        this.asp101C = value;
    }

    /**
     * Gets the value of the asp201C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP201C() {
        return asp201C;
    }

    /**
     * Sets the value of the asp201C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP201C(JAXBElement<BigDecimal> value) {
        this.asp201C = value;
    }

    /**
     * Gets the value of the asp301C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP301C() {
        return asp301C;
    }

    /**
     * Sets the value of the asp301C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP301C(JAXBElement<BigDecimal> value) {
        this.asp301C = value;
    }

    /**
     * Gets the value of the asp401C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP401C() {
        return asp401C;
    }

    /**
     * Sets the value of the asp401C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP401C(JAXBElement<BigDecimal> value) {
        this.asp401C = value;
    }

    /**
     * Gets the value of the asp501C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP501C() {
        return asp501C;
    }

    /**
     * Sets the value of the asp501C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP501C(JAXBElement<BigDecimal> value) {
        this.asp501C = value;
    }

    /**
     * Gets the value of the asp601C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP601C() {
        return asp601C;
    }

    /**
     * Sets the value of the asp601C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP601C(JAXBElement<BigDecimal> value) {
        this.asp601C = value;
    }

    /**
     * Gets the value of the asp701C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP701C() {
        return asp701C;
    }

    /**
     * Sets the value of the asp701C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP701C(JAXBElement<BigDecimal> value) {
        this.asp701C = value;
    }

    /**
     * Gets the value of the asp801C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP801C() {
        return asp801C;
    }

    /**
     * Sets the value of the asp801C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP801C(JAXBElement<BigDecimal> value) {
        this.asp801C = value;
    }

    /**
     * Gets the value of the asp901C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP901C() {
        return asp901C;
    }

    /**
     * Sets the value of the asp901C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP901C(JAXBElement<BigDecimal> value) {
        this.asp901C = value;
    }

    /**
     * Gets the value of the asp100C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP100C() {
        return asp100C;
    }

    /**
     * Sets the value of the asp100C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP100C(JAXBElement<BigDecimal> value) {
        this.asp100C = value;
    }

    /**
     * Gets the value of the asp111C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP111C() {
        return asp111C;
    }

    /**
     * Sets the value of the asp111C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP111C(JAXBElement<BigDecimal> value) {
        this.asp111C = value;
    }

    /**
     * Gets the value of the asp122C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASP122C() {
        return asp122C;
    }

    /**
     * Sets the value of the asp122C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASP122C(JAXBElement<BigDecimal> value) {
        this.asp122C = value;
    }

    /**
     * Gets the value of the aspq11C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASPQ11C() {
        return aspq11C;
    }

    /**
     * Sets the value of the aspq11C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASPQ11C(JAXBElement<BigDecimal> value) {
        this.aspq11C = value;
    }

    /**
     * Gets the value of the aspq22C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASPQ22C() {
        return aspq22C;
    }

    /**
     * Sets the value of the aspq22C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASPQ22C(JAXBElement<BigDecimal> value) {
        this.aspq22C = value;
    }

    /**
     * Gets the value of the aspq33C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASPQ33C() {
        return aspq33C;
    }

    /**
     * Sets the value of the aspq33C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASPQ33C(JAXBElement<BigDecimal> value) {
        this.aspq33C = value;
    }

    /**
     * Gets the value of the aspq44C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getASPQ44C() {
        return aspq44C;
    }

    /**
     * Sets the value of the aspq44C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setASPQ44C(JAXBElement<BigDecimal> value) {
        this.aspq44C = value;
    }

    /**
     * Gets the value of the costC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostC() {
        return costC;
    }

    /**
     * Sets the value of the costC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostC(JAXBElement<BigDecimal> value) {
        this.costC = value;
    }

    /**
     * Gets the value of the creationDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDateC() {
        return creationDateC;
    }

    /**
     * Sets the value of the creationDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDateC = value;
    }

    /**
     * Gets the value of the rev1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV1C() {
        return rev1C;
    }

    /**
     * Sets the value of the rev1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV1C(JAXBElement<AmountType> value) {
        this.rev1C = value;
    }

    /**
     * Gets the value of the rev2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV2C() {
        return rev2C;
    }

    /**
     * Sets the value of the rev2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV2C(JAXBElement<AmountType> value) {
        this.rev2C = value;
    }

    /**
     * Gets the value of the rev3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV3C() {
        return rev3C;
    }

    /**
     * Sets the value of the rev3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV3C(JAXBElement<AmountType> value) {
        this.rev3C = value;
    }

    /**
     * Gets the value of the rev4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV4C() {
        return rev4C;
    }

    /**
     * Sets the value of the rev4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV4C(JAXBElement<AmountType> value) {
        this.rev4C = value;
    }

    /**
     * Gets the value of the rev5C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV5C() {
        return rev5C;
    }

    /**
     * Sets the value of the rev5C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV5C(JAXBElement<AmountType> value) {
        this.rev5C = value;
    }

    /**
     * Gets the value of the rev6C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV6C() {
        return rev6C;
    }

    /**
     * Sets the value of the rev6C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV6C(JAXBElement<AmountType> value) {
        this.rev6C = value;
    }

    /**
     * Gets the value of the rev7C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV7C() {
        return rev7C;
    }

    /**
     * Sets the value of the rev7C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV7C(JAXBElement<AmountType> value) {
        this.rev7C = value;
    }

    /**
     * Gets the value of the rev8C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV8C() {
        return rev8C;
    }

    /**
     * Sets the value of the rev8C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV8C(JAXBElement<AmountType> value) {
        this.rev8C = value;
    }

    /**
     * Gets the value of the rev9C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV9C() {
        return rev9C;
    }

    /**
     * Sets the value of the rev9C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV9C(JAXBElement<AmountType> value) {
        this.rev9C = value;
    }

    /**
     * Gets the value of the rev10C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV10C() {
        return rev10C;
    }

    /**
     * Sets the value of the rev10C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV10C(JAXBElement<AmountType> value) {
        this.rev10C = value;
    }

    /**
     * Gets the value of the rev11C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV11C() {
        return rev11C;
    }

    /**
     * Sets the value of the rev11C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV11C(JAXBElement<AmountType> value) {
        this.rev11C = value;
    }

    /**
     * Gets the value of the rev12C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREV12C() {
        return rev12C;
    }

    /**
     * Sets the value of the rev12C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREV12C(JAXBElement<AmountType> value) {
        this.rev12C = value;
    }

    /**
     * Gets the value of the revq1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREVQ1C() {
        return revq1C;
    }

    /**
     * Sets the value of the revq1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREVQ1C(JAXBElement<AmountType> value) {
        this.revq1C = value;
    }

    /**
     * Gets the value of the revq2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREVQ2C() {
        return revq2C;
    }

    /**
     * Sets the value of the revq2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREVQ2C(JAXBElement<AmountType> value) {
        this.revq2C = value;
    }

    /**
     * Gets the value of the revq3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREVQ3C() {
        return revq3C;
    }

    /**
     * Sets the value of the revq3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREVQ3C(JAXBElement<AmountType> value) {
        this.revq3C = value;
    }

    /**
     * Gets the value of the revq4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getREVQ4C() {
        return revq4C;
    }

    /**
     * Sets the value of the revq4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setREVQ4C(JAXBElement<AmountType> value) {
        this.revq4C = value;
    }

    /**
     * Gets the value of the forecastHistoryTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastHistoryTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastHistoryTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastHistoryTeamC }
     * 
     * 
     */
    public List<ForecastHistoryTeamC> getForecastHistoryTeamCollectionC() {
        if (forecastHistoryTeamCollectionC == null) {
            forecastHistoryTeamCollectionC = new ArrayList<ForecastHistoryTeamC>();
        }
        return this.forecastHistoryTeamCollectionC;
    }

}
