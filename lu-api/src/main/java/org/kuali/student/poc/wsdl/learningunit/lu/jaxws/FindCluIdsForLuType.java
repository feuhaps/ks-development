
package org.kuali.student.poc.wsdl.learningunit.lu.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by the CXF 2.0.4-incubator
 * Fri Apr 18 16:30:07 EDT 2008
 * Generated source version: 2.0.4-incubator
 * 
 */

@XmlRootElement(name = "findCluIdsForLuType", namespace = "http://student.kuali.org/poc/wsdl/learningunit/lu")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCluIdsForLuType", namespace = "http://student.kuali.org/poc/wsdl/learningunit/lu")

public class FindCluIdsForLuType {

    @XmlElement(name = "luTypeKey")
    private java.lang.String luTypeKey;

    public java.lang.String getLuTypeKey() {
        return this.luTypeKey;
    }
    
    public void setLuTypeKey( java.lang.String newLuTypeKey ) {
        this.luTypeKey = newLuTypeKey;
    }
    
}

