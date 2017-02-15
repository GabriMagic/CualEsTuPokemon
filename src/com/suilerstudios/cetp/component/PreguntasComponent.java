package com.suilerstudios.cetp.component;

import java.io.IOException;

import com.suilerstudios.cetp.modelo.Color;
import com.suilerstudios.cetp.modelo.Evoluciones;
import com.suilerstudios.cetp.modelo.Peso;
import com.suilerstudios.cetp.modelo.Tipo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class PreguntasComponent extends VBox {

	@FXML
	private VBox view;

	@FXML
	private ComboBox<String> c1;

	@FXML
	private ComboBox<String> c2;

	private ObservableList<String> datos;

	public PreguntasComponent() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/PreguntasView.fxml"));
			loader.setController(this);
			view = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		datos = FXCollections.observableArrayList();
		datos.add("Color");
		datos.add("Tipo");
		datos.add("Peso");
		datos.add("Evoluciones");
		datos.add("Alas");
		datos.add("Patas");
		datos.add("Pico");
		datos.add("Orejas");
		datos.add("Manchas");
		datos.add("Cola");
		datos.add("Vuela");

		c1.setItems(datos);
		c1.setPromptText("- Elija una opción -");
		c1.valueProperty().addListener((observable, oldValue, newValue) -> {
			System.out.println(newValue);

			switch (c1.getValue().toLowerCase()) {
			case "color":
				c2.getItems().removeAll(c2.getItems());
				for (Color c : Color.values()) {
					c2.getItems().add(c.toString());
				}
				c2.setValue(c2.getItems().get(0));
				break;
			case "tipo":
				c2.getItems().removeAll(c2.getItems());
				for (Tipo c : Tipo.values()) {
					c2.getItems().add(c.toString());
				}
				c2.setValue(c2.getItems().get(0));
				break;
			case "peso":
				c2.getItems().removeAll(c2.getItems());
				for (Peso c : Peso.values()) {
					c2.getItems().add(c.toString());
				}
				c2.setValue(c2.getItems().get(0));
				break;
			case "evoluciones":
				c2.getItems().removeAll(c2.getItems());
				for (Evoluciones c : Evoluciones.values()) {
					c2.getItems().add(c.toString());
				}
				c2.setValue(c2.getItems().get(0));
				break;
			default:
				c2.getItems().removeAll(c2.getItems());
				c2.getItems().add("Si");
				c2.getItems().add("No");
				c2.setValue(c2.getItems().get(0));
				break;
			}
		});
	}

	@FXML
	void onPreguntar(ActionEvent event) {

	}

	public VBox getView() {
		return view;
	}
}
