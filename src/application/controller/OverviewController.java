package application.controller;

import application.model.UserReview;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class OverviewController {
	@FXML
	ListView<UserReview> commentView;
	
	@FXML
	Label roomNumber, buildingLabel;
	
	public void initialize() {
		this.buildingLabel.setText(SelectionController.building.toString());
		this.roomNumber.setText(SelectionController.restroom.toString());
		
		updateList();
	}
	
	private void updateList() {
		ObservableList<UserReview> reviews = FXCollections.observableArrayList();
		reviews.addAll(SelectionController.restroom.getReviews());
		commentView.getItems().clear();
		commentView.getItems().addAll(reviews);
	}
}
