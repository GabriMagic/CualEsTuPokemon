package com.suilerstudios.cetp.modelo;

import java.util.ConcurrentModificationException;
import java.util.List;

public class IA extends Jugador {

	private List<Pokemon> listaPartidaPokes;

	public IA() {
		super();
		listaPartidaPokes = JsonFinder.getPokes();
	}

	public boolean comprobarDato(String dato, Object c) {

		System.out.println("PREGUNTO " + dato + " " + c + "\n\n");
		boolean x = true;
		Object aux = c;

		switch (dato) {
		case "color":
			if (getPokemon().getColor() == c) {
				x = true;
				flitrarPokemons(dato, c, x);
			} else {
				x = false;
				flitrarPokemons(dato, c, x);
			}
			break;
		case "tipo":
			if (getPokemon().getTipo() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "peso":
			if (getPokemon().getPeso() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "evoluciones":
			if (getPokemon().getEvoluciones() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "alas":
			x = ((boolean) c == getPokemon().hasAlas());
			break;
		case "patas":
			x = ((boolean) c == getPokemon().hasPatas());
			break;
		case "pico":
			x = ((boolean) c == getPokemon().hasPico());
			break;
		case "orejas":
			x = ((boolean) c == getPokemon().hasOrejas());
			break;
		case "manchas":
			x = ((boolean) c == getPokemon().hasManchas());
			break;
		case "cola":
			x = ((boolean) c == getPokemon().hasCola());
			break;
		case "vuela":
			x = ((boolean) c == getPokemon().canVuela());
			break;
		case "pokemon":

			break;
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}
		
		for (Pokemon pokemon : listaPartidaPokes) {
			System.out.println(pokemon.getNombre());
		}
		
		return x;
	}

	private void flitrarPokemons(String dato, Object c, boolean x) {
		switch (dato) {
		case "color":
//			try {
//				for (Pokemon pokemon : JsonFinder.getPokes()) {
//					if (pokemon.getColor() == c && x) {
//						listaPartidaPokes.remove(pokemon);
//					}
//				}
//			} catch (ConcurrentModificationException e) {
//				System.out.println("404");
//			}
			
			try {
				for (int i = 0; i < listaPartidaPokes.size(); i++) {
					System.out.println(listaPartidaPokes.get(i));
					if (listaPartidaPokes.get(i).getColor() == c && !x) {
						System.out.println("Eliminando a "+listaPartidaPokes.get(i));
						listaPartidaPokes.remove(listaPartidaPokes.get(i));
					} else if (listaPartidaPokes.get(i).getColor() != c && x) {
						listaPartidaPokes.remove(i);
					}
				}

			} catch (ConcurrentModificationException e) {
				System.out.println("404");
			}

			
			break;
		case "tipo":
			for (int i = 0; i < listaPartidaPokes.size(); i++) {
				if (listaPartidaPokes.get(i).getTipo() == c && x) {
					listaPartidaPokes.remove(i);
				} else if (listaPartidaPokes.get(i).getTipo() != c && !x) {
					listaPartidaPokes.remove(i);
				}
			}
			break;
		case "peso":
			if (getPokemon().getPeso() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "evoluciones":
			if (getPokemon().getEvoluciones() == c) {
				x = true;
			} else {
				x = false;
			}
			break;
		case "alas":
			x = ((boolean) c == getPokemon().hasAlas());
			break;
		case "patas":
			x = ((boolean) c == getPokemon().hasPatas());
			break;
		case "pico":
			x = ((boolean) c == getPokemon().hasPico());
			break;
		case "orejas":
			x = ((boolean) c == getPokemon().hasOrejas());
			break;
		case "manchas":
			x = ((boolean) c == getPokemon().hasManchas());
			break;
		case "cola":
			x = ((boolean) c == getPokemon().hasCola());
			break;
		case "vuela":
			x = ((boolean) c == getPokemon().canVuela());
			break;
		case "pokemon":

			break;
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}
	}

	public String generarPregunta() {
		int pregunta = (int) Math.floor(Math.random() * 11);
		String salida = "";

		switch (pregunta) {
		case 1:
			salida = Color.values()[(int) Math.floor(Math.random() * 3)].toString();
			break;
		case 2:
			salida = Tipo.values()[(int) Math.floor(Math.random() * 3)].toString();
			break;
		case 3:
			salida = Peso.values()[(int) Math.floor(Math.random() * 3)].toString();
			break;
		case 4:
			salida = Evoluciones.values()[(int) Math.floor(Math.random() * 3)].toString();
			break;
		case 5:
			salida = getPokemon().hasAlas() + "";
			break;
		case 6:
			salida = getPokemon().hasPatas() + "";
			break;
		case 7:
			salida = getPokemon().hasPico() + "";
			break;
		case 8:
			salida = getPokemon().hasOrejas() + "";
			break;
		case 9:
			salida = getPokemon().hasManchas() + "";
			break;
		case 10:
			salida = getPokemon().hasCola() + "";
			break;
		case 11:
			salida = getPokemon().canVuela() + "";
			break;

		default:
			break;
		}
		return salida;
	}

}
