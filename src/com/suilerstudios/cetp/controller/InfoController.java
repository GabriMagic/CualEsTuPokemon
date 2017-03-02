package com.suilerstudios.cetp.controller;

import java.io.IOException;

import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class InfoController {

	@FXML
	private GridPane main;

	@FXML
	private Label nombreLabel;

	@FXML
	private Label colorLabel;

	@FXML
	private Label tipoLabel;

	@FXML
	private Label pesoLabel;

	@FXML
	private Label evolucionesLabel;

	@FXML
	private CheckBox alasCheckBox;

	@FXML
	private CheckBox vuelaCheckBox;

	@FXML
	private CheckBox patasCheckBox;

	@FXML
	private CheckBox picoCheckBox;

	@FXML
	private CheckBox orejasCheckBox;

	@FXML
	private CheckBox manchasCheckBox;

	@FXML
	private CheckBox colaCheckBox;
	// @FXML
	// private Label alasLabel;
	//
	// @FXML
	// private Label patasLabel;
	//
	// @FXML
	// private Label picoLabel;
	//
	// @FXML
	// private Label orejasLabel;
	//
	// @FXML
	// private Label manchasLabel;
	//
	// @FXML
	// private Label colaLabel;
	//
	// @FXML
	// private Label vuelaLabel;
	//

	@FXML
	private ImageView pokemonImagen;

	public InfoController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/suilerstudios/cetp/view/infoPokemon.fxml"));
			loader.setController(this);
			main = loader.load();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	public void bind(Pokemon pokemon) {

		nombreLabel.textProperty().set(pokemon.getNombre());
		pokemonImagen.imageProperty().set(new Image(getClass()
				.getResource("/com/suilerstudios/cetp/img/" + pokemon.getCodigoPokemon() + ".png").toExternalForm()));
		colorLabel.textProperty().set(pokemon.getColor().toString());
		tipoLabel.textProperty().set(pokemon.getTipo().toString());
		pesoLabel.textProperty().set(pokemon.getPeso().toString());
		evolucionesLabel.textProperty().set(pokemon.getEvoluciones().toString());

		alasCheckBox.setSelected(pokemon.hasAlas());
		patasCheckBox.setSelected(pokemon.hasPatas());
		picoCheckBox.setSelected(pokemon.hasPico());
		orejasCheckBox.setSelected(pokemon.hasOrejas());
		manchasCheckBox.setSelected(pokemon.hasOrejas());
		colaCheckBox.setSelected(pokemon.hasCola());
		vuelaCheckBox.setSelected(pokemon.canVuela());
	}

	public GridPane getMain() {
		return main;
	}
}
