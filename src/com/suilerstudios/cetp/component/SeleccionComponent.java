package com.suilerstudios.cetp.component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.suilerstudios.cetp.modelo.JsonFinder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class SeleccionComponent implements Initializable{


    @FXML
    private HBox root;
    @FXML
    private Button siguienteButton;

    @FXML
    private ImageView pokemonAnteriorImage;

    @FXML
    private Label nombrePokemon;

    @FXML
    private ImageView actualPokemonImage;

    @FXML
    private ImageView siguientePokemonImage;

    @FXML
    private Button anteriorButton;
    
   private SeleccionModel model;

    public SeleccionComponent() {
    	try {
        	FXMLLoader loaderView = new FXMLLoader(getClass().getResource("SeleccionView.fxml"));
        	loaderView.setController(this);
        	root = loaderView.load();
        	
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    
    	model = new SeleccionModel();
    	
    	nombrePokemon.setText(model.getPokemonActual().getNombre());
    	actualPokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+model.getPokemonActual().getCodigoPokemon()+".png")));
    	siguientePokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxSiguiente()).getCodigoPokemon()+".png")));
    	pokemonAnteriorImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxAnterior()).getCodigoPokemon()+".png")));
    	
    }

    @FXML
    void onAnteriorButton(ActionEvent event) {
    	model.Retroceder();
    	nombrePokemon.setText(model.getPokemonActual().getNombre());
    	actualPokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+model.getPokemonActual().getCodigoPokemon()+".png")));
    	siguientePokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxSiguiente()).getCodigoPokemon()+".png")));
    	pokemonAnteriorImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxAnterior()).getCodigoPokemon()+".png")));

    }

    @FXML
    void onSiguienteButton(ActionEvent event) {
    	model.Avanzar();
    	nombrePokemon.setText(model.getPokemonActual().getNombre());
    	actualPokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+model.getPokemonActual().getCodigoPokemon()+".png")));
    	siguientePokemonImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxSiguiente()).getCodigoPokemon()+".png")));
    	pokemonAnteriorImage.setImage(new Image(getClass().getResourceAsStream("../img/"+JsonFinder.getPokes().get(model.getAuxAnterior()).getCodigoPokemon()+".png")));

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public HBox getRoot() {
		return root;
	}

	public void setRoot(HBox root) {
		this.root = root;
	}

	public Button getSiguienteButton() {
		return siguienteButton;
	}

	public void setSiguienteButton(Button siguienteButton) {
		this.siguienteButton = siguienteButton;
	}

	public ImageView getPokemonAnteriorImage() {
		return pokemonAnteriorImage;
	}

	public void setPokemonAnteriorImage(ImageView pokemonAnteriorImage) {
		this.pokemonAnteriorImage = pokemonAnteriorImage;
	}

	public Label getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(Label nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public ImageView getActualPokemonImage() {
		return actualPokemonImage;
	}

	public void setActualPokemonImage(ImageView actualPokemonImage) {
		this.actualPokemonImage = actualPokemonImage;
	}

	public ImageView getSiguientePokemonImage() {
		return siguientePokemonImage;
	}

	public void setSiguientePokemonImage(ImageView siguientePokemonImage) {
		this.siguientePokemonImage = siguientePokemonImage;
	}

	public Button getAnteriorButton() {
		return anteriorButton;
	}

	public void setAnteriorButton(Button anteriorButton) {
		this.anteriorButton = anteriorButton;
	}
    
    
}
