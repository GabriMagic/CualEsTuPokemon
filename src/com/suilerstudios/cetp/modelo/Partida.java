package com.suilerstudios.cetp.modelo;

import java.util.Scanner;

public class Partida {

	private Jugador j1;
	private IA j2;
	private boolean Final = false;
	private Scanner teclado;

	public Partida() {
		teclado = new Scanner(System.in);

		j1 = new Jugador();
		// IA
		j2 = new IA();

		// j2.setPokemon(JsonFinder.getPokes().get((int)
		// Math.floor(Math.random() * 24)));
		j2.setPokemon(JsonFinder.getPokes().get(14));

		/**
		 * elegir poke
		 */
		j1.setPokemon(JsonFinder.getPokes().get(teclado.nextInt() - 1));

		for (int i = 0; i < 1; i++) {
			// JUGADOR
			System.out.println("J1: Elegí a " + j1.getPokemon().getNombre());

			System.out.println(j2.comprobarDato("alas", true));
			System.out.println(j2.comprobarDato("tipo", Tipo.AGUA));
			System.out.println(j2.comprobarDato("color", Color.VIOLETA));
			System.out.println(j2.comprobarDato("vuela", true));

			// IA
			// System.out.println("IA: Ah si? Pues a mi me dieron a
			// "+j2.getPokemon().getNombre());
			// if (j1.comprobarAlas(true)) {
			// System.out.println("J1: Si tiene");
			// }
			// else {
			// System.out.println("J1: No TIENE COÑO PESADO!!");
			// }
			// mutexTurno.release();

		}
	}

}
