
package org.kuali.student.core.search.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.1.3
 * Tue Jan 27 08:59:03 EST 2009
 * Generated source version: 2.1.3
 */

@XmlRootElement(name = "getSearchCriteriaTypeResponse", namespace = "http://org.kuali.student/core/search")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSearchCriteriaTypeResponse", namespace = "http://org.kuali.student/core/search")

public class GetSearchCriteriaTypeResponse {

    @XmlElement(name = "return")
    private org.kuali.student.core.search.dto.SearchCriteriaTypeInfo _return;

    public org.kuali.student.core.search.dto.SearchCriteriaTypeInfo getReturn() {
        return this._return;
    }

    public void setReturn(org.kuali.student.core.search.dto.SearchCriteriaTypeInfo new_return)  {
        this._return = new_return;
    }

}

