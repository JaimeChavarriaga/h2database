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

@Route("header")
@PageTitle("Header")
public class HeaderView extends Div {

    public HeaderView() {
        H1 title = new H1("Header Page");
        H2 subtitle = new H2("This is the header page");
        Paragraph paragraph = new Paragraph("This page is a placeholder for the header content.");

        add(title, subtitle, paragraph);
    }
}
