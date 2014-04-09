//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;


/**
 * The CapabilityObjectiveRelationshipType captures a relationship between a Capability and one or more other Capabilitys.
 * 
 * <p>Java class for CapabilityRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relationship_Type" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Capability_Reference" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityRelationshipType", propOrder = {
    "relationshipType",
    "capabilityReference"
})
public class CapabilityRelationshipType {

    @XmlElement(name = "Relationship_Type")
    protected ControlledVocabularyStringType relationshipType;
    @XmlElement(name = "Capability_Reference", required = true)
    protected List<CapabilityReferenceType> capabilityReference;

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setRelationshipType(ControlledVocabularyStringType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the capabilityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capabilityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapabilityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityReferenceType }
     * 
     * 
     */
    public List<CapabilityReferenceType> getCapabilityReference() {
        if (capabilityReference == null) {
            capabilityReference = new ArrayList<CapabilityReferenceType>();
        }
        return this.capabilityReference;
    }

}