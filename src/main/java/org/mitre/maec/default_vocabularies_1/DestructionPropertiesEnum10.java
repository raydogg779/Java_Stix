//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestructionPropertiesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestructionPropertiesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="erasure scope"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestructionPropertiesEnum-1.0")
@XmlEnum
public enum DestructionPropertiesEnum10 {


    /**
     * Recommended values are: 'whole disk', or 'targeted files'.
     * 
     */
    @XmlEnumValue("erasure scope")
    ERASURE_SCOPE("erasure scope");
    private final String value;

    DestructionPropertiesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestructionPropertiesEnum10 fromValue(String v) {
        for (DestructionPropertiesEnum10 c: DestructionPropertiesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
