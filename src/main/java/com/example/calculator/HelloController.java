package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        Alert message = new Alert(Alert.AlertType.INFORMATION);
        if(username.equals("admin") && password.equals("1234")){
            message.setContentText("Welcome admin");
            message.show();

        }else {
            message.setContentText("Incorrect username or password, please try again");
            message.show();
        }


    }

}
