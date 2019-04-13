package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
	@FXML
	Label message;
	
	public static User user;
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Logs the user in after validating credentials and shows them the next view
	 * @param event The Login button is pressed
	 */
	public void login (ActionEvent event) {
		LoginController.user = new User(username.getText(), password.getText());
		System.out.println(username.getText() + " " + password.getText() + "<");
		try {
			boolean isValid = LoginController.user.validate();
			if (!isValid)
				message.setText("Your username/password is incorrect.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates a new user by called User.newUser() with arguments
	 * from username and password fields
	 * @param event The register button is pressed
	 */
	public void register(ActionEvent event) {
		try {
			LoginController.user = User.newUser(username.getText(), password.getText());
			message.setText("Successfully registered");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
