
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
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetAvailableDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="BudgetedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ChampionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesStageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DealHorizonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealHorizonCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DecisionLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryCompetitorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeyContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReasonWonLostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonWonLostCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RiskLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StrategicLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrategicLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryRevenueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="TargetPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalesStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageDaysAtStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaximumDaysInStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PhaseCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RcmndWinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StageStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StgOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesStageEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentFyPotentialRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BdgtAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrSrcNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="UpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastAssignedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LookupCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LookupValuesId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrConRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CrmRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevnLineSetEnabledFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannelCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhonePreferenceExistsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesAccountUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerOrgPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpportunityContact" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}Revenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityReference" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor2" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor3" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResource" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunitySource1" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunitySource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityLead" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityLead" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResponse" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueTerritory" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenueTerritory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenuePartnerPrimary" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenuePartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueLineSet" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}RevenueLineSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategorySummaryRevenue" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}CategorySummaryRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAppointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecurringRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RecurringRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityDeal" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityDeal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApprovalStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentEndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ParentEndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonDescription_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forecast_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSegment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transferred_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EvalPartReceived_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerApprovedQuote_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompetitorInfo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyRep_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectDescription_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SalesComment_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectDealRep1_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SelectDealRep1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskChallenges_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CriticalActionItemsMilestones_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductManagerComments_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectDealRep2_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SelectDealRep2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EvalPartRequestedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TargetDesignInDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TargetDesignWinDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TargetProductionDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EvaluationCompleteDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualDesignInDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualDesignWinDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualProductionStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SubmitForApprovalForDesignIn_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DesignInRegionalMgrApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignInRegionalMgrApprovalDat_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SubmitForApprovalForDesignWin_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DesignWinRegionalMgrApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignWinRegionalMgrApprovalDa_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DesignWinVPSalesApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignWinVPSalesApprovalDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DesignWinMarketingApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignWinMarketingApprovalDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="SubmitForApprovalForMassProduc_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MPVPSalesApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MPVPSalesApprovalDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Reason_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingProbability_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Application_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityLifetimeYears_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LifeTimeRevenue_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HelpNeededFrom_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfHelpRequest_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DealRegistration_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerTypeScript_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosedOrCancelledDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="VPOfSalesName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductMarketingManagerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductMarketingManagerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSalesId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductMarketingManagerId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerEmail_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionalManagerId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OwnerDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmitForApprovalForLost_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LostVPSalesApproved_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LostVPSalesApprovalDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="MarketSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSegment1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductMarketingManagerDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductMarketingManagerDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidateEndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VPOfSales_Id1_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VPOfSales_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMDCL_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RMDCL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyRep1_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ThirdPartyRep1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTG_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealRegID2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealRegID1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomer_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EndCustomer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectDealDistiReport_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectDealRepReport_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerCustomerType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerRegion_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerState_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerCountry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCustomerPartyID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityOwner_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevenuePlanCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}RevenuePlan_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", propOrder = {
    "budgetAvailableDate",
    "budgetedFlag",
    "primaryOrganizationId",
    "championFlag",
    "conflictId",
    "createdBy",
    "creationDate",
    "currencyCode",
    "salesMethodId",
    "salesStageId",
    "customerAccountId",
    "dealHorizonCode",
    "dealHorizonCodeSetId",
    "decisionLevelCode",
    "decisionLevelCodeSetId",
    "description",
    "lastUpdateDate",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "name",
    "objectVersionNumber",
    "optyId",
    "optyNumber",
    "ownerResourcePartyId",
    "primaryCompetitorId",
    "keyContactId",
    "reasonWonLostCode",
    "reasonWonLostCodeSetId",
    "riskLevelCode",
    "riskLevelCodeSetId",
    "statusCode",
    "statusCodeSetId",
    "strategicLevelCode",
    "strategicLevelCodeSetId",
    "primaryRevenueId",
    "targetPartyId",
    "userLastUpdateDate",
    "targetPartyName",
    "dunsNumber",
    "salesMethod",
    "salesMethodEOObjVerNumber",
    "salesStage",
    "descriptionText",
    "averageDaysAtStage",
    "maximumDaysInStage",
    "phaseCd",
    "quotaFactor",
    "rcmndWinProb",
    "stageStatusCd",
    "stgOrder",
    "salesStageEOObjVerNumber",
    "effectiveDate",
    "revenue",
    "revenueType",
    "revnId",
    "employeesTotal",
    "currentFyPotentialRevenue",
    "winProb",
    "objectVersionNumber1",
    "primaryContactPartyName",
    "primaryContactPartyId",
    "primaryContactFormattedPhoneNumber",
    "primaryContactEmailAddress",
    "accountNumber",
    "partyName",
    "locationId",
    "formattedAddress",
    "city",
    "country",
    "postalCode",
    "state",
    "bdgtAmount",
    "comments",
    "partyName1",
    "prSrcNumber",
    "downsideAmount",
    "upsideAmount",
    "emailAddress",
    "lastAssignedDate",
    "lookupCategory",
    "lookupValuesId",
    "optyCreationDate",
    "expectAmount",
    "preferredFunctionalCurrency",
    "partyUniqueName",
    "prConRelationshipId",
    "optyCreatedBy",
    "crmConversionRate",
    "crmRevenue",
    "revnLineSetEnabledFlag",
    "partyType",
    "optyLastUpdateDate",
    "optyLastUpdatedBy",
    "salesChannelCd",
    "lineOfBusinessCode",
    "phonePreferenceExistsFlag",
    "partyUniqueName1",
    "primaryOrganizationName",
    "salesAccountId",
    "salesAccountUniqueName",
    "consumerFirstName",
    "consumerLastName",
    "primaryContactFirstName",
    "primaryContactLastName",
    "primaryPartnerOrgPartyName",
    "primaryPartnerId",
    "registrationStatus",
    "registrationType",
    "registered",
    "updateFlag",
    "deleteFlag",
    "opportunityContact",
    "childRevenue",
    "note",
    "opportunityReference",
    "opportunityCompetitor2",
    "opportunityCompetitor3",
    "opportunityResource",
    "opportunitySource1",
    "opportunityLead",
    "opportunityResponse",
    "revenueTerritory",
    "revenuePartnerPrimary",
    "revenueLineSet",
    "categorySummaryRevenue",
    "appointment",
    "splitRevenue",
    "recurringRevenue",
    "opportunityDeal",
    "approvalStatusC",
    "parentEndCustomerIdC",
    "parentEndCustomerC",
    "reasonDescriptionC",
    "forecastC",
    "marketSegmentC",
    "subSegmentC",
    "transferredC",
    "evalPartReceivedC",
    "customerApprovedQuoteC",
    "competitorInfoC",
    "thirdPartyRepC",
    "projectNameC",
    "projectDescriptionC",
    "projectStartDateC",
    "salesCommentC",
    "selectDealRep1IdC",
    "selectDealRep1C",
    "riskChallengesC",
    "criticalActionItemsMilestonesC",
    "helpStatusC",
    "opportunityTypeC",
    "productManagerCommentsC",
    "selectDealRep2IdC",
    "selectDealRep2C",
    "evalPartRequestedDateC",
    "targetDesignInDateC",
    "targetDesignWinDateC",
    "targetProductionDateC",
    "evaluationCompleteDateC",
    "actualDesignInDateC",
    "actualDesignWinDateC",
    "actualProductionStartDateC",
    "submitForApprovalForDesignInC",
    "designInRegionalMgrApprovedC",
    "designInRegionalMgrApprovalDatC",
    "submitForApprovalForDesignWinC",
    "designWinRegionalMgrApprovedC",
    "designWinRegionalMgrApprovalDaC",
    "designWinVPSalesApprovedC",
    "designWinVPSalesApprovalDateC",
    "designWinMarketingApprovedC",
    "designWinMarketingApprovalDateC",
    "submitForApprovalForMassProducC",
    "mpvpSalesApprovedC",
    "mpvpSalesApprovalDateC",
    "reasonC",
    "marketingProbabilityC",
    "applicationC",
    "opportunityC",
    "opportunityLifetimeYearsC",
    "lifeTimeRevenueC",
    "helpNeededFromC",
    "dateOfHelpRequestC",
    "dealRegistrationC",
    "customerTypeScriptC",
    "closedOrCancelledDateC",
    "vpOfSalesNameC",
    "vpOfSalesEmailC",
    "productMarketingManagerNameC",
    "productMarketingManagerEmailC",
    "vpOfSalesIdC",
    "productMarketingManagerIdC",
    "regionalManagerNameC",
    "regionalManagerEmailC",
    "regionalManagerIdC",
    "ownerDCLIdC",
    "ownerDCLC",
    "submitForApprovalForLostC",
    "lostVPSalesApprovedC",
    "lostVPSalesApprovalDateC",
    "marketSegment1C",
    "subSegment1C",
    "productMarketingManagerDCLIdC",
    "productMarketingManagerDCLC",
    "validateEndCustomerC",
    "vpOfSalesId1C",
    "vpOfSalesC",
    "rmdclIdC",
    "rmdclc",
    "thirdPartyRep1IdC",
    "thirdPartyRep1C",
    "intgc",
    "dealRegID2C",
    "dealRegID1C",
    "endCustomerIdC",
    "endCustomerC",
    "selectDealDistiReportC",
    "selectDealRepReportC",
    "endCustomerCustomerTypeC",
    "endCustomerRegionC",
    "endCustomerStateC",
    "endCustomerCountryC",
    "endCustomerPartyIDC",
    "opportunityOwnerC",
    "revenuePlanCollectionC"
})
public class Opportunity {

