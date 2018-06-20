
package com.gapblue.web.stubs.opportunity;

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
 * <p>Java class for Revenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BUOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CostAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerResourceOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="MarginAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="InventoryItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoryOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="RevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RevnAmountCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="WinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectDlvryDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RecurParentRevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RecurNumberPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurQuantity" type="{http://xmlns.oracle.com/adf/svc/types/}MeasureType" minOccurs="0"/>
 *         &lt;element name="RecurUnitPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurRevnAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SalesCreditTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SplitParentRevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SplitPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SplitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="CloseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseReasonCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrCmptPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurPeriodOrEndDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualCloseDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="AttachmentEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrTerritoryVersionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConversionRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerDealExpirationDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OwnerDealProtectedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OwnerLockAsgnFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastOverrideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumberInternal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NqSplitAllocTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurDownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurUpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CrmCurcyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerOrgTreeStructCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnCreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="RevnCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyLeadId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesChannelCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrPartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartEngagementTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRcptPartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartOrgPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartOrgPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentRevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevnLineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrTerritoryUpdatedById" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrTerritoryUpdatedByPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesAccountUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewCriteriaIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecurExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ScheduleAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdditionalAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurAdditionalNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecurAdditionalAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RecurringRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RecurringRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenueOtherSplits" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenueNonQuota" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenueNonQuotaOtherSplits" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueTerritory" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenueTerritory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BU_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASP_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualUnitVolume_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpectedRevenue_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Primary_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BUOwnerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUOwnerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BUDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunitySalesStage_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASPCustom_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Part_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", propOrder = {
    "revnId",
    "targetPartyId",
    "customerAccountId",
    "buOrgId",
    "comments",
    "commitFlag",
    "costAmount",
    "resourcePartyId",
    "ownerResourceOrgId",
    "downsideAmount",
    "expectAmount",
    "marginAmount",
    "optyId",
    "unitPrice",
    "inventoryItemId",
    "inventoryOrgId",
    "quantity",
    "revnAmount",
    "revnAmountCurcyCode",
    "typeCode",
    "typeCodeSetId",
    "upsideAmount",
    "winProb",
    "uomCode",
    "expectDlvryDate",
    "createdBy",
    "creationDate",
    "conflictId",
    "lastUpdatedBy",
    "lastUpdateDate",
    "lastUpdateLogin",
    "objectVersionNumber",
    "userLastUpdateDate",
    "partyName",
    "description",
    "organizationId",
    "primaryFlag",
    "name",
    "revnNumber",
    "prodGroupId",
    "prodGroupName",
    "recurFrequencyCode",
    "recurEndDate",
    "recurParentRevnId",
    "recurNumberPeriods",
    "recurQuantity",
    "recurUnitPrice",
    "recurRevnAmount",
    "recurTypeCode",
    "recurStartDate",
    "salesCreditTypeCode",
    "splitParentRevnId",
    "splitPercent",
    "splitTypeCode",
    "statusCode",
    "statusCodeSetId",
    "effectiveDate",
    "closeReasonCode",
    "closeReasonCodeSetId",
    "prCmptPartyId",
    "partyName1",
    "recurPeriodOrEndDateCode",
    "actualCloseDate",
    "attachmentEntityName",
    "partyName2",
    "prTerritoryVersionId",
    "conversionRate",
    "conversionRateType",
    "ownerDealExpirationDate",
    "ownerDealProtectedDate",
    "ownerLockAsgnFlag",
    "name1",
    "forecastOverrideCode",
    "itemNumber",
    "itemNumberInternal",
    "optyNumber",
    "productType",
    "nqSplitAllocTypeCode",
    "recurDownsideAmount",
    "recurUpsideAmount",
    "crmCurcyCode",
    "crmConversionRateType",
    "crmConversionRate",
    "ownerOrgTreeCode",
    "ownerOrgTreeStructCode",
    "revnCreationDate",
    "revnCategoryCode",
    "optyLeadId",
    "salesChannelCd",
    "prPartOrgPartyId",
    "partEngagementTypeCd",
    "creditRcptPartOrgPartyId",
    "partOrgPartyId",
    "partOrgPartyName",
    "parentRevnId",
    "revnLineTypeCode",
    "revnSequenceNumber",
    "prTerritoryUpdatedById",
    "prTerritoryUpdatedByPartyName",
    "partyUniqueName1",
    "salesAccountId",
    "salesAccountUniqueName",
    "viewCriteriaIdentifier",
    "discount",
    "recurExpectAmount",
    "scheduleAction",
    "additionalText1",
    "additionalText2",
    "additionalNumber",
    "additionalAmount",
    "recurAdditionalNumber",
    "recurAdditionalAmount",
    "recurringRevenue",
    "splitRevenue",
    "splitRevenueOtherSplits",
    "splitRevenueNonQuota",
    "splitRevenueNonQuotaOtherSplits",
    "revenueTerritory",
    "buc",
    "aspc",
    "annualUnitVolumeC",
    "expectedRevenueC",
    "primaryC",
    "buOwnerEmailC",
    "buOwnerNameC",
    "budclIdC",
    "budclc",
    "opportunitySalesStageC",
    "aspCustomC",
    "productIdC",
    "productC",
    "partIdC",
    "partC"
})
public class Revenue {

    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetPartyId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customerAccountId;
    @XmlElement(name = "BUOrgId")
    protected Long buOrgId;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "CommitFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> commitFlag;
    @XmlElementRef(name = "CostAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> costAmount;
    @XmlElementRef(name = "ResourcePartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourcePartyId;
    @XmlElementRef(name = "OwnerResourceOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ownerResourceOrgId;
    @XmlElementRef(name = "DownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> downsideAmount;
    @XmlElementRef(name = "ExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> expectAmount;
    @XmlElementRef(name = "MarginAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> marginAmount;
    @XmlElementRef(name = "OptyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> optyId;
    @XmlElementRef(name = "UnitPrice", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> unitPrice;
    @XmlElementRef(name = "InventoryItemId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inventoryItemId;
    @XmlElementRef(name = "InventoryOrgId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> inventoryOrgId;
    @XmlElementRef(name = "Quantity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> quantity;
    @XmlElementRef(name = "RevnAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> revnAmount;
    @XmlElement(name = "RevnAmountCurcyCode")
    protected String revnAmountCurcyCode;
    @XmlElementRef(name = "TypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeCode;
    @XmlElementRef(name = "TypeCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> typeCodeSetId;
    @XmlElementRef(name = "UpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> upsideAmount;
    @XmlElementRef(name = "WinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> winProb;
    @XmlElementRef(name = "UOMCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uomCode;
    @XmlElementRef(name = "ExpectDlvryDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expectDlvryDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "OrganizationId")
    protected Long organizationId;
    @XmlElementRef(name = "PrimaryFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> primaryFlag;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RevnNumber")
    protected String revnNumber;
    @XmlElementRef(name = "ProdGroupId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prodGroupId;
    @XmlElement(name = "ProdGroupName")
    protected String prodGroupName;
    @XmlElementRef(name = "RecurFrequencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recurFrequencyCode;
    @XmlElementRef(name = "RecurEndDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recurEndDate;
    @XmlElementRef(name = "RecurParentRevnId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> recurParentRevnId;
    @XmlElementRef(name = "RecurNumberPeriods", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> recurNumberPeriods;
    @XmlElementRef(name = "RecurQuantity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureType> recurQuantity;
    @XmlElementRef(name = "RecurUnitPrice", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurUnitPrice;
    @XmlElementRef(name = "RecurRevnAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurRevnAmount;
    @XmlElementRef(name = "RecurTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recurTypeCode;
    @XmlElementRef(name = "RecurStartDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recurStartDate;
    @XmlElementRef(name = "SalesCreditTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesCreditTypeCode;
    @XmlElementRef(name = "SplitParentRevnId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> splitParentRevnId;
    @XmlElementRef(name = "SplitPercent", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> splitPercent;
    @XmlElementRef(name = "SplitTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> splitTypeCode;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "StatusCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> statusCodeSetId;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "CloseReasonCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closeReasonCode;
    @XmlElementRef(name = "CloseReasonCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> closeReasonCodeSetId;
    @XmlElementRef(name = "PrCmptPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prCmptPartyId;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElementRef(name = "RecurPeriodOrEndDateCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recurPeriodOrEndDateCode;
    @XmlElementRef(name = "ActualCloseDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualCloseDate;
    @XmlElementRef(name = "AttachmentEntityName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachmentEntityName;
    @XmlElement(name = "PartyName2")
    protected String partyName2;
    @XmlElementRef(name = "PrTerritoryVersionId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prTerritoryVersionId;
    @XmlElementRef(name = "ConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> conversionRate;
    @XmlElementRef(name = "ConversionRateType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conversionRateType;
    @XmlElementRef(name = "OwnerDealExpirationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ownerDealExpirationDate;
    @XmlElementRef(name = "OwnerDealProtectedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ownerDealProtectedDate;
    @XmlElementRef(name = "OwnerLockAsgnFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ownerLockAsgnFlag;
    @XmlElement(name = "Name1")
    protected String name1;
    @XmlElementRef(name = "ForecastOverrideCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastOverrideCode;
    @XmlElement(name = "ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "ItemNumberInternal")
    protected String itemNumberInternal;
    @XmlElement(name = "OptyNumber")
    protected String optyNumber;
    @XmlElementRef(name = "ProductType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "NqSplitAllocTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nqSplitAllocTypeCode;
    @XmlElementRef(name = "RecurDownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurDownsideAmount;
    @XmlElementRef(name = "RecurUpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurUpsideAmount;
    @XmlElementRef(name = "CrmCurcyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmCurcyCode;
    @XmlElementRef(name = "CrmConversionRateType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crmConversionRateType;
    @XmlElementRef(name = "CrmConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crmConversionRate;
    @XmlElementRef(name = "OwnerOrgTreeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerOrgTreeCode;
    @XmlElementRef(name = "OwnerOrgTreeStructCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerOrgTreeStructCode;
    @XmlElementRef(name = "RevnCreationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> revnCreationDate;
    @XmlElementRef(name = "RevnCategoryCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revnCategoryCode;
    @XmlElementRef(name = "OptyLeadId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> optyLeadId;
    @XmlElementRef(name = "SalesChannelCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesChannelCd;
    @XmlElementRef(name = "PrPartOrgPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prPartOrgPartyId;
    @XmlElementRef(name = "PartEngagementTypeCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partEngagementTypeCd;
    @XmlElementRef(name = "CreditRcptPartOrgPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> creditRcptPartOrgPartyId;
    @XmlElement(name = "PartOrgPartyId")
    protected Long partOrgPartyId;
    @XmlElement(name = "PartOrgPartyName")
    protected String partOrgPartyName;
    @XmlElementRef(name = "ParentRevnId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentRevnId;
    @XmlElementRef(name = "RevnLineTypeCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revnLineTypeCode;
    @XmlElementRef(name = "RevnSequenceNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> revnSequenceNumber;
    @XmlElementRef(name = "PrTerritoryUpdatedById", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prTerritoryUpdatedById;
    @XmlElement(name = "PrTerritoryUpdatedByPartyName")
    protected String prTerritoryUpdatedByPartyName;
    @XmlElementRef(name = "PartyUniqueName1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName1;
    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesAccountId;
    @XmlElementRef(name = "SalesAccountUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountUniqueName;
    @XmlElementRef(name = "ViewCriteriaIdentifier", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> viewCriteriaIdentifier;
    @XmlElementRef(name = "Discount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> discount;
    @XmlElementRef(name = "RecurExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurExpectAmount;
    @XmlElementRef(name = "ScheduleAction", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scheduleAction;
    @XmlElementRef(name = "AdditionalText1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalText1;
    @XmlElementRef(name = "AdditionalText2", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalText2;
    @XmlElementRef(name = "AdditionalNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> additionalNumber;
    @XmlElementRef(name = "AdditionalAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> additionalAmount;
    @XmlElementRef(name = "RecurAdditionalNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> recurAdditionalNumber;
    @XmlElementRef(name = "RecurAdditionalAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> recurAdditionalAmount;
    @XmlElement(name = "RecurringRevenue")
    protected List<RecurringRevenue> recurringRevenue;
    @XmlElement(name = "SplitRevenue")
    protected List<SplitRevenue> splitRevenue;
    @XmlElement(name = "SplitRevenueOtherSplits")
    protected List<SplitRevenue> splitRevenueOtherSplits;
    @XmlElement(name = "SplitRevenueNonQuota")
    protected List<SplitRevenue> splitRevenueNonQuota;
    @XmlElement(name = "SplitRevenueNonQuotaOtherSplits")
    protected List<SplitRevenue> splitRevenueNonQuotaOtherSplits;
    @XmlElement(name = "RevenueTerritory")
    protected List<RevenueTerritory> revenueTerritory;
    @XmlElementRef(name = "BU_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buc;
    @XmlElementRef(name = "ASP_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aspc;
    @XmlElementRef(name = "AnnualUnitVolume_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> annualUnitVolumeC;
    @XmlElementRef(name = "ExpectedRevenue_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> expectedRevenueC;
    @XmlElement(name = "Primary_c")
    protected Boolean primaryC;
    @XmlElementRef(name = "BUOwnerEmail_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buOwnerEmailC;
    @XmlElementRef(name = "BUOwnerName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buOwnerNameC;
    @XmlElementRef(name = "BUDCL_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> budclIdC;
    @XmlElementRef(name = "BUDCL_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> budclc;
    @XmlElementRef(name = "OpportunitySalesStage_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunitySalesStageC;
    @XmlElement(name = "ASPCustom_c")
    protected BigDecimal aspCustomC;
    @XmlElementRef(name = "Product_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> productIdC;
    @XmlElementRef(name = "Product_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productC;
    @XmlElementRef(name = "Part_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> partIdC;
    @XmlElementRef(name = "Part_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partC;

    /**
     * Gets the value of the revnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevnId() {
        return revnId;
    }

    /**
     * Sets the value of the revnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevnId(Long value) {
        this.revnId = value;
    }

    /**
     * Gets the value of the targetPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetPartyId() {
        return targetPartyId;
    }

    /**
     * Sets the value of the targetPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetPartyId(JAXBElement<Long> value) {
        this.targetPartyId = value;
    }

    /**
     * Gets the value of the customerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerAccountId() {
        return customerAccountId;
    }

    /**
     * Sets the value of the customerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerAccountId(JAXBElement<Long> value) {
        this.customerAccountId = value;
    }

    /**
     * Gets the value of the buOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBUOrgId() {
        return buOrgId;
    }

    /**
     * Sets the value of the buOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBUOrgId(Long value) {
        this.buOrgId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the commitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCommitFlag() {
        return commitFlag;
    }

    /**
     * Sets the value of the commitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCommitFlag(JAXBElement<Boolean> value) {
        this.commitFlag = value;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCostAmount(JAXBElement<AmountType> value) {
        this.costAmount = value;
    }

    /**
     * Gets the value of the resourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourcePartyId() {
        return resourcePartyId;
    }

    /**
     * Sets the value of the resourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourcePartyId(JAXBElement<Long> value) {
        this.resourcePartyId = value;
    }

    /**
     * Gets the value of the ownerResourceOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerResourceOrgId() {
        return ownerResourceOrgId;
    }

    /**
     * Sets the value of the ownerResourceOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerResourceOrgId(JAXBElement<Long> value) {
        this.ownerResourceOrgId = value;
    }

    /**
     * Gets the value of the downsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getDownsideAmount() {
        return downsideAmount;
    }

    /**
     * Sets the value of the downsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setDownsideAmount(JAXBElement<AmountType> value) {
        this.downsideAmount = value;
    }

    /**
     * Gets the value of the expectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getExpectAmount() {
        return expectAmount;
    }

    /**
     * Sets the value of the expectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setExpectAmount(JAXBElement<AmountType> value) {
        this.expectAmount = value;
    }

    /**
     * Gets the value of the marginAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getMarginAmount() {
        return marginAmount;
    }

    /**
     * Sets the value of the marginAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setMarginAmount(JAXBElement<AmountType> value) {
        this.marginAmount = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOptyId(JAXBElement<Long> value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<AmountType> value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the inventoryItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryItemId() {
        return inventoryItemId;
    }

    /**
     * Sets the value of the inventoryItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryItemId(JAXBElement<Long> value) {
        this.inventoryItemId = value;
    }

    /**
     * Gets the value of the inventoryOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInventoryOrgId() {
        return inventoryOrgId;
    }

    /**
     * Sets the value of the inventoryOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInventoryOrgId(JAXBElement<Long> value) {
        this.inventoryOrgId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<MeasureType> value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the revnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRevnAmount() {
        return revnAmount;
    }

    /**
     * Sets the value of the revnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRevnAmount(JAXBElement<AmountType> value) {
        this.revnAmount = value;
    }

    /**
     * Gets the value of the revnAmountCurcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevnAmountCurcyCode() {
        return revnAmountCurcyCode;
    }

    /**
     * Sets the value of the revnAmountCurcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevnAmountCurcyCode(String value) {
        this.revnAmountCurcyCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeCode(JAXBElement<String> value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the typeCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTypeCodeSetId() {
        return typeCodeSetId;
    }

    /**
     * Sets the value of the typeCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTypeCodeSetId(JAXBElement<Long> value) {
        this.typeCodeSetId = value;
    }

    /**
     * Gets the value of the upsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUpsideAmount() {
        return upsideAmount;
    }

    /**
     * Sets the value of the upsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUpsideAmount(JAXBElement<AmountType> value) {
        this.upsideAmount = value;
    }

    /**
     * Gets the value of the winProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWinProb() {
        return winProb;
    }

    /**
     * Sets the value of the winProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWinProb(JAXBElement<BigDecimal> value) {
        this.winProb = value;
    }

    /**
     * Gets the value of the uomCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUOMCode() {
        return uomCode;
    }

    /**
     * Sets the value of the uomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUOMCode(JAXBElement<String> value) {
        this.uomCode = value;
    }

    /**
     * Gets the value of the expectDlvryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpectDlvryDate() {
        return expectDlvryDate;
    }

    /**
     * Sets the value of the expectDlvryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpectDlvryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expectDlvryDate = value;
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
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConflictId(Long value) {
        this.conflictId = value;
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
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
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
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationId(Long value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrimaryFlag(JAXBElement<Boolean> value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the revnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevnNumber() {
        return revnNumber;
    }

    /**
     * Sets the value of the revnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevnNumber(String value) {
        this.revnNumber = value;
    }

    /**
     * Gets the value of the prodGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getProdGroupId() {
        return prodGroupId;
    }

    /**
     * Sets the value of the prodGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setProdGroupId(JAXBElement<Long> value) {
        this.prodGroupId = value;
    }

    /**
     * Gets the value of the prodGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdGroupName() {
        return prodGroupName;
    }

    /**
     * Sets the value of the prodGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdGroupName(String value) {
        this.prodGroupName = value;
    }

    /**
     * Gets the value of the recurFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurFrequencyCode() {
        return recurFrequencyCode;
    }

    /**
     * Sets the value of the recurFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurFrequencyCode(JAXBElement<String> value) {
        this.recurFrequencyCode = value;
    }

    /**
     * Gets the value of the recurEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurEndDate() {
        return recurEndDate;
    }

    /**
     * Sets the value of the recurEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.recurEndDate = value;
    }

    /**
     * Gets the value of the recurParentRevnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecurParentRevnId() {
        return recurParentRevnId;
    }

    /**
     * Sets the value of the recurParentRevnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecurParentRevnId(JAXBElement<Long> value) {
        this.recurParentRevnId = value;
    }

    /**
     * Gets the value of the recurNumberPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecurNumberPeriods() {
        return recurNumberPeriods;
    }

    /**
     * Sets the value of the recurNumberPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecurNumberPeriods(JAXBElement<Integer> value) {
        this.recurNumberPeriods = value;
    }

    /**
     * Gets the value of the recurQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public JAXBElement<MeasureType> getRecurQuantity() {
        return recurQuantity;
    }

    /**
     * Sets the value of the recurQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     
     */
    public void setRecurQuantity(JAXBElement<MeasureType> value) {
        this.recurQuantity = value;
    }

    /**
     * Gets the value of the recurUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurUnitPrice() {
        return recurUnitPrice;
    }

    /**
     * Sets the value of the recurUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurUnitPrice(JAXBElement<AmountType> value) {
        this.recurUnitPrice = value;
    }

    /**
     * Gets the value of the recurRevnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurRevnAmount() {
        return recurRevnAmount;
    }

    /**
     * Sets the value of the recurRevnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurRevnAmount(JAXBElement<AmountType> value) {
        this.recurRevnAmount = value;
    }

    /**
     * Gets the value of the recurTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurTypeCode() {
        return recurTypeCode;
    }

    /**
     * Sets the value of the recurTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurTypeCode(JAXBElement<String> value) {
        this.recurTypeCode = value;
    }

    /**
     * Gets the value of the recurStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRecurStartDate() {
        return recurStartDate;
    }

    /**
     * Sets the value of the recurStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRecurStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.recurStartDate = value;
    }

    /**
     * Gets the value of the salesCreditTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesCreditTypeCode() {
        return salesCreditTypeCode;
    }

    /**
     * Sets the value of the salesCreditTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesCreditTypeCode(JAXBElement<String> value) {
        this.salesCreditTypeCode = value;
    }

    /**
     * Gets the value of the splitParentRevnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSplitParentRevnId() {
        return splitParentRevnId;
    }

    /**
     * Sets the value of the splitParentRevnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSplitParentRevnId(JAXBElement<Long> value) {
        this.splitParentRevnId = value;
    }

    /**
     * Gets the value of the splitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSplitPercent() {
        return splitPercent;
    }

    /**
     * Sets the value of the splitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSplitPercent(JAXBElement<BigDecimal> value) {
        this.splitPercent = value;
    }

    /**
     * Gets the value of the splitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSplitTypeCode() {
        return splitTypeCode;
    }

    /**
     * Sets the value of the splitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSplitTypeCode(JAXBElement<String> value) {
        this.splitTypeCode = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStatusCodeSetId() {
        return statusCodeSetId;
    }

    /**
     * Sets the value of the statusCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStatusCodeSetId(JAXBElement<Long> value) {
        this.statusCodeSetId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the closeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCloseReasonCode() {
        return closeReasonCode;
    }

    /**
     * Sets the value of the closeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCloseReasonCode(JAXBElement<String> value) {
        this.closeReasonCode = value;
    }

    /**
     * Gets the value of the closeReasonCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCloseReasonCodeSetId() {
        return closeReasonCodeSetId;
    }

    /**
     * Sets the value of the closeReasonCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCloseReasonCodeSetId(JAXBElement<Long> value) {
        this.closeReasonCodeSetId = value;
    }

    /**
     * Gets the value of the prCmptPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrCmptPartyId() {
        return prCmptPartyId;
    }

    /**
     * Sets the value of the prCmptPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrCmptPartyId(JAXBElement<Long> value) {
        this.prCmptPartyId = value;
    }

    /**
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName1(String value) {
        this.partyName1 = value;
    }

    /**
     * Gets the value of the recurPeriodOrEndDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurPeriodOrEndDateCode() {
        return recurPeriodOrEndDateCode;
    }

    /**
     * Sets the value of the recurPeriodOrEndDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurPeriodOrEndDateCode(JAXBElement<String> value) {
        this.recurPeriodOrEndDateCode = value;
    }

    /**
     * Gets the value of the actualCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualCloseDate() {
        return actualCloseDate;
    }

    /**
     * Sets the value of the actualCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualCloseDate = value;
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
     * Gets the value of the partyName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName2() {
        return partyName2;
    }

    /**
     * Sets the value of the partyName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName2(String value) {
        this.partyName2 = value;
    }

    /**
     * Gets the value of the prTerritoryVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrTerritoryVersionId() {
        return prTerritoryVersionId;
    }

    /**
     * Sets the value of the prTerritoryVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrTerritoryVersionId(JAXBElement<Long> value) {
        this.prTerritoryVersionId = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConversionRate(JAXBElement<BigDecimal> value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the conversionRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConversionRateType() {
        return conversionRateType;
    }

    /**
     * Sets the value of the conversionRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConversionRateType(JAXBElement<String> value) {
        this.conversionRateType = value;
    }

    /**
     * Gets the value of the ownerDealExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOwnerDealExpirationDate() {
        return ownerDealExpirationDate;
    }

    /**
     * Sets the value of the ownerDealExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOwnerDealExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ownerDealExpirationDate = value;
    }

    /**
     * Gets the value of the ownerDealProtectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOwnerDealProtectedDate() {
        return ownerDealProtectedDate;
    }

    /**
     * Sets the value of the ownerDealProtectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOwnerDealProtectedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ownerDealProtectedDate = value;
    }

    /**
     * Gets the value of the ownerLockAsgnFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOwnerLockAsgnFlag() {
        return ownerLockAsgnFlag;
    }

    /**
     * Sets the value of the ownerLockAsgnFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOwnerLockAsgnFlag(JAXBElement<Boolean> value) {
        this.ownerLockAsgnFlag = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the forecastOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForecastOverrideCode() {
        return forecastOverrideCode;
    }

    /**
     * Sets the value of the forecastOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForecastOverrideCode(JAXBElement<String> value) {
        this.forecastOverrideCode = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the itemNumberInternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumberInternal() {
        return itemNumberInternal;
    }

    /**
     * Sets the value of the itemNumberInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumberInternal(String value) {
        this.itemNumberInternal = value;
    }

    /**
     * Gets the value of the optyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyNumber() {
        return optyNumber;
    }

    /**
     * Sets the value of the optyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyNumber(String value) {
        this.optyNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = value;
    }

    /**
     * Gets the value of the nqSplitAllocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNqSplitAllocTypeCode() {
        return nqSplitAllocTypeCode;
    }

    /**
     * Sets the value of the nqSplitAllocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNqSplitAllocTypeCode(JAXBElement<String> value) {
        this.nqSplitAllocTypeCode = value;
    }

    /**
     * Gets the value of the recurDownsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurDownsideAmount() {
        return recurDownsideAmount;
    }

    /**
     * Sets the value of the recurDownsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurDownsideAmount(JAXBElement<AmountType> value) {
        this.recurDownsideAmount = value;
    }

    /**
     * Gets the value of the recurUpsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurUpsideAmount() {
        return recurUpsideAmount;
    }

    /**
     * Sets the value of the recurUpsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurUpsideAmount(JAXBElement<AmountType> value) {
        this.recurUpsideAmount = value;
    }

    /**
     * Gets the value of the crmCurcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmCurcyCode() {
        return crmCurcyCode;
    }

    /**
     * Sets the value of the crmCurcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmCurcyCode(JAXBElement<String> value) {
        this.crmCurcyCode = value;
    }

    /**
     * Gets the value of the crmConversionRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrmConversionRateType() {
        return crmConversionRateType;
    }

    /**
     * Sets the value of the crmConversionRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrmConversionRateType(JAXBElement<String> value) {
        this.crmConversionRateType = value;
    }

    /**
     * Gets the value of the crmConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmConversionRate() {
        return crmConversionRate;
    }

    /**
     * Sets the value of the crmConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmConversionRate(JAXBElement<BigDecimal> value) {
        this.crmConversionRate = value;
    }

    /**
     * Gets the value of the ownerOrgTreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerOrgTreeCode() {
        return ownerOrgTreeCode;
    }

    /**
     * Sets the value of the ownerOrgTreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerOrgTreeCode(JAXBElement<String> value) {
        this.ownerOrgTreeCode = value;
    }

    /**
     * Gets the value of the ownerOrgTreeStructCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerOrgTreeStructCode() {
        return ownerOrgTreeStructCode;
    }

    /**
     * Sets the value of the ownerOrgTreeStructCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerOrgTreeStructCode(JAXBElement<String> value) {
        this.ownerOrgTreeStructCode = value;
    }

    /**
     * Gets the value of the revnCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRevnCreationDate() {
        return revnCreationDate;
    }

    /**
     * Sets the value of the revnCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRevnCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.revnCreationDate = value;
    }

    /**
     * Gets the value of the revnCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnCategoryCode() {
        return revnCategoryCode;
    }

    /**
     * Sets the value of the revnCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnCategoryCode(JAXBElement<String> value) {
        this.revnCategoryCode = value;
    }

    /**
     * Gets the value of the optyLeadId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOptyLeadId() {
        return optyLeadId;
    }

    /**
     * Sets the value of the optyLeadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOptyLeadId(JAXBElement<Long> value) {
        this.optyLeadId = value;
    }

    /**
     * Gets the value of the salesChannelCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesChannelCd() {
        return salesChannelCd;
    }

    /**
     * Sets the value of the salesChannelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesChannelCd(JAXBElement<String> value) {
        this.salesChannelCd = value;
    }

    /**
     * Gets the value of the prPartOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrPartOrgPartyId() {
        return prPartOrgPartyId;
    }

    /**
     * Sets the value of the prPartOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrPartOrgPartyId(JAXBElement<Long> value) {
        this.prPartOrgPartyId = value;
    }

    /**
     * Gets the value of the partEngagementTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartEngagementTypeCd() {
        return partEngagementTypeCd;
    }

    /**
     * Sets the value of the partEngagementTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartEngagementTypeCd(JAXBElement<String> value) {
        this.partEngagementTypeCd = value;
    }

    /**
     * Gets the value of the creditRcptPartOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCreditRcptPartOrgPartyId() {
        return creditRcptPartOrgPartyId;
    }

    /**
     * Sets the value of the creditRcptPartOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCreditRcptPartOrgPartyId(JAXBElement<Long> value) {
        this.creditRcptPartOrgPartyId = value;
    }

    /**
     * Gets the value of the partOrgPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartOrgPartyId() {
        return partOrgPartyId;
    }

    /**
     * Sets the value of the partOrgPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartOrgPartyId(Long value) {
        this.partOrgPartyId = value;
    }

    /**
     * Gets the value of the partOrgPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrgPartyName() {
        return partOrgPartyName;
    }

    /**
     * Sets the value of the partOrgPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrgPartyName(String value) {
        this.partOrgPartyName = value;
    }

    /**
     * Gets the value of the parentRevnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentRevnId() {
        return parentRevnId;
    }

    /**
     * Sets the value of the parentRevnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentRevnId(JAXBElement<Long> value) {
        this.parentRevnId = value;
    }

    /**
     * Gets the value of the revnLineTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevnLineTypeCode() {
        return revnLineTypeCode;
    }

    /**
     * Sets the value of the revnLineTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevnLineTypeCode(JAXBElement<String> value) {
        this.revnLineTypeCode = value;
    }

    /**
     * Gets the value of the revnSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRevnSequenceNumber() {
        return revnSequenceNumber;
    }

    /**
     * Sets the value of the revnSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRevnSequenceNumber(JAXBElement<Integer> value) {
        this.revnSequenceNumber = value;
    }

    /**
     * Gets the value of the prTerritoryUpdatedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrTerritoryUpdatedById() {
        return prTerritoryUpdatedById;
    }

    /**
     * Sets the value of the prTerritoryUpdatedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrTerritoryUpdatedById(JAXBElement<Long> value) {
        this.prTerritoryUpdatedById = value;
    }

    /**
     * Gets the value of the prTerritoryUpdatedByPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTerritoryUpdatedByPartyName() {
        return prTerritoryUpdatedByPartyName;
    }

    /**
     * Sets the value of the prTerritoryUpdatedByPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTerritoryUpdatedByPartyName(String value) {
        this.prTerritoryUpdatedByPartyName = value;
    }

    /**
     * Gets the value of the partyUniqueName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName1() {
        return partyUniqueName1;
    }

    /**
     * Sets the value of the partyUniqueName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName1(JAXBElement<String> value) {
        this.partyUniqueName1 = value;
    }

    /**
     * Gets the value of the salesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesAccountId(JAXBElement<Long> value) {
        this.salesAccountId = value;
    }

    /**
     * Gets the value of the salesAccountUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountUniqueName() {
        return salesAccountUniqueName;
    }

    /**
     * Sets the value of the salesAccountUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountUniqueName(JAXBElement<String> value) {
        this.salesAccountUniqueName = value;
    }

    /**
     * Gets the value of the viewCriteriaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViewCriteriaIdentifier() {
        return viewCriteriaIdentifier;
    }

    /**
     * Sets the value of the viewCriteriaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViewCriteriaIdentifier(JAXBElement<String> value) {
        this.viewCriteriaIdentifier = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDiscount(JAXBElement<BigDecimal> value) {
        this.discount = value;
    }

    /**
     * Gets the value of the recurExpectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurExpectAmount() {
        return recurExpectAmount;
    }

    /**
     * Sets the value of the recurExpectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurExpectAmount(JAXBElement<AmountType> value) {
        this.recurExpectAmount = value;
    }

    /**
     * Gets the value of the scheduleAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScheduleAction() {
        return scheduleAction;
    }

    /**
     * Sets the value of the scheduleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScheduleAction(JAXBElement<String> value) {
        this.scheduleAction = value;
    }

    /**
     * Gets the value of the additionalText1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalText1() {
        return additionalText1;
    }

    /**
     * Sets the value of the additionalText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalText1(JAXBElement<String> value) {
        this.additionalText1 = value;
    }

    /**
     * Gets the value of the additionalText2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalText2() {
        return additionalText2;
    }

    /**
     * Sets the value of the additionalText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalText2(JAXBElement<String> value) {
        this.additionalText2 = value;
    }

    /**
     * Gets the value of the additionalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAdditionalNumber() {
        return additionalNumber;
    }

    /**
     * Sets the value of the additionalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAdditionalNumber(JAXBElement<BigDecimal> value) {
        this.additionalNumber = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAdditionalAmount(JAXBElement<AmountType> value) {
        this.additionalAmount = value;
    }

    /**
     * Gets the value of the recurAdditionalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRecurAdditionalNumber() {
        return recurAdditionalNumber;
    }

    /**
     * Sets the value of the recurAdditionalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRecurAdditionalNumber(JAXBElement<BigDecimal> value) {
        this.recurAdditionalNumber = value;
    }

    /**
     * Gets the value of the recurAdditionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getRecurAdditionalAmount() {
        return recurAdditionalAmount;
    }

    /**
     * Sets the value of the recurAdditionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setRecurAdditionalAmount(JAXBElement<AmountType> value) {
        this.recurAdditionalAmount = value;
    }

    /**
     * Gets the value of the recurringRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringRevenue }
     * 
     * 
     */
    public List<RecurringRevenue> getRecurringRevenue() {
        if (recurringRevenue == null) {
            recurringRevenue = new ArrayList<RecurringRevenue>();
        }
        return this.recurringRevenue;
    }

    /**
     * Gets the value of the splitRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenue() {
        if (splitRevenue == null) {
            splitRevenue = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenue;
    }

    /**
     * Gets the value of the splitRevenueOtherSplits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenueOtherSplits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenueOtherSplits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenueOtherSplits() {
        if (splitRevenueOtherSplits == null) {
            splitRevenueOtherSplits = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenueOtherSplits;
    }

    /**
     * Gets the value of the splitRevenueNonQuota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenueNonQuota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenueNonQuota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenueNonQuota() {
        if (splitRevenueNonQuota == null) {
            splitRevenueNonQuota = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenueNonQuota;
    }

    /**
     * Gets the value of the splitRevenueNonQuotaOtherSplits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenueNonQuotaOtherSplits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenueNonQuotaOtherSplits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenueNonQuotaOtherSplits() {
        if (splitRevenueNonQuotaOtherSplits == null) {
            splitRevenueNonQuotaOtherSplits = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenueNonQuotaOtherSplits;
    }

    /**
     * Gets the value of the revenueTerritory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueTerritory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueTerritory }
     * 
     * 
     */
    public List<RevenueTerritory> getRevenueTerritory() {
        if (revenueTerritory == null) {
            revenueTerritory = new ArrayList<RevenueTerritory>();
        }
        return this.revenueTerritory;
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
     * Gets the value of the annualUnitVolumeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAnnualUnitVolumeC() {
        return annualUnitVolumeC;
    }

    /**
     * Sets the value of the annualUnitVolumeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAnnualUnitVolumeC(JAXBElement<BigDecimal> value) {
        this.annualUnitVolumeC = value;
    }

    /**
     * Gets the value of the expectedRevenueC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getExpectedRevenueC() {
        return expectedRevenueC;
    }

    /**
     * Sets the value of the expectedRevenueC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setExpectedRevenueC(JAXBElement<AmountType> value) {
        this.expectedRevenueC = value;
    }

    /**
     * Gets the value of the primaryC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryC() {
        return primaryC;
    }

    /**
     * Sets the value of the primaryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryC(Boolean value) {
        this.primaryC = value;
    }

    /**
     * Gets the value of the buOwnerEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUOwnerEmailC() {
        return buOwnerEmailC;
    }

    /**
     * Sets the value of the buOwnerEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUOwnerEmailC(JAXBElement<String> value) {
        this.buOwnerEmailC = value;
    }

    /**
     * Gets the value of the buOwnerNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUOwnerNameC() {
        return buOwnerNameC;
    }

    /**
     * Sets the value of the buOwnerNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUOwnerNameC(JAXBElement<String> value) {
        this.buOwnerNameC = value;
    }

    /**
     * Gets the value of the budclIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBUDCLIdC() {
        return budclIdC;
    }

    /**
     * Sets the value of the budclIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBUDCLIdC(JAXBElement<BigDecimal> value) {
        this.budclIdC = value;
    }

    /**
     * Gets the value of the budclc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUDCLC() {
        return budclc;
    }

    /**
     * Sets the value of the budclc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUDCLC(JAXBElement<String> value) {
        this.budclc = value;
    }

    /**
     * Gets the value of the opportunitySalesStageC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunitySalesStageC() {
        return opportunitySalesStageC;
    }

    /**
     * Sets the value of the opportunitySalesStageC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunitySalesStageC(JAXBElement<String> value) {
        this.opportunitySalesStageC = value;
    }

    /**
     * Gets the value of the aspCustomC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getASPCustomC() {
        return aspCustomC;
    }

    /**
     * Sets the value of the aspCustomC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setASPCustomC(BigDecimal value) {
        this.aspCustomC = value;
    }

    /**
     * Gets the value of the productIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProductIdC() {
        return productIdC;
    }

    /**
     * Sets the value of the productIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProductIdC(JAXBElement<BigDecimal> value) {
        this.productIdC = value;
    }

    /**
     * Gets the value of the productC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductC() {
        return productC;
    }

    /**
     * Sets the value of the productC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductC(JAXBElement<String> value) {
        this.productC = value;
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

}
