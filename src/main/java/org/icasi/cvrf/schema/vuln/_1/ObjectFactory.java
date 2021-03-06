//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.icasi.cvrf.schema.vuln._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.icasi.cvrf.schema.vuln._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductID_QNAME = new QName("http://www.icasi.org/CVRF/schema/vuln/1.1", "ProductID");
    private final static QName _GroupID_QNAME = new QName("http://www.icasi.org/CVRF/schema/vuln/1.1", "GroupID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.icasi.cvrf.schema.vuln._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Vulnerability }
     * 
     */
    public Vulnerability createVulnerability() {
        return new Vulnerability();
    }

    /**
     * Create an instance of {@link Vulnerability.Acknowledgments }
     * 
     */
    public Vulnerability.Acknowledgments createVulnerabilityAcknowledgments() {
        return new Vulnerability.Acknowledgments();
    }

    /**
     * Create an instance of {@link Vulnerability.Acknowledgments.Acknowledgment }
     * 
     */
    public Vulnerability.Acknowledgments.Acknowledgment createVulnerabilityAcknowledgmentsAcknowledgment() {
        return new Vulnerability.Acknowledgments.Acknowledgment();
    }

    /**
     * Create an instance of {@link Vulnerability.References }
     * 
     */
    public Vulnerability.References createVulnerabilityReferences() {
        return new Vulnerability.References();
    }

    /**
     * Create an instance of {@link Vulnerability.References.Reference }
     * 
     */
    public Vulnerability.References.Reference createVulnerabilityReferencesReference() {
        return new Vulnerability.References.Reference();
    }

    /**
     * Create an instance of {@link Vulnerability.Remediations }
     * 
     */
    public Vulnerability.Remediations createVulnerabilityRemediations() {
        return new Vulnerability.Remediations();
    }

    /**
     * Create an instance of {@link Vulnerability.Remediations.Remediation }
     * 
     */
    public Vulnerability.Remediations.Remediation createVulnerabilityRemediationsRemediation() {
        return new Vulnerability.Remediations.Remediation();
    }

    /**
     * Create an instance of {@link Vulnerability.CVSSScoreSets }
     * 
     */
    public Vulnerability.CVSSScoreSets createVulnerabilityCVSSScoreSets() {
        return new Vulnerability.CVSSScoreSets();
    }

    /**
     * Create an instance of {@link Vulnerability.Threats }
     * 
     */
    public Vulnerability.Threats createVulnerabilityThreats() {
        return new Vulnerability.Threats();
    }

    /**
     * Create an instance of {@link Vulnerability.Threats.Threat }
     * 
     */
    public Vulnerability.Threats.Threat createVulnerabilityThreatsThreat() {
        return new Vulnerability.Threats.Threat();
    }

    /**
     * Create an instance of {@link Vulnerability.ProductStatuses }
     * 
     */
    public Vulnerability.ProductStatuses createVulnerabilityProductStatuses() {
        return new Vulnerability.ProductStatuses();
    }

    /**
     * Create an instance of {@link Vulnerability.Involvements }
     * 
     */
    public Vulnerability.Involvements createVulnerabilityInvolvements() {
        return new Vulnerability.Involvements();
    }

    /**
     * Create an instance of {@link Vulnerability.Involvements.Involvement }
     * 
     */
    public Vulnerability.Involvements.Involvement createVulnerabilityInvolvementsInvolvement() {
        return new Vulnerability.Involvements.Involvement();
    }

    /**
     * Create an instance of {@link Vulnerability.Notes }
     * 
     */
    public Vulnerability.Notes createVulnerabilityNotes() {
        return new Vulnerability.Notes();
    }

    /**
     * Create an instance of {@link Vulnerability.Title }
     * 
     */
    public Vulnerability.Title createVulnerabilityTitle() {
        return new Vulnerability.Title();
    }

    /**
     * Create an instance of {@link Vulnerability.ID }
     * 
     */
    public Vulnerability.ID createVulnerabilityID() {
        return new Vulnerability.ID();
    }

    /**
     * Create an instance of {@link Vulnerability.CWE }
     * 
     */
    public Vulnerability.CWE createVulnerabilityCWE() {
        return new Vulnerability.CWE();
    }

    /**
     * Create an instance of {@link Vulnerability.Acknowledgments.Acknowledgment.Name }
     * 
     */
    public Vulnerability.Acknowledgments.Acknowledgment.Name createVulnerabilityAcknowledgmentsAcknowledgmentName() {
        return new Vulnerability.Acknowledgments.Acknowledgment.Name();
    }

    /**
     * Create an instance of {@link Vulnerability.Acknowledgments.Acknowledgment.Organization }
     * 
     */
    public Vulnerability.Acknowledgments.Acknowledgment.Organization createVulnerabilityAcknowledgmentsAcknowledgmentOrganization() {
        return new Vulnerability.Acknowledgments.Acknowledgment.Organization();
    }

    /**
     * Create an instance of {@link Vulnerability.Acknowledgments.Acknowledgment.Description }
     * 
     */
    public Vulnerability.Acknowledgments.Acknowledgment.Description createVulnerabilityAcknowledgmentsAcknowledgmentDescription() {
        return new Vulnerability.Acknowledgments.Acknowledgment.Description();
    }

    /**
     * Create an instance of {@link Vulnerability.References.Reference.Description }
     * 
     */
    public Vulnerability.References.Reference.Description createVulnerabilityReferencesReferenceDescription() {
        return new Vulnerability.References.Reference.Description();
    }

    /**
     * Create an instance of {@link Vulnerability.Remediations.Remediation.Description }
     * 
     */
    public Vulnerability.Remediations.Remediation.Description createVulnerabilityRemediationsRemediationDescription() {
        return new Vulnerability.Remediations.Remediation.Description();
    }

    /**
     * Create an instance of {@link Vulnerability.Remediations.Remediation.Entitlement }
     * 
     */
    public Vulnerability.Remediations.Remediation.Entitlement createVulnerabilityRemediationsRemediationEntitlement() {
        return new Vulnerability.Remediations.Remediation.Entitlement();
    }

    /**
     * Create an instance of {@link Vulnerability.CVSSScoreSets.ScoreSet }
     * 
     */
    public Vulnerability.CVSSScoreSets.ScoreSet createVulnerabilityCVSSScoreSetsScoreSet() {
        return new Vulnerability.CVSSScoreSets.ScoreSet();
    }

    /**
     * Create an instance of {@link Vulnerability.Threats.Threat.Description }
     * 
     */
    public Vulnerability.Threats.Threat.Description createVulnerabilityThreatsThreatDescription() {
        return new Vulnerability.Threats.Threat.Description();
    }

    /**
     * Create an instance of {@link Vulnerability.ProductStatuses.Status }
     * 
     */
    public Vulnerability.ProductStatuses.Status createVulnerabilityProductStatusesStatus() {
        return new Vulnerability.ProductStatuses.Status();
    }

    /**
     * Create an instance of {@link Vulnerability.Involvements.Involvement.Description }
     * 
     */
    public Vulnerability.Involvements.Involvement.Description createVulnerabilityInvolvementsInvolvementDescription() {
        return new Vulnerability.Involvements.Involvement.Description();
    }

    /**
     * Create an instance of {@link Vulnerability.Notes.Note }
     * 
     */
    public Vulnerability.Notes.Note createVulnerabilityNotesNote() {
        return new Vulnerability.Notes.Note();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.icasi.org/CVRF/schema/vuln/1.1", name = "ProductID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductID(String value) {
        return new JAXBElement<String>(_ProductID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.icasi.org/CVRF/schema/vuln/1.1", name = "GroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGroupID(String value) {
        return new JAXBElement<String>(_GroupID_QNAME, String.class, null, value);
    }

}
