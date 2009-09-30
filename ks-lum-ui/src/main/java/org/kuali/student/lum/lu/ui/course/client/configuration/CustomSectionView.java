package org.kuali.student.lum.lu.ui.course.client.configuration;

import java.util.List;

import org.kuali.student.common.ui.client.configurable.mvc.SectionView;
import org.kuali.student.common.ui.client.mvc.Callback;
import org.kuali.student.common.ui.client.mvc.Controller;
import org.kuali.student.common.ui.client.mvc.Model;
import org.kuali.student.common.ui.client.mvc.ModelRequestCallback;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTO;
import org.kuali.student.core.validation.dto.ValidationResultContainer;
import org.kuali.student.core.validation.dto.ValidationResultInfo.ErrorLevel;
import org.kuali.student.lum.ui.requirements.client.controller.CourseReqManager;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * 
 * Displays Rules pages within this section, allowing end user to navigate between rules screens
 * without using or affecting menu on the left.  
 * 
 * @author Kuali Student Team
 *
 */
public class CustomSectionView extends SectionView {
    
    protected final VerticalPanel panel = new VerticalPanel();
	private boolean loaded = false;
	CourseReqManager childController;	//controls the display of all rules related pages
	
	private Class<? extends ModelDTO> modelDTOType;
	
	private Model<ModelDTO> model = null;
		
	public CustomSectionView(Enum<?> viewEnum, String name, Class<? extends ModelDTO> modelDTOType) {	    
		super(viewEnum, name);
	    super.initWidget(panel);
	    this.modelDTOType = modelDTOType; 
	}
	
    public void beforeShow(){	
		
		if (loaded == false) {
			childController = new CourseReqManager(panel);
			childController.setParentController(getController());
		}
		
		//Request model and redraw view if model changed
	    getController().requestModel(modelDTOType, new ModelRequestCallback<ModelDTO>(){
            public void onModelReady(Model<ModelDTO> m) {
                //if (model != m){
                    model = m;
                    redraw();
                //}                    
            }

            @Override
            public void onRequestFail(Throwable cause) {
                Window.alert("Failed to get model");
            }
            
        });		
		
        if (childController.getCurrentView() == null){
            childController.showDefaultView();
        }
        
        loaded = true;
	}
	
	public void clear(){
	}

    @Override	
	public void redraw(){
		super.updateView(model.get());
	}			

	@Override
	public void updateModel() {
	    childController.saveApplicationState();
	}

	@Override
	public void validate(Callback<ErrorLevel> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processValidationResults(List<ValidationResultContainer> results) {
		// TODO Auto-generated method stub
		
	}
}
