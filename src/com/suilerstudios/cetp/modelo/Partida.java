package com.suilerstudios.cetp.modelo;

public class Partida {

	private Jugador j1;
	private IA ia;

	public Partida() {
		j1 = new Jugador();
		ia = new IA();
		setIaPokemon();
	}

	public String preguntaIA() {

		Object[][] pre = ia.generarPregunta();
		String dato = "La pregunta es ¿" + pre[0][0].toString() + " " + pre[0][1] + "?";
		return dato;
	}

	public void setPokemonJugador(Pokemon pokemon) {
		j1.setPokemon(pokemon);
	}

	public void setIaPokemon() {
		ia.setPokemon(JsonFinder.getPokes().get((int) Math.floor(Math.random() * 24)));
	}

	public IA getIa() {
		return ia;
	}

	public Jugador getJ1() {
		return j1;
	}
}
