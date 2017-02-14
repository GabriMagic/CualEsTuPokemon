package com.suilerstudios.cetp.modelo;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Partida {

	private Jugador j1;
	private IA j2;
	private boolean Final = false;
	private Semaphore mutexTurno;
	private Scanner teclado;
	
	public Partida() {
		teclado = new Scanner(System.in);
		mutexTurno = new Semaphore(1);

		j1 = new Jugador();
		// IA
		j2 = new IA();

//		j2.setPokemon(JsonFinder.getPokes().get((int) Math.floor(Math.random() * 24)));
		j2.setPokemon(JsonFinder.getPokes().get(14));

		System.out.println(j2.getPokemon() + "\n" + j2.comprobarAlas(true));

		/**
		 * elegir poke
		 */
		try {
			mutexTurno.acquire();
			j1.setPokemon(JsonFinder.getPokes().get(teclado.nextInt()-1));
			mutexTurno.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 1; i++) {
			try {
				// JUGADOR
				mutexTurno.acquire();
				System.out.println("J1: Elegí a "+j1.getPokemon().getNombre());
				
				j2.comprobarDato(Color.AZUL);
				j2.comprobarDato(Evoluciones.NINGUNA);
				j2.comprobarDato(Peso.LIGERO);
				mutexTurno.release();
				
				
				// IA
//				mutexTurno.acquire();
//				System.out.println("IA: Ah si? Pues a mi me dieron a "+j2.getPokemon().getNombre());
//				if (j1.comprobarAlas(true)) {
//					System.out.println("J1: Si tiene");
//				}
//				else {
//					System.out.println("J1: No TIENE COÑO PESADO!!");
//				}
//				mutexTurno.release();
					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
