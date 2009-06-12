package org.kuali.student.common.ui.client.application;

import java.util.ArrayList;
import java.util.List;

import org.kuali.student.common.ui.client.widgets.KSImage;
import org.kuali.student.common.ui.client.widgets.KSLabel;
import org.kuali.student.common.ui.client.widgets.breadcrumb.KSBreadcrumb;
import org.kuali.student.common.ui.client.widgets.breadcrumb.KSBreadcrumbItem;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Header extends Composite {
    private final VerticalPanel main = new VerticalPanel();

    private final SimplePanel logoContentPanel = new SimplePanel();
    private final DockPanel logoPanel = new DockPanel();

    private final HorizontalPanel linksContentPanel = new HorizontalPanel();
    private final DockPanel linksPanel = new DockPanel();

    private List<KSBreadcrumbItem> breadcrumbItems;
    private List<HeaderLinkItem> linkItems;

    private KSBreadcrumb breadcrumb;

    private final KSImage logo = new KSImage("images/KS_logo_on_grey.jpg");
    private final KSImage separator1 = new KSImage("images/red_gradient_1.jpg");
    private final KSImage separator2 = new KSImage("images/red_gradient_2.jpg");

    /**
     * 
     * This constructs a default Header with no Breadcrumb menu and just Logout and Preferences 
     * function links.
     *
     */
    public Header() {
        super();
        breadcrumbItems = new ArrayList<KSBreadcrumbItem>();
        linkItems = new ArrayList<HeaderLinkItem>();
        initHeader();
    }

    /**
     * 
     * This constructs a custom Header with breadcrumb menu and additional function links. N.B Always get Logout 
     * and Preferences functions
     * 
     * if only one of breadcrumb or links is required, set other parameter to null
     * 
     * @param breadcrumbItems
     * @param linkItems
     */
    public Header(List<KSBreadcrumbItem> breadcrumbItems,
            List<HeaderLinkItem> linkItems) {
        super();
        this.breadcrumbItems = breadcrumbItems;
        this.linkItems = linkItems;
        initHeader();
    }

    private void initHeader() {
        super.initWidget(main);

        buildLogoPanel();
        main.add(logoPanel);

        main.add(separator1);
        buildLinksPanel();
        main.add(linksPanel);    
        main.add(separator2);

        if (breadcrumbItems != null &&
                !breadcrumbItems.isEmpty()) {
            buildBreadcrumb();
            main.add(breadcrumb);
        }
        main.addStyleName("KS-Header");
    }

    private void buildLogoPanel() {

        logo.addStyleName("KS-Header-Logo");
        logoContentPanel.add(logo);
        logoContentPanel.addStyleName("KS-Header-Logo-Panel");
        
        //logoPanel is a spacer panel to allow for expansion of browser
        logoPanel.add(logoContentPanel ,DockPanel.WEST);
        logoPanel.addStyleName("KS-Header-Logo-Spacer");
        logoPanel.setHorizontalAlignment(DockPanel.ALIGN_LEFT);
        logoPanel.setVerticalAlignment(DockPanel.ALIGN_BOTTOM);
    }

    private void buildLinksPanel() {

        separator1.addStyleName("KS-Header-Separator");
        separator2.addStyleName("KS-Header-Separator");

        if (linkItems == null) {
            linkItems = new ArrayList<HeaderLinkItem>();
        }

        // Always have logout and preferences options
        linkItems.add(new HeaderLinkItem("Preferences", "Create, modify or delete user preferences", "Preferences not yet implemented"));
        linkItems.add(new HeaderLinkItem("Logout", "End current Kuali Student session", GWT.getModuleBaseURL()+"../j_spring_security_logout"/*"Logout not yet implemented"*/));

        for (HeaderLinkItem i : linkItems) {
            linksContentPanel.add(buildLink(i.getText(), i.getTitle(), i.getActionUrl()));           
        }

        linksContentPanel.addStyleName("KS-Header-Link-Panel");

        //linksPanel is a spacer panel for right alignment of links
        linksPanel.add(linksContentPanel ,DockPanel.EAST);
        linksPanel.addStyleName("KS-Header-Link-Spacer");
        linksPanel.setHorizontalAlignment(DockPanel.ALIGN_RIGHT);
        linksPanel.setVerticalAlignment(DockPanel.ALIGN_BOTTOM);
    }

    private KSLabel buildLink(final String text, final String title, final String actionUrl) {
        //TODO need to add the action for the link        

        //Using KSLabel for now - couldn't change color for Anchor
        final KSLabel link = new KSLabel(text);
        link.addStyleName("KS-Header-Link");
        link.setTitle(title);
        link.addMouseOverHandler(new MouseOverHandler() {

            @Override
            public void onMouseOver(MouseOverEvent event) {
                link.addStyleName("KS-Header-Link-Focus");               
            }});

        link.addMouseOutHandler(new MouseOutHandler() {

            @Override
            public void onMouseOut(MouseOutEvent event) {
                link.removeStyleName("KS-Header-Link-Focus");               

            }});
        link.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                //TODO need to set actionUrl
                Window.Location.assign(actionUrl);               
            }});

        return link;

    }

    private void buildBreadcrumb() {
        //TODO need to allow Linked or Unlinked breadcrumb lists

        breadcrumb = new KSBreadcrumb();
        breadcrumb.setUnLinkedBreadcrumbList(breadcrumbItems);
        breadcrumb.addStyleName("KS-Header-Breadcrumb");

    }   

}
