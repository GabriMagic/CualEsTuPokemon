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

		j2.setPokemon(JsonFinder.getPokes().get((int) Math.floor(Math.random() * 24)));

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

		for (int i = 0; i < 5; i++) {
			try {
				mutexTurno.acquire();
				System.out.println("Elegí a "+j1.getPokemon().getNombre());
				
				mutexTurno.release();
				
				mutexTurno.acquire();
				System.out.println("Ah si? Pues a mi me dieron a "+j2.getPokemon().getNombre());
				mutexTurno.release();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
