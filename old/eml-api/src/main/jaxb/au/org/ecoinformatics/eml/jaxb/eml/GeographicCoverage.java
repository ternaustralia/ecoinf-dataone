//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:18 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.eml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicCoverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="geographicDescription" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *           &lt;element name="boundingCoordinates">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="westBoundingCoordinate">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="-180.0"/>
 *                           &lt;maxInclusive value="180.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="eastBoundingCoordinate">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="-180.0"/>
 *                           &lt;maxInclusive value="180.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="northBoundingCoordinate">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="-90.0"/>
 *                           &lt;maxInclusive value="90.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="southBoundingCoordinate">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           &lt;minInclusive value="-90.0"/>
 *                           &lt;maxInclusive value="90.0"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="boundingAltitudes" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="altitudeMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                               &lt;element name="altitudeMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                               &lt;element name="altitudeUnits" type="{eml://ecoinformatics.org/units-2.1.1}LengthUnitType"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="datasetGPolygon" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="datasetGPolygonOuterGRing">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded" minOccurs="3"/>
 *                               &lt;/sequence>
 *                               &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="datasetGPolygonExclusionGRing" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded"/>
 *                               &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
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
@XmlType(name = "GeographicCoverage", namespace = "eml://ecoinformatics.org/coverage-2.1.1", propOrder = {
    "geographicDescription",
    "boundingCoordinates",
    "datasetGPolygon",
    "references"
})
public class GeographicCoverage {

    protected String geographicDescription;
    protected GeographicCoverage.BoundingCoordinates boundingCoordinates;
    protected List<GeographicCoverage.DatasetGPolygon> datasetGPolygon;
    protected au.org.ecoinformatics.eml.jaxb.eml.ViewType.References references;
    @XmlAttribute(name = "id")
    protected List<String> id;
    @XmlAttribute(name = "system")
    protected List<String> system;
    @XmlAttribute(name = "scope")
    protected ScopeType scope;

    /**
     * Gets the value of the geographicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicDescription() {
        return geographicDescription;
    }

    /**
     * Sets the value of the geographicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicDescription(String value) {
        this.geographicDescription = value;
    }

    /**
     * Gets the value of the boundingCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoverage.BoundingCoordinates }
     *     
     */
    public GeographicCoverage.BoundingCoordinates getBoundingCoordinates() {
        return boundingCoordinates;
    }

    /**
     * Sets the value of the boundingCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoverage.BoundingCoordinates }
     *     
     */
    public void setBoundingCoordinates(GeographicCoverage.BoundingCoordinates value) {
        this.boundingCoordinates = value;
    }

