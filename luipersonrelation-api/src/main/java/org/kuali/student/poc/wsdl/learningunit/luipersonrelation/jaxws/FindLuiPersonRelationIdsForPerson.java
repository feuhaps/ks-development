
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

@XmlRootElement(name = "findLuiPersonRelationIdsForPerson", namespace = "http://student.kuali.org/poc/wsdl/learningunit/luipersonrelation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLuiPersonRelationIdsForPerson", namespace = "http://student.kuali.org/poc/wsdl/learningunit/luipersonrelation")

public class FindLuiPersonRelationIdsForPerson {

    @XmlElement(name = "personId")
    private java.lang.String personId;

    public java.lang.String getPersonId() {
        return this.personId;
    }
    
    public void setPersonId( java.lang.String newPersonId ) {
        this.personId = newPersonId;
    }
    
}

