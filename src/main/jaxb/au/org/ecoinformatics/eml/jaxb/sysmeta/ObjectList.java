//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.23 at 04:26:04 PM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of object locations (nodes) from which the
 *       object can be retrieved. 
 * 
 * <p>Java class for ObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ns.dataone.org/service/types/v1}Slice">
 *       &lt;sequence>
 *         &lt;element name="objectInfo" type="{http://ns.dataone.org/service/types/v1}ObjectInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectList", propOrder = {
    "objectInfo"
})
public class ObjectList
    extends Slice
{

    protected List<ObjectInfo> objectInfo;

    /**
     * Gets the value of the objectInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectInfo }
     * 
     * 
     */
    public List<ObjectInfo> getObjectInfo() {
        if (objectInfo == null) {
            objectInfo = new ArrayList<ObjectInfo>();
        }
        return this.objectInfo;
    }

    public ObjectList withObjectInfo(ObjectInfo... values) {
        if (values!= null) {
            for (ObjectInfo value: values) {
                getObjectInfo().add(value);
            }
        }
        return this;
    }

    public ObjectList withObjectInfo(Collection<ObjectInfo> values) {
        if (values!= null) {
            getObjectInfo().addAll(values);
        }
        return this;
    }

    @Override
    public ObjectList withCount(int value) {
        setCount(value);
        return this;
    }

    @Override
    public ObjectList withStart(int value) {
        setStart(value);
        return this;
    }

    @Override
    public ObjectList withTotal(int value) {
        setTotal(value);
        return this;
    }

}
