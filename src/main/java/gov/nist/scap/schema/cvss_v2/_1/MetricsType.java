//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package gov.nist.scap.schema.cvss_v2._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for metrics that defines common attributes of all metrics.
 * 
 * <p>Java class for metricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="upgraded-from-version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metricsType")
@XmlSeeAlso({
    TemporalMetricsType.class,
    BaseMetricsType.class,
    EnvironmentalMetricsType.class
})
public abstract class MetricsType {

    @XmlAttribute(name = "upgraded-from-version")
    protected BigDecimal upgradedFromVersion;

    /**
     * Gets the value of the upgradedFromVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpgradedFromVersion() {
        return upgradedFromVersion;
    }

    /**
     * Sets the value of the upgradedFromVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpgradedFromVersion(BigDecimal value) {
        this.upgradedFromVersion = value;
    }

}
