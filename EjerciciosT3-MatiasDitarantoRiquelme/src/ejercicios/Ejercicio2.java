package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Autor -> @mditaranto
	 * 
	 * Pruebras realizadas para la comprobacion de un correcto funcionamiento:
	 * 
	 * Numero introducido: -2
	 * Respuesta esperada: Error
	 * Respuesta dada: Error
	 * 
	 * Numero introducido: 13
	 * Respuesta esperada: 6
	 * Respuesta dada: 6
	 * 
	 * Numero introducido: 1
	 * Respuesta esperada: 0
	 * Respuesta dada: 0
	 */

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int n;
		// Creamos las variables para contar y para decir si el nuevo es primo o no
		boolean primo = false;
		int cont = 0;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero");
		n = sc.nextInt();// El numero es guardado en la variable

		//Si no introduce un numero positivo se acaba el programa
		if (n > 0) {
			// Mediante un for vamos sumando numeros hasta el del usuario
			for (int i = 2; i <= n; i++) {
				// En caso que sea 2 (Primo) se suma.
				if (i == 2) {
					cont++;
				}
				// Mediante otro for se verifica si el numero del for actual es primo o no
				for (int a = 2; a < i; a++) {
					// Se divide entre todos los numeros hasta el mismo
					if (i % a == 0) {
						// Si no es primo se sale del bucle
						primo = false;
						break;
					} // Si es primo se guarda en el boolean
					primo = true;
					// Al cumplir que sea primo y que a 1 menos que i, se suma.
					if (primo == true && a == i - 1) {
						cont++;
					}
				}
			}
			// Se ofrece al usuario los resultados
			System.out.println("La cantidad de primos desde 1 a " + n + " es: " + cont);
		} else {
			System.out.println("Introduzca un numero positivo.");
		}
		
		sc.close(); // Cerramos el objeto Scanner
	}

}
