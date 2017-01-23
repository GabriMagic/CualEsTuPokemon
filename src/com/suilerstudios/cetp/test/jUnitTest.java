package com.suilerstudios.cetp.test;

import org.json.JSONObject;
import org.junit.Test;

import com.suilerstudios.cetp.modelo.Pokemon;

public class jUnitTest {

	@Test
	public void test() {
		Pokemon poke = new Pokemon("Pikachu");
		System.out.println(poke.getColor());
		
		JSONObject jsonObject = new JSONObject(Pokemon.accederFicheroJson());
	}

}
