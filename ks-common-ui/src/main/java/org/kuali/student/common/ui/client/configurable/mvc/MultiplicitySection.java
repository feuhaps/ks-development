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
package org.kuali.student.common.ui.client.configurable.mvc;

import java.util.ArrayList;
import java.util.List;

import org.kuali.student.common.ui.client.mvc.Callback;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTO;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTOValue;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTO.Updater;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTOValue.StringType;
import org.kuali.student.common.ui.client.mvc.dto.ModelDTOValue.ModelDTOType;
import org.kuali.student.core.validation.dto.ValidationResultContainer;
import org.kuali.student.core.validation.dto.ValidationResultInfo;

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;

/**
 * This is a section that can be added to a MultiplictyComposite. It is a configurable
 * section which allows the section to be defined by adding fields and nested sections.
 * 
 * 
 * Although this implements the HasModelDTOValue interface, it only supports
 * the ModelDTOValue type of MODELDTO.
 * 
 * 
 * @author Kuali Student Team
 * 
 */
public class MultiplicitySection extends Section implements HasModelDTOValue{

    private ModelDTOValue modelDTOValue; 
    protected FlowPanel panel;
    private String modelDtoClassName;
    private String type;
    private String state;

    public MultiplicitySection(String modelDtoClassName){
        init(modelDtoClassName, null, null);
    }
    
    public MultiplicitySection(String modelDtoClassName, String type, String state){
        init(modelDtoClassName, type, state);
    }

    public void init(String modelDtoClassName, String type, String state){
        fields = new ArrayList<FieldDescriptor>();
        panel = new FlowPanel();
        this.modelDtoClassName = modelDtoClassName;
        this.type = type;
        initWidget(panel);        
    }
    
    /**
     * @see org.kuali.student.common.ui.client.configurable.mvc.ConfigurableLayoutSection#addField(org.kuali.student.common.ui.client.configurable.mvc.FieldDescriptor)
     */
    @Override
    public void addField(FieldDescriptor fieldDescriptor) {
        super.addField(fieldDescriptor);
        
        RowDescriptor row = rows.get(rows.size()-1);

        if (fieldDescriptor.getFieldWidget() instanceof MultiplicityComposite){
            MultiplicityComposite listField = (MultiplicityComposite)fieldDescriptor.getFieldWidget(); 
            listField.redraw();                  
        }
        panel.add(row);
    }
    
    @Override
    public void addSection(Section section) {
        super.addSection(section);
        section.redraw();
        panel.add(section);
    }
    

    /**
     * @see org.kuali.student.common.ui.client.configurable.mvc.HasModelDTOValue#getModelDTOValue()
     */
    @Override
    public ModelDTOValue getValue() {
        if (modelDTOValue == null){
            ModelDTO modelDTO = new ModelDTO(modelDtoClassName);
            Updater updater = modelDTO.beginUpdate(true);
            updater.put("type", new ModelDTOValue.StringType(this.type));
            modelDTOValue = new ModelDTOValue.ModelDTOType(modelDTO);            
        }
        
        return this.modelDTOValue;
    }

    /**
     * @see org.kuali.student.common.ui.client.configurable.mvc.HasModelDTOValue#setModelDTOValue(org.kuali.student.common.ui.client.mvc.dto.ModelDTOValue)
     * 
     * Set the ModelDTOValue for the multiplicity section. The ModelDTOValue must be of type MODELDTO.
     */
    @Override
    public void setValue(ModelDTOValue modelDTOValue) {
        assert(modelDTOValue instanceof ModelDTOValue.ModelDTOType);
        this.modelDTOValue = modelDTOValue;

        redraw();
    }

    /**
     * @see org.kuali.student.common.ui.client.configurable.mvc.HasModelDTOValue#updateModelDTOValue()
     */
    @Override
    public void updateModelDTOValue() {        
        ModelDTO modelDTO = ((ModelDTOValue.ModelDTOType)modelDTOValue).get();
        super.updateModel(modelDTO);
    }

    public void clear(){
        //TODO: How should a section be cleared, reset contained widgets or remove all widgets?
    }
    
    /**
     * 
     * This method redraws the widget
     *
     */
    public void redraw(){
        if (modelDTOValue != null){
        	super.updateView(((ModelDTOType) modelDTOValue).get());
        }
    }

	@Override
	public void validate(Callback<ValidationResultInfo.ErrorLevel> callback) {
		// TODO Auto-generated method stub
		
	}

    /**
     * @see com.google.gwt.user.client.ui.HasValue#setValue(java.lang.Object, boolean)
     */
    @Override
    public void setValue(ModelDTOValue value, boolean fireEvents) {
        setValue(value);
    }

    /**
     * @see com.google.gwt.event.logical.shared.HasValueChangeHandlers#addValueChangeHandler(com.google.gwt.event.logical.shared.ValueChangeHandler)
     */
    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<ModelDTOValue> handler) {        
        // TODO: Add value change handlers
        return null;
    }

}
