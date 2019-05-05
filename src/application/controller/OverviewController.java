package application.controller;

import application.Main;
import application.model.UserReview;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class OverviewController {
	@FXML
	ListView<UserReview> commentView;
	
	@FXML
	Label roomNumber, buildingLabel;
	
	/**
	 * @void initilize
	 */
	public void initialize() {
		this.buildingLabel.setText(SelectionController.building.toString());
		this.roomNumber.setText(SelectionController.restroom.toString());
		
		updateList();
	}
	
	/**
	 * @void UpdateList
	 */
	private void updateList() {
		ObservableList<UserReview> reviews = FXCollections.observableArrayList();
		reviews.addAll(SelectionController.restroom.getReviews());
		commentView.getItems().clear();
		commentView.getItems().addAll(reviews);
		commentView.setStyle("-fx-control-inner-background: #2A293E ; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00; -fx-text-fill: #FF0000; -fx-background-insets: 0  ");
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
	 * Moves to UserReview.fxml
	 * @param event
	 */
	public void gotoUserReview(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/UserReview.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
