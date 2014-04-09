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


/**
 * The PoolsType enables the description of Events, Actions, Objects and Properties in a space-efficient pooled manner with the actual Observable structures defined in the CybOX schema containing references to the pooled elements. This reduces redundancy caused when identical observable elements occur multiple times within a set of defined Observables.
 * 
 * <p>Java class for PoolsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Pool" type="{http://cybox.mitre.org/cybox-2}EventPoolType" minOccurs="0"/>
 *         &lt;element name="Action_Pool" type="{http://cybox.mitre.org/cybox-2}ActionPoolType" minOccurs="0"/>
 *         &lt;element name="Object_Pool" type="{http://cybox.mitre.org/cybox-2}ObjectPoolType" minOccurs="0"/>
 *         &lt;element name="Property_Pool" type="{http://cybox.mitre.org/cybox-2}PropertyPoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolsType", propOrder = {
    "eventPool",
    "actionPool",
    "objectPool",
    "propertyPool"
})
public class PoolsType {

    @XmlElement(name = "Event_Pool")
    protected EventPoolType eventPool;
    @XmlElement(name = "Action_Pool")
    protected ActionPoolType actionPool;
    @XmlElement(name = "Object_Pool")
    protected ObjectPoolType objectPool;
    @XmlElement(name = "Property_Pool")
    protected PropertyPoolType propertyPool;

    /**
     * Gets the value of the eventPool property.
     * 
     * @return
     *     possible object is
     *     {@link EventPoolType }
     *     
     */
    public EventPoolType getEventPool() {
        return eventPool;
    }

    /**
     * Sets the value of the eventPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPoolType }
     *     
     */
    public void setEventPool(EventPoolType value) {
        this.eventPool = value;
    }

    /**
     * Gets the value of the actionPool property.
     * 
     * @return
     *     possible object is
     *     {@link ActionPoolType }
     *     
     */
    public ActionPoolType getActionPool() {
        return actionPool;
    }

    /**
     * Sets the value of the actionPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPoolType }
     *     
     */
    public void setActionPool(ActionPoolType value) {
        this.actionPool = value;
    }

    /**
     * Gets the value of the objectPool property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectPoolType }
     *     
     */
    public ObjectPoolType getObjectPool() {
        return objectPool;
    }

    /**
     * Sets the value of the objectPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectPoolType }
     *     
     */
    public void setObjectPool(ObjectPoolType value) {
        this.objectPool = value;
    }

    /**
     * Gets the value of the propertyPool property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyPoolType }
     *     
     */
    public PropertyPoolType getPropertyPool() {
        return propertyPool;
    }

    /**
     * Sets the value of the propertyPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyPoolType }
     *     
     */
    public void setPropertyPool(PropertyPoolType value) {
        this.propertyPool = value;
    }

}
