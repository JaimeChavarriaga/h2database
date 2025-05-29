package org.h2.server.web.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("login")
@CssImport("./styles/shared-styles.css")
public class LoginView extends VerticalLayout {

    public LoginView() {
        H1 title = new H1("H2 Console Login");

        TextField usernameField = new TextField("Username");
        PasswordField passwordField = new PasswordField("Password");

        Button loginButton = new Button("Login", event -> {
            String username = usernameField.getValue();
            String password = passwordField.getValue();

            // Perform login logic here
            if (authenticate(username, password)) {
                VaadinSession.getCurrent().setAttribute("user", username);
                getUI().ifPresent(ui -> ui.navigate("index"));
            } else {
                Label errorLabel = new Label("Invalid username or password");
                add(errorLabel);
            }
        });

        Div loginForm = new Div(usernameField, passwordField, loginButton);
        loginForm.addClassName("login-form");

        add(title, loginForm);
    }

    private boolean authenticate(String username, String password) {
        // Implement authentication logic here
        return "admin".equals(username) && "password".equals(password);
    }
}
