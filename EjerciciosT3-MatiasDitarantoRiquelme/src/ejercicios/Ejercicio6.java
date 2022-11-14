package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (int i = 1; i<=n ; i++) {
			for (int a = 1; a<=i; a++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		sc.close();
	}

}
