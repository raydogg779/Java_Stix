//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossDurationEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossDurationEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="Weeks"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Seconds"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossDurationEnum-1.0")
@XmlEnum
public enum LossDurationEnum10 {


    /**
     * The loss is permanent.
     * 
     */
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),

    /**
     * The loss lasted for weeks.
     * 
     */
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),

    /**
     * The loss lasted for days.
     * 
     */
    @XmlEnumValue("Days")
    DAYS("Days"),

    /**
     * The loss lasted for hours.
     * 
     */
    @XmlEnumValue("Hours")
    HOURS("Hours"),

    /**
     * The loss lasted for minutes.
     * 
     */
    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),

    /**
     * The loss lasted for seconds.
     * 
     */
    @XmlEnumValue("Seconds")
    SECONDS("Seconds"),

    /**
     * The loss duration is not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LossDurationEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossDurationEnum10 fromValue(String v) {
        for (LossDurationEnum10 c: LossDurationEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
