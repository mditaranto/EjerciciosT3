package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos la variable donde guardaremos los datos introduccidos
		int N;
		//Creamos las variables con las que operamos
		int aux, cifra, inverso = 0;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
		
		//Nos aseguramos que introduzca un numero de al menos 2 cifras
		do {
			//Se le solicita al usuario un numero
			System.out.print("Introduce un número mayor o igual a 10, te dire si es capicua o no: ");
			N = sc.nextInt(); // El numero es guardado en la variable
			//El bucle se va a repetir hasta que introduzca un numero mayor de 10
		} while (N < 10);

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