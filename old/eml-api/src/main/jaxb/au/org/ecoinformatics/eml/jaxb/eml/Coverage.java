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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="geographicCoverage" type="{eml://ecoinformatics.org/coverage-2.1.1}GeographicCoverage"/>
 *           &lt;element name="temporalCoverage">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{eml://ecoinformatics.org/coverage-2.1.1}TemporalCoverage">
 *                   &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *                   &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="taxonomicCoverage">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{eml://ecoinformatics.org/coverage-2.1.1}TaxonomicCoverage">
 *                   &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *                   &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
@XmlType(name = "Coverage", namespace = "eml://ecoinformatics.org/coverage-2.1.1", propOrder = {
    "geographicCoverageOrTemporalCoverageOrTaxonomicCoverage",
    "references"
})
public class Coverage {

    @XmlElements({
        @XmlElement(name = "geographicCoverage", type = GeographicCoverage.class),
        @XmlElement(name = "temporalCoverage", type = Coverage.TemporalCoverage.class),
        @XmlElement(name = "taxonomicCoverage", type = Coverage.TaxonomicCoverage.class)
    })
    protected List<Object> geographicCoverageOrTemporalCoverageOrTaxonomicCoverage;
    protected au.org.ecoinformatics.eml.jaxb.eml.ViewType.References references;
    @XmlAttribute(name = "id")
    protected List<String> id;
    @XmlAttribute(name = "system")
    protected List<String> system;
    @XmlAttribute(name = "scope")
    protected ScopeType scope;

    /**
     * Gets the value of the geographicCoverageOrTemporalCoverageOrTaxonomicCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicCoverageOrTemporalCoverageOrTaxonomicCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicCoverage }
     * {@link Coverage.TemporalCoverage }
     * {@link Coverage.TaxonomicCoverage }
     * 
     * 
     */
    public List<Object> getGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage() {
        if (geographicCoverageOrTemporalCoverageOrTaxonomicCoverage == null) {
            geographicCoverageOrTemporalCoverageOrTaxonomicCoverage = new ArrayList<Object>();
        }
        return this.geographicCoverageOrTemporalCoverageOrTaxonomicCoverage;
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

    public Coverage withGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage().add(value);
            }
        }
        return this;
    }

    public Coverage withGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage(Collection<Object> values) {
        if (values!= null) {
            getGeographicCoverageOrTemporalCoverageOrTaxonomicCoverage().addAll(values);
        }
        return this;
    }

    public Coverage withReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
        setReferences(value);
        return this;
    }

    public Coverage withId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getId().add(value);
            }
        }
        return this;
    }

    public Coverage withId(Collection<String> values) {
        if (values!= null) {
            getId().addAll(values);
        }
        return this;
    }

    public Coverage withSystem(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSystem().add(value);
            }
        }
        return this;
    }

    public Coverage withSystem(Collection<String> values) {
        if (values!= null) {
            getSystem().addAll(values);
        }
        return this;
    }

    public Coverage withScope(ScopeType value) {
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
     *     &lt;extension base="{eml://ecoinformatics.org/coverage-2.1.1}TaxonomicCoverage">
     *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
     *       &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TaxonomicCoverage
        extends au.org.ecoinformatics.eml.jaxb.eml.TaxonomicCoverage
    {

        @XmlAttribute(name = "system")
        protected List<String> system;
        @XmlAttribute(name = "scope")
        protected ScopeType scope;

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

        public Coverage.TaxonomicCoverage withSystem(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getSystem().add(value);
                }
            }
            return this;
        }

        public Coverage.TaxonomicCoverage withSystem(Collection<String> values) {
            if (values!= null) {
                getSystem().addAll(values);
            }
            return this;
        }

        public Coverage.TaxonomicCoverage withScope(ScopeType value) {
            setScope(value);
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withTaxonomicSystem(au.org.ecoinformatics.eml.jaxb.eml.TaxonomicCoverage.TaxonomicSystem value) {
            setTaxonomicSystem(value);
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withGeneralTaxonomicCoverage(String value) {
            setGeneralTaxonomicCoverage(value);
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withTaxonomicClassification(TaxonomicClassificationType... values) {
            if (values!= null) {
                for (TaxonomicClassificationType value: values) {
                    getTaxonomicClassification().add(value);
                }
            }
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withTaxonomicClassification(Collection<TaxonomicClassificationType> values) {
            if (values!= null) {
                getTaxonomicClassification().addAll(values);
            }
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
            setReferences(value);
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withId(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getId().add(value);
                }
            }
            return this;
        }

        @Override
        public Coverage.TaxonomicCoverage withId(Collection<String> values) {
            if (values!= null) {
                getId().addAll(values);
            }
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
     *   &lt;complexContent>
     *     &lt;extension base="{eml://ecoinformatics.org/coverage-2.1.1}TemporalCoverage">
     *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
     *       &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TemporalCoverage
        extends au.org.ecoinformatics.eml.jaxb.eml.TemporalCoverage
    {

        @XmlAttribute(name = "system")
        protected List<String> system;
        @XmlAttribute(name = "scope")
        protected ScopeType scope;

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

        public Coverage.TemporalCoverage withSystem(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getSystem().add(value);
                }
            }
            return this;
        }

        public Coverage.TemporalCoverage withSystem(Collection<String> values) {
            if (values!= null) {
                getSystem().addAll(values);
            }
            return this;
        }

        public Coverage.TemporalCoverage withScope(ScopeType value) {
            setScope(value);
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withSingleDateTime(SingleDateTimeType... values) {
            if (values!= null) {
                for (SingleDateTimeType value: values) {
                    getSingleDateTime().add(value);
                }
            }
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withSingleDateTime(Collection<SingleDateTimeType> values) {
            if (values!= null) {
                getSingleDateTime().addAll(values);
            }
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withRangeOfDates(au.org.ecoinformatics.eml.jaxb.eml.TemporalCoverage.RangeOfDates value) {
            setRangeOfDates(value);
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
            setReferences(value);
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withId(String... values) {
            if (values!= null) {
                for (String value: values) {
                    getId().add(value);
                }
            }
            return this;
        }

        @Override
        public Coverage.TemporalCoverage withId(Collection<String> values) {
            if (values!= null) {
                getId().addAll(values);
            }
            return this;
        }

    }

}