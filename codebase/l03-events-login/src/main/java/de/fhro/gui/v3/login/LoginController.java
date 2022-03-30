/*
 * _____________________________________________________________________________
 *
 *           Project:    GUI 2015
 * _____________________________________________________________________________
 *
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 *
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________
 */
package de.fhro.gui.v3.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Login.
 *
 * @author weigend
 */
public class LoginController implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);



    @FXML
    private TextField userInput;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private Button loginButton;

    public LoginController() {
        LOGGER.info("Constructor");

        LOGGER.info("Constructor Button: {}", loginButton);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOGGER.info("initialize Button: {}", loginButton);

        loginButton.addEventHandler(ActionEvent.ACTION, (event) -> {
            //don't log passwords in real life!
            LOGGER.info("do login: {} {}", userInput.getText(), passwordInput.getText());
            //actual login here
        });

        LOGGER.info("Initialization done!");
    }

}
