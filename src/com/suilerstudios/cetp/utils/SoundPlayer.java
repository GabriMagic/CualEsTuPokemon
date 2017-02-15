package com.suilerstudios.cetp.utils;

import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class SoundPlayer extends Thread {

	private static Player player;
	private InputStream inputStream;

	public SoundPlayer(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public void run() {
		try {
			player = new Player(inputStream);
			player.play();
			super.run();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
}
