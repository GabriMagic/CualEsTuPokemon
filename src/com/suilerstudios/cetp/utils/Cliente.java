package com.suilerstudios.cetp.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Cliente {

	static final String HOST = "10.2.2.99";
	static final int puerto = 2000;
	boolean estado =true;
	Scanner sc = new Scanner(System.in);
	public Cliente() {
		
		String datos;
		String num_cliente;
		
		//leer teclado
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			//conexion puerto
			Socket sCliente = new Socket(HOST, puerto);
			
			//flujos
			DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
			DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());
			
			//Cuerpo del algoritmo
			while (true) {
				if (estado) {
					flujo_salida.writeUTF(sc.nextLine());
					estado=false;
	
				}else{
					flujo_entrada.readUTF();
					estado=true;
				}
				
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
	public static void main(String[] args) {
		new Cliente();
	}
	
}