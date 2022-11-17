package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numero introducido: 5
	 * Respuesta esperada: (Formacion de una piramide de numeros)
	 * Respuesta dada: (Formacion de una piramide de numeros)
	 * 
	 * Numero introducido: -5
	 * Respuesta esperada: (Finalizacion del programa)
	 * Respuesta dada: (Finalizacion del programa)
	 */

	public static void main(String[] args) {
		
		// Creamos la variable donde guardaremos los datos introduccidos
		int n;
		
		Scanner sc = new Scanner(System.in);// Creamos el objeto Scanner
		
		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero positivo, se formara una piramide :)");
		n = sc.nextInt();// El numero es guardado en la variable
		
		//Mediante un for creamos una variable que crezca hasta el numero introducido por el usuario
		for (int i=1; i<=n ; i++) {
			//Mientra i sea menor o igual que el numero se ejecutara lo siguiente:
			//En este for se añaden los espacios necesarios para la forma de piramide
			for (int g = n-i; g>0; g--) {
				System.out.print(" ");
			}
			//En este for se añaden los numero del 1 hasta el numero del usuario
			for (int a = 1; a<=i; a++) {
				System.out.print(a);
			}
			//En este for se añaden los numeros desde el del usuario hasta 1
			for (int a = i-1; a>=1; a--) {
				System.out.print(a);
			}
			//Añadimos un salto de linea
			System.out.println("");
		}
		sc.close();// Cerramos el objeto Scanner
	}

}
