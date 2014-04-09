//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ToolConfigurationType characterizes the configuration for a tool used as a cyber observation source.
 * 
 * <p>Java class for ToolConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToolConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Configuration_Settings" type="{http://cybox.mitre.org/common-2}ConfigurationSettingsType" minOccurs="0"/>
 *         &lt;element name="Dependencies" type="{http://cybox.mitre.org/common-2}DependenciesType" minOccurs="0"/>
 *         &lt;element name="Usage_Context_Assumptions" type="{http://cybox.mitre.org/common-2}UsageContextAssumptionsType" minOccurs="0"/>
 *         &lt;element name="Internationalization_Settings" type="{http://cybox.mitre.org/common-2}InternationalizationSettingsType" minOccurs="0"/>
 *         &lt;element name="Build_Information" type="{http://cybox.mitre.org/common-2}BuildInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolConfigurationType", propOrder = {
    "configurationSettings",
    "dependencies",
    "usageContextAssumptions",
    "internationalizationSettings",
    "buildInformation"
})
public class ToolConfigurationType {

    @XmlElement(name = "Configuration_Settings")
    protected ConfigurationSettingsType configurationSettings;
    @XmlElement(name = "Dependencies")
    protected DependenciesType dependencies;
    @XmlElement(name = "Usage_Context_Assumptions")
    protected UsageContextAssumptionsType usageContextAssumptions;
    @XmlElement(name = "Internationalization_Settings")
    protected InternationalizationSettingsType internationalizationSettings;
    @XmlElement(name = "Build_Information")
    protected BuildInformationType buildInformation;

    /**
     * Gets the value of the configurationSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationSettingsType }
     *     
     */
    public ConfigurationSettingsType getConfigurationSettings() {
        return configurationSettings;
    }

    /**
     * Sets the value of the configurationSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationSettingsType }
     *     
     */
    public void setConfigurationSettings(ConfigurationSettingsType value) {
        this.configurationSettings = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link DependenciesType }
     *     
     */
    public DependenciesType getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependenciesType }
     *     
     */
    public void setDependencies(DependenciesType value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the usageContextAssumptions property.
     * 
     * @return
     *     possible object is
     *     {@link UsageContextAssumptionsType }
     *     
     */
    public UsageContextAssumptionsType getUsageContextAssumptions() {
        return usageContextAssumptions;
    }

    /**
     * Sets the value of the usageContextAssumptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageContextAssumptionsType }
     *     
     */
    public void setUsageContextAssumptions(UsageContextAssumptionsType value) {
        this.usageContextAssumptions = value;
    }

    /**
     * Gets the value of the internationalizationSettings property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalizationSettingsType }
     *     
     */
    public InternationalizationSettingsType getInternationalizationSettings() {
        return internationalizationSettings;
    }

    /**
     * Sets the value of the internationalizationSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalizationSettingsType }
     *     
     */
    public void setInternationalizationSettings(InternationalizationSettingsType value) {
        this.internationalizationSettings = value;
    }

    /**
     * Gets the value of the buildInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BuildInformationType }
     *     
     */
    public BuildInformationType getBuildInformation() {
        return buildInformation;
    }

    /**
     * Sets the value of the buildInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildInformationType }
     *     
     */
    public void setBuildInformation(BuildInformationType value) {
        this.buildInformation = value;
    }

}
