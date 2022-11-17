package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numero introducido: 5
	 * Respuesta esperada: (piramide formada)
	 * Respuesta dada: (piramide formada)
	 * 
	 * Numero introducido: 1
	 * Respuesta esperada: (fin del programa)
	 * Respuesta dada: (fin del programa)
	 */

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int n;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero positivo, dibujare una piramide");
		n = sc.nextInt(); // El numero es guardado en la variable

		// Mediante un for vamos sumando numeros hasta el del usuario
		for (int i = 1; i <= n; i++) {
			// Con este for añadimos los espacios para formar la estructura
			// Dependera de i
			for (int g = n - i; g > 0; g--) {
				System.out.print(" ");
			} // Con este for añadimos los comodines y un espacio detras de cada uno
				// Dependera de i
			for (int a = 0; a < i; a++) {
				System.out.print("* ");
			} // Añadimos un salto de linea
			System.out.println("");
		}

		sc.close(); // Cerramos el objeto Scanner

	}

}
