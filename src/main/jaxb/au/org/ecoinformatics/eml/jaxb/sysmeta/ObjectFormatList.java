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
 * An ObjectFormatList is the structure returned from the
 *       :func:`CNCore.listFormats()` method of the CN REST interface. It
 *       provides a list of named object formats defined in the DataONE system.
 *       Each :class:`Types.ObjectFormat` returned in the list describes the
 *       object format via its name, and future versions may contain additional
 *       structured content from common external typing systems.
 *       
 * 
 * <p>Java class for ObjectFormatList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectFormatList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ns.dataone.org/service/types/v1}Slice">
 *       &lt;sequence>
 *         &lt;element name="objectFormat" type="{http://ns.dataone.org/service/types/v1}ObjectFormat" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectFormatList", propOrder = {
    "objectFormats"
})
@XmlRootElement(name = "objectFormatList")
public class ObjectFormatList
    extends Slice
{

    @XmlElement(name = "objectFormat", required = true)
    protected List<ObjectFormat> objectFormats;

    /**
     * Gets the value of the objectFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectFormat }
     * 
     * 
     */
    public List<ObjectFormat> getObjectFormats() {
        if (objectFormats == null) {
            objectFormats = new ArrayList<ObjectFormat>();
        }
        return this.objectFormats;
    }

    public ObjectFormatList withObjectFormats(ObjectFormat... values) {
        if (values!= null) {
            for (ObjectFormat value: values) {
                getObjectFormats().add(value);
            }
        }
        return this;
    }

    public ObjectFormatList withObjectFormats(Collection<ObjectFormat> values) {
        if (values!= null) {
            getObjectFormats().addAll(values);
        }
        return this;
    }

    @Override
    public ObjectFormatList withCount(int value) {
        setCount(value);
        return this;
    }

    @Override
    public ObjectFormatList withStart(int value) {
        setStart(value);
        return this;
    }

    @Override
    public ObjectFormatList withTotal(int value) {
        setTotal(value);
        return this;
    }

}
