package br.com.poli.gp.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Mainapp extends Application {

	public static Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("ViewHome.fxml"));
		
		Scene scene = new Scene(root);
		
		Mainapp.stage = primaryStage;
		stage.setScene(scene);
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(Mainapp.class);
	}
}
