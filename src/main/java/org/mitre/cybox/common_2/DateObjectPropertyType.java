//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * For fields of this type using CybOX patterning, it is strongly suggested that the condition (pattern type) is limited to one of Equals, DoesNotEqual, GreaterThan, LessThan, GreaterThanOrEqual, LessThanOrEqual, ExclusiveBetween, or InclusiveBetween. The use of other conditions may lead to ambiguity or unexpected results. When evaluating data against a pattern, the evaluator should take into account the precision of the field (as given by the precision attribute) and any timezone information that is available to perform a data-aware comparison. The usage of simple string comparisons is discouraged due to ambiguities in how precision and timezone information is processed.
 * 
 * <p>Java class for DateObjectPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateObjectPropertyType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://cybox.mitre.org/common-2>DateObjectPropertyRestrictionType">
 *       &lt;attribute name="precision" type="{http://cybox.mitre.org/common-2}DatePrecisionEnum" default="day" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateObjectPropertyType")
public class DateObjectPropertyType
    extends DateObjectPropertyRestrictionType
{

    @XmlAttribute(name = "precision")
    protected DatePrecisionEnum precision;

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link DatePrecisionEnum }
     *     
     */
    public DatePrecisionEnum getPrecision() {
        if (precision == null) {
            return DatePrecisionEnum.DAY;
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePrecisionEnum }
     *     
     */
    public void setPrecision(DatePrecisionEnum value) {
        this.precision = value;
    }

}
