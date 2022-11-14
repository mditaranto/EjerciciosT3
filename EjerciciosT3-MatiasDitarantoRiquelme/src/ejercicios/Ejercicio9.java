package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int n;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1; i<n ; i*=10) {
			cont++;
		}
		System.out.println(cont);
		sc.close();
	}

}
