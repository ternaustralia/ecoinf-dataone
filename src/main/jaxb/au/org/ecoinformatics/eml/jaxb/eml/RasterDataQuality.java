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
 * <p>Java class for DataQuality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataQuality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracyReport" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *         &lt;element name="quantitativeAccuracyReport" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantitativeAccuracyValue" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *                   &lt;element name="quantitativeAccuracyMethod" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
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
@XmlType(name = "DataQuality", namespace = "eml://ecoinformatics.org/spatialRaster-2.1.1", propOrder = {
    "accuracyReport",
    "quantitativeAccuracyReport"
})
public class RasterDataQuality {

    @XmlElement(required = true)
    protected String accuracyReport;
    protected List<RasterDataQuality.QuantitativeAccuracyReport> quantitativeAccuracyReport;

    /**
     * Gets the value of the accuracyReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracyReport() {
        return accuracyReport;
    }

    /**
     * Sets the value of the accuracyReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracyReport(String value) {
        this.accuracyReport = value;
    }

    /**
     * Gets the value of the quantitativeAccuracyReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantitativeAccuracyReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantitativeAccuracyReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RasterDataQuality.QuantitativeAccuracyReport }
     * 
     * 
     */
    public List<RasterDataQuality.QuantitativeAccuracyReport> getQuantitativeAccuracyReport() {
        if (quantitativeAccuracyReport == null) {
            quantitativeAccuracyReport = new ArrayList<RasterDataQuality.QuantitativeAccuracyReport>();
        }
        return this.quantitativeAccuracyReport;
    }

    public RasterDataQuality withAccuracyReport(String value) {
        setAccuracyReport(value);
        return this;
    }

    public RasterDataQuality withQuantitativeAccuracyReport(RasterDataQuality.QuantitativeAccuracyReport... values) {
        if (values!= null) {
            for (RasterDataQuality.QuantitativeAccuracyReport value: values) {
                getQuantitativeAccuracyReport().add(value);
            }
        }
        return this;
    }

    public RasterDataQuality withQuantitativeAccuracyReport(Collection<RasterDataQuality.QuantitativeAccuracyReport> values) {
        if (values!= null) {
            getQuantitativeAccuracyReport().addAll(values);
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
     *       &lt;sequence>
     *         &lt;element name="quantitativeAccuracyValue" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
     *         &lt;element name="quantitativeAccuracyMethod" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
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
        "quantitativeAccuracyValue",
        "quantitativeAccuracyMethod"
    })
    public static class QuantitativeAccuracyReport {

        @XmlElement(required = true)
        protected String quantitativeAccuracyValue;
        @XmlElement(required = true)
        protected String quantitativeAccuracyMethod;

        /**
         * Gets the value of the quantitativeAccuracyValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantitativeAccuracyValue() {
            return quantitativeAccuracyValue;
        }

        /**
         * Sets the value of the quantitativeAccuracyValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantitativeAccuracyValue(String value) {
            this.quantitativeAccuracyValue = value;
        }

        /**
         * Gets the value of the quantitativeAccuracyMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantitativeAccuracyMethod() {
            return quantitativeAccuracyMethod;
        }

        /**
         * Sets the value of the quantitativeAccuracyMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantitativeAccuracyMethod(String value) {
            this.quantitativeAccuracyMethod = value;
        }

        public RasterDataQuality.QuantitativeAccuracyReport withQuantitativeAccuracyValue(String value) {
            setQuantitativeAccuracyValue(value);
            return this;
        }

        public RasterDataQuality.QuantitativeAccuracyReport withQuantitativeAccuracyMethod(String value) {
            setQuantitativeAccuracyMethod(value);
            return this;
        }

    }

}
