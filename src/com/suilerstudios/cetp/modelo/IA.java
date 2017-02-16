package com.suilerstudios.cetp.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IA extends Jugador {

	private List<Pokemon> listaPartidaPokes;

	public IA() {
		super();
		listaPartidaPokes = new ArrayList<>();
		listaPartidaPokes.addAll(JsonFinder.getPokes());
	}

	public boolean comprobarDato(String dato, Object c) {

		
		boolean x = true;

		switch (dato) {
		case "color":
			if (getPokemon().getColor() == Color.valueOf(c.toString().toUpperCase())) {
				x = true;
				
			} else {
				x = false;
				
			}
			break;
		case "tipo":
			if (getPokemon().getTipo() == Tipo.valueOf(c.toString().toUpperCase())) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "peso":
			if (getPokemon().getPeso() == Peso.valueOf(c.toString().toUpperCase())) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "evoluciones":
			if (getPokemon().getEvoluciones() == Evoluciones.valueOf(c.toString().toUpperCase())) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "alas":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasAlas());

			break;
		case "patas":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasPatas());
			break;
		case "pico":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasPico());
			break;
		case "orejas":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasOrejas());
			break;
		case "manchas":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasManchas());
			break;
		case "cola":
			x = (Boolean.valueOf(c.toString()) == getPokemon().hasCola());
			break;
		case "vuela":
			x = (Boolean.valueOf(c.toString()) == getPokemon().canVuela());
			break;
	
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}

		/*
		 * for (Pokemon pokemon : listaPartidaPokes) {
		 * System.out.println(pokemon.getNombre()); }
		 */

		return x;
	}
	public Boolean comprobarPokemon(Pokemon pokemon){
		return getPokemon() == pokemon;

	}
	public void flitrarPokemons(String dato, Object c, boolean x) {
		Iterator<Pokemon> it = listaPartidaPokes.iterator();
		switch (dato) {
		case "color":

			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.getColor() != Color.valueOf(c.toString().toUpperCase())&& x) {

					it.remove();

				} else if (poke.getColor() == Color.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "tipo":

			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.getTipo() != Tipo.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.getTipo() == Tipo.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "peso":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.getPeso() != Peso.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.getPeso() == Peso.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "evoluciones":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.getEvoluciones() != Evoluciones.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.getEvoluciones() == Evoluciones.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "alas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasAlas() !=  Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasAlas() == Boolean.valueOf(c.toString().toUpperCase())  && !x) {
					it.remove();
				}
			}

			break;
		case "patas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasPatas() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasPatas() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "pico":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasPico() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasPico() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "orejas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasOrejas() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasOrejas() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "manchas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasManchas() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasManchas() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}

			break;
		case "cola":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.hasCola() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.hasCola() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}
			break;
		case "vuela":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if (poke.canVuela() != Boolean.valueOf(c.toString().toUpperCase()) && x) {

					it.remove();

				} else if (poke.canVuela() == Boolean.valueOf(c.toString().toUpperCase()) && !x) {
					it.remove();
				}
			}
			break;
		case "pokemon":

			break;
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}
		/*
		 * Object[][] obj =generarPregunta();
		 * System.out.println("la ia pregunta: " + obj[0][0]+
		 * " propiedad "+obj[0][1]+"?");
		 */

	}

	public Object[][] generarPregunta() {
		int pregunta = (int) Math.floor(Math.random() * 11);
		Object salida = "";
		Object[][] obj = new Object[2][2];
		switch (pregunta) {
		case 0:
			obj[0][0] = "color";
			salida = Color.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 1:
			obj[0][0] = "tipo";
			salida = Tipo.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 2:
			obj[0][0] = "peso";
			salida = Peso.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 3:
			obj[0][0] = "evoluciones";
			salida = Evoluciones.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 4:
			obj[0][0] = "alas";
			salida = getPokemon().hasAlas();
			obj[0][1] = salida;
			break;
		case 5:
			obj[0][0] = "patas";
			salida = getPokemon().hasPatas();
			obj[0][1] = salida;
			break;
		case 6:
			obj[0][0] = "pico";
			salida = getPokemon().hasPico();
			obj[0][1] = salida;
			break;
		case 7:
			obj[0][0] = "orejas";
			salida = getPokemon().hasOrejas();
			obj[0][1] = salida;
			break;
		case 8:
			obj[0][0] = "manchas";
			salida = getPokemon().hasManchas();
			obj[0][1] = salida;
			break;
		case 9:
			obj[0][0] = "cola";
			salida = getPokemon().hasCola();
			obj[0][1] = salida;
			break;
		case 10:
			obj[0][0] = "vuela";
			salida = getPokemon().canVuela();
			obj[0][1] = salida;
			break;
		}
		return obj;
	}

	public List<Pokemon> getListaPartidaPokes() {
		return listaPartidaPokes;
	}

	public void setListaPartidaPokes(List<Pokemon> listaPartidaPokes) {
		this.listaPartidaPokes = listaPartidaPokes;
	}

}
