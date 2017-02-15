package com.suilerstudios.cetp.modelo;

import java.util.Scanner;

public class Partida {

	private Jugador j1;
	private IA ia;
	private Scanner teclado;

	public Partida() {
		System.out.println("Empieza la partida");
		teclado = new Scanner(System.in);

		j1 = new Jugador();
		// IA
		ia = new IA();

		ia.setPokemon(JsonFinder.getPokes().get((int) Math.floor(Math.random() * 24)));
		// ia.setPokemon(JsonFinder.getPokes().get(1));

		/**
		 * elegir poke
		 */

		j1.setPokemon(JsonFinder.getPokes().get(teclado.nextInt() - 1));

		System.out.println("J1:" + j1.getPokemon().getNombre());
		System.out.println("IA:" + ia.getPokemon().getNombre());
		System.out.println();
		for (int i = 0; i < 2; i++) {

			// TURNOS
			switch (i % 2) {
			case 0:

				System.out.println("TURNO J1");

				while (ia.getListaPartidaPokes().size() > 1) {
					Object[][] pre = ia.generarPregunta();
					System.out.println(ia.comprobarDato(pre[0][0].toString(), pre[0][1]));

				}
				ia.comprobarDato("pokemon", ia.getListaPartidaPokes().get(0));

				// System.out.println(ia.comprobarDato("color", Color.MARRON));
				// System.out.println(ia.comprobarDato("color",
				// Color.AMARILLO));
				// ia.comprobarDato("tipo", Tipo.AGUA);
				// ia.comprobarDato("tipo", Tipo.ELECTRICO);
				// ia.comprobarDato("tipo", Tipo.BICHO);
				// ia.comprobarDato("tipo", Tipo.NINGUNO);
				// ia.comprobarDato("evoluciones", Evoluciones.DOS);
				// ia.comprobarDato("orejas", true);

				break;
			default:

				break;
			}

		}

	}

	public IA getIa() {
		return ia;
	}

	public Jugador getJ1() {
		return j1;
	}
}
