package main;


public class ReservaDeAsientos {
	
	public static void main(String[] args) {
		
		// Matriz de 10 filas 10 asientos
		char asientos [][] = new char[10][10];
		
		// Cargar matriz "L"
		for (int f = 0; f < asientos.length; f++) {
			for (int a = 0; a < asientos.length; a++) {
				asientos[f][a] = 'L';
			}
		}
				
	}

}
