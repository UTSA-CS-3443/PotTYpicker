package application.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import application.Main;
import application.model.Building;
import application.model.Restroom;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

public class SelectionController {
	@FXML
	ComboBox<String> buildingDropDown;

	@FXML
	ComboBox<Restroom> restroomDropDown;
	@FXML
	AnchorPane app = new AnchorPane(); 
	@FXML
	ImageView imageview = new ImageView (); 
	
	private ArrayList<String> buildings;
	private ArrayList<Restroom> restrooms;

	public void initialize() throws FileNotFoundException {
		buildings = new ArrayList<String>();
		File homeDir = new File("data");
		File image_home = new File ("image");
		for (File file : homeDir.listFiles() ) {
			if (file.isDirectory()) {
				buildings.add(file.getName()); 
			}
			buildingDropDown.getItems().addAll(buildings);
		}

		/*for (File file: homeDir.listFiles()) {
			if (file.isDirectory()) {
			buildings.add(file.getName());
			}
		}
		buildingDropDown.getItems().addAll(buildings);
		 */
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
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Reviews.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
