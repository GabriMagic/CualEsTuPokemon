package com.suilerstudios.cetp.controller;


import com.suilerstudios.moverVentanaComponent.controller.VMBox;


import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VentanaPrincipalController {

	private HBox root;
	private TableroController tablero;
	private VMBox movimiento;
	
	
	public VentanaPrincipalController(Stage primaryStage) {
	
		root = new HBox();
		HBox spacing = new HBox();
		spacing.setPrefWidth(50);
		spacing.setPrefHeight(40);
		spacing.setStyle("-fx-background-color: rgba(255, 0, 0, 0.8);" );
		tablero = new TableroController();
		movimiento = new VMBox(primaryStage);
		movimiento.getVMBox().setPrefSize(50, 100);
		movimiento.getVMBox().getChildren().add(0, spacing);
		root.setStyle("-fx-background-color: rgba(255, 255, 255, 0);" );
		root.getChildren().add(movimiento.getVMBox());
		root.getChildren().add(tablero.getMain());
		
	}
	
	
	public TableroController getTablero() {
		return tablero;
	}
	public HBox getRoot() {
		return root;
	}
}
