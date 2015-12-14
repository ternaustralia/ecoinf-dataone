//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:18 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.eml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Manuscript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manuscript">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="institution" type="{eml://ecoinformatics.org/party-2.1.1}ResponsibleParty" maxOccurs="unbounded"/>
 *         &lt;element name="totalPages" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manuscript", propOrder = {
    "institution",
    "totalPages"
})
public class Manuscript {

    @XmlElement(required = true)
    protected List<ResponsibleParty> institution;
    protected String totalPages;

    /**
     * Gets the value of the institution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsibleParty }
     * 
     * 
     */
    public List<ResponsibleParty> getInstitution() {
        if (institution == null) {
            institution = new ArrayList<ResponsibleParty>();
        }
        return this.institution;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPages(String value) {
        this.totalPages = value;
    }

    public Manuscript withInstitution(ResponsibleParty... values) {
        if (values!= null) {
            for (ResponsibleParty value: values) {
                getInstitution().add(value);
            }
        }
        return this;
    }

    public Manuscript withInstitution(Collection<ResponsibleParty> values) {
        if (values!= null) {
            getInstitution().addAll(values);
        }
        return this;
    }

    public Manuscript withTotalPages(String value) {
        setTotalPages(value);
        return this;
    }

}