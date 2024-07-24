package main;

import java.util.Scanner;

public class ReservaDeAsientos {
	
	static void mostrarMapaAsientos(char asientos[][]) {
		
		for (int f = 0; f < asientos.length; f++) {
			System.out.print(f + " ");
			for (int a = 0; a < asientos.length; a++) {
				System.out.print("[" + asientos[f][a] + "] ");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		
		// Matriz de 10 filas 10 asientos
		char asientos [][] = new char[10][10];
		
		// Bandera de corte
		Boolean bandera = false;
		
		// Lectura de input por consola
		Scanner input = new Scanner(System.in);
		
		// Variable para cortar bucle
		String respuesta;
		
		// Variable para ver mapa de asients
		String verAsientos;
		
		// Variables de lectura
		int fila = 0, asiento = 0;
		
		// Cargar matriz "L"
		for (int f = 0; f < asientos.length; f++) {
			for (int a = 0; a < asientos.length; a++) {
				asientos[f][a] = 'L';
			}
		}
		
		System.out.println("---- Reserva de asientos ----");
		
		while(bandera != true) {			
			
			// En caso de que un cliente solicite visualizar cuales son los asientos libre
			System.out.print("Desea ver asientos disponibles? 'S': si cualquier tecla 'NO': ");
			verAsientos = input.next();
			
			if(verAsientos.equalsIgnoreCase("S")) {				
				mostrarMapaAsientos(asientos);
			}
		
			System.out.println("--- Ingresar fila y asiento a reservar ---");
			
			
			
			// No se permite sobreventa
			boolean estado = false;
			while(!estado) {
				
				// Cargar fila por consola
				System.out.print("\n\ningresar fila: ");
				fila = input.nextInt();
				
				// Cargar asiento por consola
				System.out.print("ingrese asiento: ");
				asiento = input.nextInt();				
				
				
				if(fila >= 0 && fila <= 9) {
					if(asiento >= 0 && asiento <= 9) {						
						estado = true;
					}else {
						System.out.println("Asiento fuera de rango deberia ser entre 0 y 9");
					}
				}else {
					System.out.println("Fila fuera de rango deberia ser entre 0 y 9");
				}
			}
			
			// Reserva de asientos. Comparacion de caracter(primitivo)
			if(asientos[fila][asiento] == 'L') {
				asientos[fila][asiento] = 'X';
				System.out.println("Asiento reservado correctamente");
			}else {
				System.out.println("Asiento ocupado");
			}
			
			// Pregunta para terminar bucle
			System.out.print("¿Finalizar reserva?... 'S': si cualquier tecla No: ");
			respuesta = input.next();
			
			// Modificar bandera comparacion con equals en String(objeto)
			if(respuesta.equalsIgnoreCase("S")) {
				bandera = true;
			}
			
		}
				
	}

}
