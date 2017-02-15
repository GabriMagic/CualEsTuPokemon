package com.suilerstudios.cetp.modelo;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
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
				System.out.println("ia: "+ x);
				flitrarPokemons(dato, c, x);
			} else {
				x = false;
				System.out.println("ia: "+ x);
				flitrarPokemons(dato, c, x);
			}
			break;
		case "tipo":
			if (getPokemon().getTipo() == c) {
				x = true;
				System.out.println("ia: "+ x);
				flitrarPokemons(dato, c, x);
			} else {
				x = false;
				System.out.println("ia: "+ x);
				flitrarPokemons(dato, c, x);
			}
			break;
		case "peso":
			if (getPokemon().getPeso() == c) {
				x = true;
				System.out.println("ia: "+ x);

				flitrarPokemons(dato, c, x);
			} else {
				x = false;
				System.out.println("ia: "+ x);

				flitrarPokemons(dato, c, x);
			}
			break;
		case "evoluciones":
			if (getPokemon().getEvoluciones() == c) {
				x = true;
				System.out.println("ia: "+ x);

				flitrarPokemons(dato, c, x);
			} else {
				x = false;
				System.out.println("ia: "+ x);

				flitrarPokemons(dato, c, x);
			}
			break;
		case "alas":
			x = ((boolean) c == getPokemon().hasAlas());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			
			break;
		case "patas":
			x = ((boolean) c == getPokemon().hasPatas());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "pico":
			x = ((boolean) c == getPokemon().hasPico());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "orejas":
			x = ((boolean) c == getPokemon().hasOrejas());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "manchas":
			x = ((boolean) c == getPokemon().hasManchas());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "cola":
			x = ((boolean) c == getPokemon().hasCola());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "vuela":
			x = ((boolean) c == getPokemon().canVuela());
			System.out.println("ia: "+ x);

			flitrarPokemons(dato, c, x);
			break;
		case "pokemon":

			break;
		default:
			System.out.println("CHAO PESCAO!");
			break;
		}
		
		/*for (Pokemon pokemon : listaPartidaPokes) {
			System.out.println(pokemon.getNombre());
		}*/
		
		return x;
	}

	private void flitrarPokemons(String dato, Object c, boolean x) {
		Iterator<Pokemon> it = listaPartidaPokes.iterator();
		switch (dato) {
		case "color":
			
			
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.getColor() != (Color) c && x) {
					
					it.remove();
					
				} else if (poke.getColor() == (Color) c && !x) {
					it.remove();
				}
			}
			
			break;
		case "tipo":

			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.getTipo() != (Tipo) c && x) {
					
					it.remove();
					
				} else if (poke.getTipo() == (Tipo) c && !x) {
					it.remove();
				}
			}

			break;
		case "peso":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.getPeso() != (Peso) c && x) {
					
					it.remove();
					
				} else if (poke.getPeso() == (Peso) c && !x) {
					it.remove();
				}
			}

			break;
		case "evoluciones":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.getEvoluciones() != (Evoluciones) c && x) {
					
					it.remove();
					
				} else if (poke.getEvoluciones() == (Evoluciones) c && !x) {
					it.remove();
				}
			}

			break;
		case "alas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasAlas() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasAlas() == (boolean) c && !x) {
					it.remove();
				}
			}

			break;
		case "patas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasPatas() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasPatas() == (boolean) c && !x) {
					it.remove();
				}
			}

			break;
		case "pico":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasPico() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasPico() == (boolean) c && !x) {
					it.remove();
				}
			}

			break;
		case "orejas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasOrejas() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasOrejas() == (boolean) c && !x) {
					it.remove();
				}
			}

			
			break;
		case "manchas":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasManchas() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasManchas() == (boolean) c && !x) {
					it.remove();
				}
			}

			break;
		case "cola":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.hasCola() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.hasCola() == (boolean) c && !x) {
					it.remove();
				}
			}
			break;
		case "vuela":
			while (it.hasNext()) {
				Pokemon poke = it.next();
				if ( poke.canVuela() != (boolean) c && x) {
					
					it.remove();
					
				} else if (poke.canVuela() == (boolean) c && !x) {
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
		System.out.println(generarPregunta());
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
