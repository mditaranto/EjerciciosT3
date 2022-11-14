package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int n;
		int a;
		int fallo, cont;

		fallo = cont = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		do {
			System.out.print("Dime un numero mayor: ");
			a = sc.nextInt();
			if (a != 0) {
				if (a < n) {
					System.out.println("Fallo, es menor.");
					fallo++;
				}
				cont++;
			}
			n = a;
		} while (a != 0);

		System.out.println("Ha introducido " + cont + " numeros.");
		System.out.println("De los cuales ha fallado " + fallo);
		
		sc.close();
	}

}
