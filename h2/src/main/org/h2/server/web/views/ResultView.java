/*
 * Copyright 2004-2025 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (https://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.server.web.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

@Route("result")
@PageTitle("Result")
public class ResultView extends Div {

    public ResultView() {
        Paragraph resultParagraph = new Paragraph("Result will be displayed here.");
        add(resultParagraph);
    }
}
