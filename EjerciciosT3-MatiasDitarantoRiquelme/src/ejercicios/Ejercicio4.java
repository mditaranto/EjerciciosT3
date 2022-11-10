package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int a, b ,aux = 0;
	
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		 while (b != 0) {
		        aux = b;
		        b = a % b;
		        a = aux;
		 }
		 System.out.println(a);
	}

}
