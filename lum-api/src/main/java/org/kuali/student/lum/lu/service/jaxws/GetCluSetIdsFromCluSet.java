
package org.kuali.student.lum.lu.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.1.4
 * Tue Feb 17 15:12:56 EST 2009
 * Generated source version: 2.1.4
 */

@XmlRootElement(name = "getCluSetIdsFromCluSet", namespace = "http://student.kuali.org/lum/lu")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCluSetIdsFromCluSet", namespace = "http://student.kuali.org/lum/lu")

public class GetCluSetIdsFromCluSet {

    @XmlElement(name = "cluSetId")
    private java.lang.String cluSetId;

    public java.lang.String getCluSetId() {
        return this.cluSetId;
    }

    public void setCluSetId(java.lang.String newCluSetId)  {
        this.cluSetId = newCluSetId;
    }

}

