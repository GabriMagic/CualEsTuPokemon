package com.suilerstudios.cetp.controller;

import com.suilerstudios.cetp.component.JugadorComponent;
import com.suilerstudios.moverVentanaComponent.controller.VMBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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

		ImageView logo = new ImageView();
		logo.setFitWidth(50);
		logo.setFitHeight(50);
		logo.setImage(new Image(getClass().getResourceAsStream("../img/logo.png")));

		tablero = new TableroController();
		tablero.getMain().setPrefSize(840, 616);
		movimiento = new VMBox(primaryStage);
		movimiento.getVMBox().setPrefSize(50, 100);
		movimiento.getVMBox().getChildren().add(0, logo);
		root.setStyle("-fx-background-color: rgba(255, 255, 255, 0);");
		info.getMain().setStyle("-fx-background-color: #22313F; ");

		BorderPane izquierda = new BorderPane();
		izquierda.setTop(info.getMain());
		izquierda.setCenter(jugadorComponent.getView());
		izquierda.setStyle("-fx-background-color: #22313F ");
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
