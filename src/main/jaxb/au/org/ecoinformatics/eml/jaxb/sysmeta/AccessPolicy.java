//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:14 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of rules that specifies as a whole the allowable
 *       permissions that a given user, group, or system has for accessing a
 *       resource, including data, metadata, resource map, and service resources.
 *       An access policy consists of a sequence of allow rules that grant
 *       permissions to principals, which can be individual users, groups of
 *       users, symbolic users, or systems and services.
 * 
 * <p>Java class for AccessPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allow" type="{http://ns.dataone.org/service/types/v1}AccessRule" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPolicy", propOrder = {
    "allows"
})
@XmlRootElement(name = "accessPolicy")
public class AccessPolicy {

    @XmlElement(name = "allow", required = true)
    protected List<AccessRule> allows;

    /**
     * Gets the value of the allows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessRule }
     * 
     * 
     */
    public List<AccessRule> getAllows() {
        if (allows == null) {
            allows = new ArrayList<AccessRule>();
        }
        return this.allows;
    }

    public AccessPolicy withAllows(AccessRule... values) {
        if (values!= null) {
            for (AccessRule value: values) {
                getAllows().add(value);
            }
        }
        return this;
    }

    public AccessPolicy withAllows(Collection<AccessRule> values) {
        if (values!= null) {
            getAllows().addAll(values);
        }
        return this;
    }

}
