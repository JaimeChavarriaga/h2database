/*
 * Copyright 2004-2025 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.server.web.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

@Route("")
@PageTitle("Welcome to H2")
public class IndexView extends Div {

    public IndexView() {
        H1 title = new H1("Welcome to H2");
        H2 subtitle = new H2("No Javascript");
        Paragraph paragraph = new Paragraph("If you are not automatically redirected to the login page, then " +
                "Javascript is currently disabled or your browser does not support Javascript. " +
                "For this application to work, Javascript is essential. " +
                "Please enable Javascript now, or use another web browser that supports it.");

        add(title, subtitle, paragraph);
    }
}
