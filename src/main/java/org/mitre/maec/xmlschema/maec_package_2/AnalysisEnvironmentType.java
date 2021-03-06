//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The AnalysisEnvironmentType provides mechanisms for characterizing the particular hardware/software environment used in the analysis of a Malware Subject.
 * 
 * <p>Java class for AnalysisEnvironmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisEnvironmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hypervisor_Host_System" type="{http://maec.mitre.org/XMLSchema/maec-package-2}HypervisorHostSystemType" minOccurs="0"/>
 *         &lt;element name="Analysis_Systems" type="{http://maec.mitre.org/XMLSchema/maec-package-2}AnalysisSystemListType" minOccurs="0"/>
 *         &lt;element name="Network_Infrastructure" type="{http://maec.mitre.org/XMLSchema/maec-package-2}NetworkInfrastructureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisEnvironmentType", propOrder = {
    "hypervisorHostSystem",
    "analysisSystems",
    "networkInfrastructure"
})
public class AnalysisEnvironmentType {

    @XmlElement(name = "Hypervisor_Host_System")
    protected HypervisorHostSystemType hypervisorHostSystem;
    @XmlElement(name = "Analysis_Systems")
    protected AnalysisSystemListType analysisSystems;
    @XmlElement(name = "Network_Infrastructure")
    protected NetworkInfrastructureType networkInfrastructure;

    /**
     * Gets the value of the hypervisorHostSystem property.
     * 
     * @return
     *     possible object is
     *     {@link HypervisorHostSystemType }
     *     
     */
    public HypervisorHostSystemType getHypervisorHostSystem() {
        return hypervisorHostSystem;
    }

    /**
     * Sets the value of the hypervisorHostSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link HypervisorHostSystemType }
     *     
     */
    public void setHypervisorHostSystem(HypervisorHostSystemType value) {
        this.hypervisorHostSystem = value;
    }

    /**
     * Gets the value of the analysisSystems property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisSystemListType }
     *     
     */
    public AnalysisSystemListType getAnalysisSystems() {
        return analysisSystems;
    }

    /**
     * Sets the value of the analysisSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisSystemListType }
     *     
     */
    public void setAnalysisSystems(AnalysisSystemListType value) {
        this.analysisSystems = value;
    }

    /**
     * Gets the value of the networkInfrastructure property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInfrastructureType }
     *     
     */
    public NetworkInfrastructureType getNetworkInfrastructure() {
        return networkInfrastructure;
    }

    /**
     * Sets the value of the networkInfrastructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInfrastructureType }
     *     
     */
    public void setNetworkInfrastructure(NetworkInfrastructureType value) {
        this.networkInfrastructure = value;
    }

}
