//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.cybox.cybox_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.DataSegmentType;


/**
 * The DataReceivedEffectType type is intended to characterize the effects of actions upon objects where some data is received, such as a byte sequence on a socket.
 * 
 * <p>Java class for DataReceivedEffectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataReceivedEffectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/cybox-2}DefinedEffectType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://cybox.mitre.org/common-2}DataSegmentType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataReceivedEffectType", propOrder = {
    "data"
})
public class DataReceivedEffectType
    extends DefinedEffectType
{

    @XmlElement(name = "Data", required = true)
    protected DataSegmentType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataSegmentType }
     *     
     */
    public DataSegmentType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSegmentType }
     *     
     */
    public void setData(DataSegmentType value) {
        this.data = value;
    }

}
