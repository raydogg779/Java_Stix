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
 * <p>Java class for DataExfiltrationPropertiesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataExfiltrationPropertiesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="archive type"/>
 *     &lt;enumeration value="file type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataExfiltrationPropertiesEnum-1.0")
@XmlEnum
public enum DataExfiltrationPropertiesEnum10 {


    /**
     * The 'archive type' value refers to the name of the file archive format used in the Stage Data for Exfiltration Strategic Objective and/or its Package Data Tactical Objective.
     * 
     */
    @XmlEnumValue("archive type")
    ARCHIVE_TYPE("archive type"),

    /**
     * The 'file type' value refers to the name of the file format used for storing data to be exfiltrated as part of the Data Exfiltration Capability or its child Objectives.
     * 
     */
    @XmlEnumValue("file type")
    FILE_TYPE("file type");
    private final String value;

    DataExfiltrationPropertiesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataExfiltrationPropertiesEnum10 fromValue(String v) {
        for (DataExfiltrationPropertiesEnum10 c: DataExfiltrationPropertiesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
