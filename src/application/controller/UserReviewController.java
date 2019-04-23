package application.controller;

import java.io.File;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 * @author Kevin Nguyen (zpp390)
 *
 * 
 */
public class UserReviewController {
	@FXML
	Button button1,button2,button3,button4,button5,submit; 
	@FXML
	ImageView popup ;  
	@FXML
	ImageView rate1, rate2, rate3, rate4, rate5;
	@FXML
	TextField text_review; 
	@FXML
	Label after_submit; 
	private int rating_stars = 0; 
	public void button1 (ActionEvent Event) {
		File home = new File ("rating");
		for (File file: home.listFiles()){
			if (file.getName().equalsIgnoreCase("gold-star.png")) {
				System.out.println ("it's works ");
				Image image = new Image (file.toURI().toString());
				rate1.setImage(image);
				rate1.setRotate(rate1.getRotate() + 180);
				this.rating_stars++; 
			}
		}
	}
	public void button2 (ActionEvent Event) {
		File home = new File ("rating");
		for (File file: home.listFiles()){
			if (file.getName().equalsIgnoreCase("gold-star.png")) {
				System.out.println ("it's works ");
				Image image = new Image (file.toURI().toString());
				rate2.setImage(image);
				rate2.setRotate(rate2.getRotate() + 180);
				this.rating_stars++; 
			}
		}
	}
	public void button3 (ActionEvent Event) {
		File home = new File ("rating");
		for (File file: home.listFiles()){
			if (file.getName().equalsIgnoreCase("gold-star.png")) {
				System.out.println ("it's works ");
				Image image = new Image (file.toURI().toString());
				rate3.setImage(image);
				rate3.setRotate(rate3.getRotate() + 180);
				this.rating_stars++; 
			}
		}
	}
	public void button4 (ActionEvent Event) {
		File home = new File ("rating");
		for (File file: home.listFiles()){
			if (file.getName().equalsIgnoreCase("gold-star.png")) {
				System.out.println ("it's works ");
				Image image = new Image (file.toURI().toString());
				rate4.setImage(image);
				rate4.setRotate(rate4.getRotate() + 180);
				this.rating_stars++; 
			}
		}
	}
	public void button5 (ActionEvent Event) {
		File home = new File ("rating");
		for (File file: home.listFiles()){
			if (file.getName().equalsIgnoreCase("gold-star.png")) {
				System.out.println ("it's works ");
				Image image = new Image (file.toURI().toString());
				rate5.setImage(image);
				rate5.setRotate(rate5.getRotate() + 180);
				this.rating_stars++; 
			}
		}
	}
	public void submit (ActionEvent Event) {
		System.out.println (text_review.getText());
		after_submit.setText("Your review submitted successfully");
		after_submit.setFont(new Font("American Typewriter", 15));
		after_submit.setTextFill(Color.web("#32CD32"));
	}
	public void map_redirect () {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Map.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
