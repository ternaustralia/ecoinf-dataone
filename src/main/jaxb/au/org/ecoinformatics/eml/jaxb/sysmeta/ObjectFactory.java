//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:14 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.sysmeta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.org.ecoinformatics.eml.jaxb.sysmeta package. 
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

    private final static QName _SubjectList_QNAME = new QName("http://ns.dataone.org/service/types/v1", "subjectList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.org.ecoinformatics.eml.jaxb.sysmeta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectInfo }
     * 
     */
    public SubjectInfo createSubjectInfo() {
        return new SubjectInfo();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link LogEntry }
     * 
     */
    public LogEntry createLogEntry() {
        return new LogEntry();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link NodeReference }
     * 
     */
    public NodeReference createNodeReference() {
        return new NodeReference();
    }

    /**
     * Create an instance of {@link AccessPolicy }
     * 
     */
    public AccessPolicy createAccessPolicy() {
        return new AccessPolicy();
    }

    /**
     * Create an instance of {@link AccessRule }
     * 
     */
    public AccessRule createAccessRule() {
        return new AccessRule();
    }

    /**
     * Create an instance of {@link SystemMetadata }
     * 
     */
    public SystemMetadata createSystemMetadata() {
        return new SystemMetadata();
    }

    /**
     * Create an instance of {@link Checksum }
     * 
     */
    public Checksum createChecksum() {
        return new Checksum();
    }

    /**
     * Create an instance of {@link ReplicationPolicy }
     * 
     */
    public ReplicationPolicy createReplicationPolicy() {
        return new ReplicationPolicy();
    }

    /**
     * Create an instance of {@link Replica }
     * 
     */
    public Replica createReplica() {
        return new Replica();
    }

    /**
     * Create an instance of {@link ObjectList }
     * 
     */
    public ObjectList createObjectList() {
        return new ObjectList();
    }

    /**
     * Create an instance of {@link Slice }
     * 
     */
    public Slice createSlice() {
        return new Slice();
    }

    /**
     * Create an instance of {@link ObjectInfo }
     * 
     */
    public ObjectInfo createObjectInfo() {
        return new ObjectInfo();
    }

    /**
     * Create an instance of {@link ServiceMethodRestriction }
     * 
     */
    public ServiceMethodRestriction createServiceMethodRestriction() {
        return new ServiceMethodRestriction();
    }

    /**
     * Create an instance of {@link SubjectList }
     * 
     */
    public SubjectList createSubjectList() {
        return new SubjectList();
    }

    /**
     * Create an instance of {@link ObjectFormat }
     * 
     */
    public ObjectFormat createObjectFormat() {
        return new ObjectFormat();
    }

    /**
     * Create an instance of {@link NodeList }
     * 
     */
    public NodeList createNodeList() {
        return new NodeList();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link ObjectLocationList }
     * 
     */
    public ObjectLocationList createObjectLocationList() {
        return new ObjectLocationList();
    }

    /**
     * Create an instance of {@link ObjectLocation }
     * 
     */
    public ObjectLocation createObjectLocation() {
        return new ObjectLocation();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link NodeReplicationPolicy }
     * 
     */
    public NodeReplicationPolicy createNodeReplicationPolicy() {
        return new NodeReplicationPolicy();
    }

    /**
     * Create an instance of {@link Synchronization }
     * 
     */
    public Synchronization createSynchronization() {
        return new Synchronization();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link ChecksumAlgorithmList }
     * 
     */
    public ChecksumAlgorithmList createChecksumAlgorithmList() {
        return new ChecksumAlgorithmList();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link ObjectFormatList }
     * 
     */
    public ObjectFormatList createObjectFormatList() {
        return new ObjectFormatList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.dataone.org/service/types/v1", name = "subjectList")
    public JAXBElement<SubjectList> createSubjectList(SubjectList value) {
        return new JAXBElement<SubjectList>(_SubjectList_QNAME, SubjectList.class, null, value);
    }

}
