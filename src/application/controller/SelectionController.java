package application.controller;

import java.io.File;
import java.util.ArrayList;

import application.Main;
import application.model.Building;
import application.model.Restroom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

public class SelectionController {
	@FXML
	ComboBox<Building> buildingDropDown;
	
	@FXML
	ComboBox<Restroom> restroomDropDown;
	
	private ArrayList<Building> buildings;
	private ArrayList<Restroom> restrooms;
	
	public void initialize() {
		buildings = new ArrayList<Building>();
		
		File homeDir = new File("data");
		System.out.println(homeDir.getAbsolutePath());
		for (File file : homeDir.listFiles()) {
			if (file.isDirectory()) {
				buildings.add(new Building(file));
			}
		}
		
		buildingDropDown.getItems().addAll(buildings);
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
