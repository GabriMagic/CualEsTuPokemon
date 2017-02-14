package com.suilerstudios.cetp.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	static final int puerto = 2000;
	boolean estado =true;
	Scanner sc = new Scanner(System.in);
	public Servidor(){
		
		try {
			
			//inicio
			ServerSocket sServidor = new ServerSocket(puerto);
			System.out.println("Escucho el puerto "+puerto);
			//se conecta un cliente
			Socket sCliente = sServidor.accept();
			System.out.println("cliente conectado");
			//flujos entrada y salida
			DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
			DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());
			
			//cuerpo
			
			while (true) {
				if (estado) {
				
					flujo_salida.writeUTF(sc.nextLine());
					estado=false;
	
				}else{
					System.out.println(flujo_entrada.readUTF());
					estado=true;
				}
				
			}
			
			/*long tiempo1 = (new Date().getTime());
			flujo_salida.writeUTF(Long.toString(tiempo1));
			flujo_salida.writeUTF("Penis hola");
		
			System.out.println(flujo_entrada.readUTF());
			 */	
			//Se cierra la conexion
			
			/*sCliente.close();
			System.out.println("Cliente desconectado");*/
			
		
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
	public static void main(String[] args) {
		new Servidor();
	}
	
}
