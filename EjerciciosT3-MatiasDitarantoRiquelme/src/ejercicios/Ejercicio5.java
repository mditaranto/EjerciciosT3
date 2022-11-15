package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos
		int a;
		int b;
		 
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// Se solicita al usuario que introduzca dos numero
		System.out.println("Introduzca 2 numeros para hacer MCM");
		a = sc.nextInt(); // El numero es guardado en la variable
		b = sc.nextInt(); // El numero es guardado en la variable
		
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
