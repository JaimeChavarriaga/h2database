/*
 * Copyright 2004-2025 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.server.web.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.h2.server.web.WebSession;
import org.h2.server.web.WebServer;

@Route("tables")
public class TablesView extends VerticalLayout {

    private final WebSession webSession;

    public TablesView() {
        this.webSession = WebServer.getCurrentWebSession();
        init();
    }

    private void init() {
        Grid<String> grid = new Grid<>();
        grid.addColumn(String::toString).setHeader("Tables");

        // Fetch tables from the database and add to the grid
        webSession.getContents().getTables().forEach(table -> grid.setItems(table.getName()));

        add(grid);
    }
}
