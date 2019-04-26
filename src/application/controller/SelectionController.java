package application.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import application.Main;
import application.model.Building;
import application.model.Restroom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class SelectionController {
	@FXML
	ComboBox<Button> buildingDropDown;
	
	@FXML
	ComboBox<Restroom> restroomDropDown;
	
	@FXML
	AnchorPane app;
	
	@FXML
	Button hover;
	
	
	public static Restroom restroom;
	public static Building building;
	private HashMap<Button, Building> buttonMap;
	
	public void initialize() throws FileNotFoundException {
		this.buttonMap = new HashMap();
		File homeDir = new File("data");
		File image_home = new File ("image");
		for (File file : homeDir.listFiles() ) {
			if (file.isDirectory()) {
				Button button = new Button(file.getName());
				for (File f: image_home.listFiles()) {
					if ( file.getName().equalsIgnoreCase(f.getName().substring(0,f.getName().length()-4))) {
						/* Make the image */
						Image image = new Image (f.toURI().toString());
						ImageView imageview = new ImageView (image);
						imageview.setFitHeight(250.0);
						imageview.setFitWidth(300.0);
						
						/* Place image in tooltip */
						Tooltip tt = new Tooltip (); 
						tt.setGraphic(imageview);
						
						/* Add hovering image to combobox items */
						button.setTooltip(tt);
						button.setStyle("-fx-background-color: #333952");
						button.setFont(new Font("American Typewriter", 20));
						button.setTextFill(Color.web("#ffffff"));
						button.setMinWidth(buildingDropDown.getPrefWidth());
						buildingDropDown.getItems().add(button);
						
						/* Associate building with button so we can get it later */ 
						buttonMap.put(button, new Building(file));
					}
				}
			}
		}
		buildingDropDown.setOnAction((event)->{
			System.out.println (buildingDropDown.getSelectionModel().getSelectedItem().getText());
			System.out.println ("Hello");
		});
	}
	
	/**
	 * Moves to Login.fxml
	 * @param event
	 */
	public void gotoLogin(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Moves to Reviews.fxml
	 * @param event The Go! button is pressed
	 */
	public void gotoReviews(ActionEvent event) {
		/* If no selction, do nothing */
		if (SelectionController.restroom == null || SelectionController.building == null) {
			return;
		}
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Reviews.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void pickBuilding(ActionEvent event) {
		Button pressed = (Button) event.getSource();
		SelectionController.building = buttonMap.get(pressed);
		
		/* populate restroom dropdown */
	}
	
	public void pickRestroom(ActionEvent event) {
		
	}
}