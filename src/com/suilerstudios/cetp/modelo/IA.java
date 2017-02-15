package com.suilerstudios.cetp.modelo;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
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

		System.out.println("PREGUNTO " + dato + " " + c + "\n\n");
		boolean x = true;

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
			Pokemon poke = (Pokemon) c;
			System.out.println(resolver(poke));
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
		Object[][] obj =generarPregunta();
		System.out.println("la ia pregunta: " + obj[0][0]+ " propiedad "+obj[0][1]+"?");

	}

	public Object[][] generarPregunta() {
		int pregunta = (int) Math.floor(Math.random() * 11);
		Object salida = "";
		Object[][] obj = new Object[2][2];
		switch (pregunta) {
		case 1:
			obj[0][0] ="color";
			salida = Color.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 2:
			obj[0][0] ="tipo";
			salida = Tipo.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 3:
			obj[0][0] ="peso";
			salida = Peso.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 4:
			obj[0][0] ="evoluciones";
			salida = Evoluciones.values()[(int) Math.floor(Math.random() * 3)];
			obj[0][1] = salida;
			break;
		case 5:
			obj[0][0] ="alas";
			salida = getPokemon().hasAlas();
			obj[0][1] = salida;
			break;
		case 6:
			obj[0][0] ="patas";
			salida = getPokemon().hasPatas();
			obj[0][1] = salida;
			break;
		case 7:
			obj[0][0] ="pico";
			salida = getPokemon().hasPico();
			obj[0][1] = salida;
			break;
		case 8:
			obj[0][0] ="orejas";
			salida = getPokemon().hasOrejas();
			obj[0][1] = salida;
			break;
		case 9:
			obj[0][0] ="monchas";
			salida = getPokemon().hasManchas();
			obj[0][1] = salida;
			break;
		case 10:
			obj[0][0] ="cola";
			salida = getPokemon().hasCola() ;
			obj[0][1] = salida;
			break;
		case 11:
			obj[0][0] ="vuela";
			salida = getPokemon().canVuela() ;
			obj[0][1] = salida;
			break;

		default:
			break;
		}
		return obj;
	}

}
