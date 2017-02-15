package com.suilerstudios.cetp.modelo;

public class Jugador {

	private Pokemon pokemon;

	public Jugador() {
		pokemon = new Pokemon();

	}

	public boolean resolver(Pokemon poke) {
		return pokemon.equals(poke);
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}