package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int n;
		boolean primo = false;
		int cont = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			if (i==2) {
				cont++;
			}
			for (int a = 2; a < i; a++) {
				if (i % a == 0) {
					primo = false;
					break;
				} 
				primo = true;
				if (primo == true && a == i - 1) {
					cont++;
				}
			}
		}
		
		System.out.println(cont);
		sc.close();
	}

}
