//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The BundleReferenceType serves as a method for linking to Bundles embedded in other locations.
 * 
 * <p>Java class for BundleReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bundle_idref" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleReferenceType")
public class BundleReferenceType {

    @XmlAttribute(name = "bundle_idref", required = true)
    protected QName bundleIdref;

    /**
     * Gets the value of the bundleIdref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBundleIdref() {
        return bundleIdref;
    }

    /**
     * Sets the value of the bundleIdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBundleIdref(QName value) {
        this.bundleIdref = value;
    }

}
