package org.kuali.student.common.ui.client.widgets.menus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gwt.event.dom.client.ClickHandler;

/**
 * The data object used to populate interactive ui menus.
 * 
 * @author Kuali Student Team
 *
 */
public class KSMenuItemData {
	private String label;
	private ClickHandler clickHandler;
	private List<KSMenuItemData> subItems = new ArrayList<KSMenuItemData>();
	private KSMenuItemData parent = null;

	public KSMenuItemData(String label) {
		super();
		this.label = label;
	}
	
	/**
	 * Get the text used for this menu item
	 * 
	 * @return the "label" for this menu item
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * Set the label to be used in the menu for this menu item
	 * 
	 * @param label the "label" of this menu item
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * Get the ClickHandler for this menu item.
	 * 
	 * @return ClickHandler which controls what this menu item does when selected
	 */
	public ClickHandler getClickHandler() {
		return clickHandler;
	}
	/**
	 * Set the click handler for this menu item (what the menu item does when selected).
	 * 
	 * @param clickHandler a ClickHandler for this menu item.
	 */
	public void setClickHandler(ClickHandler clickHandler) {
		this.clickHandler = clickHandler;
	}
	
	/**
	 * Adds a KSMenuItemData to the list of children for this menu "category".
	 * 
	 * @param item a KSMenuItemData that is a child of this KSMenuItemData
	 */
	public void addSubItem(KSMenuItemData item) {
		subItems.add(item);
		item.setParent(this);
	}
	
	/**
	 * Gets the list of sub items (children) in this KSMenuItemData
	 * 
	 * @return the list of sub items in this KSMenuItemData
	 */
	public List<KSMenuItemData> getSubItems() {
		return Collections.unmodifiableList(subItems);
	}

    /**
     * Set the parent of this KSMenuItemData
     * 
     * @param parent the KSMenuItemData which is the parent KSMenuItemData (category)
     */
    public void setParent(KSMenuItemData parent) {
        this.parent = parent;
    }

    /**
     * Gets the parent of this KSMenuItemData
     * 
     * @return the paren of this KSMenuItemData
     */
    public KSMenuItemData getParent() {
        return parent;
    }
}
