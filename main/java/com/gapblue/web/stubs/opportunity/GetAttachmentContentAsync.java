
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
 *         &lt;element name="getParameters" type="{http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/}CommonAttachments"/>
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
    "getParameters"
})
@XmlRootElement(name = "getAttachmentContentAsync")
public class GetAttachmentContentAsync {

    @XmlElement(required = true)
    protected CommonAttachments getParameters;

    /**
     * Gets the value of the getParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CommonAttachments }
     *     
     */
    public CommonAttachments getGetParameters() {
        return getParameters;
    }

    /**
     * Sets the value of the getParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonAttachments }
     *     
     */
    public void setGetParameters(CommonAttachments value) {
        this.getParameters = value;
    }

}
