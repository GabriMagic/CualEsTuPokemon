package com.suilerstudios.cetp.component;

import com.suilerstudios.cetp.modelo.JsonFinder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class testMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		JsonFinder.generarListaPokemon();
		SeleccionComponent s = new SeleccionComponent();
		primaryStage.setScene(new Scene(s.getRoot()));
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
