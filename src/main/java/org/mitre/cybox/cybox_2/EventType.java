//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.cybox.cybox_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;
import org.mitre.cybox.common_2.LocationType;
import org.mitre.cybox.common_2.MeasureSourceType;
import org.mitre.cybox.common_2.StructuredTextType;


/**
 * The EventType is a complex type representing a cyber observable event that is dynamic in nature with specific action(s) taken against specific cyber relevant objects (e.g. a file is deleted, a registry key is created or an HTTP Get Request is received).
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="Type" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" minOccurs="0"/>
 *           &lt;element name="Description" type="{http://cybox.mitre.org/common-2}StructuredTextType" minOccurs="0"/>
 *           &lt;element name="Observation_Method" type="{http://cybox.mitre.org/common-2}MeasureSourceType" minOccurs="0"/>
 *           &lt;element name="Actions" type="{http://cybox.mitre.org/cybox-2}ActionsType" minOccurs="0"/>
 *           &lt;element name="Location" type="{http://cybox.mitre.org/common-2}LocationType" minOccurs="0"/>
 *           &lt;element name="Frequency" type="{http://cybox.mitre.org/cybox-2}FrequencyType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="Event" type="{http://cybox.mitre.org/cybox-2}EventType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="idref" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "type",
    "description",
    "observationMethod",
    "actions",
    "location",
    "frequency",
    "event"
})
public class EventType {

    @XmlElement(name = "Type")
    protected ControlledVocabularyStringType type;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Observation_Method")
    protected MeasureSourceType observationMethod;
    @XmlElement(name = "Actions")
    protected ActionsType actions;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "Frequency")
    protected FrequencyType frequency;
    @XmlElement(name = "Event")
    protected List<EventType> event;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "idref")
    protected QName idref;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setType(ControlledVocabularyStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the observationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureSourceType }
     *     
     */
    public MeasureSourceType getObservationMethod() {
        return observationMethod;
    }

    /**
     * Sets the value of the observationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureSourceType }
     *     
     */
    public void setObservationMethod(MeasureSourceType value) {
        this.observationMethod = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsType }
     *     
     */
    public ActionsType getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsType }
     *     
     */
    public void setActions(ActionsType value) {
        this.actions = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setFrequency(FrequencyType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<EventType>();
        }
        return this.event;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setIdref(QName value) {
        this.idref = value;
    }

}
