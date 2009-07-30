/*
 * Copyright 2007 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.student.common.ui.client.event;

import org.kuali.student.common.ui.client.mvc.ApplicationEventHandler;

/**
 * A save handler should be implemented to carry out a save operation in response
 * to a save event.  A SaveEvent will have an EventHandlerCallback, which should
 * be invoked upon save complete action to notify widget that fired the event of
 * a success/failed save action. 
 * 
 * @author Kuali Student Team
 *
 */
public interface LoadModelHandler extends ApplicationEventHandler{
    public void loadModel(LoadModelEvent loadModel);
}
