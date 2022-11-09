package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int n;
		boolean primo = false;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			for (int a = 1; a < i; a++) {
				if (i % a == 0) {
					primo = false;
					break;
				} 
				primo = true;
				if (primo == true && a == i - 1) {
					System.out.println(i);
				}
			}
		}

	}

}
