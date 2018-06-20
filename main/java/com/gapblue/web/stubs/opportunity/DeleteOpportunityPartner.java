
package com.gapblue.web.stubs.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opportunityPartnerVO" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenuePartner"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opportunityPartnerVO"
})
@XmlRootElement(name = "deleteOpportunityPartner")
public class DeleteOpportunityPartner {

    @XmlElement(required = true)
    protected RevenuePartner opportunityPartnerVO;

    /**
     * Gets the value of the opportunityPartnerVO property.
     * 
     * @return
     *     possible object is
     *     {@link RevenuePartner }
     *     
     */
    public RevenuePartner getOpportunityPartnerVO() {
        return opportunityPartnerVO;
    }

    /**
     * Sets the value of the opportunityPartnerVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenuePartner }
     *     
     */
    public void setOpportunityPartnerVO(RevenuePartner value) {
        this.opportunityPartnerVO = value;
    }

}
