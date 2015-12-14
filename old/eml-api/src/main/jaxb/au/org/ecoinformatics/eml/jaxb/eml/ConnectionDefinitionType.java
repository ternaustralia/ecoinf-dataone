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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ConnectionDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="schemeName">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="description" type="{eml://ecoinformatics.org/text-2.1.1}TextType"/>
 *           &lt;element name="parameterDefinition" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="name" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *                     &lt;element name="definition" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *                     &lt;element name="defaultValue" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;group ref="{eml://ecoinformatics.org/resource-2.1.1}ReferencesGroup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{eml://ecoinformatics.org/resource-2.1.1}IDType" />
 *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *       &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionDefinitionType", namespace = "eml://ecoinformatics.org/resource-2.1.1", propOrder = {
    "schemeName",
    "description",
    "parameterDefinition",
    "references"
})
public class ConnectionDefinitionType {

    protected ConnectionDefinitionType.SchemeName schemeName;
    protected TextType description;
    protected List<ConnectionDefinitionType.ParameterDefinition> parameterDefinition;
    protected au.org.ecoinformatics.eml.jaxb.eml.ViewType.References references;
    @XmlAttribute(name = "id")
    protected List<String> id;
    @XmlAttribute(name = "system")
    protected List<String> system;
    @XmlAttribute(name = "scope")
    protected ScopeType scope;

    /**
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDefinitionType.SchemeName }
     *     
     */
    public ConnectionDefinitionType.SchemeName getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDefinitionType.SchemeName }
     *     
     */
    public void setSchemeName(ConnectionDefinitionType.SchemeName value) {
        this.schemeName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the parameterDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionDefinitionType.ParameterDefinition }
     * 
     * 
     */
    public List<ConnectionDefinitionType.ParameterDefinition> getParameterDefinition() {
        if (parameterDefinition == null) {
            parameterDefinition = new ArrayList<ConnectionDefinitionType.ParameterDefinition>();
        }
        return this.parameterDefinition;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link au.org.ecoinformatics.eml.jaxb.eml.ViewType.References }
     *     
     */
    public au.org.ecoinformatics.eml.jaxb.eml.ViewType.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link au.org.ecoinformatics.eml.jaxb.eml.ViewType.References }
     *     
     */
    public void setReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getId() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystem() {
        if (system == null) {
            system = new ArrayList<String>();
        }
        return this.system;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeType }
     *     
     */
    public ScopeType getScope() {
        if (scope == null) {
            return ScopeType.DOCUMENT;
        } else {
            return scope;
        }
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeType }
     *     
     */
    public void setScope(ScopeType value) {
        this.scope = value;
    }

    public ConnectionDefinitionType withSchemeName(ConnectionDefinitionType.SchemeName value) {
        setSchemeName(value);
        return this;
    }

    public ConnectionDefinitionType withDescription(TextType value) {
        setDescription(value);
        return this;
    }

    public ConnectionDefinitionType withParameterDefinition(ConnectionDefinitionType.ParameterDefinition... values) {
        if (values!= null) {
            for (ConnectionDefinitionType.ParameterDefinition value: values) {
                getParameterDefinition().add(value);
            }
        }
        return this;
    }

    public ConnectionDefinitionType withParameterDefinition(Collection<ConnectionDefinitionType.ParameterDefinition> values) {
        if (values!= null) {
            getParameterDefinition().addAll(values);
        }
        return this;
    }

    public ConnectionDefinitionType withReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
        setReferences(value);
        return this;
    }

    public ConnectionDefinitionType withId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getId().add(value);
            }
        }
        return this;
    }

    public ConnectionDefinitionType withId(Collection<String> values) {
        if (values!= null) {
            getId().addAll(values);
        }
        return this;
    }

    public ConnectionDefinitionType withSystem(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSystem().add(value);
            }
        }
        return this;
    }

    public ConnectionDefinitionType withSystem(Collection<String> values) {
        if (values!= null) {
            getSystem().addAll(values);
        }
        return this;
    }

    public ConnectionDefinitionType withScope(ScopeType value) {
        setScope(value);
        return this;
    }


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
     *         &lt;element name="name" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
     *         &lt;element name="definition" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
     *         &lt;element name="defaultValue" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
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
        "name",
        "definition",
        "defaultValue"
    })
    public static class ParameterDefinition {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String definition;
        protected String defaultValue;

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
         * Gets the value of the definition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefinition() {
            return definition;
        }

        /**
         * Sets the value of the definition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefinition(String value) {
            this.definition = value;
        }

        /**
         * Gets the value of the defaultValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultValue() {
            return defaultValue;
        }

        /**
         * Sets the value of the defaultValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultValue(String value) {
            this.defaultValue = value;
        }

        public ConnectionDefinitionType.ParameterDefinition withName(String value) {
            setName(value);
            return this;
        }

        public ConnectionDefinitionType.ParameterDefinition withDefinition(String value) {
            setDefinition(value);
            return this;
        }

        public ConnectionDefinitionType.ParameterDefinition withDefaultValue(String value) {
            setDefaultValue(value);
            return this;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SchemeName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "system")
        protected List<String> system;

        /**
         * Gets the value of the value property.
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

        /**
         * Gets the value of the system property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the system property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSystem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSystem() {
            if (system == null) {
                system = new ArrayList<String>();
            }
            return this.system;
        }

        public ConnectionDefinitionType.SchemeName withValue(String value) {
            setValue(value);
            return this;
        }

        public ConnectionDefinitionType.SchemeName withSystem(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getSystem().add(value);
                }
            }
            return this;
        }

        public ConnectionDefinitionType.SchemeName withSystem(Collection<String> values) {
            if (values!= null) {
                getSystem().addAll(values);
            }
            return this;
        }

    }

}