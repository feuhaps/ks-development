
package org.kuali.student.brms.repository.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.2
 * Mon Jul 13 20:53:46 PDT 2009
 * Generated source version: 2.2
 */

@XmlRootElement(name = "checkinRuleSet", namespace = "http://student.kuali.org/wsdl/brms/RuleRepository")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkinRuleSet", namespace = "http://student.kuali.org/wsdl/brms/RuleRepository", propOrder = {"ruleSetUUID","comment"})

public class CheckinRuleSet {

    @XmlElement(name = "ruleSetUUID")
    private java.lang.String ruleSetUUID;
    @XmlElement(name = "comment")
    private java.lang.String comment;

    public java.lang.String getRuleSetUUID() {
        return this.ruleSetUUID;
    }

    public void setRuleSetUUID(java.lang.String newRuleSetUUID)  {
        this.ruleSetUUID = newRuleSetUUID;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public void setComment(java.lang.String newComment)  {
        this.comment = newComment;
    }

}

