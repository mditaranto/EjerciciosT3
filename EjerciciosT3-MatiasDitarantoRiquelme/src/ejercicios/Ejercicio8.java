package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos las variables donde guardaremos los datos introduccidos
		int n;
		int mayor;
		// Creamos la variable donde contaremos los fallos y los numeros introducidos
		int fallo, cont;

		fallo = cont = 0;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		do {
		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero. Cuando quiera finalizar el programa introduzca un \"0\"");
		n = sc.nextInt(); // El numero es guardado en la variable
		} while (n!=0); //El bucle se repite hasta que introduzca un numero diferente de 0
			
		//Hace:
		do { 
			// Se solicita al usuario que introduzca un numero mayor que el anterior
			System.out.print("Introduzca un numero mayor al anterior: ");
			mayor = sc.nextInt(); // El numero es guardado en la variable
				//Si el numero es menor que el anterior, se suma al los errores y se comunica al usuario
				if (mayor < n) {
					System.out.println("Fallo, es menor.");
					fallo++;
				} //Se suma 1 al contador de numeros introducidos
				cont++;
			//El numero introducido se asigna como el mayor
			n = mayor;
			//Mientas el numero introducido sea diferente de 0 continua el bucle
		} while (mayor != 0);

		//Se ofrece al usuario la cantidad de numeros introducidos y errores
		System.out.println("Ha introducido " + cont + " numeros.");
		System.out.println("De los cuales ha fallado " + fallo);
		
		sc.close(); // Cerramos el objeto Scanner
	}

}
