package main;

import java.util.Scanner;

public class ReservaDeAsientos {
	
	
	public static void main(String[] args) {
		
		// Matriz de 10 filas 10 asientos
		char asientos [][] = new char[10][10];
		
		// Bandera de corte
		Boolean bandera = false;
		
		// Lectura de input por consola
		Scanner input = new Scanner(System.in);
		
		// Variable para cortar bucle
		String respuesta;
		
		// Variables de lectura
		int fila, asiento;
		
		// Cargar matriz "L"
		for (int f = 0; f < asientos.length; f++) {
			for (int a = 0; a < asientos.length; a++) {
				asientos[f][a] = 'L';
			}
		}
		
		System.out.println("---- Reserva de asientos ----");
		
		while(bandera != true) {
			System.out.println("--- Ingresar fila y asiento a reservar ---");
			
			// Cargar fila por consola
			System.out.print("ingresar fila: ");
			fila = input.nextInt();
			
			System.out.println("");
			
			// Cargar asiento por consola
			System.out.print("ingrese asiento: ");
			asiento = input.nextInt();
			
			// Comparacion de caracter
			if(asientos[fila][asiento] == 'L') {
				asientos[fila][asiento] = 'X';
				System.out.println("Asiento reservado correctamete");
			}else {
				System.out.println("Asiento ocupado");
			}
			
			// Pregunta para terminar bucle
			System.out.println("┐Finalizar reserva?... 'S': si cualquier tecla No");
			respuesta = input.next();
			
			// Modificar bandera comparacion con equals en String(objeto)
			if(respuesta.equalsIgnoreCase("S")) {
				bandera = true;
			}
			
		}
				
	}

}
