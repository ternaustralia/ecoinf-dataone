//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.23 at 04:26:04 PM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The :term:`Subject` is a string that provides a formal
 *       name to identify a user or group in the DataONE Identity Management
 *       Service. The *subject* is represented by a unique, persistent,
 *       non-reassignable identifier string that follows the same constraints as
 *       :class:`Types.Identifier`. Subjects are immutable and can not be 
 *       deleted.
 * 
 * <p>Java class for Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subject">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://ns.dataone.org/service/types/v1>NonEmptyString">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", propOrder = {
    "value"
})
public class Subject {

    @XmlValue
    protected String value;

    /**
     * A derived string type with at least length 1 and it
     *       must contain non-whitespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public Subject withValue(String value) {
        setValue(value);
        return this;
    }

}
