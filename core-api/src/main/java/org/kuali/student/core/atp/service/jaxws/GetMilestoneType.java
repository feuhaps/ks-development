
package org.kuali.student.core.atp.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.2
 * Tue Mar 31 14:06:06 EDT 2009
 * Generated source version: 2.2
 */

@XmlRootElement(name = "getMilestoneType", namespace = "http://student.kuali.org/core/atp")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMilestoneType", namespace = "http://student.kuali.org/core/atp")

public class GetMilestoneType {

    @XmlElement(name = "milestoneTypeKey")
    private java.lang.String milestoneTypeKey;

    public java.lang.String getMilestoneTypeKey() {
        return this.milestoneTypeKey;
    }

    public void setMilestoneTypeKey(java.lang.String newMilestoneTypeKey)  {
        this.milestoneTypeKey = newMilestoneTypeKey;
    }

}

