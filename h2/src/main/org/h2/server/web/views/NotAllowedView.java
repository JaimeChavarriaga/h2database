package org.h2.server.web.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;

@Route("not-allowed")
public class NotAllowedView extends Div {

    public NotAllowedView() {
        H1 title = new H1("Not Allowed");
        Paragraph message = new Paragraph("Remote connections are disabled.");
        add(title, message);
    }
}
