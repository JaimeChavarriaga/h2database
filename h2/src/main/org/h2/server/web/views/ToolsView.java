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

@Route("tools")
public class ToolsView extends VerticalLayout {

    private final WebSession session;

    public ToolsView(WebSession session) {
        this.session = session;

        H1 title = new H1("Tools");
        add(title);

        Anchor logoutLink = new Anchor("logout", "Logout");
        add(logoutLink);

        Hr separator1 = new Hr();
        add(separator1);

        FormLayout formLayout = new FormLayout();

        RadioButtonGroup<String> toolGroup = new RadioButtonGroup<>();
        toolGroup.setLabel("Select Tool");
        toolGroup.setItems("Backup", "Restore", "Recover", "DeleteDbFiles", "ChangeFileEncryption", "Script", "RunScript", "ConvertTraceFile", "CreateCluster");
        toolGroup.setValue("Backup");
        formLayout.add(toolGroup);

        TextField targetFileNameField = new TextField("Target File Name");
        formLayout.add(targetFileNameField);

        TextField sourceDirectoryField = new TextField("Source Directory");
        formLayout.add(sourceDirectoryField);

        TextField sourceDatabaseNameField = new TextField("Source Database Name");
        formLayout.add(sourceDatabaseNameField);

        add(formLayout);

        Hr separator2 = new Hr();
        add(separator2);

        Button runButton = new Button("Run");
        add(runButton);

        Paragraph commandLineParagraph = new Paragraph("Command line: java -cp h2*.jar org.h2.tools.<span id='toolName'></span> <span id='toolOptions'></span>");
        add(commandLineParagraph);

        Hr separator3 = new Hr();
        add(separator3);

        Paragraph resultParagraph = new Paragraph("Result: <span id='toolResult'></span>");
        add(resultParagraph);
    }
}
