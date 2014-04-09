//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.threatactor_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.data_marking.marking_1.MarkingType;
import org.mitre.stix.common_1.ConfidenceType;
import org.mitre.stix.common_1.IdentityType;
import org.mitre.stix.common_1.InformationSourceType;
import org.mitre.stix.common_1.RelatedPackageRefsType;
import org.mitre.stix.common_1.StatementType;
import org.mitre.stix.common_1.StructuredTextType;
import org.mitre.stix.common_1.ThreatActorBaseType;


/**
 * <p>Java class for ThreatActorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreatActorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}ThreatActorBaseType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Short_Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://stix.mitre.org/common-1}IdentityType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://stix.mitre.org/common-1}StatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Motivation" type="{http://stix.mitre.org/common-1}StatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sophistication" type="{http://stix.mitre.org/common-1}StatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Intended_Effect" type="{http://stix.mitre.org/common-1}StatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Planning_And_Operational_Support" type="{http://stix.mitre.org/common-1}StatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Observed_TTPs" type="{http://stix.mitre.org/ThreatActor-1}ObservedTTPsType" minOccurs="0"/>
 *         &lt;element name="Associated_Campaigns" type="{http://stix.mitre.org/ThreatActor-1}AssociatedCampaignsType" minOccurs="0"/>
 *         &lt;element name="Associated_Actors" type="{http://stix.mitre.org/ThreatActor-1}AssociatedActorsType" minOccurs="0"/>
 *         &lt;element name="Handling" type="{http://data-marking.mitre.org/Marking-1}MarkingType" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{http://stix.mitre.org/common-1}ConfidenceType" minOccurs="0"/>
 *         &lt;element name="Information_Source" type="{http://stix.mitre.org/common-1}InformationSourceType" minOccurs="0"/>
 *         &lt;element name="Related_Packages" type="{http://stix.mitre.org/common-1}RelatedPackageRefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://stix.mitre.org/ThreatActor-1}ThreatActorVersionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreatActorType", propOrder = {
    "title",
    "description",
    "shortDescription",
    "identity",
    "type",
    "motivation",
    "sophistication",
    "intendedEffect",
    "planningAndOperationalSupport",
    "observedTTPs",
    "associatedCampaigns",
    "associatedActors",
    "handling",
    "confidence",
    "informationSource",
    "relatedPackages"
})
public class ThreatActorType
    extends ThreatActorBaseType
{

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Short_Description")
    protected StructuredTextType shortDescription;
    @XmlElement(name = "Identity")
    protected IdentityType identity;
    @XmlElement(name = "Type")
    protected List<StatementType> type;
    @XmlElement(name = "Motivation")
    protected List<StatementType> motivation;
    @XmlElement(name = "Sophistication")
    protected List<StatementType> sophistication;
    @XmlElement(name = "Intended_Effect")
    protected List<StatementType> intendedEffect;
    @XmlElement(name = "Planning_And_Operational_Support")
    protected List<StatementType> planningAndOperationalSupport;
    @XmlElement(name = "Observed_TTPs")
    protected ObservedTTPsType observedTTPs;
    @XmlElement(name = "Associated_Campaigns")
    protected AssociatedCampaignsType associatedCampaigns;
    @XmlElement(name = "Associated_Actors")
    protected AssociatedActorsType associatedActors;
    @XmlElement(name = "Handling")
    protected MarkingType handling;
    @XmlElement(name = "Confidence")
    protected ConfidenceType confidence;
    @XmlElement(name = "Information_Source")
    protected InformationSourceType informationSource;
    @XmlElement(name = "Related_Packages")
    protected RelatedPackageRefsType relatedPackages;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setShortDescription(StructuredTextType value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setIdentity(IdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getType() {
        if (type == null) {
            type = new ArrayList<StatementType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the motivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getMotivation() {
        if (motivation == null) {
            motivation = new ArrayList<StatementType>();
        }
        return this.motivation;
    }

    /**
     * Gets the value of the sophistication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sophistication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSophistication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getSophistication() {
        if (sophistication == null) {
            sophistication = new ArrayList<StatementType>();
        }
        return this.sophistication;
    }

    /**
     * Gets the value of the intendedEffect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedEffect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedEffect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getIntendedEffect() {
        if (intendedEffect == null) {
            intendedEffect = new ArrayList<StatementType>();
        }
        return this.intendedEffect;
    }

    /**
     * Gets the value of the planningAndOperationalSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planningAndOperationalSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanningAndOperationalSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getPlanningAndOperationalSupport() {
        if (planningAndOperationalSupport == null) {
            planningAndOperationalSupport = new ArrayList<StatementType>();
        }
        return this.planningAndOperationalSupport;
    }

    /**
     * Gets the value of the observedTTPs property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedTTPsType }
     *     
     */
    public ObservedTTPsType getObservedTTPs() {
        return observedTTPs;
    }

    /**
     * Sets the value of the observedTTPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedTTPsType }
     *     
     */
    public void setObservedTTPs(ObservedTTPsType value) {
        this.observedTTPs = value;
    }

    /**
     * Gets the value of the associatedCampaigns property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedCampaignsType }
     *     
     */
    public AssociatedCampaignsType getAssociatedCampaigns() {
        return associatedCampaigns;
    }

    /**
     * Sets the value of the associatedCampaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedCampaignsType }
     *     
     */
    public void setAssociatedCampaigns(AssociatedCampaignsType value) {
        this.associatedCampaigns = value;
    }

    /**
     * Gets the value of the associatedActors property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedActorsType }
     *     
     */
    public AssociatedActorsType getAssociatedActors() {
        return associatedActors;
    }

    /**
     * Sets the value of the associatedActors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedActorsType }
     *     
     */
    public void setAssociatedActors(AssociatedActorsType value) {
        this.associatedActors = value;
    }

    /**
     * Gets the value of the handling property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingType }
     *     
     */
    public MarkingType getHandling() {
        return handling;
    }

    /**
     * Sets the value of the handling property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingType }
     *     
     */
    public void setHandling(MarkingType value) {
        this.handling = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceType }
     *     
     */
    public ConfidenceType getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceType }
     *     
     */
    public void setConfidence(ConfidenceType value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSourceType }
     *     
     */
    public InformationSourceType getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSourceType }
     *     
     */
    public void setInformationSource(InformationSourceType value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the relatedPackages property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPackageRefsType }
     *     
     */
    public RelatedPackageRefsType getRelatedPackages() {
        return relatedPackages;
    }

    /**
     * Sets the value of the relatedPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPackageRefsType }
     *     
     */
    public void setRelatedPackages(RelatedPackageRefsType value) {
        this.relatedPackages = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
