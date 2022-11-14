package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i=1; i<=n ; i++) {
			for (int g = n-i; g>0; g--) {
				System.out.print(" ");
			}
			for (int a = 1; a<=i; a++) {
				System.out.print(a);
			}
			for (int a = i-1; a>=1; a--) {
				System.out.print(a);
			}
			System.out.println("");
		}
		sc.close();
	}

}
