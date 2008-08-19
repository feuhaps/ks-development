package org.kuali.student.ui.personidentity.client.view;

import org.kuali.student.commons.ui.mvc.client.ApplicationContext;
import org.kuali.student.registration.client.controller.RegistrationController;
import org.kuali.student.ui.personidentity.client.ModelState;
import org.kuali.student.ui.personidentity.client.view.lu.CourseSchedulePanel;
import org.kuali.student.ui.personidentity.client.view.lu.EnrollmentSummaryPanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.ui.TabListener;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;

public class RegistrationTab extends SelectedTabPanel {
   EnrollmentSummaryPanel enrollmentSummaryPanel = new EnrollmentSummaryPanel();
   CourseSchedulePanel schedulePanel = new CourseSchedulePanel();
   
	TabListener queryCourseList = new TabListener(){
		public boolean onBeforeTabSelected(SourcesTabEvents sender, int tabIndex) {
			return true;
		}
		public void onTabSelected(SourcesTabEvents sender, int tabIndex) {
			if(ModelState.getInstance().getCurrPerson() != null)
				RegistrationController.getInstance().setCurrentUserLuiRelations(ModelState.getInstance().getCurrPerson().getPersonId());			
		}};
   
	
   public RegistrationTab(){
	   //this.addTabListener(queryBasket);
	   this.addTabListener(queryCourseList);
	   //add(enrollmentSummaryPanel,"Enrollment Summary");
	   addTab(enrollmentSummaryPanel,ApplicationContext.getViews().get(AdminEditPanel.VIEW_NAME).getMessages().get("enrollmentSummary"));
	   addTab(schedulePanel, "Change");
	   super.setStyleName("gwt-TabBar-Nested");
   }
   
   private void addTab(Widget tabWidget, String text) {
       Label label = new Label(text);
       label.addStyleName("gwt-TabBarItem");
       add(tabWidget, label);
   }
}
