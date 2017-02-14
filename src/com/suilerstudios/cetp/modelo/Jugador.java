package com.suilerstudios.cetp.modelo;

public class Jugador {

	private Pokemon pokemon;

	public Jugador() {
		pokemon = new Pokemon();
	}

	private boolean comprobarDato(String dato) {

		// if () {
		//
		// }

		return false;
	}

	public boolean comprobarAlas(boolean x) {
		return x == pokemon.hasAlas();
	}
}