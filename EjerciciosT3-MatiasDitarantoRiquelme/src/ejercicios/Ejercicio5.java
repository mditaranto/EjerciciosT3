package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numeros introducido: [5] y [20]
	 * Respuesta esperada: 20
	 * Respuesta dada: 20
	 * 
	 * Numeros introducido: [-2] y [20]
	 * Respuesta esperada: Pide de nuevo un numero positivo
	 * Respuesta dada: Pide de nuevo un numero positivo
	 * 
	 * Numeros introducidos: [0] y [9]
	 * Respuesta esperada: Error
	 * Respuesta dada: Error
	 */

	public static void main(String[] args) {
		
		// Creamos las variables donde guardaremos los datos introduccidos
		int a;
		int b;
		 
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		do {
			// Se solicita al usuario que introduzca dos numero
			System.out.println("Introduzca 2 numeros positivos para hacer MCM");
			a = sc.nextInt(); // El numero es guardado en la variable
			b = sc.nextInt(); // El numero es guardado en la variable
		} while (a < 0 || b < 0);
		
		//Hacemos un for con los limites siendo el max de a y b y el min de a y b
		for (int i = Math.max(a, b); i>=Math.min(a, b) ; i++) {
			//En caso de ser el multiplo comun, se termina el bucle y se muestra al usuario
			if (i%a==0 && i%b==0) {
				System.out.println("El MCM de " + a + " y " + b + " es: " + i);
				break;
			}
		}
		sc.close(); // Cerramos el objeto Scanner

	}

}
