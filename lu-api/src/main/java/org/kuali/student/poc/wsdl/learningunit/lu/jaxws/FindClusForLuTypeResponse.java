
package org.kuali.student.poc.wsdl.learningunit.lu.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.kuali.student.poc.xsd.learningunit.lu.dto.CluDisplay;

/**
 * This class was generated by the CXF 2.0.4-incubator
 * Fri Apr 18 16:30:07 EDT 2008
 * Generated source version: 2.0.4-incubator
 * 
 */

@XmlRootElement(name = "findClusForLuTypeResponse", namespace = "http://student.kuali.org/poc/wsdl/learningunit/lu")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findClusForLuTypeResponse", namespace = "http://student.kuali.org/poc/wsdl/learningunit/lu")

public class FindClusForLuTypeResponse {

    @XmlElement(name = "return")
    private java.util.List<CluDisplay> _return;

    public java.util.List<CluDisplay> get_return() {
        return this._return;
    }
    
    public void set_return( java.util.List<CluDisplay> new_return ) {
        this._return = new_return;
    }
    
}

