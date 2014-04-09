//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package oasis.names.tc.ciq.xal._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAdministrativeAreaNameTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubAdministrativeAreaNameTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="ReferenceLocation"/>
 *     &lt;enumeration value="Type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubAdministrativeAreaNameTypeList")
@XmlEnum
public enum SubAdministrativeAreaNameTypeList {


    /**
     * Name of the sub administrative area
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Number")
    NUMBER("Number"),

    /**
     * Reference location information in support of the sub administrative area.  
     * 
     */
    @XmlEnumValue("ReferenceLocation")
    REFERENCE_LOCATION("ReferenceLocation"),

    /**
     * Other supporting information 
     * 
     */
    @XmlEnumValue("Type")
    TYPE("Type");
    private final String value;

    SubAdministrativeAreaNameTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubAdministrativeAreaNameTypeList fromValue(String v) {
        for (SubAdministrativeAreaNameTypeList c: SubAdministrativeAreaNameTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
