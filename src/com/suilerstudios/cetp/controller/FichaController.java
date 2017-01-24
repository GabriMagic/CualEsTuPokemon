package com.suilerstudios.cetp.controller;


	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.VBox;

	public class FichaController implements Initializable{ 

	    @FXML
	    private VBox view;

	    @FXML
	    private ImageView imgPokemon;

	    @FXML
	    private Label nomPokemon;

	    private Pokemon pokemon;
	   
	    public FichaController(Pokemon pokemon) {
		
	    	this.pokemon = pokemon;
	    	
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/FichaView.fxml"));
				loader.setController(this);
				view=loader.load();
				
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			nomPokemon.textProperty().set(pokemon.getNombre());
			
		}


		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}


		public VBox getView() {
			return view;
		}


		public void setView(VBox view) {
			this.view = view;
		}


		public ImageView getImgPokemon() {
			return imgPokemon;
		}


		public void setImgPokemon(ImageView imgPokemon) {
			this.imgPokemon = imgPokemon;
		}


		public Label getNomPokemon() {
			return nomPokemon;
		}


		public void setNomPokemon(Label nomPokemon) {
			this.nomPokemon = nomPokemon;
		}


		public Pokemon getPokemon() {
			return pokemon;
		}


		public void setPokemon(Pokemon pokemon) {
			this.pokemon = pokemon;
		}

}
