//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The CapturedProtocolType specifies the details of a network protocol that may be captured or otherwise manipulated in the malware analysis environment.
 * 
 * <p>Java class for CapturedProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapturedProtocolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="layer7_protocol" type="{http://maec.mitre.org/XMLSchema/maec-package-2}Layer7ProtocolEnum" />
 *       &lt;attribute name="layer4_protocol" type="{http://maec.mitre.org/XMLSchema/maec-package-2}Layer4ProtocolEnum" />
 *       &lt;attribute name="port_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="interaction_level" type="{http://maec.mitre.org/XMLSchema/maec-package-2}InteractionLevelEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapturedProtocolType")
public class CapturedProtocolType {

    @XmlAttribute(name = "layer7_protocol")
    protected Layer7ProtocolEnum layer7Protocol;
    @XmlAttribute(name = "layer4_protocol")
    protected Layer4ProtocolEnum layer4Protocol;
    @XmlAttribute(name = "port_number")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portNumber;
    @XmlAttribute(name = "interaction_level")
    protected InteractionLevelEnum interactionLevel;

    /**
     * Gets the value of the layer7Protocol property.
     * 
     * @return
     *     possible object is
     *     {@link Layer7ProtocolEnum }
     *     
     */
    public Layer7ProtocolEnum getLayer7Protocol() {
        return layer7Protocol;
    }

    /**
     * Sets the value of the layer7Protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layer7ProtocolEnum }
     *     
     */
    public void setLayer7Protocol(Layer7ProtocolEnum value) {
        this.layer7Protocol = value;
    }

    /**
     * Gets the value of the layer4Protocol property.
     * 
     * @return
     *     possible object is
     *     {@link Layer4ProtocolEnum }
     *     
     */
    public Layer4ProtocolEnum getLayer4Protocol() {
        return layer4Protocol;
    }

    /**
     * Sets the value of the layer4Protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layer4ProtocolEnum }
     *     
     */
    public void setLayer4Protocol(Layer4ProtocolEnum value) {
        this.layer4Protocol = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortNumber(BigInteger value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the interactionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionLevelEnum }
     *     
     */
    public InteractionLevelEnum getInteractionLevel() {
        return interactionLevel;
    }

    /**
     * Sets the value of the interactionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionLevelEnum }
     *     
     */
    public void setInteractionLevel(InteractionLevelEnum value) {
        this.interactionLevel = value;
    }

}
