package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		for (int i = Math.max(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}
