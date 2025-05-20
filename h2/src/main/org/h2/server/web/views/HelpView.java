package org.h2.server.web.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("help")
public class HelpView extends VerticalLayout {

    public HelpView() {
        H1 title = new H1("Help");
        add(title);

        Hr separator1 = new Hr();
        add(separator1);

        Paragraph importantCommands = new Paragraph("Important Commands:");
        add(importantCommands);

        // Add more help content here

        Hr separator2 = new Hr();
        add(separator2);

        Paragraph sampleSQL = new Paragraph("Sample SQL:");
        add(sampleSQL);

        // Add sample SQL content here

        Hr separator3 = new Hr();
        add(separator3);

        Paragraph addDrivers = new Paragraph("Add Drivers:");
        add(addDrivers);

        // Add add drivers content here
    }
}
