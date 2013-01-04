/**
 * Copyright 2010 The Kuali Foundation Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.kuali.student.common.messages.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.1.3
 * Fri Jan 09 10:52:53 PST 2009
 * Generated source version: 2.1.3
 */

@XmlRootElement(name = "getMessages", namespace = "http://student.kuali.org/wsdl/messages")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessages", namespace = "http://student.kuali.org/wsdl/messages", propOrder = {"localeKey","messageGroupKey"})

public class GetMessages {

    @XmlElement(name = "localeKey")
    private java.lang.String localeKey;
    @XmlElement(name = "messageGroupKey")
    private java.lang.String messageGroupKey;

    public java.lang.String getLocaleKey() {
        return this.localeKey;
    }

    public void setLocaleKey(java.lang.String newLocaleKey)  {
        this.localeKey = newLocaleKey;
    }

    public java.lang.String getMessageGroupKey() {
        return this.messageGroupKey;
    }

    public void setMessageGroupKey(java.lang.String newMessageGroupKey)  {
        this.messageGroupKey = newMessageGroupKey;
    }

}

