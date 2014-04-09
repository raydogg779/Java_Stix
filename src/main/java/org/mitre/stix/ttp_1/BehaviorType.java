//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.ttp_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BehaviorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BehaviorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attack_Patterns" type="{http://stix.mitre.org/TTP-1}AttackPatternsType" minOccurs="0"/>
 *         &lt;element name="Malware" type="{http://stix.mitre.org/TTP-1}MalwareType" minOccurs="0"/>
 *         &lt;element name="Exploits" type="{http://stix.mitre.org/TTP-1}ExploitsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BehaviorType", propOrder = {
    "attackPatterns",
    "malware",
    "exploits"
})
public class BehaviorType {

    @XmlElement(name = "Attack_Patterns")
    protected AttackPatternsType attackPatterns;
    @XmlElement(name = "Malware")
    protected MalwareType malware;
    @XmlElement(name = "Exploits")
    protected ExploitsType exploits;

    /**
     * Gets the value of the attackPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link AttackPatternsType }
     *     
     */
    public AttackPatternsType getAttackPatterns() {
        return attackPatterns;
    }

    /**
     * Sets the value of the attackPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttackPatternsType }
     *     
     */
    public void setAttackPatterns(AttackPatternsType value) {
        this.attackPatterns = value;
    }

    /**
     * Gets the value of the malware property.
     * 
     * @return
     *     possible object is
     *     {@link MalwareType }
     *     
     */
    public MalwareType getMalware() {
        return malware;
    }

    /**
     * Sets the value of the malware property.
     * 
     * @param value
     *     allowed object is
     *     {@link MalwareType }
     *     
     */
    public void setMalware(MalwareType value) {
        this.malware = value;
    }

    /**
     * Gets the value of the exploits property.
     * 
     * @return
     *     possible object is
     *     {@link ExploitsType }
     *     
     */
    public ExploitsType getExploits() {
        return exploits;
    }

    /**
     * Sets the value of the exploits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExploitsType }
     *     
     */
    public void setExploits(ExploitsType value) {
        this.exploits = value;
    }

}
