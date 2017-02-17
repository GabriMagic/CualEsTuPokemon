package com.suilerstudios.cetp;

import com.suilerstudios.cetp.controller.MenuController;
import com.suilerstudios.cetp.controller.TableroFichasController;
import com.suilerstudios.cetp.modelo.JsonFinder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CETPokemonApp extends Application {

	
	private Scene pokemon;

	private MenuController menu;
	@Override
	public void start(Stage primaryStage) throws Exception {
		JsonFinder.generarListaPokemon();
		menu = new MenuController(primaryStage);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		
		pokemon = new Scene(menu.getRoot());
		pokemon.setFill(Color.TRANSPARENT);

		primaryStage.setTitle("¿Cuál es tu Pokémon?");
		primaryStage.setResizable(false);
		
		// carga de icono
		primaryStage.getIcons().add(new Image("/com/suilerstudios/cetp/img/logo.png"));

		primaryStage.setScene(pokemon);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
