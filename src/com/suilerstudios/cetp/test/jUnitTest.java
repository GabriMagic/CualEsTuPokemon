package com.suilerstudios.cetp.test;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.suilerstudios.cetp.modelo.Color;
import com.suilerstudios.cetp.modelo.Evoluciones;
import com.suilerstudios.cetp.modelo.Peso;
import com.suilerstudios.cetp.modelo.Pokemon;
import com.suilerstudios.cetp.modelo.Tipo;

public class jUnitTest {

	@Test
	public void test() {

		List<Pokemon> pokes = new ArrayList<>();
		
		JSONObject jsonObject = new JSONObject(Pokemon.accederFicheroJson());
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
			pokes.add(poke);
		}
		
		System.out.println(pokes.get(1));
	}

}
