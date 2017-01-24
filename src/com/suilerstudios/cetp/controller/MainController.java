package com.suilerstudios.cetp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.suilerstudios.cetp.modelo.JsonFinder;
import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.fxml.FXMLLoader;

public class MainController {

	
	TableroController tablero;
	List<Pokemon> poke;
	List<FichaController> fichas;
	
	public MainController() {
		JsonFinder.generarListaPokemon();
		tablero = new TableroController();
		fichas = new ArrayList<>();
		poke = JsonFinder.getPokes();
		
		for (int i = 0; i < poke.size(); i++) {
			
			fichas.add(new FichaController(poke.get(i)));
			
		}
		
		for (int i = 0; i < fichas.size(); i++) {
			tablero.getMain().getChildren().add(fichas.get(i).getView());
		}
		
		
		
	}

	public TableroController getTablero() {
		return tablero;
	}
}
