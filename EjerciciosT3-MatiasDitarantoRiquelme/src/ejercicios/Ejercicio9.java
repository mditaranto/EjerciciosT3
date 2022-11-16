package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos
		long n;
		// Creamos las variables donde haremos la cuenta
		int cont = 0;
		
		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero, yo le dire cuantas digitos tiene");
		n = sc.nextInt();// El numero es guardado en la variable
		
		//En un for creamos una variable que se va multiplicando de 10 en 10
		for (int i = 1; i<n ; i*=10) {
			//Siempre que la variable sea menor que el numero se sumara 1 a la cuenta y se multiplicara por 10
			cont++;
		}
		
		//Se le ofrece al usuario la cantidad de cifras
		System.out.println("El numero introducido tiene " + cont + " digitos");

		sc.close(); // Cerramos el objeto Scanner
	}

}
