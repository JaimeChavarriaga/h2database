/*
 * Copyright 2004-2025 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.server.web.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import org.h2.server.web.WebServer;
import org.h2.server.web.WebSession;

@Route("query")
public class QueryView extends VerticalLayout {

    private final WebServer server;
    private final WebSession session;
    private final TextArea queryArea;
    private final Button executeButton;
    private final Grid<Object[]> resultGrid;

    public QueryView(WebServer server, WebSession session) {
        this.server = server;
        this.session = session;

        queryArea = new TextArea("SQL Query");
        queryArea.setWidthFull();

        executeButton = new Button("Execute", event -> executeQuery());

        resultGrid = new Grid<>();
        resultGrid.setWidthFull();

        add(queryArea, executeButton, resultGrid);
    }

    private void executeQuery() {
        String query = queryArea.getValue();
        // Execute the query and populate the resultGrid with the results
        // This is a placeholder for the actual query execution logic
    }
}
