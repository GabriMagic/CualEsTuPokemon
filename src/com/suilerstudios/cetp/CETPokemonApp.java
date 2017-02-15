package com.suilerstudios.cetp;

import com.suilerstudios.cetp.controller.TableroFichasController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CETPokemonApp extends Application {

	private TableroFichasController main;
	private Scene pokemon;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.initStyle(StageStyle.TRANSPARENT);
		main = new TableroFichasController(primaryStage);
		pokemon = new Scene(main.getVentana().getRoot());
		pokemon.setFill(Color.TRANSPARENT);

		primaryStage.setTitle("�Cu�l es tu Pok�mon?");
		primaryStage.setResizable(false);

		primaryStage.setScene(pokemon);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
