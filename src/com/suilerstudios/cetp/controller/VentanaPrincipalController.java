package com.suilerstudios.cetp.controller;

import com.suilerstudios.cetp.component.JugadorComponent;
import com.suilerstudios.moverVentanaComponent.controller.VMBox;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentanaPrincipalController {

	private HBox root;
	private TableroController tablero;
	private VMBox movimiento;
	private InfoController info;
	private JugadorComponent jugadorComponent;

	public VentanaPrincipalController(Stage primaryStage) {

		jugadorComponent = new JugadorComponent();
		info = new InfoController();
		root = new HBox();
		HBox spacing = new HBox();
		spacing.setPrefWidth(50);
		spacing.setPrefHeight(40);
		spacing.setStyle("-fx-background-color: rgba(255, 0, 0, 0.8);");
		tablero = new TableroController();
		tablero.getMain().setPrefSize(840, 700);
		movimiento = new VMBox(primaryStage);
		movimiento.getVMBox().setPrefSize(50, 100);
		movimiento.getVMBox().getChildren().add(0, spacing);
		root.setStyle("-fx-background-color: rgba(255, 255, 255, 0);");
		info.getMain().setStyle("-fx-background-color: #22313F; ");

		VBox izquierda = new VBox(info.getMain(),jugadorComponent.getView());
		root.getChildren().add(izquierda);
		root.getChildren().add(tablero.getMain());
		root.getChildren().add(movimiento.getVMBox());

	}

	public TableroController getTablero() {
		return tablero;
	}

	public HBox getRoot() {
		return root;
	}

	public InfoController getInfo() {
		return info;
	}
}
