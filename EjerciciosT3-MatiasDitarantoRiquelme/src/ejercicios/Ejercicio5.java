package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		for (int i = Math.max(a, b); i>=Math.min(a, b) ; i++) {
			if (i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();

	}

}
