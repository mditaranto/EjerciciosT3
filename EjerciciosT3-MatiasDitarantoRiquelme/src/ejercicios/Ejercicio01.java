package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int h;
		int min;
		int seg;
		int segaum;

		Scanner sc = new Scanner(System.in);

		// BLOQUE DE SCANNER
		// Se le pide al usuario que introduzca la hora
		System.out.print("Por favor introduzca la hora actual: ");
		h = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los minutos
		System.out.print("Por favor introduzca los minutos actuales: ");
		min = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los segundos
		System.out.print("Por favor introduzca los segundos actuales: ");
		seg = sc.nextInt(); // El valor es guardado en la variable
		// Se le pide al usuario que introduzca los segundos a aumentar
		System.out.print("Por favor introduzca los segundos a aumentar: ");
		segaum = sc.nextInt(); // El valor es guardado en la variable

		/*
		 * mediante una condicional nos aseguramos que haya introducido correctamente la
		 * hora
		 */
		
		
		if (h >= 0 && min >= 0 && seg >= 0 && h <= 24 && min <= 60) {
			seg += segaum + (h *= 3600) + (h *= 60);
			while (seg>60) {
				h = seg / 3600;
				min = (seg%3600)/60;
				seg = (seg%3600)%60;
			}
	
		} else {
			System.out.println("La hora introducida no es correcta.");
		}
		System.out.println(h + min + seg);
		sc.close(); // Se cierra el objeto Scanner
	}

}
