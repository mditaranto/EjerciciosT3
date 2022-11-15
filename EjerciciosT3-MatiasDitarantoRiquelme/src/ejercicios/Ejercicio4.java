package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos
		int a, b;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// Se solicita al usuario que introduzca dos numero
		System.out.println("Introduzca 2 numeros para hacer MCD");
		a = sc.nextInt(); // El numero es guardado en la variable
		b = sc.nextInt(); // El numero es guardado en la variable

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
