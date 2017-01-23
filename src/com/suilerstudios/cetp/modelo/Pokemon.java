package com.suilerstudios.cetp.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONObject;

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
	private boolean estado;
	private String imagen;

	public Pokemon(String nombre) {

		this.nombre = nombre;

		JSONObject jsonObject = new JSONObject(accederFicheroJson());

			color = Color.valueOf(jsonObject.getJSONObject(nombre).getString("color").toUpperCase());
			tamanio = Tamanio.valueOf(jsonObject.getJSONObject(nombre).getString("tamanio").toUpperCase());


	}

	public static String accederFicheroJson() {
		String line = "";

		try {
			InputStream fis = Pokemon.class.getResourceAsStream("/com/suilerstudios/cetp/utils/pokemons.json");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			line = br.readLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public String getNombre() {
		return nombre;
	}

	public Tamanio getTamanio() {
		return tamanio;
	}

	public Color getColor() {
		return color;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Peso getPeso() {
		return peso;
	}

	public Evoluciones getEvoluciones() {
		return evoluciones;
	}

	public boolean isAlas() {
		return alas;
	}

	public boolean isPatas() {
		return patas;
	}

	public boolean isPico() {
		return pico;
	}

	public boolean isOrejas() {
		return orejas;
	}

	public boolean isManchas() {
		return manchas;
	}

	public boolean isCola() {
		return cola;
	}

	public boolean isVuela() {
		return vuela;
	}

	public boolean isEstado() {
		return estado;
	}

	public String getImagen() {
		return imagen;
	}

}
