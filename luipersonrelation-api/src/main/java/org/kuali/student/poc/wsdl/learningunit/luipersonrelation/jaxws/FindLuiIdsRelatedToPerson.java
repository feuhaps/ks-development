
package org.kuali.student.poc.wsdl.learningunit.luipersonrelation.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by the CXF 2.0.4-incubator
 * Mon Apr 28 11:57:54 EDT 2008
 * Generated source version: 2.0.4-incubator
 * 
 */

@XmlRootElement(name = "findLuiIdsRelatedToPerson", namespace = "http://student.kuali.org/poc/wsdl/learningunit/luipersonrelation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLuiIdsRelatedToPerson", namespace = "http://student.kuali.org/poc/wsdl/learningunit/luipersonrelation")

public class FindLuiIdsRelatedToPerson {

    @XmlElement(name = "personId")
    private java.lang.String personId;
    @XmlElement(name = "luiPersonRelationTypeInfo")
    private org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.LuiPersonRelationTypeInfo luiPersonRelationTypeInfo;
    @XmlElement(name = "relationStateInfo")
    private org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.RelationStateInfo relationStateInfo;

    public java.lang.String getPersonId() {
        return this.personId;
    }
    
    public void setPersonId( java.lang.String newPersonId ) {
        this.personId = newPersonId;
    }
    
    public org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.LuiPersonRelationTypeInfo getLuiPersonRelationTypeInfo() {
        return this.luiPersonRelationTypeInfo;
    }
    
    public void setLuiPersonRelationTypeInfo( org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.LuiPersonRelationTypeInfo newLuiPersonRelationTypeInfo ) {
        this.luiPersonRelationTypeInfo = newLuiPersonRelationTypeInfo;
    }
    
    public org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.RelationStateInfo getRelationStateInfo() {
        return this.relationStateInfo;
    }
    
    public void setRelationStateInfo( org.kuali.student.poc.xsd.learningunit.luipersonrelation.dto.RelationStateInfo newRelationStateInfo ) {
        this.relationStateInfo = newRelationStateInfo;
    }
    
}

