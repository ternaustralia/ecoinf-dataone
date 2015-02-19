//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:14 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The schedule on which :term:`synchronization` will run
 *       for a particular node. Syntax for each time slot follows the syntax
 *       conventions defined by the Quartz Scheduler
 *       (http://www.quartz-scheduler.org/api/2.1.0/org/quartz/CronExpression.html)
 *       
 * 
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="hour" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *       &lt;attribute name="mday" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *       &lt;attribute name="min" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *       &lt;attribute name="mon" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *       &lt;attribute name="sec" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntrySeconds" />
 *       &lt;attribute name="wday" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *       &lt;attribute name="year" use="required" type="{http://ns.dataone.org/service/types/v1}CrontabEntry" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule")
@XmlRootElement(name = "schedule")
public class Schedule {

    @XmlAttribute(name = "hour", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hour;
    @XmlAttribute(name = "mday", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mday;
    @XmlAttribute(name = "min", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String min;
    @XmlAttribute(name = "mon", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mon;
    @XmlAttribute(name = "sec", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sec;
    @XmlAttribute(name = "wday", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wday;
    @XmlAttribute(name = "year", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String year;

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the mday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMday() {
        return mday;
    }

    /**
     * Sets the value of the mday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMday(String value) {
        this.mday = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the mon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMon() {
        return mon;
    }

    /**
     * Sets the value of the mon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMon(String value) {
        this.mon = value;
    }

    /**
     * Gets the value of the sec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSec() {
        return sec;
    }

    /**
     * Sets the value of the sec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSec(String value) {
        this.sec = value;
    }

    /**
     * Gets the value of the wday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWday() {
        return wday;
    }

    /**
     * Sets the value of the wday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWday(String value) {
        this.wday = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    public Schedule withHour(String value) {
        setHour(value);
        return this;
    }

    public Schedule withMday(String value) {
        setMday(value);
        return this;
    }

    public Schedule withMin(String value) {
        setMin(value);
        return this;
    }

    public Schedule withMon(String value) {
        setMon(value);
        return this;
    }

    public Schedule withSec(String value) {
        setSec(value);
        return this;
    }

    public Schedule withWday(String value) {
        setWday(value);
        return this;
    }

    public Schedule withYear(String value) {
        setYear(value);
        return this;
    }

}
