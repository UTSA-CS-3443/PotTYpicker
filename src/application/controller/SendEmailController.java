package application.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


/**
 * @author Kevin Nguyen (zpp390)
 *
 * 
 */
public class SendEmailController {

	
	@FXML
	TextField display; 
	@FXML
	Button toilet_paper, toilet,tower_paper,hand_dryer,sink,urinals,SubmitRequest;
	public static String subject; 
	/**
	 * 	
	 * @param Event
	 */
	public void toilet(ActionEvent Event) {
		display.setText("Hello, I think one of your toilets is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH THE TOILET"; 
	}
	/**
	 * 
	 * @param Event
	 */
	public void sink(ActionEvent Event) {
		display.setText("Hello, I think one of your sinks is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMEWRONG WITH THE SINK";
	}
	/**
	 * 
	 * @param Event
	 */
	public void urinals(ActionEvent Event) {
		display.setText("Hello, I think one of your urinals is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH URINALS";
	}
	/**
	 * 
	 * @param Event
	 */
	public void hand_dryer(ActionEvent Event) {
		display.setText("Hello, I think one of your hand dryers is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH HAND DRYER"; 
	}
	/**
	 * 
	 * @param Event
	 */
	public void toilet_paper(ActionEvent Event) {
		display.setText("Hello, I think there is no more toilet paper, \nCan you please exchange the toilet paper!");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "NEED SOME TOILET PAPERS"; 
	}
	/**
	 * 
	 * @param Event
	 */
	public void tower_paper(ActionEvent Event) {
		display.setText("Hello, I think there is no more paper towers, \nCan you please exchange the paper towers");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "NEED SOME PAPER TOWERS"; 
	}
	/**
	 * Submit request to local host: port 587 
	 * @param Event
	 */
	public void SubmitRequest (ActionEvent Event) {
		//You can change to your email for testing. 
		String to = "Your Email";

		// Sender's email ID needs to be mentioned, (Dummy Email account)
		String from = "muahua51@gmail.com";
		final String username = "muahua51@gmail.com";//change accordingly
		final String password = "Really!.";//change accordingly

		// Assuming you are sending email through imap.gmail.com
		String host = "imap.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object.
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			// Set Subject: header field
			message.setSubject(this.subject);

			// Now set the actual message
			message.setText(display.getText());

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/UserReview.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
