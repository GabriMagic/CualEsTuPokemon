package com.suilerstudios.cetp.modelo;

import java.io.File;

public class Pokemon {

	private String nombre;
	private Tamanio tamanio;
	private Color color;
	private Tipo tipo;
	private Peso peso;
	private Evoluciones evoluciones;
	private boolean alas;
	private boolean patas;
	private boolean pico;
	private boolean orejas;
	private boolean manchas;
	private boolean cola;
	private boolean vuela;
	private String imagen;

	public Pokemon(String nombre) {

		this.nombre = nombre;
		File fichero = new File(getClass().getResourceAsStream("pokemons.json").toString());
		
		System.out.println(fichero.getAbsolutePath());

	}

}
