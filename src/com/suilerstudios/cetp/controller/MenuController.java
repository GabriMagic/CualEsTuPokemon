package com.suilerstudios.cetp.controller;

import java.io.IOException;

import com.suilerstudios.cetp.component.SeleccionComponent;
import com.suilerstudios.cetp.modelo.Partida;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * � 2017 Suiler Studios
 * 
 * @author Xilerth
 * @author GabriMagic
 * @author LordOxikran
 * @author Civix
 *
 */
public class MenuController {

	@FXML
	private BorderPane root;

	@FXML
	private VBox menuVbox;

	@FXML
	private Button nuevoJuegoButton;

	@FXML
	private Button salirButton;

	private SeleccionComponent selectComponents;

	private TableroFichasController main;

	private Stage primaryStage;

	public MenuController(Stage primaryStage) {
		this.primaryStage = primaryStage;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/suilerstudios/cetp/view/MenuView.fxml"));
			loader.setController(this);
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		selectComponents = new SeleccionComponent();
		menuVbox.getChildren().add(0, selectComponents.getRoot());
	}

	@FXML
	void onNuevoJuego(ActionEvent event) {
		Scene pokemon;
		Stage secondStage = new Stage();
		secondStage.initStyle(StageStyle.TRANSPARENT);

		Partida p = new Partida();
		p.setPokemonJugador(selectComponents.getPokemon());
		main = new TableroFichasController(secondStage, p);
		pokemon = new Scene(main.getVentana().getRoot());
		pokemon.setFill(Color.TRANSPARENT);

		secondStage.setTitle("�Cu�l es tu Pok�mon?");
		secondStage.setResizable(false);

		// carga de icono
		secondStage.getIcons().add(new Image("/com/suilerstudios/cetp/img/logo.png"));

		secondStage.setScene(pokemon);
		secondStage.show();
		primaryStage.close();
	}

	@FXML
	void onSalir(ActionEvent event) {
		primaryStage.close();
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
