//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:14 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an optional restriction policy for a given
 *       method. If this element exists for a service method, its use is
 *       restricted, and only :term:`Subjects` listed in the list are allowed to
 *       invoke the method named in the *methodName*
 *       attribute.
 * 
 * <p>Java class for ServiceMethodRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMethodRestriction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ns.dataone.org/service/types/v1}SubjectList">
 *       &lt;attribute name="methodName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMethodRestriction")
@XmlRootElement(name = "serviceMethodRestriction")
public class ServiceMethodRestriction
    extends SubjectList
{

    @XmlAttribute(name = "methodName", required = true)
    protected String methodName;

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    public ServiceMethodRestriction withMethodName(String value) {
        setMethodName(value);
        return this;
    }

    @Override
    public ServiceMethodRestriction withSubjects(Subject... values) {
        if (values!= null) {
            for (Subject value: values) {
                getSubjects().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceMethodRestriction withSubjects(Collection<Subject> values) {
        if (values!= null) {
            getSubjects().addAll(values);
        }
        return this;
    }

}