    /**
     * Gets the value of the datasetGPolygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetGPolygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetGPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicCoverage.DatasetGPolygon }
     * 
     * 
     */
    public List<GeographicCoverage.DatasetGPolygon> getDatasetGPolygon() {
        if (datasetGPolygon == null) {
            datasetGPolygon = new ArrayList<GeographicCoverage.DatasetGPolygon>();
        }
        return this.datasetGPolygon;
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

    public GeographicCoverage withGeographicDescription(String value) {
        setGeographicDescription(value);
        return this;
    }

    public GeographicCoverage withBoundingCoordinates(GeographicCoverage.BoundingCoordinates value) {
        setBoundingCoordinates(value);
        return this;
    }

    public GeographicCoverage withDatasetGPolygon(GeographicCoverage.DatasetGPolygon... values) {
        if (values!= null) {
            for (GeographicCoverage.DatasetGPolygon value: values) {
                getDatasetGPolygon().add(value);
            }
        }
        return this;
    }

    public GeographicCoverage withDatasetGPolygon(Collection<GeographicCoverage.DatasetGPolygon> values) {
        if (values!= null) {
            getDatasetGPolygon().addAll(values);
        }
        return this;
    }

    public GeographicCoverage withReferences(au.org.ecoinformatics.eml.jaxb.eml.ViewType.References value) {
        setReferences(value);
        return this;
    }

    public GeographicCoverage withId(String... values) {
        if (values!= null) {
            for (String value: values) {
                getId().add(value);
            }
        }
        return this;
    }

    public GeographicCoverage withId(Collection<String> values) {
        if (values!= null) {
            getId().addAll(values);
        }
        return this;
    }

    public GeographicCoverage withSystem(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSystem().add(value);
            }
        }
        return this;
    }

    public GeographicCoverage withSystem(Collection<String> values) {
        if (values!= null) {
            getSystem().addAll(values);
        }
        return this;
    }

    public GeographicCoverage withScope(ScopeType value) {
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
     *         &lt;element name="westBoundingCoordinate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-180.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="eastBoundingCoordinate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-180.0"/>
     *               &lt;maxInclusive value="180.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="northBoundingCoordinate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-90.0"/>
     *               &lt;maxInclusive value="90.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="southBoundingCoordinate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="-90.0"/>
     *               &lt;maxInclusive value="90.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="boundingAltitudes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="altitudeMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="altitudeMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="altitudeUnits" type="{eml://ecoinformatics.org/units-2.1.1}LengthUnitType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "westBoundingCoordinate",
        "eastBoundingCoordinate",
        "northBoundingCoordinate",
        "southBoundingCoordinate",
        "boundingAltitudes"
    })
    public static class BoundingCoordinates {

        @XmlElement(required = true)
        protected BigDecimal westBoundingCoordinate;
        @XmlElement(required = true)
        protected BigDecimal eastBoundingCoordinate;
        @XmlElement(required = true)
        protected BigDecimal northBoundingCoordinate;
        @XmlElement(required = true)
        protected BigDecimal southBoundingCoordinate;
        protected GeographicCoverage.BoundingCoordinates.BoundingAltitudes boundingAltitudes;

        /**
         * Gets the value of the westBoundingCoordinate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWestBoundingCoordinate() {
            return westBoundingCoordinate;
        }

        /**
         * Sets the value of the westBoundingCoordinate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWestBoundingCoordinate(BigDecimal value) {
            this.westBoundingCoordinate = value;
        }

        /**
         * Gets the value of the eastBoundingCoordinate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEastBoundingCoordinate() {
            return eastBoundingCoordinate;
        }

        /**
         * Sets the value of the eastBoundingCoordinate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEastBoundingCoordinate(BigDecimal value) {
            this.eastBoundingCoordinate = value;
        }

        /**
         * Gets the value of the northBoundingCoordinate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNorthBoundingCoordinate() {
            return northBoundingCoordinate;
        }

        /**
         * Sets the value of the northBoundingCoordinate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNorthBoundingCoordinate(BigDecimal value) {
            this.northBoundingCoordinate = value;
        }

        /**
         * Gets the value of the southBoundingCoordinate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSouthBoundingCoordinate() {
            return southBoundingCoordinate;
        }

        /**
         * Sets the value of the southBoundingCoordinate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSouthBoundingCoordinate(BigDecimal value) {
            this.southBoundingCoordinate = value;
        }

        /**
         * Gets the value of the boundingAltitudes property.
         * 
         * @return
         *     possible object is
         *     {@link GeographicCoverage.BoundingCoordinates.BoundingAltitudes }
         *     
         */
        public GeographicCoverage.BoundingCoordinates.BoundingAltitudes getBoundingAltitudes() {
            return boundingAltitudes;
        }

        /**
         * Sets the value of the boundingAltitudes property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeographicCoverage.BoundingCoordinates.BoundingAltitudes }
         *     
         */
        public void setBoundingAltitudes(GeographicCoverage.BoundingCoordinates.BoundingAltitudes value) {
            this.boundingAltitudes = value;
        }

        public GeographicCoverage.BoundingCoordinates withWestBoundingCoordinate(BigDecimal value) {
            setWestBoundingCoordinate(value);
            return this;
        }

        public GeographicCoverage.BoundingCoordinates withEastBoundingCoordinate(BigDecimal value) {
            setEastBoundingCoordinate(value);
            return this;
        }

        public GeographicCoverage.BoundingCoordinates withNorthBoundingCoordinate(BigDecimal value) {
            setNorthBoundingCoordinate(value);
            return this;
        }

        public GeographicCoverage.BoundingCoordinates withSouthBoundingCoordinate(BigDecimal value) {
            setSouthBoundingCoordinate(value);
            return this;
        }

        public GeographicCoverage.BoundingCoordinates withBoundingAltitudes(GeographicCoverage.BoundingCoordinates.BoundingAltitudes value) {
            setBoundingAltitudes(value);
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
         *         &lt;element name="altitudeMinimum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="altitudeMaximum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="altitudeUnits" type="{eml://ecoinformatics.org/units-2.1.1}LengthUnitType"/>
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
            "altitudeMinimum",
            "altitudeMaximum",
            "altitudeUnits"
        })
        public static class BoundingAltitudes {

            @XmlElement(required = true)
            protected BigDecimal altitudeMinimum;
            @XmlElement(required = true)
            protected BigDecimal altitudeMaximum;
            @XmlElement(required = true)
            protected LengthUnitType altitudeUnits;

            /**
             * Gets the value of the altitudeMinimum property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAltitudeMinimum() {
                return altitudeMinimum;
            }

            /**
             * Sets the value of the altitudeMinimum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAltitudeMinimum(BigDecimal value) {
                this.altitudeMinimum = value;
            }

            /**
             * Gets the value of the altitudeMaximum property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAltitudeMaximum() {
                return altitudeMaximum;
            }

            /**
             * Sets the value of the altitudeMaximum property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAltitudeMaximum(BigDecimal value) {
                this.altitudeMaximum = value;
            }

            /**
             * Gets the value of the altitudeUnits property.
             * 
             * @return
             *     possible object is
             *     {@link LengthUnitType }
             *     
             */
            public LengthUnitType getAltitudeUnits() {
                return altitudeUnits;
            }

            /**
             * Sets the value of the altitudeUnits property.
             * 
             * @param value
             *     allowed object is
             *     {@link LengthUnitType }
             *     
             */
            public void setAltitudeUnits(LengthUnitType value) {
                this.altitudeUnits = value;
            }

            public GeographicCoverage.BoundingCoordinates.BoundingAltitudes withAltitudeMinimum(BigDecimal value) {
                setAltitudeMinimum(value);
                return this;
            }

            public GeographicCoverage.BoundingCoordinates.BoundingAltitudes withAltitudeMaximum(BigDecimal value) {
                setAltitudeMaximum(value);
                return this;
            }

            public GeographicCoverage.BoundingCoordinates.BoundingAltitudes withAltitudeUnits(LengthUnitType value) {
                setAltitudeUnits(value);
                return this;
            }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="datasetGPolygonOuterGRing">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;sequence>
     *                     &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded" minOccurs="3"/>
     *                   &lt;/sequence>
     *                   &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="datasetGPolygonExclusionGRing" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded"/>
     *                   &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "datasetGPolygonOuterGRing",
        "datasetGPolygonExclusionGRing"
    })
    public static class DatasetGPolygon {

        @XmlElement(required = true)
        protected GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing datasetGPolygonOuterGRing;
        protected List<GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing> datasetGPolygonExclusionGRing;

        /**
         * Gets the value of the datasetGPolygonOuterGRing property.
         * 
         * @return
         *     possible object is
         *     {@link GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing }
         *     
         */
        public GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing getDatasetGPolygonOuterGRing() {
            return datasetGPolygonOuterGRing;
        }

        /**
         * Sets the value of the datasetGPolygonOuterGRing property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing }
         *     
         */
        public void setDatasetGPolygonOuterGRing(GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing value) {
            this.datasetGPolygonOuterGRing = value;
        }

        /**
         * Gets the value of the datasetGPolygonExclusionGRing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datasetGPolygonExclusionGRing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatasetGPolygonExclusionGRing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing }
         * 
         * 
         */
        public List<GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing> getDatasetGPolygonExclusionGRing() {
            if (datasetGPolygonExclusionGRing == null) {
                datasetGPolygonExclusionGRing = new ArrayList<GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing>();
            }
            return this.datasetGPolygonExclusionGRing;
        }

        public GeographicCoverage.DatasetGPolygon withDatasetGPolygonOuterGRing(GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing value) {
            setDatasetGPolygonOuterGRing(value);
            return this;
        }

        public GeographicCoverage.DatasetGPolygon withDatasetGPolygonExclusionGRing(GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing... values) {
            if (values!= null) {
                for (GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing value: values) {
                    getDatasetGPolygonExclusionGRing().add(value);
                }
            }
            return this;
        }

        public GeographicCoverage.DatasetGPolygon withDatasetGPolygonExclusionGRing(Collection<GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing> values) {
            if (values!= null) {
                getDatasetGPolygonExclusionGRing().addAll(values);
            }
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
         *       &lt;choice>
         *         &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded"/>
         *         &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gRingPoint",
            "gRing"
        })
        public static class DatasetGPolygonExclusionGRing {

            protected List<GRingPointType> gRingPoint;
            protected String gRing;

            /**
             * Gets the value of the gRingPoint property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gRingPoint property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGRingPoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GRingPointType }
             * 
             * 
             */
            public List<GRingPointType> getGRingPoint() {
                if (gRingPoint == null) {
                    gRingPoint = new ArrayList<GRingPointType>();
                }
                return this.gRingPoint;
            }

            /**
             * Gets the value of the gRing property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGRing() {
                return gRing;
            }

            /**
             * Sets the value of the gRing property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGRing(String value) {
                this.gRing = value;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing withGRingPoint(GRingPointType... values) {
                if (values!= null) {
                    for (GRingPointType value: values) {
                        getGRingPoint().add(value);
                    }
                }
                return this;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing withGRingPoint(Collection<GRingPointType> values) {
                if (values!= null) {
                    getGRingPoint().addAll(values);
                }
                return this;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonExclusionGRing withGRing(String value) {
                setGRing(value);
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;sequence>
         *           &lt;element name="gRingPoint" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingPointType" maxOccurs="unbounded" minOccurs="3"/>
         *         &lt;/sequence>
         *         &lt;element name="gRing" type="{eml://ecoinformatics.org/coverage-2.1.1}GRingType"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gRingPoint",
            "gRing"
        })
        public static class DatasetGPolygonOuterGRing {

            protected List<GRingPointType> gRingPoint;
            protected String gRing;

            /**
             * Gets the value of the gRingPoint property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gRingPoint property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGRingPoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GRingPointType }
             * 
             * 
             */
            public List<GRingPointType> getGRingPoint() {
                if (gRingPoint == null) {
                    gRingPoint = new ArrayList<GRingPointType>();
                }
                return this.gRingPoint;
            }

            /**
             * Gets the value of the gRing property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGRing() {
                return gRing;
            }

            /**
             * Sets the value of the gRing property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGRing(String value) {
                this.gRing = value;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing withGRingPoint(GRingPointType... values) {
                if (values!= null) {
                    for (GRingPointType value: values) {
                        getGRingPoint().add(value);
                    }
                }
                return this;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing withGRingPoint(Collection<GRingPointType> values) {
                if (values!= null) {
                    getGRingPoint().addAll(values);
                }
                return this;
            }

            public GeographicCoverage.DatasetGPolygon.DatasetGPolygonOuterGRing withGRing(String value) {
                setGRing(value);
                return this;
            }

        }

    }

}