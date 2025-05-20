package org.h2.server.web.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.h2.server.web.WebSession;

@Route("admin")
public class AdminView extends VerticalLayout {

    private final WebSession session;

    public AdminView(WebSession session) {
        this.session = session;

        H1 title = new H1("Admin Console");
        add(title);

        Anchor logoutLink = new Anchor("logout", "Logout");
        add(logoutLink);

        Hr separator1 = new Hr();
        add(separator1);

        FormLayout formLayout = new FormLayout();

        RadioButtonGroup<String> allowOthersGroup = new RadioButtonGroup<>();
        allowOthersGroup.setLabel("Allow Others");
        allowOthersGroup.setItems("Local", "Others");
        allowOthersGroup.setValue("Local");
        formLayout.add(allowOthersGroup);

        TextField webExternalNamesField = new TextField("Web External Names");
        formLayout.add(webExternalNamesField);

        RadioButtonGroup<String> sslGroup = new RadioButtonGroup<>();
        sslGroup.setLabel("Connection");
        sslGroup.setItems("HTTP", "HTTPS");
        sslGroup.setValue("HTTP");
        formLayout.add(sslGroup);

        TextField portField = new TextField("Port");
        formLayout.add(portField);

        add(formLayout);

        Hr separator2 = new Hr();
        add(separator2);

        Button saveButton = new Button("Save");
        add(saveButton);

        Paragraph restartParagraph = new Paragraph("Restart required after saving changes.");
        add(restartParagraph);

        Hr separator3 = new Hr();
        add(separator3);

        Button translateButton = new Button("Start Translation");
        add(translateButton);

        Paragraph translateHelpParagraph = new Paragraph("Help text for translation.");
        add(translateHelpParagraph);

        Hr separator4 = new Hr();
        add(separator4);

        H1 sessionsTitle = new H1("Sessions");
        add(sessionsTitle);

        // Add session information here

        Hr separator5 = new Hr();
        add(separator5);

        Button shutdownButton = new Button("Shutdown");
        add(shutdownButton);
    }
}
