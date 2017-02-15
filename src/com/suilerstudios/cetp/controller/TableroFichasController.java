package com.suilerstudios.cetp.controller;

import java.util.ArrayList;
import java.util.List;

import com.suilerstudios.cetp.modelo.JsonFinder;
import com.suilerstudios.cetp.modelo.Partida;

import javafx.stage.Stage;

public class TableroFichasController {

	private VentanaPrincipalController ventana;
	private List<FichaController> fichas;

	private InfoController info;

	public TableroFichasController(Stage primaryStage) {
		JsonFinder.generarListaPokemon();

		ventana = new VentanaPrincipalController(primaryStage);
		fichas = new ArrayList<>();
		info = ventana.getInfo();

		for (int i = 0; i < JsonFinder.getPokes().size(); i++)
			fichas.add(new FichaController(JsonFinder.getPokes().get(i), info));

		for (int i = 0; i < fichas.size(); i++)
			ventana.getTablero().getMain().getChildren().add(fichas.get(i).getView());

		info.bind(fichas.get(0).getPokemon());
		
		Partida p = new Partida();
	}

	public TableroController getTablero() {
		return ventana.getTablero();
	}

	public VentanaPrincipalController getVentana() {
		return ventana;
	}
}
