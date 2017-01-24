package com.suilerstudios.cetp.modelo;

public class Pokemon {

	private String nombre;
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


	public String getNombre() {
		return nombre;
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

	public boolean hasAlas() {
		return alas;
	}

	public boolean hasPatas() {
		return patas;
	}

	public boolean hasPico() {
		return pico;
	}

	public boolean hasOrejas() {
		return orejas;
	}

	public boolean hasManchas() {
		return manchas;
	}

	public boolean hasCola() {
		return cola;
	}

	public boolean isVuela() {
		return vuela;
	}

	public boolean hasEstado() {
		return estado;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void setPeso(Peso peso) {
		this.peso = peso;
	}

	public void setEvoluciones(Evoluciones evoluciones) {
		this.evoluciones = evoluciones;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	public void setPatas(boolean patas) {
		this.patas = patas;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}

	public void setOrejas(boolean orejas) {
		this.orejas = orejas;
	}

	public void setManchas(boolean manchas) {
		this.manchas = manchas;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return getNombre() + ", " + getColor() + ", " + getTipo() + ", " + getPeso() + ", " + getEvoluciones() + ", "
				+ hasAlas() + ", " + hasPatas() + ", " + hasPico() + ", " + hasOrejas() + ", " + hasManchas() + ", "
				+ hasCola() + ", " + isVuela();
	}
}
