package com.suilerstudios.cetp.modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonFinder {
	
	private static List<Pokemon> pokes;
	
	public static String accederFicheroJson() {
		String line = "";

		try {
			InputStream fhas = Pokemon.class.getResourceAsStream("/com/suilerstudios/cetp/utils/pokemons.json");
			InputStreamReader hasr = new InputStreamReader(fhas);
			BufferedReader br = new BufferedReader(hasr);
			line = br.readLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static void generarListaPokemon() {
		 pokes = new ArrayList<>();

		JSONObject jsonObject = new JSONObject(JsonFinder.accederFicheroJson());
		JSONArray pokemons = jsonObject.getJSONArray("Pokemons");

		for (int i = 0; i < pokemons.length(); i++) {
			JSONObject p = pokemons.getJSONObject(i);
			Pokemon poke = new Pokemon();
			poke.setNombre(pokemons.getJSONObject(i).getString("nombre"));
			poke.setColor(Color.valueOf(p.getString("color").toUpperCase()));
			poke.setTipo(Tipo.valueOf(p.getString("tipo").toUpperCase()));
			poke.setPeso(Peso.valueOf(p.getString("peso").toUpperCase()));
			poke.setEvoluciones(Evoluciones.valueOf(p.getString("evoluciones").toUpperCase()));
			poke.setAlas(p.getBoolean("alas"));
			poke.setPatas(p.getBoolean("patas"));
			poke.setPico(p.getBoolean("pico"));
			poke.setOrejas(p.getBoolean("orejas"));
			poke.setManchas(p.getBoolean("manchas"));
			poke.setCodigoPokemon(p.getInt("codigo"));
			pokes.add(poke);
		}

		
	}
public static List<Pokemon> getPokes() {
	return pokes;
}
}
