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

	public boolean comprobarDato(Object c) {
		System.out.println(c);
		
		if (pokemon.getColor() == c) {
			System.out.println("SI es "+Color.AZUL);
		}else if (pokemon.getEvoluciones() == c) {
			System.out.println("Si tiene"+pokemon.getEvoluciones()+" evoluciones");
		}else if (pokemon.getPeso() == c) {
			System.out.println("Es de peso"+pokemon.getPeso());
		}
		
		
		
		return true;
	}

	public boolean comprobarAlas(boolean x) {
		return x == pokemon.hasAlas();
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}