//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:18 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.eml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParagraphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParagraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="value" type="{eml://ecoinformatics.org/text-2.1.1}i18nString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemizedlist" type="{eml://ecoinformatics.org/text-2.1.1}ListType"/>
 *         &lt;element name="orderedlist" type="{eml://ecoinformatics.org/text-2.1.1}ListType"/>
 *         &lt;element name="emphasis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{eml://ecoinformatics.org/text-2.1.1}i18nString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subscript" type="{eml://ecoinformatics.org/text-2.1.1}SubSuperScriptType"/>
 *         &lt;element name="superscript" type="{eml://ecoinformatics.org/text-2.1.1}SubSuperScriptType"/>
 *         &lt;element name="literalLayout">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{eml://ecoinformatics.org/text-2.1.1}i18nString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ulink" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="citetitle" type="{eml://ecoinformatics.org/text-2.1.1}i18nString"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", namespace = "eml://ecoinformatics.org/text-2.1.1", propOrder = {
    "content"
})
public class ParagraphType {

    @XmlElementRefs({
        @XmlElementRef(name = "orderedlist", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "superscript", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "emphasis", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "literalLayout", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ulink", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subscript", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "itemizedlist", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "value", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubSuperScriptType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParagraphType.Emphasis }{@code >}
     * {@link JAXBElement }{@code <}{@link ParagraphType.LiteralLayout }{@code >}
     * {@link JAXBElement }{@code <}{@link ParagraphType.Ulink }{@code >}
     * {@link JAXBElement }{@code <}{@link SubSuperScriptType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link ListType }{@code >}
     * {@link JAXBElement }{@code <}{@link I18NString }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public ParagraphType withContent(Serializable... values) {
        if (values!= null) {
            for (Serializable value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public ParagraphType withContent(Collection<Serializable> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    public ParagraphType withLang(String value) {
        setLang(value);
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
     *         &lt;element name="value" type="{eml://ecoinformatics.org/text-2.1.1}i18nString" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Emphasis {

        @XmlElementRef(name = "value", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected String lang;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link I18NString }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

        public ParagraphType.Emphasis withContent(Serializable... values) {
            if (values!= null) {
                for (Serializable value: values) {
                    getContent().add(value);
                }
            }
            return this;
        }

        public ParagraphType.Emphasis withContent(Collection<Serializable> values) {
            if (values!= null) {
                getContent().addAll(values);
            }
            return this;
        }

        public ParagraphType.Emphasis withLang(String value) {
            setLang(value);
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
     *       &lt;sequence>
     *         &lt;element name="value" type="{eml://ecoinformatics.org/text-2.1.1}i18nString" maxOccurs="unbounded" minOccurs="0"/>
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
        "content"
    })
    public static class LiteralLayout {

        @XmlElementRef(name = "value", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link I18NString }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

        public ParagraphType.LiteralLayout withContent(Serializable... values) {
            if (values!= null) {
                for (Serializable value: values) {
                    getContent().add(value);
                }
            }
            return this;
        }

        public ParagraphType.LiteralLayout withContent(Collection<Serializable> values) {
            if (values!= null) {
                getContent().addAll(values);
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="citetitle" type="{eml://ecoinformatics.org/text-2.1.1}i18nString"/>
     *       &lt;/sequence>
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Ulink {

        @XmlElementRef(name = "citetitle", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;
        @XmlAttribute(name = "url")
        @XmlSchemaType(name = "anySimpleType")
        protected String url;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link I18NString }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        public ParagraphType.Ulink withContent(Serializable... values) {
            if (values!= null) {
                for (Serializable value: values) {
                    getContent().add(value);
                }
            }
            return this;
        }

        public ParagraphType.Ulink withContent(Collection<Serializable> values) {
            if (values!= null) {
                getContent().addAll(values);
            }
            return this;
        }

        public ParagraphType.Ulink withUrl(String value) {
            setUrl(value);
            return this;
        }

    }

}