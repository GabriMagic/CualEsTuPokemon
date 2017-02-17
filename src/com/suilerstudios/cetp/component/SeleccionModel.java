package com.suilerstudios.cetp.component;

import java.util.Iterator;

import com.suilerstudios.cetp.modelo.JsonFinder;
import com.suilerstudios.cetp.modelo.Pokemon;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SeleccionModel {

	private Pokemon pokemonActual;
	private IntegerProperty auxSiguiente;
	private IntegerProperty auxAnterior;
 
	private IntegerProperty punteroPokemon;
	
	public SeleccionModel() {
		
		punteroPokemon = new SimpleIntegerProperty(this,"puntero",0);
		pokemonActual = JsonFinder.getPokes().get(punteroPokemon.get());
		auxSiguiente = new SimpleIntegerProperty(this,"punteroSiguiente",1);
		auxAnterior = new SimpleIntegerProperty(this,"punteroAnterior",JsonFinder.getPokes().size()-1);
	}
	
	public void Avanzar(){
		punteroPokemon.set(punteroPokemon.get()+1);
		if (punteroPokemon.get() > JsonFinder.getPokes().size()-1) {
			
			punteroPokemon.set(0);
			auxSiguiente.set(punteroPokemon.get()+1);
			auxAnterior.set(JsonFinder.getPokes().size()-1);
		}else if(punteroPokemon.get() > JsonFinder.getPokes().size()-2){
			auxSiguiente.set(0);
			auxAnterior.set(punteroPokemon.get()-1);
		}else {
			auxSiguiente.set(punteroPokemon.get()+1);
			auxAnterior.set(punteroPokemon.get()-1);
		}
		
		
		pokemonActual= JsonFinder.getPokes().get(punteroPokemon.get());
	}
	
public void Retroceder(){
	punteroPokemon.set(punteroPokemon.get()-1);

		if (punteroPokemon.get() < 0) {
			punteroPokemon.set(JsonFinder.getPokes().size()-1);
			auxSiguiente.set(0);
			auxAnterior.set(JsonFinder.getPokes().size()-2);
		}else if(punteroPokemon.get() < 1){
			auxSiguiente.set(punteroPokemon.get()+1);
			auxAnterior.set(JsonFinder.getPokes().size()-1);
		}else{
			auxSiguiente.set(punteroPokemon.get()+1);
			auxAnterior.set(punteroPokemon.get()-1);
		}
		
		pokemonActual = JsonFinder.getPokes().get(punteroPokemon.get());

}

public Pokemon getPokemonActual() {
	return pokemonActual;
}

public IntegerProperty auxSiguienteProperty() {
	return this.auxSiguiente;
}


public int getAuxSiguiente() {
	return this.auxSiguienteProperty().get();
}


public void setAuxSiguiente(final int auxSiguiente) {
	this.auxSiguienteProperty().set(auxSiguiente);
}


public IntegerProperty auxAnteriorProperty() {
	return this.auxAnterior;
}


public int getAuxAnterior() {
	return this.auxAnteriorProperty().get();
}


public void setAuxAnterior(final int auxAnterior) {
	this.auxAnteriorProperty().set(auxAnterior);
}



}
