package com.suilerstudios.cetp.controller;


	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

	public class FichaController implements Initializable{ 

	    @FXML
	    private VBox view;

	    @FXML
	    private ImageView imgPokemon;

	    @FXML
	    private Label nomPokemon;

	    private Pokemon pokemon;
	   
	    private int estado;
	    
	    private InfoController info;
	    public FichaController(Pokemon pokemon, InfoController info) {
		
	    	this.pokemon = pokemon;
	    	this.info = info;
	    	estado=0;
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/FichaView.fxml"));
				loader.setController(this);
				view=loader.load();
				
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			nomPokemon.textProperty().set(pokemon.getNombre());
			imgPokemon.imageProperty().set(new Image(getClass().getResource("../img/"+pokemon.getCodigoPokemon()+".png").toExternalForm()));
			
		}


		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}

	    @FXML
	    void onFichaMouseEntered(MouseEvent event) {

	    	info.bind(pokemon);
	    	//System.out.println("entrando "+pokemon.getNombre());
	    }

	    @FXML
	    void onFichaMouseReleased(MouseEvent event) {
	    	System.out.println("click "+pokemon.getNombre());

	    	if (estado!=3) {
				if(estado == 1){
					estado=0;
				}else if(estado == 0){
					estado=1;
				}
	    		
	    		
			}
	    	
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
