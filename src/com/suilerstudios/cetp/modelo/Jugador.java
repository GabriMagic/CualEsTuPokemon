package com.suilerstudios.cetp.modelo;

public class Jugador {

	private Pokemon pokemon;

	public Jugador() {
		pokemon = new Pokemon();
	}

	public boolean comprobarDato(String dato, Object c) {
		System.out.println("PREGUNTO " + dato + " " + c + "\n\n");
		boolean x = true;

		switch (dato) {
		case "color":
			if (pokemon.getColor() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "tipo":
			if (pokemon.getTipo() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "peso":
			if (pokemon.getPeso() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "evoluciones":
			if (pokemon.getEvoluciones() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "alas":
			x = ((boolean) c == pokemon.hasAlas());
			break;
		case "patas":
			x = ((boolean) c == pokemon.hasPatas());
			break;
		case "pico":
			x = ((boolean) c == pokemon.hasPico());
			break;
		case "orejas":
			x = ((boolean) c == pokemon.hasOrejas());
			break;
		case "manchas":
			x = ((boolean) c == pokemon.hasManchas());
			break;
		case "cola":
			x = ((boolean) c == pokemon.hasCola());
			break;
		case "vuela":
			x = ((boolean) c == pokemon.canVuela());
			break;
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}

		return x;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}