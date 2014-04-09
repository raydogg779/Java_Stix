//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipScopeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipScopeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="inclusive"/>
 *     &lt;enumeration value="exclusive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationshipScopeEnum")
@XmlEnum
public enum RelationshipScopeEnum {


    /**
     * A single relationship is being defined between the subject and the collection of objects indicated by the related items.
     * 
     */
    @XmlEnumValue("inclusive")
    INCLUSIVE("inclusive"),

    /**
     * Multiple relationships are being defined between the specific subject and each object individually.
     * 
     */
    @XmlEnumValue("exclusive")
    EXCLUSIVE("exclusive");
    private final String value;

    RelationshipScopeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipScopeEnum fromValue(String v) {
        for (RelationshipScopeEnum c: RelationshipScopeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
