//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:14 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Metadata about an object, representing a subset of the
 *       metadata found in :class:`Types.SystemMetadata`.
 * 
 * <p>Java class for ObjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://ns.dataone.org/service/types/v1}Identifier"/>
 *         &lt;element name="formatId" type="{http://ns.dataone.org/service/types/v1}ObjectFormatIdentifier"/>
 *         &lt;element name="checksum" type="{http://ns.dataone.org/service/types/v1}Checksum"/>
 *         &lt;element name="dateSysMetadataModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectInfo", propOrder = {
    "identifier",
    "formatId",
    "checksum",
    "dateSysMetadataModified",
    "size"
})
@XmlRootElement(name = "objectInfo")
public class ObjectInfo {

    @XmlElement(required = true)
    protected Identifier identifier;
    @XmlElement(required = true)
    protected String formatId;
    @XmlElement(required = true)
    protected Checksum checksum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSysMetadataModified;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger size;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the formatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatId() {
        return formatId;
    }

    /**
     * Sets the value of the formatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatId(String value) {
        this.formatId = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link Checksum }
     *     
     */
    public Checksum getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Checksum }
     *     
     */
    public void setChecksum(Checksum value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the dateSysMetadataModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSysMetadataModified() {
        return dateSysMetadataModified;
    }

    /**
     * Sets the value of the dateSysMetadataModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSysMetadataModified(XMLGregorianCalendar value) {
        this.dateSysMetadataModified = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    public ObjectInfo withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public ObjectInfo withFormatId(String value) {
        setFormatId(value);
        return this;
    }

    public ObjectInfo withChecksum(Checksum value) {
        setChecksum(value);
        return this;
    }

    public ObjectInfo withDateSysMetadataModified(XMLGregorianCalendar value) {
        setDateSysMetadataModified(value);
        return this;
    }

    public ObjectInfo withSize(BigInteger value) {
        setSize(value);
        return this;
    }

}