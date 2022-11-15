package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int n;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un valor entre 0 y 20");
		n = sc.nextInt();  // El numero es guardado en la variable

		//Si no esta entre los valores se termina el programa
		if (n <= 20) {
			//Mediante un for 
			for (int i = 1; i <= n; i++) {
				for (int a = 1; a <= i; a++) {
					System.out.print(i);
				}
				System.out.println("");
			}
		} else {
			System.out.println("No ha introducido un valor entre 0 y 20");
		}
		sc.close();
	}

}
