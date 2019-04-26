package application.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
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
		/*
		String to = "an.nguyen1197@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "muahua51@gmail.com";
		final String username = "muahua51@gmail.com";//change accordingly
		final String password = "Baoan826111997";//change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
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
			message.setSubject("");

			// Now set the actual message
			message.setText("This is what I need");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
*/

	public void toilet(ActionEvent Event) {
		display.setText("Hello, I think one of your toilet is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH THE TOILET"; 
	}
	public void sink(ActionEvent Event) {
		display.setText("Hello, I think one of your sink is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMEWRONG WITH THE SINK";
	}
	public void urinals(ActionEvent Event) {
		display.setText("Hello, I think one of your urinal is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH URINALS";
	}
	public void hand_dryer(ActionEvent Event) {
		display.setText("Hello, I think one of your hand dryer is broken. Please come check it out");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "SOMETHING WRONG WITH HAND DRYER"; 
	}
	public void toilet_paper(ActionEvent Event) {
		display.setText("Hello, I think there is no more toilet paper, \nCan please you exchange the toilet paper!");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "NEED SOME TOILET PAPERS"; 
	}
	public void tower_paper(ActionEvent Event) {
		display.setText("Hello, I think there is no more tower paper, \nCan please you exchange the toilet paper!");
		display.setFont(new Font("American Typewriter", 18));
		display.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #00ff00; ");
		display.setAlignment(Pos.TOP_LEFT);
		this.subject = "NEED SOME PAPER TOWERS"; 
	}
	public void SubmitRequest (ActionEvent Event) {
		String to = "an.nguyen1197@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "muahua51@gmail.com";
		final String username = "muahua51@gmail.com";//change accordingly
		final String password = "Really!.";//change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
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
	}

}
