package com.suilerstudios.cetp;

import com.suilerstudios.cetp.controller.MainController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CETPokemonApp extends Application {

	private MainController main;
	private Scene pokemon;
	// private PartidaController partidaController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.initStyle(StageStyle.TRANSPARENT);
		main = new MainController(primaryStage);
		pokemon = new Scene(main.getVentana().getRoot());
		pokemon.setFill(Color.TRANSPARENT);

		primaryStage.setTitle("¿Cuál es tu Pokémon?");
		primaryStage.setResizable(false);

		primaryStage.setScene(pokemon);
//		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
