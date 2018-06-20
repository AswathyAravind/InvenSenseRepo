
package com.gapblue.web.stubs.opportunity;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="attachmentRows" type="{http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/}CommonAttachments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commitData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "attachmentRows",
    "commitData"
})
@XmlRootElement(name = "createAttachment")
public class CreateAttachment {

    protected List<CommonAttachments> attachmentRows;
    @XmlElement(required = true)
    protected String commitData;

    /**
     * Gets the value of the attachmentRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonAttachments }
     * 
     * 
     */
    public List<CommonAttachments> getAttachmentRows() {
        if (attachmentRows == null) {
            attachmentRows = new ArrayList<CommonAttachments>();
        }
        return this.attachmentRows;
    }

    /**
     * Gets the value of the commitData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitData() {
        return commitData;
    }

    /**
     * Sets the value of the commitData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitData(String value) {
        this.commitData = value;
    }

}
