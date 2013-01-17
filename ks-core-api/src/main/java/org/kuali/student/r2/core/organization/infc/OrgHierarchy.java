/*
 * Copyright 2010 The Kuali Foundation 
 *
 * Licensed under the Educational Community License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.kuali.student.r2.core.organization.infc;

import java.util.List;
import org.kuali.student.r2.common.infc.HasEffectiveDates;
import org.kuali.student.r2.common.infc.IdEntity;

/**
 * Information for an organization hierarchy.
 *
 * @author tom
 */ 

public interface OrgHierarchy 
    extends IdEntity, HasEffectiveDates {

    /**
     * Root organization for the hierarchy.
     * 
     * @name Root Org Id
     */
    public String getRootOrgId();
    
    /**
     * Org-org relation types that should be 
     * used to navigate this hierarchy.
     * 
     * @name Org-Org Relation Types
     */
    public List<String> getOrgOrgRelationTypes();
}
