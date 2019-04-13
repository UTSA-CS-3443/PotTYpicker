package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author Kevin Nguyen (zpp390)
 *
 * 
 */
public class LoginController implements Initializable { 
	@FXML
	TextField username; 
	@FXML
	PasswordField password; 
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void login (ActionEvent event) {
		String user = username.getText(); 
		String pass = password.getText();
	}
}
