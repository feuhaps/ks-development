
package org.kuali.student.core.organization.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.1.3
 * Fri Jan 16 11:42:39 EST 2009
 * Generated source version: 2.1.3
 */

@XmlRootElement(name = "getOrgPersonRelationsByIdList", namespace = "http://org.kuali.student/core/organization")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrgPersonRelationsByIdList", namespace = "http://org.kuali.student/core/organization")

public class GetOrgPersonRelationsByIdList {

    @XmlElement(name = "arg0")
    private java.util.List<java.lang.String> arg0;

    public java.util.List<java.lang.String> getArg0() {
        return this.arg0;
    }

    public void setArg0(java.util.List<java.lang.String> newArg0)  {
        this.arg0 = newArg0;
    }

}

