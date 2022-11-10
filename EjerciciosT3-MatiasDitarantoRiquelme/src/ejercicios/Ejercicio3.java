package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			for (int g = n-i; g>0; g--) {
				System.out.print(" ");
			}
			for (int a = 0; a<i; a++) {	
				System.out.print("* ");
			}
			System.out.println("");
		} 

	}

}
