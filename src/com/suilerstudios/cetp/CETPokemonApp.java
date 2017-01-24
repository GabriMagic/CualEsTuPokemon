package com.suilerstudios.cetp;

import com.suilerstudios.cetp.controller.FichaController;
import com.suilerstudios.cetp.controller.MainController;
import com.suilerstudios.cetp.controller.TableroController;
import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CETPokemonApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		MainController main = new MainController();
		
		primaryStage.setScene(new Scene(main.getTablero().getMain()));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