    @XmlElementRef(name = "BudgetAvailableDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> budgetAvailableDate;
    @XmlElementRef(name = "BudgetedFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> budgetedFlag;
    @XmlElement(name = "PrimaryOrganizationId")
    protected Long primaryOrganizationId;
    @XmlElement(name = "ChampionFlag")
    protected Boolean championFlag;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElementRef(name = "SalesMethodId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesMethodId;
    @XmlElementRef(name = "SalesStageId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesStageId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customerAccountId;
    @XmlElementRef(name = "DealHorizonCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealHorizonCode;
    @XmlElementRef(name = "DealHorizonCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dealHorizonCodeSetId;
    @XmlElementRef(name = "DecisionLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> decisionLevelCode;
    @XmlElementRef(name = "DecisionLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> decisionLevelCodeSetId;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "OptyNumber")
    protected String optyNumber;
    @XmlElement(name = "OwnerResourcePartyId")
    protected Long ownerResourcePartyId;
    @XmlElementRef(name = "PrimaryCompetitorId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryCompetitorId;
    @XmlElementRef(name = "KeyContactId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> keyContactId;
    @XmlElementRef(name = "ReasonWonLostCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonWonLostCode;
    @XmlElementRef(name = "ReasonWonLostCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reasonWonLostCodeSetId;
    @XmlElementRef(name = "RiskLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskLevelCode;
    @XmlElementRef(name = "RiskLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevelCodeSetId;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "StatusCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> statusCodeSetId;
    @XmlElementRef(name = "StrategicLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strategicLevelCode;
    @XmlElementRef(name = "StrategicLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> strategicLevelCodeSetId;
    @XmlElementRef(name = "PrimaryRevenueId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryRevenueId;
    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetPartyId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElement(name = "TargetPartyName")
    protected String targetPartyName;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "SalesMethod", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesMethod;
    @XmlElement(name = "SalesMethodEOObjVerNumber")
    protected Integer salesMethodEOObjVerNumber;
    @XmlElement(name = "SalesStage")
    protected String salesStage;
    @XmlElementRef(name = "DescriptionText", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionText;
    @XmlElementRef(name = "AverageDaysAtStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> averageDaysAtStage;
    @XmlElementRef(name = "MaximumDaysInStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maximumDaysInStage;
    @XmlElement(name = "PhaseCd")
    protected String phaseCd;
    @XmlElement(name = "QuotaFactor")
    protected BigDecimal quotaFactor;
    @XmlElementRef(name = "RcmndWinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rcmndWinProb;
    @XmlElementRef(name = "StageStatusCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stageStatusCd;
    @XmlElement(name = "StgOrder")
    protected BigDecimal stgOrder;
    @XmlElement(name = "SalesStageEOObjVerNumber")
    protected Integer salesStageEOObjVerNumber;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "Revenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> revenue;
    @XmlElementRef(name = "RevenueType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revenueType;
    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "CurrentFyPotentialRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> currentFyPotentialRevenue;
    @XmlElementRef(name = "WinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> winProb;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElement(name = "PrimaryContactPartyName")
    protected String primaryContactPartyName;
    @XmlElement(name = "PrimaryContactPartyId")
    protected Long primaryContactPartyId;
    @XmlElementRef(name = "PrimaryContactFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryContactEmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactEmailAddress;
    @XmlElementRef(name = "AccountNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "BdgtAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> bdgtAmount;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElementRef(name = "PrSrcNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prSrcNumber;
    @XmlElementRef(name = "DownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> downsideAmount;
    @XmlElementRef(name = "UpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> upsideAmount;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "LastAssignedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedDate;
    @XmlElementRef(name = "LookupCategory", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lookupCategory;
    @XmlElementRef(name = "LookupValuesId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lookupValuesId;
    @XmlElementRef(name = "OptyCreationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> optyCreationDate;
    @XmlElementRef(name = "ExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> expectAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName;
    @XmlElementRef(name = "PrConRelationshipId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prConRelationshipId;
    @XmlElementRef(name = "OptyCreatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optyCreatedBy;
    @XmlElementRef(name = "CrmConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crmConversionRate;
    @XmlElementRef(name = "CrmRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crmRevenue;
    @XmlElementRef(name = "RevnLineSetEnabledFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> revnLineSetEnabledFlag;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElementRef(name = "OptyLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> optyLastUpdateDate;
    @XmlElementRef(name = "OptyLastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optyLastUpdatedBy;
    @XmlElementRef(name = "SalesChannelCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesChannelCd;
    @XmlElementRef(name = "LineOfBusinessCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineOfBusinessCode;
    @XmlElementRef(name = "PhonePreferenceExistsFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phonePreferenceExistsFlag;
    @XmlElementRef(name = "PartyUniqueName1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName1;
    @XmlElement(name = "PrimaryOrganizationName")
    protected String primaryOrganizationName;
    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesAccountId;
    @XmlElementRef(name = "SalesAccountUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountUniqueName;
    @XmlElementRef(name = "ConsumerFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerFirstName;
    @XmlElementRef(name = "ConsumerLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerLastName;
    @XmlElementRef(name = "PrimaryContactFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactFirstName;
    @XmlElementRef(name = "PrimaryContactLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactLastName;
    @XmlElement(name = "PrimaryPartnerOrgPartyName")
    protected String primaryPartnerOrgPartyName;
    @XmlElementRef(name = "PrimaryPartnerId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryPartnerId;
    @XmlElementRef(name = "RegistrationStatus", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "RegistrationType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationType;
    @XmlElementRef(name = "Registered", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registered;
    @XmlElementRef(name = "UpdateFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> updateFlag;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElement(name = "OpportunityContact")
    protected List<OpportunityContact> opportunityContact;
    @XmlElement(name = "ChildRevenue")
    protected List<Revenue> childRevenue;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElement(name = "OpportunityReference")
    protected List<OpportunityReference> opportunityReference;
    @XmlElement(name = "OpportunityCompetitor2")
    protected List<OpportunityCompetitor> opportunityCompetitor2;
    @XmlElement(name = "OpportunityCompetitor3")
    protected List<OpportunityCompetitor> opportunityCompetitor3;
    @XmlElement(name = "OpportunityResource")
    protected List<OpportunityResource> opportunityResource;
    @XmlElement(name = "OpportunitySource1")
    protected List<OpportunitySource> opportunitySource1;
    @XmlElement(name = "OpportunityLead")
    protected List<OpportunityLead> opportunityLead;
    @XmlElement(name = "OpportunityResponse")
    protected List<OpportunityResponse> opportunityResponse;
    @XmlElement(name = "RevenueTerritory")
    protected List<RevenueTerritory> revenueTerritory;
    @XmlElement(name = "RevenuePartnerPrimary")
    protected List<RevenuePartner> revenuePartnerPrimary;
    @XmlElement(name = "RevenueLineSet")
    protected List<RevenueLineSet> revenueLineSet;
    @XmlElement(name = "CategorySummaryRevenue")
    protected List<CategorySummaryRevenue> categorySummaryRevenue;
    @XmlElement(name = "Appointment")
    protected List<TransientAppointment> appointment;
    @XmlElement(name = "SplitRevenue")
    protected List<SplitRevenue> splitRevenue;
    @XmlElement(name = "RecurringRevenue")
    protected List<RecurringRevenue> recurringRevenue;
    @XmlElement(name = "OpportunityDeal")
    protected List<OpportunityDeal> opportunityDeal;
    @XmlElementRef(name = "ApprovalStatus_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvalStatusC;
    @XmlElementRef(name = "ParentEndCustomer_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> parentEndCustomerIdC;
    @XmlElementRef(name = "ParentEndCustomer_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentEndCustomerC;
    @XmlElement(name = "ReasonDescription_c")
    protected String reasonDescriptionC;
    @XmlElement(name = "Forecast_c")
    protected Boolean forecastC;
    @XmlElementRef(name = "MarketSegment_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSegmentC;
    @XmlElementRef(name = "SubSegment_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subSegmentC;
    @XmlElementRef(name = "Transferred_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferredC;
    @XmlElement(name = "EvalPartReceived_c")
    protected Boolean evalPartReceivedC;
    @XmlElement(name = "CustomerApprovedQuote_c")
    protected Boolean customerApprovedQuoteC;
    @XmlElement(name = "CompetitorInfo_c")
    protected String competitorInfoC;
    @XmlElementRef(name = "ThirdPartyRep_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirdPartyRepC;
    @XmlElement(name = "ProjectName_c")
    protected String projectNameC;
    @XmlElement(name = "ProjectDescription_c")
    protected String projectDescriptionC;
    @XmlElement(name = "ProjectStartDate_c")
    protected XMLGregorianCalendar projectStartDateC;
    @XmlElementRef(name = "SalesComment_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesCommentC;
    @XmlElementRef(name = "SelectDealRep1_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> selectDealRep1IdC;
    @XmlElementRef(name = "SelectDealRep1_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectDealRep1C;
    @XmlElement(name = "RiskChallenges_c")
    protected String riskChallengesC;
    @XmlElement(name = "CriticalActionItemsMilestones_c")
    protected String criticalActionItemsMilestonesC;
    @XmlElement(name = "HelpStatus_c")
    protected String helpStatusC;
    @XmlElement(name = "OpportunityType_c")
    protected String opportunityTypeC;
    @XmlElementRef(name = "ProductManagerComments_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productManagerCommentsC;
    @XmlElementRef(name = "SelectDealRep2_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> selectDealRep2IdC;
    @XmlElementRef(name = "SelectDealRep2_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectDealRep2C;
    @XmlElement(name = "EvalPartRequestedDate_c")
    protected XMLGregorianCalendar evalPartRequestedDateC;
    @XmlElement(name = "TargetDesignInDate_c")
    protected XMLGregorianCalendar targetDesignInDateC;
    @XmlElement(name = "TargetDesignWinDate_c")
    protected XMLGregorianCalendar targetDesignWinDateC;
    @XmlElement(name = "TargetProductionDate_c")
    protected XMLGregorianCalendar targetProductionDateC;
    @XmlElementRef(name = "EvaluationCompleteDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> evaluationCompleteDateC;
    @XmlElement(name = "ActualDesignInDate_c")
    protected XMLGregorianCalendar actualDesignInDateC;
    @XmlElement(name = "ActualDesignWinDate_c")
    protected XMLGregorianCalendar actualDesignWinDateC;
    @XmlElement(name = "ActualProductionStartDate_c")
    protected XMLGregorianCalendar actualProductionStartDateC;
    @XmlElement(name = "SubmitForApprovalForDesignIn_c")
    protected Boolean submitForApprovalForDesignInC;
    @XmlElementRef(name = "DesignInRegionalMgrApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designInRegionalMgrApprovedC;
    @XmlElementRef(name = "DesignInRegionalMgrApprovalDat_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> designInRegionalMgrApprovalDatC;
    @XmlElement(name = "SubmitForApprovalForDesignWin_c")
    protected Boolean submitForApprovalForDesignWinC;
    @XmlElementRef(name = "DesignWinRegionalMgrApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designWinRegionalMgrApprovedC;
    @XmlElementRef(name = "DesignWinRegionalMgrApprovalDa_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> designWinRegionalMgrApprovalDaC;
    @XmlElementRef(name = "DesignWinVPSalesApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designWinVPSalesApprovedC;
    @XmlElementRef(name = "DesignWinVPSalesApprovalDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> designWinVPSalesApprovalDateC;
    @XmlElementRef(name = "DesignWinMarketingApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designWinMarketingApprovedC;
    @XmlElementRef(name = "DesignWinMarketingApprovalDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> designWinMarketingApprovalDateC;
    @XmlElement(name = "SubmitForApprovalForMassProduc_c")
    protected Boolean submitForApprovalForMassProducC;
    @XmlElementRef(name = "MPVPSalesApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpvpSalesApprovedC;
    @XmlElementRef(name = "MPVPSalesApprovalDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mpvpSalesApprovalDateC;
    @XmlElement(name = "Reason_c")
    protected String reasonC;
    @XmlElementRef(name = "MarketingProbability_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> marketingProbabilityC;
    @XmlElementRef(name = "Application_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationC;
    @XmlElementRef(name = "Opportunity_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityC;
    @XmlElementRef(name = "OpportunityLifetimeYears_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> opportunityLifetimeYearsC;
    @XmlElementRef(name = "LifeTimeRevenue_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> lifeTimeRevenueC;
    @XmlElement(name = "HelpNeededFrom_c")
    protected String helpNeededFromC;
    @XmlElementRef(name = "DateOfHelpRequest_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfHelpRequestC;
    @XmlElement(name = "DealRegistration_c")
    protected Boolean dealRegistrationC;
    @XmlElementRef(name = "CustomerTypeScript_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerTypeScriptC;
    @XmlElement(name = "ClosedOrCancelledDate_c")
    protected XMLGregorianCalendar closedOrCancelledDateC;
    @XmlElementRef(name = "VPOfSalesName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesNameC;
    @XmlElementRef(name = "VPOfSalesEmail_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesEmailC;
    @XmlElementRef(name = "ProductMarketingManagerName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productMarketingManagerNameC;
    @XmlElementRef(name = "ProductMarketingManagerEmail_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productMarketingManagerEmailC;
    @XmlElementRef(name = "VPOfSalesId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesIdC;
    @XmlElementRef(name = "ProductMarketingManagerId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productMarketingManagerIdC;
    @XmlElementRef(name = "RegionalManagerName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerNameC;
    @XmlElementRef(name = "RegionalManagerEmail_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerEmailC;
    @XmlElementRef(name = "RegionalManagerId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionalManagerIdC;
    @XmlElementRef(name = "OwnerDCL_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ownerDCLIdC;
    @XmlElementRef(name = "OwnerDCL_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerDCLC;
    @XmlElement(name = "SubmitForApprovalForLost_c")
    protected Boolean submitForApprovalForLostC;
    @XmlElementRef(name = "LostVPSalesApproved_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lostVPSalesApprovedC;
    @XmlElementRef(name = "LostVPSalesApprovalDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lostVPSalesApprovalDateC;
    @XmlElement(name = "MarketSegment1_c")
    protected String marketSegment1C;
    @XmlElement(name = "SubSegment1_c")
    protected String subSegment1C;
    @XmlElementRef(name = "ProductMarketingManagerDCL_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> productMarketingManagerDCLIdC;
    @XmlElementRef(name = "ProductMarketingManagerDCL_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productMarketingManagerDCLC;
    @XmlElementRef(name = "ValidateEndCustomer_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validateEndCustomerC;
    @XmlElementRef(name = "VPOfSales_Id1_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vpOfSalesId1C;
    @XmlElementRef(name = "VPOfSales_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpOfSalesC;
    @XmlElementRef(name = "RMDCL_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rmdclIdC;
    @XmlElementRef(name = "RMDCL_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmdclc;
    @XmlElementRef(name = "ThirdPartyRep1_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> thirdPartyRep1IdC;
    @XmlElementRef(name = "ThirdPartyRep1_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirdPartyRep1C;
    @XmlElementRef(name = "INTG_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intgc;
    @XmlElementRef(name = "DealRegID2_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealRegID2C;
    @XmlElementRef(name = "DealRegID1_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealRegID1C;
    @XmlElement(name = "EndCustomer_Id_c")
    protected BigDecimal endCustomerIdC;
    @XmlElement(name = "EndCustomer_c")
    protected String endCustomerC;
    @XmlElementRef(name = "SelectDealDistiReport_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectDealDistiReportC;
    @XmlElementRef(name = "SelectDealRepReport_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectDealRepReportC;
    @XmlElementRef(name = "EndCustomerCustomerType_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerCustomerTypeC;
    @XmlElementRef(name = "EndCustomerRegion_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerRegionC;
    @XmlElementRef(name = "EndCustomerState_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerStateC;
    @XmlElementRef(name = "EndCustomerCountry_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerCountryC;
    @XmlElementRef(name = "EndCustomerPartyID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCustomerPartyIDC;
    @XmlElementRef(name = "OpportunityOwner_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityOwnerC;
    @XmlElement(name = "RevenuePlanCollection_c")
    protected List<RevenuePlanC> revenuePlanCollectionC;

    /**
     * Gets the value of the budgetAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBudgetAvailableDate() {
        return budgetAvailableDate;
    }

    /**
     * Sets the value of the budgetAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBudgetAvailableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.budgetAvailableDate = value;
    }

    /**
     * Gets the value of the budgetedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBudgetedFlag() {
        return budgetedFlag;
    }

    /**
     * Sets the value of the budgetedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBudgetedFlag(JAXBElement<Boolean> value) {
        this.budgetedFlag = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryOrganizationId(Long value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the championFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChampionFlag() {
        return championFlag;
    }

    /**
     * Sets the value of the championFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChampionFlag(Boolean value) {
        this.championFlag = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the salesMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesMethodId() {
        return salesMethodId;
    }

    /**
     * Sets the value of the salesMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesMethodId(JAXBElement<Long> value) {
        this.salesMethodId = value;
    }

    /**
     * Gets the value of the salesStageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesStageId() {
        return salesStageId;
    }

    /**
     * Sets the value of the salesStageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesStageId(JAXBElement<Long> value) {
        this.salesStageId = value;
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
     * Gets the value of the dealHorizonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealHorizonCode() {
        return dealHorizonCode;
    }

    /**
     * Sets the value of the dealHorizonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealHorizonCode(JAXBElement<String> value) {
        this.dealHorizonCode = value;
    }

    /**
     * Gets the value of the dealHorizonCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDealHorizonCodeSetId() {
        return dealHorizonCodeSetId;
    }

    /**
     * Sets the value of the dealHorizonCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDealHorizonCodeSetId(JAXBElement<Long> value) {
        this.dealHorizonCodeSetId = value;
    }

    /**
     * Gets the value of the decisionLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecisionLevelCode() {
        return decisionLevelCode;
    }

    /**
     * Sets the value of the decisionLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecisionLevelCode(JAXBElement<String> value) {
        this.decisionLevelCode = value;
    }

    /**
     * Gets the value of the decisionLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDecisionLevelCodeSetId() {
        return decisionLevelCodeSetId;
    }

    /**
     * Sets the value of the decisionLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDecisionLevelCodeSetId(JAXBElement<Long> value) {
        this.decisionLevelCodeSetId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyId(Long value) {
        this.optyId = value;
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
     * Gets the value of the ownerResourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerResourcePartyId() {
        return ownerResourcePartyId;
    }

    /**
     * Sets the value of the ownerResourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerResourcePartyId(Long value) {
        this.ownerResourcePartyId = value;
    }

    /**
     * Gets the value of the primaryCompetitorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryCompetitorId() {
        return primaryCompetitorId;
    }

    /**
     * Sets the value of the primaryCompetitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryCompetitorId(JAXBElement<Long> value) {
        this.primaryCompetitorId = value;
    }

    /**
     * Gets the value of the keyContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKeyContactId() {
        return keyContactId;
    }

    /**
     * Sets the value of the keyContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKeyContactId(JAXBElement<Long> value) {
        this.keyContactId = value;
    }

    /**
     * Gets the value of the reasonWonLostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonWonLostCode() {
        return reasonWonLostCode;
    }

    /**
     * Sets the value of the reasonWonLostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonWonLostCode(JAXBElement<String> value) {
        this.reasonWonLostCode = value;
    }

    /**
     * Gets the value of the reasonWonLostCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReasonWonLostCodeSetId() {
        return reasonWonLostCodeSetId;
    }

    /**
     * Sets the value of the reasonWonLostCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReasonWonLostCodeSetId(JAXBElement<Long> value) {
        this.reasonWonLostCodeSetId = value;
    }

    /**
     * Gets the value of the riskLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskLevelCode() {
        return riskLevelCode;
    }

    /**
     * Sets the value of the riskLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskLevelCode(JAXBElement<String> value) {
        this.riskLevelCode = value;
    }

    /**
     * Gets the value of the riskLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRiskLevelCodeSetId() {
        return riskLevelCodeSetId;
    }

    /**
     * Sets the value of the riskLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRiskLevelCodeSetId(JAXBElement<Long> value) {
        this.riskLevelCodeSetId = value;
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
     * Gets the value of the strategicLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrategicLevelCode() {
        return strategicLevelCode;
    }

    /**
     * Sets the value of the strategicLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrategicLevelCode(JAXBElement<String> value) {
        this.strategicLevelCode = value;
    }

    /**
     * Gets the value of the strategicLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStrategicLevelCodeSetId() {
        return strategicLevelCodeSetId;
    }

    /**
     * Sets the value of the strategicLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStrategicLevelCodeSetId(JAXBElement<Long> value) {
        this.strategicLevelCodeSetId = value;
    }

    /**
     * Gets the value of the primaryRevenueId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryRevenueId() {
        return primaryRevenueId;
    }

    /**
     * Sets the value of the primaryRevenueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryRevenueId(JAXBElement<Long> value) {
        this.primaryRevenueId = value;
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
     * Gets the value of the targetPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPartyName() {
        return targetPartyName;
    }

    /**
     * Sets the value of the targetPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPartyName(String value) {
        this.targetPartyName = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the salesMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesMethod() {
        return salesMethod;
    }

    /**
     * Sets the value of the salesMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesMethod(JAXBElement<String> value) {
        this.salesMethod = value;
    }

    /**
     * Gets the value of the salesMethodEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesMethodEOObjVerNumber() {
        return salesMethodEOObjVerNumber;
    }

    /**
     * Sets the value of the salesMethodEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesMethodEOObjVerNumber(Integer value) {
        this.salesMethodEOObjVerNumber = value;
    }

    /**
     * Gets the value of the salesStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesStage() {
        return salesStage;
    }

    /**
     * Sets the value of the salesStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesStage(String value) {
        this.salesStage = value;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionText(JAXBElement<String> value) {
        this.descriptionText = value;
    }

    /**
     * Gets the value of the averageDaysAtStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAverageDaysAtStage() {
        return averageDaysAtStage;
    }

    /**
     * Sets the value of the averageDaysAtStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAverageDaysAtStage(JAXBElement<Long> value) {
        this.averageDaysAtStage = value;
    }

    /**
     * Gets the value of the maximumDaysInStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaximumDaysInStage() {
        return maximumDaysInStage;
    }

    /**
     * Sets the value of the maximumDaysInStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaximumDaysInStage(JAXBElement<Long> value) {
        this.maximumDaysInStage = value;
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseCd(String value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the quotaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaFactor() {
        return quotaFactor;
    }

    /**
     * Sets the value of the quotaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaFactor(BigDecimal value) {
        this.quotaFactor = value;
    }

    /**
     * Gets the value of the rcmndWinProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRcmndWinProb() {
        return rcmndWinProb;
    }

    /**
     * Sets the value of the rcmndWinProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRcmndWinProb(JAXBElement<BigDecimal> value) {
        this.rcmndWinProb = value;
    }

    /**
     * Gets the value of the stageStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStageStatusCd() {
        return stageStatusCd;
    }

    /**
     * Sets the value of the stageStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStageStatusCd(JAXBElement<String> value) {
        this.stageStatusCd = value;
    }

    /**
     * Gets the value of the stgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStgOrder() {
        return stgOrder;
    }

    /**
     * Sets the value of the stgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStgOrder(BigDecimal value) {
        this.stgOrder = value;
    }

    /**
     * Gets the value of the salesStageEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesStageEOObjVerNumber() {
        return salesStageEOObjVerNumber;
    }

    /**
     * Sets the value of the salesStageEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesStageEOObjVerNumber(Integer value) {
        this.salesStageEOObjVerNumber = value;
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
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRevenue(JAXBElement<BigDecimal> value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevenueType(JAXBElement<String> value) {
        this.revenueType = value;
    }

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
     * Gets the value of the employeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Sets the value of the employeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeesTotal(JAXBElement<BigDecimal> value) {
        this.employeesTotal = value;
    }

    /**
     * Gets the value of the currentFyPotentialRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCurrentFyPotentialRevenue() {
        return currentFyPotentialRevenue;
    }

    /**
     * Sets the value of the currentFyPotentialRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCurrentFyPotentialRevenue(JAXBElement<BigDecimal> value) {
        this.currentFyPotentialRevenue = value;
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
     * Gets the value of the objectVersionNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber1() {
        return objectVersionNumber1;
    }

    /**
     * Sets the value of the objectVersionNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber1(Integer value) {
        this.objectVersionNumber1 = value;
    }

    /**
     * Gets the value of the primaryContactPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactPartyName() {
        return primaryContactPartyName;
    }

    /**
     * Sets the value of the primaryContactPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactPartyName(String value) {
        this.primaryContactPartyName = value;
    }

    /**
     * Gets the value of the primaryContactPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Sets the value of the primaryContactPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryContactPartyId(Long value) {
        this.primaryContactPartyId = value;
    }

    /**
     * Gets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFormattedPhoneNumber() {
        return primaryContactFormattedPhoneNumber;
    }

    /**
     * Sets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFormattedPhoneNumber(JAXBElement<String> value) {
        this.primaryContactFormattedPhoneNumber = value;
    }

    /**
     * Gets the value of the primaryContactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactEmailAddress() {
        return primaryContactEmailAddress;
    }

    /**
     * Sets the value of the primaryContactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactEmailAddress(JAXBElement<String> value) {
        this.primaryContactEmailAddress = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
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
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the bdgtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBdgtAmount() {
        return bdgtAmount;
    }

    /**
     * Sets the value of the bdgtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBdgtAmount(JAXBElement<AmountType> value) {
        this.bdgtAmount = value;
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
     * Gets the value of the prSrcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrSrcNumber() {
        return prSrcNumber;
    }

    /**
     * Sets the value of the prSrcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrSrcNumber(JAXBElement<String> value) {
        this.prSrcNumber = value;
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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the lastAssignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignedDate() {
        return lastAssignedDate;
    }

    /**
     * Sets the value of the lastAssignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignedDate = value;
    }

    /**
     * Gets the value of the lookupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLookupCategory() {
        return lookupCategory;
    }

    /**
     * Sets the value of the lookupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLookupCategory(JAXBElement<String> value) {
        this.lookupCategory = value;
    }

    /**
     * Gets the value of the lookupValuesId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLookupValuesId() {
        return lookupValuesId;
    }

    /**
     * Sets the value of the lookupValuesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLookupValuesId(JAXBElement<Long> value) {
        this.lookupValuesId = value;
    }

    /**
     * Gets the value of the optyCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyCreationDate() {
        return optyCreationDate;
    }

    /**
     * Sets the value of the optyCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyCreationDate = value;
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
     * Gets the value of the preferredFunctionalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    /**
     * Sets the value of the preferredFunctionalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFunctionalCurrency(JAXBElement<String> value) {
        this.preferredFunctionalCurrency = value;
    }

    /**
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName(JAXBElement<String> value) {
        this.partyUniqueName = value;
    }

    /**
     * Gets the value of the prConRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrConRelationshipId() {
        return prConRelationshipId;
    }

    /**
     * Sets the value of the prConRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrConRelationshipId(JAXBElement<Long> value) {
        this.prConRelationshipId = value;
    }

    /**
     * Gets the value of the optyCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyCreatedBy() {
        return optyCreatedBy;
    }

    /**
     * Sets the value of the optyCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyCreatedBy(JAXBElement<String> value) {
        this.optyCreatedBy = value;
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
     * Gets the value of the crmRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmRevenue() {
        return crmRevenue;
    }

    /**
     * Sets the value of the crmRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmRevenue(JAXBElement<BigDecimal> value) {
        this.crmRevenue = value;
    }

    /**
     * Gets the value of the revnLineSetEnabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRevnLineSetEnabledFlag() {
        return revnLineSetEnabledFlag;
    }

    /**
     * Sets the value of the revnLineSetEnabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRevnLineSetEnabledFlag(JAXBElement<Boolean> value) {
        this.revnLineSetEnabledFlag = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the optyLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyLastUpdateDate() {
        return optyLastUpdateDate;
    }

    /**
     * Sets the value of the optyLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyLastUpdateDate = value;
    }

    /**
     * Gets the value of the optyLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyLastUpdatedBy() {
        return optyLastUpdatedBy;
    }

    /**
     * Sets the value of the optyLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyLastUpdatedBy(JAXBElement<String> value) {
        this.optyLastUpdatedBy = value;
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
     * Gets the value of the lineOfBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }

    /**
     * Sets the value of the lineOfBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusinessCode(JAXBElement<String> value) {
        this.lineOfBusinessCode = value;
    }

    /**
     * Gets the value of the phonePreferenceExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhonePreferenceExistsFlag() {
        return phonePreferenceExistsFlag;
    }

    /**
     * Sets the value of the phonePreferenceExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhonePreferenceExistsFlag(JAXBElement<Boolean> value) {
        this.phonePreferenceExistsFlag = value;
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
     * Gets the value of the primaryOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationName() {
        return primaryOrganizationName;
    }

    /**
     * Sets the value of the primaryOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationName(String value) {
        this.primaryOrganizationName = value;
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
     * Gets the value of the consumerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerFirstName() {
        return consumerFirstName;
    }

    /**
     * Sets the value of the consumerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerFirstName(JAXBElement<String> value) {
        this.consumerFirstName = value;
    }

    /**
     * Gets the value of the consumerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerLastName() {
        return consumerLastName;
    }

    /**
     * Sets the value of the consumerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerLastName(JAXBElement<String> value) {
        this.consumerLastName = value;
    }

    /**
     * Gets the value of the primaryContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFirstName() {
        return primaryContactFirstName;
    }

    /**
     * Sets the value of the primaryContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFirstName(JAXBElement<String> value) {
        this.primaryContactFirstName = value;
    }

    /**
     * Gets the value of the primaryContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactLastName() {
        return primaryContactLastName;
    }

    /**
     * Sets the value of the primaryContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactLastName(JAXBElement<String> value) {
        this.primaryContactLastName = value;
    }

    /**
     * Gets the value of the primaryPartnerOrgPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPartnerOrgPartyName() {
        return primaryPartnerOrgPartyName;
    }

    /**
     * Sets the value of the primaryPartnerOrgPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPartnerOrgPartyName(String value) {
        this.primaryPartnerOrgPartyName = value;
    }

    /**
     * Gets the value of the primaryPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryPartnerId() {
        return primaryPartnerId;
    }

    /**
     * Sets the value of the primaryPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryPartnerId(JAXBElement<Long> value) {
        this.primaryPartnerId = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatus(JAXBElement<String> value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationType(JAXBElement<String> value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistered(JAXBElement<String> value) {
        this.registered = value;
    }

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUpdateFlag(JAXBElement<Boolean> value) {
        this.updateFlag = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = value;
    }

    /**
     * Gets the value of the opportunityContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityContact }
     * 
     * 
     */
    public List<OpportunityContact> getOpportunityContact() {
        if (opportunityContact == null) {
            opportunityContact = new ArrayList<OpportunityContact>();
        }
        return this.opportunityContact;
    }

    /**
     * Gets the value of the childRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revenue }
     * 
     * 
     */
    public List<Revenue> getChildRevenue() {
        if (childRevenue == null) {
            childRevenue = new ArrayList<Revenue>();
        }
        return this.childRevenue;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the opportunityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityReference }
     * 
     * 
     */
    public List<OpportunityReference> getOpportunityReference() {
        if (opportunityReference == null) {
            opportunityReference = new ArrayList<OpportunityReference>();
        }
        return this.opportunityReference;
    }

    /**
     * Gets the value of the opportunityCompetitor2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor2() {
        if (opportunityCompetitor2 == null) {
            opportunityCompetitor2 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor2;
    }

    /**
     * Gets the value of the opportunityCompetitor3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor3() {
        if (opportunityCompetitor3 == null) {
            opportunityCompetitor3 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor3;
    }

    /**
     * Gets the value of the opportunityResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResource }
     * 
     * 
     */
    public List<OpportunityResource> getOpportunityResource() {
        if (opportunityResource == null) {
            opportunityResource = new ArrayList<OpportunityResource>();
        }
        return this.opportunityResource;
    }

    /**
     * Gets the value of the opportunitySource1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunitySource1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunitySource1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunitySource }
     * 
     * 
     */
    public List<OpportunitySource> getOpportunitySource1() {
        if (opportunitySource1 == null) {
            opportunitySource1 = new ArrayList<OpportunitySource>();
        }
        return this.opportunitySource1;
    }

    /**
     * Gets the value of the opportunityLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityLead }
     * 
     * 
     */
    public List<OpportunityLead> getOpportunityLead() {
        if (opportunityLead == null) {
            opportunityLead = new ArrayList<OpportunityLead>();
        }
        return this.opportunityLead;
    }

    /**
     * Gets the value of the opportunityResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResponse }
     * 
     * 
     */
    public List<OpportunityResponse> getOpportunityResponse() {
        if (opportunityResponse == null) {
            opportunityResponse = new ArrayList<OpportunityResponse>();
        }
        return this.opportunityResponse;
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
     * Gets the value of the revenuePartnerPrimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenuePartnerPrimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenuePartnerPrimary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenuePartner }
     * 
     * 
     */
    public List<RevenuePartner> getRevenuePartnerPrimary() {
        if (revenuePartnerPrimary == null) {
            revenuePartnerPrimary = new ArrayList<RevenuePartner>();
        }
        return this.revenuePartnerPrimary;
    }

    /**
     * Gets the value of the revenueLineSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueLineSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueLineSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueLineSet }
     * 
     * 
     */
    public List<RevenueLineSet> getRevenueLineSet() {
        if (revenueLineSet == null) {
            revenueLineSet = new ArrayList<RevenueLineSet>();
        }
        return this.revenueLineSet;
    }

    /**
     * Gets the value of the categorySummaryRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySummaryRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySummaryRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySummaryRevenue }
     * 
     * 
     */
    public List<CategorySummaryRevenue> getCategorySummaryRevenue() {
        if (categorySummaryRevenue == null) {
            categorySummaryRevenue = new ArrayList<CategorySummaryRevenue>();
        }
        return this.categorySummaryRevenue;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientAppointment }
     * 
     * 
     */
    public List<TransientAppointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<TransientAppointment>();
        }
        return this.appointment;
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
     * Gets the value of the opportunityDeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityDeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityDeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityDeal }
     * 
     * 
     */
    public List<OpportunityDeal> getOpportunityDeal() {
        if (opportunityDeal == null) {
            opportunityDeal = new ArrayList<OpportunityDeal>();
        }
        return this.opportunityDeal;
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
     * Gets the value of the parentEndCustomerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getParentEndCustomerIdC() {
        return parentEndCustomerIdC;
    }

    /**
     * Sets the value of the parentEndCustomerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setParentEndCustomerIdC(JAXBElement<BigDecimal> value) {
        this.parentEndCustomerIdC = value;
    }

    /**
     * Gets the value of the parentEndCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentEndCustomerC() {
        return parentEndCustomerC;
    }

    /**
     * Sets the value of the parentEndCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentEndCustomerC(JAXBElement<String> value) {
        this.parentEndCustomerC = value;
    }

    /**
     * Gets the value of the reasonDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonDescriptionC() {
        return reasonDescriptionC;
    }

    /**
     * Sets the value of the reasonDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonDescriptionC(String value) {
        this.reasonDescriptionC = value;
    }

    /**
     * Gets the value of the forecastC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastC() {
        return forecastC;
    }

    /**
     * Sets the value of the forecastC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastC(Boolean value) {
        this.forecastC = value;
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
     * Gets the value of the subSegmentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubSegmentC() {
        return subSegmentC;
    }

    /**
     * Sets the value of the subSegmentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubSegmentC(JAXBElement<String> value) {
        this.subSegmentC = value;
    }

    /**
     * Gets the value of the transferredC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferredC() {
        return transferredC;
    }

    /**
     * Sets the value of the transferredC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferredC(JAXBElement<String> value) {
        this.transferredC = value;
    }

    /**
     * Gets the value of the evalPartReceivedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvalPartReceivedC() {
        return evalPartReceivedC;
    }

    /**
     * Sets the value of the evalPartReceivedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvalPartReceivedC(Boolean value) {
        this.evalPartReceivedC = value;
    }

    /**
     * Gets the value of the customerApprovedQuoteC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerApprovedQuoteC() {
        return customerApprovedQuoteC;
    }

    /**
     * Sets the value of the customerApprovedQuoteC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerApprovedQuoteC(Boolean value) {
        this.customerApprovedQuoteC = value;
    }

    /**
     * Gets the value of the competitorInfoC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitorInfoC() {
        return competitorInfoC;
    }

    /**
     * Sets the value of the competitorInfoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitorInfoC(String value) {
        this.competitorInfoC = value;
    }

    /**
     * Gets the value of the thirdPartyRepC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirdPartyRepC() {
        return thirdPartyRepC;
    }

    /**
     * Sets the value of the thirdPartyRepC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirdPartyRepC(JAXBElement<String> value) {
        this.thirdPartyRepC = value;
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
     * Gets the value of the projectDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectDescriptionC() {
        return projectDescriptionC;
    }

    /**
     * Sets the value of the projectDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectDescriptionC(String value) {
        this.projectDescriptionC = value;
    }

    /**
     * Gets the value of the projectStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectStartDateC() {
        return projectStartDateC;
    }

    /**
     * Sets the value of the projectStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectStartDateC(XMLGregorianCalendar value) {
        this.projectStartDateC = value;
    }

    /**
     * Gets the value of the salesCommentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesCommentC() {
        return salesCommentC;
    }

    /**
     * Sets the value of the salesCommentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesCommentC(JAXBElement<String> value) {
        this.salesCommentC = value;
    }

    /**
     * Gets the value of the selectDealRep1IdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSelectDealRep1IdC() {
        return selectDealRep1IdC;
    }

    /**
     * Sets the value of the selectDealRep1IdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSelectDealRep1IdC(JAXBElement<BigDecimal> value) {
        this.selectDealRep1IdC = value;
    }

    /**
     * Gets the value of the selectDealRep1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectDealRep1C() {
        return selectDealRep1C;
    }

    /**
     * Sets the value of the selectDealRep1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectDealRep1C(JAXBElement<String> value) {
        this.selectDealRep1C = value;
    }

    /**
     * Gets the value of the riskChallengesC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskChallengesC() {
        return riskChallengesC;
    }

    /**
     * Sets the value of the riskChallengesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskChallengesC(String value) {
        this.riskChallengesC = value;
    }

    /**
     * Gets the value of the criticalActionItemsMilestonesC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriticalActionItemsMilestonesC() {
        return criticalActionItemsMilestonesC;
    }

    /**
     * Sets the value of the criticalActionItemsMilestonesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriticalActionItemsMilestonesC(String value) {
        this.criticalActionItemsMilestonesC = value;
    }

    /**
     * Gets the value of the helpStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpStatusC() {
        return helpStatusC;
    }

    /**
     * Sets the value of the helpStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpStatusC(String value) {
        this.helpStatusC = value;
    }

    /**
     * Gets the value of the opportunityTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityTypeC() {
        return opportunityTypeC;
    }

    /**
     * Sets the value of the opportunityTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityTypeC(String value) {
        this.opportunityTypeC = value;
    }

    /**
     * Gets the value of the productManagerCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductManagerCommentsC() {
        return productManagerCommentsC;
    }

    /**
     * Sets the value of the productManagerCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductManagerCommentsC(JAXBElement<String> value) {
        this.productManagerCommentsC = value;
    }

    /**
     * Gets the value of the selectDealRep2IdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSelectDealRep2IdC() {
        return selectDealRep2IdC;
    }

    /**
     * Sets the value of the selectDealRep2IdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSelectDealRep2IdC(JAXBElement<BigDecimal> value) {
        this.selectDealRep2IdC = value;
    }

    /**
     * Gets the value of the selectDealRep2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectDealRep2C() {
        return selectDealRep2C;
    }

    /**
     * Sets the value of the selectDealRep2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectDealRep2C(JAXBElement<String> value) {
        this.selectDealRep2C = value;
    }

    /**
     * Gets the value of the evalPartRequestedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvalPartRequestedDateC() {
        return evalPartRequestedDateC;
    }

    /**
     * Sets the value of the evalPartRequestedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvalPartRequestedDateC(XMLGregorianCalendar value) {
        this.evalPartRequestedDateC = value;
    }

    /**
     * Gets the value of the targetDesignInDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDesignInDateC() {
        return targetDesignInDateC;
    }

    /**
     * Sets the value of the targetDesignInDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDesignInDateC(XMLGregorianCalendar value) {
        this.targetDesignInDateC = value;
    }

    /**
     * Gets the value of the targetDesignWinDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetDesignWinDateC() {
        return targetDesignWinDateC;
    }

    /**
     * Sets the value of the targetDesignWinDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetDesignWinDateC(XMLGregorianCalendar value) {
        this.targetDesignWinDateC = value;
    }

    /**
     * Gets the value of the targetProductionDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetProductionDateC() {
        return targetProductionDateC;
    }

    /**
     * Sets the value of the targetProductionDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetProductionDateC(XMLGregorianCalendar value) {
        this.targetProductionDateC = value;
    }

    /**
     * Gets the value of the evaluationCompleteDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEvaluationCompleteDateC() {
        return evaluationCompleteDateC;
    }

    /**
     * Sets the value of the evaluationCompleteDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEvaluationCompleteDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.evaluationCompleteDateC = value;
    }

    /**
     * Gets the value of the actualDesignInDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDesignInDateC() {
        return actualDesignInDateC;
    }

    /**
     * Sets the value of the actualDesignInDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDesignInDateC(XMLGregorianCalendar value) {
        this.actualDesignInDateC = value;
    }

    /**
     * Gets the value of the actualDesignWinDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDesignWinDateC() {
        return actualDesignWinDateC;
    }

    /**
     * Sets the value of the actualDesignWinDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDesignWinDateC(XMLGregorianCalendar value) {
        this.actualDesignWinDateC = value;
    }

    /**
     * Gets the value of the actualProductionStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualProductionStartDateC() {
        return actualProductionStartDateC;
    }

    /**
     * Sets the value of the actualProductionStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualProductionStartDateC(XMLGregorianCalendar value) {
        this.actualProductionStartDateC = value;
    }

    /**
     * Gets the value of the submitForApprovalForDesignInC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApprovalForDesignInC() {
        return submitForApprovalForDesignInC;
    }

    /**
     * Sets the value of the submitForApprovalForDesignInC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApprovalForDesignInC(Boolean value) {
        this.submitForApprovalForDesignInC = value;
    }

    /**
     * Gets the value of the designInRegionalMgrApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignInRegionalMgrApprovedC() {
        return designInRegionalMgrApprovedC;
    }

    /**
     * Sets the value of the designInRegionalMgrApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignInRegionalMgrApprovedC(JAXBElement<String> value) {
        this.designInRegionalMgrApprovedC = value;
    }

    /**
     * Gets the value of the designInRegionalMgrApprovalDatC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDesignInRegionalMgrApprovalDatC() {
        return designInRegionalMgrApprovalDatC;
    }

    /**
     * Sets the value of the designInRegionalMgrApprovalDatC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDesignInRegionalMgrApprovalDatC(JAXBElement<XMLGregorianCalendar> value) {
        this.designInRegionalMgrApprovalDatC = value;
    }

    /**
     * Gets the value of the submitForApprovalForDesignWinC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApprovalForDesignWinC() {
        return submitForApprovalForDesignWinC;
    }

    /**
     * Sets the value of the submitForApprovalForDesignWinC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApprovalForDesignWinC(Boolean value) {
        this.submitForApprovalForDesignWinC = value;
    }

    /**
     * Gets the value of the designWinRegionalMgrApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignWinRegionalMgrApprovedC() {
        return designWinRegionalMgrApprovedC;
    }

    /**
     * Sets the value of the designWinRegionalMgrApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignWinRegionalMgrApprovedC(JAXBElement<String> value) {
        this.designWinRegionalMgrApprovedC = value;
    }

    /**
     * Gets the value of the designWinRegionalMgrApprovalDaC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDesignWinRegionalMgrApprovalDaC() {
        return designWinRegionalMgrApprovalDaC;
    }

    /**
     * Sets the value of the designWinRegionalMgrApprovalDaC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDesignWinRegionalMgrApprovalDaC(JAXBElement<XMLGregorianCalendar> value) {
        this.designWinRegionalMgrApprovalDaC = value;
    }

    /**
     * Gets the value of the designWinVPSalesApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignWinVPSalesApprovedC() {
        return designWinVPSalesApprovedC;
    }

    /**
     * Sets the value of the designWinVPSalesApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignWinVPSalesApprovedC(JAXBElement<String> value) {
        this.designWinVPSalesApprovedC = value;
    }

    /**
     * Gets the value of the designWinVPSalesApprovalDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDesignWinVPSalesApprovalDateC() {
        return designWinVPSalesApprovalDateC;
    }

    /**
     * Sets the value of the designWinVPSalesApprovalDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDesignWinVPSalesApprovalDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.designWinVPSalesApprovalDateC = value;
    }

    /**
     * Gets the value of the designWinMarketingApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignWinMarketingApprovedC() {
        return designWinMarketingApprovedC;
    }

    /**
     * Sets the value of the designWinMarketingApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignWinMarketingApprovedC(JAXBElement<String> value) {
        this.designWinMarketingApprovedC = value;
    }

    /**
     * Gets the value of the designWinMarketingApprovalDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDesignWinMarketingApprovalDateC() {
        return designWinMarketingApprovalDateC;
    }

    /**
     * Sets the value of the designWinMarketingApprovalDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDesignWinMarketingApprovalDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.designWinMarketingApprovalDateC = value;
    }

    /**
     * Gets the value of the submitForApprovalForMassProducC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApprovalForMassProducC() {
        return submitForApprovalForMassProducC;
    }

    /**
     * Sets the value of the submitForApprovalForMassProducC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApprovalForMassProducC(Boolean value) {
        this.submitForApprovalForMassProducC = value;
    }

    /**
     * Gets the value of the mpvpSalesApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPVPSalesApprovedC() {
        return mpvpSalesApprovedC;
    }

    /**
     * Sets the value of the mpvpSalesApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPVPSalesApprovedC(JAXBElement<String> value) {
        this.mpvpSalesApprovedC = value;
    }

    /**
     * Gets the value of the mpvpSalesApprovalDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMPVPSalesApprovalDateC() {
        return mpvpSalesApprovalDateC;
    }

    /**
     * Sets the value of the mpvpSalesApprovalDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMPVPSalesApprovalDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.mpvpSalesApprovalDateC = value;
    }

    /**
     * Gets the value of the reasonC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonC() {
        return reasonC;
    }

    /**
     * Sets the value of the reasonC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonC(String value) {
        this.reasonC = value;
    }

    /**
     * Gets the value of the marketingProbabilityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMarketingProbabilityC() {
        return marketingProbabilityC;
    }

    /**
     * Sets the value of the marketingProbabilityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMarketingProbabilityC(JAXBElement<BigDecimal> value) {
        this.marketingProbabilityC = value;
    }

    /**
     * Gets the value of the applicationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationC() {
        return applicationC;
    }

    /**
     * Sets the value of the applicationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationC(JAXBElement<String> value) {
        this.applicationC = value;
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
     * Gets the value of the opportunityLifetimeYearsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOpportunityLifetimeYearsC() {
        return opportunityLifetimeYearsC;
    }

    /**
     * Sets the value of the opportunityLifetimeYearsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOpportunityLifetimeYearsC(JAXBElement<BigDecimal> value) {
        this.opportunityLifetimeYearsC = value;
    }

    /**
     * Gets the value of the lifeTimeRevenueC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getLifeTimeRevenueC() {
        return lifeTimeRevenueC;
    }

    /**
     * Sets the value of the lifeTimeRevenueC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setLifeTimeRevenueC(JAXBElement<AmountType> value) {
        this.lifeTimeRevenueC = value;
    }

    /**
     * Gets the value of the helpNeededFromC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpNeededFromC() {
        return helpNeededFromC;
    }

    /**
     * Sets the value of the helpNeededFromC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpNeededFromC(String value) {
        this.helpNeededFromC = value;
    }

    /**
     * Gets the value of the dateOfHelpRequestC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfHelpRequestC() {
        return dateOfHelpRequestC;
    }

    /**
     * Sets the value of the dateOfHelpRequestC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfHelpRequestC(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfHelpRequestC = value;
    }

    /**
     * Gets the value of the dealRegistrationC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDealRegistrationC() {
        return dealRegistrationC;
    }

    /**
     * Sets the value of the dealRegistrationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDealRegistrationC(Boolean value) {
        this.dealRegistrationC = value;
    }

    /**
     * Gets the value of the customerTypeScriptC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerTypeScriptC() {
        return customerTypeScriptC;
    }

    /**
     * Sets the value of the customerTypeScriptC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerTypeScriptC(JAXBElement<String> value) {
        this.customerTypeScriptC = value;
    }

    /**
     * Gets the value of the closedOrCancelledDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedOrCancelledDateC() {
        return closedOrCancelledDateC;
    }

    /**
     * Sets the value of the closedOrCancelledDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedOrCancelledDateC(XMLGregorianCalendar value) {
        this.closedOrCancelledDateC = value;
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
     * Gets the value of the productMarketingManagerNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductMarketingManagerNameC() {
        return productMarketingManagerNameC;
    }

    /**
     * Sets the value of the productMarketingManagerNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductMarketingManagerNameC(JAXBElement<String> value) {
        this.productMarketingManagerNameC = value;
    }

    /**
     * Gets the value of the productMarketingManagerEmailC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductMarketingManagerEmailC() {
        return productMarketingManagerEmailC;
    }

    /**
     * Sets the value of the productMarketingManagerEmailC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductMarketingManagerEmailC(JAXBElement<String> value) {
        this.productMarketingManagerEmailC = value;
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
     * Gets the value of the productMarketingManagerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductMarketingManagerIdC() {
        return productMarketingManagerIdC;
    }

    /**
     * Sets the value of the productMarketingManagerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductMarketingManagerIdC(JAXBElement<String> value) {
        this.productMarketingManagerIdC = value;
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
     * Gets the value of the ownerDCLIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOwnerDCLIdC() {
        return ownerDCLIdC;
    }

    /**
     * Sets the value of the ownerDCLIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOwnerDCLIdC(JAXBElement<BigDecimal> value) {
        this.ownerDCLIdC = value;
    }

    /**
     * Gets the value of the ownerDCLC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerDCLC() {
        return ownerDCLC;
    }

    /**
     * Sets the value of the ownerDCLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerDCLC(JAXBElement<String> value) {
        this.ownerDCLC = value;
    }

    /**
     * Gets the value of the submitForApprovalForLostC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApprovalForLostC() {
        return submitForApprovalForLostC;
    }

    /**
     * Sets the value of the submitForApprovalForLostC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApprovalForLostC(Boolean value) {
        this.submitForApprovalForLostC = value;
    }

    /**
     * Gets the value of the lostVPSalesApprovedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLostVPSalesApprovedC() {
        return lostVPSalesApprovedC;
    }

    /**
     * Sets the value of the lostVPSalesApprovedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLostVPSalesApprovedC(JAXBElement<String> value) {
        this.lostVPSalesApprovedC = value;
    }

    /**
     * Gets the value of the lostVPSalesApprovalDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLostVPSalesApprovalDateC() {
        return lostVPSalesApprovalDateC;
    }

    /**
     * Sets the value of the lostVPSalesApprovalDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLostVPSalesApprovalDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.lostVPSalesApprovalDateC = value;
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
     * Gets the value of the subSegment1C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSegment1C() {
        return subSegment1C;
    }

    /**
     * Sets the value of the subSegment1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSegment1C(String value) {
        this.subSegment1C = value;
    }

    /**
     * Gets the value of the productMarketingManagerDCLIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProductMarketingManagerDCLIdC() {
        return productMarketingManagerDCLIdC;
    }

    /**
     * Sets the value of the productMarketingManagerDCLIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProductMarketingManagerDCLIdC(JAXBElement<BigDecimal> value) {
        this.productMarketingManagerDCLIdC = value;
    }

    /**
     * Gets the value of the productMarketingManagerDCLC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductMarketingManagerDCLC() {
        return productMarketingManagerDCLC;
    }

    /**
     * Sets the value of the productMarketingManagerDCLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductMarketingManagerDCLC(JAXBElement<String> value) {
        this.productMarketingManagerDCLC = value;
    }

    /**
     * Gets the value of the validateEndCustomerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidateEndCustomerC() {
        return validateEndCustomerC;
    }

    /**
     * Sets the value of the validateEndCustomerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidateEndCustomerC(JAXBElement<String> value) {
        this.validateEndCustomerC = value;
    }

    /**
     * Gets the value of the vpOfSalesId1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVPOfSalesId1C() {
        return vpOfSalesId1C;
    }

    /**
     * Sets the value of the vpOfSalesId1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVPOfSalesId1C(JAXBElement<BigDecimal> value) {
        this.vpOfSalesId1C = value;
    }

    /**
     * Gets the value of the vpOfSalesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVPOfSalesC() {
        return vpOfSalesC;
    }

    /**
     * Sets the value of the vpOfSalesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVPOfSalesC(JAXBElement<String> value) {
        this.vpOfSalesC = value;
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
     * Gets the value of the thirdPartyRep1IdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getThirdPartyRep1IdC() {
        return thirdPartyRep1IdC;
    }

    /**
     * Sets the value of the thirdPartyRep1IdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setThirdPartyRep1IdC(JAXBElement<BigDecimal> value) {
        this.thirdPartyRep1IdC = value;
    }

    /**
     * Gets the value of the thirdPartyRep1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirdPartyRep1C() {
        return thirdPartyRep1C;
    }

    /**
     * Sets the value of the thirdPartyRep1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirdPartyRep1C(JAXBElement<String> value) {
        this.thirdPartyRep1C = value;
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
     * Gets the value of the dealRegID2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealRegID2C() {
        return dealRegID2C;
    }

    /**
     * Sets the value of the dealRegID2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealRegID2C(JAXBElement<String> value) {
        this.dealRegID2C = value;
    }

    /**
     * Gets the value of the dealRegID1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealRegID1C() {
        return dealRegID1C;
    }

    /**
     * Sets the value of the dealRegID1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealRegID1C(JAXBElement<String> value) {
        this.dealRegID1C = value;
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
     * Gets the value of the selectDealDistiReportC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectDealDistiReportC() {
        return selectDealDistiReportC;
    }

    /**
     * Sets the value of the selectDealDistiReportC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectDealDistiReportC(JAXBElement<String> value) {
        this.selectDealDistiReportC = value;
    }

    /**
     * Gets the value of the selectDealRepReportC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectDealRepReportC() {
        return selectDealRepReportC;
    }

    /**
     * Sets the value of the selectDealRepReportC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectDealRepReportC(JAXBElement<String> value) {
        this.selectDealRepReportC = value;
    }

    /**
     * Gets the value of the endCustomerCustomerTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerCustomerTypeC() {
        return endCustomerCustomerTypeC;
    }

    /**
     * Sets the value of the endCustomerCustomerTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerCustomerTypeC(JAXBElement<String> value) {
        this.endCustomerCustomerTypeC = value;
    }

    /**
     * Gets the value of the endCustomerRegionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerRegionC() {
        return endCustomerRegionC;
    }

    /**
     * Sets the value of the endCustomerRegionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerRegionC(JAXBElement<String> value) {
        this.endCustomerRegionC = value;
    }

    /**
     * Gets the value of the endCustomerStateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerStateC() {
        return endCustomerStateC;
    }

    /**
     * Sets the value of the endCustomerStateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerStateC(JAXBElement<String> value) {
        this.endCustomerStateC = value;
    }

    /**
     * Gets the value of the endCustomerCountryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerCountryC() {
        return endCustomerCountryC;
    }

    /**
     * Sets the value of the endCustomerCountryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerCountryC(JAXBElement<String> value) {
        this.endCustomerCountryC = value;
    }

    /**
     * Gets the value of the endCustomerPartyIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCustomerPartyIDC() {
        return endCustomerPartyIDC;
    }

    /**
     * Sets the value of the endCustomerPartyIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCustomerPartyIDC(JAXBElement<String> value) {
        this.endCustomerPartyIDC = value;
    }

    /**
     * Gets the value of the opportunityOwnerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityOwnerC() {
        return opportunityOwnerC;
    }

    /**
     * Sets the value of the opportunityOwnerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityOwnerC(JAXBElement<String> value) {
        this.opportunityOwnerC = value;
    }

    /**
     * Gets the value of the revenuePlanCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenuePlanCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenuePlanCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenuePlanC }
     * 
     * 
     */
    public List<RevenuePlanC> getRevenuePlanCollectionC() {
        if (revenuePlanCollectionC == null) {
            revenuePlanCollectionC = new ArrayList<RevenuePlanC>();
        }
        return this.revenuePlanCollectionC;
    }

}
