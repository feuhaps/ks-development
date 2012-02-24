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

package org.kuali.student.lum.lu.ui.course.client.service;

import java.util.List;

import org.kuali.student.r2.common.dto.ContextInfo;
import org.kuali.student.r1.common.ui.client.service.BaseRpcService;
import org.kuali.student.common.versionmanagement.dto.VersionDisplayInfo;
import org.kuali.student.lum.lu.dto.CluInfo;
import org.kuali.student.lum.lu.dto.CluLoRelationInfo;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * This is a description of what this class does - Will Gomes don't forget to fill this in.
 * 
 * @author Kuali Student Team
 */
@RemoteServiceRelativePath("rpcservices/LuRpcService")
public interface LuRpcService extends BaseRpcService {

    public CluInfo createClu(String luTypeKey, CluInfo cluInfo, ContextInfo contextInfo);

    public CluInfo updateClu(String luTypeKey, CluInfo cluInfo, ContextInfo contextInfo);

    public List<CluLoRelationInfo> getCluLoRelationsByClu(String cluId, ContextInfo contextInfo);

    public CluInfo getClu(String cluId, ContextInfo contextInfo);

    public VersionDisplayInfo getCurrentVersion(String refObjectTypeURI, String refObjectId, ContextInfo contextInfo);
}
