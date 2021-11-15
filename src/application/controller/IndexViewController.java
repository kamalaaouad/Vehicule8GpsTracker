package application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class IndexViewController {

	// Event Listener on Button.onAction
	@FXML
	public void onAccessV(ActionEvent event) {
		Parent root;
		try {
			// ((Node)event.getSource()).getScene().getWindow().hide();
			root = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/VehiculeView.fxml"));
			Stage stage = new Stage();
			stage.setTitle("Page Vehicules");
			stage.setScene(new Scene(root, 645, 500));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button.onAction
	@FXML
	public void onAccessT(ActionEvent event) {
		Parent root;
		try {
			// ((Node)event.getSource()).getScene().getWindow().hide();
			root = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/GPSTrackerView.fxml"));
			Stage stage = new Stage();
			stage.setTitle("Page Vehicules");
			stage.setScene(new Scene(root, 645, 500));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button.onAction
	@FXML
	public void onAccessA(ActionEvent event) {
		Parent root;
		try {
			// ((Node)event.getSource()).getScene().getWindow().hide();
			root = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/VehiculeTrackerView.fxml"));
			Stage stage = new Stage();
			stage.setTitle("Page Vehicules");
			stage.setScene(new Scene(root, 645, 500));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
