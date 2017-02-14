package com.suilerstudios.cetp.modelo;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Partida {

	private Jugador j1;
	private IA ia;
	private boolean Final = false;
	private Semaphore mutexTurno;
	private Scanner teclado;

	public Partida() {
		System.out.println("Empieza la partida");
		teclado = new Scanner(System.in);
		mutexTurno = new Semaphore(1);

		j1 = new Jugador();
		// IA
		ia = new IA();

//		ia.setPokemon(JsonFinder.getPokes().get((int) Math.floor(Math.random() * 24)));
		 ia.setPokemon(JsonFinder.getPokes().get(14));

		/**
		 * elegir poke
		 */
		try {
			mutexTurno.acquire();
			j1.setPokemon(JsonFinder.getPokes().get(teclado.nextInt() - 1));
			mutexTurno.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("J1:" + j1.getPokemon().getNombre());
		System.out.println("IA:" + ia.getPokemon().getNombre());
		System.out.println();
		for (int i = 0; i < 2; i++) {
			try {

				// TURNOS
				switch (i % 2) {
				case 0:
					mutexTurno.acquire();
					System.out.println("TURNO J1");

					System.out.println(ia.comprobarDato("color", Color.AZUL));
					System.out.println(ia.comprobarDato("color", Color.MARRON));
					System.out.println(ia.comprobarDato("color", Color.AMARILLO));
//					ia.comprobarDato("tipo", Tipo.AGUA);
//					ia.comprobarDato("tipo", Tipo.ELECTRICO);
//					ia.comprobarDato("tipo", Tipo.BICHO);
//					ia.comprobarDato("tipo", Tipo.NINGUNO);
					mutexTurno.release();
					break;
				default:
					mutexTurno.acquire();
					System.out.println("Turno J2");
					mutexTurno.release();
					break;
				}

				// if (i % 2 == 0) {
				//
				// } else {
				//
				// }

				// IA
				// mutexTurno.acquire();
				// System.out.println("IA: Ah si? Pues a mi me dieron a
				// "+j2.getPokemon().getNombre());
				// if (j1.comprobarAlas(true)) {
				// System.out.println("J1: Si tiene");
				// }
				// else {
				// System.out.println("J1: No TIENE COÑO PESADO!!");
				// }
				// mutexTurno.release();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
