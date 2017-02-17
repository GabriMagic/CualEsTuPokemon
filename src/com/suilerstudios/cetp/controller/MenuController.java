package com.suilerstudios.cetp.controller;

import java.io.IOException;

import com.suilerstudios.cetp.component.SeleccionComponent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MenuController {

	@FXML
	private BorderPane root;

	@FXML
	private VBox menuVbox;

	@FXML
	private Button nuevoJuegoButton;

	@FXML
	private Button salirButton;

	private SeleccionComponent selectComponents ;
	
	public MenuController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MenuView.fxml"));
			loader.setController(this);
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		selectComponents = new SeleccionComponent();
		
		menuVbox.getChildren().add(0,selectComponents.getRoot());
	}

	@FXML
	void onNuevoJuego(ActionEvent event) {

		
		
	}

	@FXML
	void onSalir(ActionEvent event) {

	}

	public BorderPane getRoot() {
		return root;
	}

	public VBox getMenuVbox() {
		return menuVbox;
	}

	public Button getNuevoJuegoButton() {
		return nuevoJuegoButton;
	}

	public Button getSalirButton() {
		return salirButton;
	}



}
