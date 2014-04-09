//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodePurposeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodePurposeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Application_Code"/>
 *     &lt;enumeration value="Library_Code"/>
 *     &lt;enumeration value="Shellcode"/>
 *     &lt;enumeration value="Exploit_Code"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodePurposeEnum", namespace = "http://cybox.mitre.org/objects#CodeObject-2")
@XmlEnum
public enum CodePurposeEnum {


    /**
     * The code represented is intended as application code.
     * 
     */
    @XmlEnumValue("Application_Code")
    APPLICATION_CODE("Application_Code"),

    /**
     * The code represented is intended as library code.
     * 
     */
    @XmlEnumValue("Library_Code")
    LIBRARY_CODE("Library_Code"),

    /**
     * The code represented is intended as shellcode.
     * 
     */
    @XmlEnumValue("Shellcode")
    SHELLCODE("Shellcode"),

    /**
     * The code represented is intended as exploit code.
     * 
     */
    @XmlEnumValue("Exploit_Code")
    EXPLOIT_CODE("Exploit_Code"),

    /**
     * The code represented is intended for unknown purposes.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The code represented is intended for a purpose other than those listed in this enumeration.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CodePurposeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodePurposeEnum fromValue(String v) {
        for (CodePurposeEnum c: CodePurposeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
