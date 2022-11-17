package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numero introducido: [2] y [5]
	 * Respuesta esperada: 1
	 * Respuesta dada: 1
	 * 
	 * Numero introducido: [-1] y [20]
	 * Respuesta esperada: Pide de nuevo un numero positivo
	 * Respuesta dada: Pide de nuevo un numero positivo
	 * 
	 * Numeros introducidos: [0] y [9]
	 * Respuesta esperada: Error
	 * Respuesta dada: Error
	 */

	public static void main(String[] args) {
		
		// Creamos las variables donde guardaremos los datos introduccidos
		int a, b;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		do {
			// Se solicita al usuario que introduzca dos numero
			System.out.println("Introduzca 2 numeros para hacer MCD");
			a = sc.nextInt(); // El numero es guardado en la variable
			b = sc.nextInt(); // El numero es guardado en la variable
		} while (a < 0 || b < 0);
		
		//Mediante un for guardamos el valor mas alto de a y b y decrecemos
		for (int i = Math.max(a, b); i >= 1; i--) {
			//En caso de ser el divisor se termina el bucle y se muestra al usuario
			if (a % i == 0 && b % i == 0) {
				System.out.println("El MCD de " + a + " y " + b + " es: " + i);
				break;
			}
		}

		sc.close(); // Cerramos el objeto Scanner
	}

}
