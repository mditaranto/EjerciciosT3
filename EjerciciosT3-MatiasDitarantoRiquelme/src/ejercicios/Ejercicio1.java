package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable donde guardaremos los datos introduccidos
		int hora;// Se guardará la cantidad de horas.
		int min;// Se guardará la cantidad de minutos.
		int seg;// Se guardará la cantidad de segundos.
		int segaum;// Se guardará el incremento.
		
		// Creamos el obejto Scanner
		Scanner sc = new Scanner(System.in);
		
		/* Solicitamos la usuario la cantidad de horas, minutos, segundos y el
		 incremento.*/
		System.out.println("Introduzca una cantidad de horas: ");
		hora = sc.nextInt();// El numero es guardado en la variable
		System.out.println("Introduzca una cantidad de minutos:");
		min = sc.nextInt();// El numero es guardado en la variable
		System.out.println("Introduzca una cantidad de segundos: ");
		seg = sc.nextInt();// El numero es guardado en la variable
		System.out.println("Introduzca cuantos segundos quiere añadir: ");
		segaum = sc.nextInt();// El numero es guardado en la variable

		/*
		 * Utilizamos un if para que, en el caso de que los segundos y los minutos pasen
		 * 60 y la hora 24, se muestre hora erronea.
		 */
		if (seg >= 60 && min >= 60 && hora >= 24) {
			System.out.println("Datos introducidos erróneos");
		} else {
			/*
			 *Creamos un for para ir aumentando los segundos 1 por 1 y establecer correctamente la hora
			 */
			for (int i = 0; i <= segaum; segaum++) {
				// Utilizamos un if para que seg = 59, se restablezca a 0.
				if (seg == 59) {
					seg = 0;
					// Utilizamos otro if para que min=59, se restablezca a 0.
					if (min == 59) {
						min = 0;
						// Utilizamos otro if para que hora = 23, se restablezca a 0.
						if (hora == 23) {
							hora = 0;
							// En caso contrario, se sumará una hora.
						} else {
							hora++;
						}
						// En caso contrario, se sumará un minuto.
					} else {
						min++;
					}
					// En caso contrario, se sumará un segundo.
				} else {
					seg++;
				}
			}
			// Se muestra la hora resultante al usuario
			System.out.println(hora + " : " + min + " : " + seg);
		}
		// Cerramos el obejto Scanner.
		sc.close();
	}

}
