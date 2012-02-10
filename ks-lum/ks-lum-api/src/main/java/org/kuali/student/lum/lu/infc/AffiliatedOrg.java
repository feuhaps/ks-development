/*
 * Copyright 2011 The Kuali Foundation Licensed under the Educational Community
 * License, Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.opensource.org/licenses/ecl1.php Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.kuali.student.lum.lu.infc;

import java.util.Date;

import org.kuali.student.common.infc.IdNamelessEntity;

/**
 * Detailed information about the distribution of revenue by organization.
 * 
 * @author nwright
 */
public interface AffiliatedOrg extends IdNamelessEntity {

    /**
     * Unique identifier for an organization.
     * 
     * @name Organization Id
     */
    public String getOrgId();

    /**
     * A long numeric value without a fractional component.
     * 
     * @name Percentage
     */
    public Long getPercentage();

    public Date getEffectiveDate();

    public Date getExpirationDate();
}