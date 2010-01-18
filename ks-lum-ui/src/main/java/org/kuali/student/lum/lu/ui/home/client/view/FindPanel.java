/*
 * Copyright 2009 The Kuali Foundation Licensed under the
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
package org.kuali.student.lum.lu.ui.home.client.view;

import java.util.List;

import org.kuali.student.common.assembly.client.Metadata;
import org.kuali.student.common.ui.client.mvc.Callback;
import org.kuali.student.common.ui.client.mvc.Controller;
import org.kuali.student.common.ui.client.mvc.ViewComposite;
import org.kuali.student.common.ui.client.widgets.KSButton;
import org.kuali.student.common.ui.client.widgets.search.AdvancedSearchWindow;
import org.kuali.student.common.ui.client.widgets.search.SearchPanel;
import org.kuali.student.common.ui.client.widgets.suggestbox.KSAdvancedSearchWindow;
import org.kuali.student.core.organization.ui.client.service.OrgRpcService;
import org.kuali.student.core.organization.ui.client.service.OrgRpcServiceAsync;
import org.kuali.student.core.proposal.ui.client.service.ProposalRpcService;
import org.kuali.student.core.proposal.ui.client.service.ProposalRpcServiceAsync;
import org.kuali.student.lum.lu.assembly.data.client.refactorme.orch.CreditCourseMetadata;
import org.kuali.student.lum.lu.assembly.data.client.refactorme.orch.FindCourseMetadata;
import org.kuali.student.lum.lu.ui.course.client.service.AtpRpcService;
import org.kuali.student.lum.lu.ui.course.client.service.AtpRpcServiceAsync;
import org.kuali.student.lum.lu.ui.course.client.service.LuRpcService;
import org.kuali.student.lum.lu.ui.course.client.service.LuRpcServiceAsync;
import org.kuali.student.lum.lu.ui.home.client.view.CreateCreditCoursePanel.ButtonRow;
import org.kuali.student.lum.lu.ui.main.client.controller.LUMApplicationManager.LUMViews;
import org.kuali.student.lum.lu.ui.main.client.events.ChangeViewStateEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.VerticalPanel;

public class FindPanel extends ViewComposite{
    public static final String SEARCH_TYPE_PROPOSALS = "Proposals";
    public static final String SEARCH_TYPE_COURSES = "Courses";
    
    LuRpcServiceAsync luServiceAsync = GWT.create(LuRpcService.class);
    ProposalRpcServiceAsync proposalServiceAsync = GWT.create(ProposalRpcService.class);
    AtpRpcServiceAsync atpRpcServiceAsync = GWT.create(AtpRpcService.class);
    
    
    AdvancedSearchWindow courseSearchWindow;
    KSAdvancedSearchWindow proposalSearchWindow;
    // TODO please leave on until the atp search has found a home.
    AdvancedSearchWindow atpSearchWindow;
    
    private VerticalPanel mainPanel = new VerticalPanel();
        
    private boolean loaded = false;    
       
    public FindPanel(Controller controller) {

        super(controller, "Find Course or Proposal");                     
        this.initWidget(mainPanel);
    }

    @Override
    public void beforeShow(final Callback<Boolean> onReadyCallback) {
        if (!loaded){                        
            //FIXME: This is a quick fix
            KSButton findCourseButton = new KSButton("Find Course", new ClickHandler(){
                public void onClick(ClickEvent event) {
                    if (courseSearchWindow == null){
                        initCourseSearchWindow();
                    }
                    courseSearchWindow.show();
                }            
            });
            
            KSButton findProposalButton = new KSButton("Find Proposal", new ClickHandler(){
                public void onClick(ClickEvent event) {
                    if (proposalSearchWindow == null){
                        initProposalSearchWindow();
                    }
                    proposalSearchWindow.show();
                }            
            });
            
            
            // TODO please leave on until the atp search has found a home.
            KSButton findAtpButton = new KSButton("Find Session", new ClickHandler(){
                public void onClick(ClickEvent event) {
                    if (atpSearchWindow == null){
                        initAtpSearchWindow();
                    }
                    atpSearchWindow.show();
                }            
            });
            
            mainPanel.add(new ButtonRow(findCourseButton, "Find an existing course."));
            mainPanel.add(new ButtonRow(findProposalButton, "Find an existing proposal."));
            // TODO Please leave on 
            mainPanel.add(new ButtonRow(findAtpButton, "Find a Session."));

            loaded = true;
        }
        onReadyCallback.exec(true);
    }
    
    private void initCourseSearchWindow(){
    	       
    	Metadata searchMetadata = new FindCourseMetadata().getMetadata("", "");  //no type or state at this point
        SearchPanel searchPicker = new SearchPanel(luServiceAsync, searchMetadata.getProperties().get("courseId").getLookupMetadata());                
        courseSearchWindow = new AdvancedSearchWindow("Find Course", searchPicker);
   	    	
       // courseSearchWindow = new KSAdvancedSearchWindow(luServiceAsync, "lu.search.clus","lu.resultColumn.cluId", "Find Course");
        courseSearchWindow.addSelectionCompleteCallback(new Callback<List<String>>(){
            //FIXME: This should take user to the course view screens
            public void exec(List<String> event) {
                final String selected = event.get(0);
                if (selected.length() > 0){
                	List<String> selectedItems = event;
                	ChangeViewStateEvent tempEvent = new ChangeViewStateEvent(LUMViews.VIEW_COURSE, selectedItems);
                    FindPanel.this.getController().fireApplicationEvent(new ChangeViewStateEvent<LUMViews>(LUMViews.VIEW_COURSE, event));
                    courseSearchWindow.hide();
                }                
            }            
        });        
    } 
    
    private void initProposalSearchWindow(){
        proposalSearchWindow = new KSAdvancedSearchWindow(proposalServiceAsync, "proposal.search.courses", "proposal.resultColumn.proposalId", "Find Proposal");            
        proposalSearchWindow.addSelectionHandler(new SelectionHandler<List<String>>(){
            //FIXME: This should take user to the course view screens
            public void onSelection(SelectionEvent<List<String>> event) {
                final List<String> selected = event.getSelectedItem();
                if (selected.size() > 0){
                    FindPanel.this.getController().fireApplicationEvent(new ChangeViewStateEvent<LUMViews>(LUMViews.EDIT_COURSE_PROPOSAL, event));
                    proposalSearchWindow.hide();
                }                
            }            
        });        
    }
    
    private void initAtpSearchWindow(){
        
        Metadata searchMetadata = new CreditCourseMetadata().getMetadata("", "");  //no type or state at this point
        SearchPanel searchPicker = new SearchPanel(atpRpcServiceAsync, searchMetadata.getProperties().get("firstExpectedOffering").getLookupMetadata());
        atpSearchWindow = new AdvancedSearchWindow("Find Session", searchPicker);
            
        atpSearchWindow.addSelectionCompleteCallback(new Callback<List<String>>(){
            public void exec(List<String> event) {
                final String selected = event.get(0);
                if (selected.length() > 0){
//                    List<String> selectedItems = event;
//                    ChangeViewStateEvent tempEvent = new ChangeViewStateEvent(LUMViews.VIEW_COURSE, selectedItems);
//                    FindPanel.this.getController().fireApplicationEvent(new ChangeViewStateEvent<LUMViews>(LUMViews.VIEW_COURSE, event));
                    courseSearchWindow.hide();
                }                
            }            
        });        
    }
}
