package com.suilerstudios.cetp.controller;

import java.util.ArrayList;
import java.util.List;

import com.suilerstudios.cetp.modelo.JsonFinder;
import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

	
	private VentanaPrincipalController ventana;
	private List<Pokemon> poke;
	private List<FichaController> fichas;
	private Stage secondStage;
	
	private InfoController info;
	
	
	public MainController(Stage primaryStage) {	
		JsonFinder.generarListaPokemon();
		info = new InfoController();
		ventana = new VentanaPrincipalController(primaryStage);
		fichas = new ArrayList<>();
		poke = JsonFinder.getPokes();
		secondStage = new Stage();

		
		for (int i = 0; i < poke.size(); i++) {
			
			fichas.add(new FichaController(poke.get(i),info));
			
			
		}
		
		for (int i = 0; i < fichas.size(); i++) {
			ventana.getTablero().getMain().getChildren().add(fichas.get(i).getView());
			
		}
		
		
		info.bind(poke.get(0));
		
		secondStage.setResizable(false);
		secondStage.setScene(new Scene(info.getMain()));
		secondStage.show();
	}

	
	public TableroController getTablero() {
		return ventana.getTablero();
	}
	public VentanaPrincipalController getVentana() {
		return ventana;
	}
}
