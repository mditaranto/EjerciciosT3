package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	
	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 *
	 * Numero introducido:2222
	 * Respuesta esperada: Es capicua
	 * Respuesta dada: Es capicua
	 * 
	 * Numero introducido: 0
	 * Respuesta esperada: Es capicua
	 * Respuesta dada: Es capicua
	 * 
	 * Numero introducido: -5
	 * Respuesta esperada: Introduzca un numero mayor o igual a 0
	 * Respuesta dada: Introduzca un numero mayor o igual a 0
	 */
	 

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int N;
		//Creamos las variables con las que operamos
		int aux, cifra, inverso = 0;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		//Nos aseguramos que introduzca un numero de al menos 2 cifras
		do {
			//Se le solicita al usuario un numero
			System.out.print("Introduce un número mayor o igual a 0, te dire si es capicua o no: ");
			N = sc.nextInt(); // El numero es guardado en la variable
			//El bucle se va a repetir hasta que introduzca un numero mayor de 10
		} while (N < 0);

		// le damos la vuelta al número separando numero por numero 
		aux = N;
		while (aux != 0) {
			cifra = aux % 10; //Sacamos el numero de las unidades
			//al numero anterior lo multiplicamos por 10 y sumamos la cifra sacada de las unidades
			inverso = inverso * 10 + cifra; 
			//dividimos el numero entre 10 para descartar las unidades que acabamos de extraer
			aux = aux / 10; 
		}
		
		//Si el inverso es igual al numero
		if (N == inverso) {
			//Es capicua
			System.out.println("Es capicua");
		} else { //En caso contrario, no lo es.
			System.out.println("No es capicua");
		}
		
		sc.close(); // Cerramos el objeto Scanner
		
	}
}