package com.suilerstudios.cetp.controller;

import com.suilerstudios.cetp.component.SeleccionComponent;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class RespuestaController {
	private SeleccionComponent sc;
	private Button aceptarButton;
	private VBox root;
	
	public RespuestaController() {
		sc = new SeleccionComponent();
		aceptarButton = new Button("Responder");
		aceptarButton.maxWidth(Double.MAX_VALUE);
		root = new VBox();
		root.getChildren().addAll(sc.getRoot(),aceptarButton);
	}

	public SeleccionComponent getSc() {
		return sc;
	}

	public Button getAceptarButton() {
		return aceptarButton;
	}

	public VBox getRoot() {
		return root;
	}
	
	
}
