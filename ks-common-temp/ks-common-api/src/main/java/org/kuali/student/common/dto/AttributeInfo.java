/*
 * Copyright 2011 The Kuali Foundation Licensed under the Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.osedu.org/licenses/ECL-2.0 Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing permissions and limitations under the License.
 */
package org.kuali.student.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.kuali.student.common.infc.Attribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeInfo", propOrder = {"id", "key", "value"/* TODO KSCM-gwt-compile , "_futureElements"*/})
public final class AttributeInfo implements Attribute, Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement
    private String id;
    
    @XmlElement
    private String key;
    
    @XmlElement
    private String value;

    //TODO KSCM-gwt-compile
    //@XmlAnyElement
    //private List<Element> _futureElements;

    
    public AttributeInfo() {
        this.id = null;
        this.key = null;
        this.value = null;
        //TODO KSCM-gwt-compile this._futureElements = null;
    }

    public AttributeInfo(Attribute attribute) {
        this.id = attribute.getId();
        this.key = attribute.getKey();
        this.value = attribute.getValue();
        //TODO KSCM-gwt-compile this._futureElements = null;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getKey() {
        return key;
    }

    
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }
}
