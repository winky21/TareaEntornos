package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Dados 2 n�meros, indique cu�l de ellos es menor.

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Introduzca 2 n�meros:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		// Ahora calcular cual de ellos es menor.
		
		if(num1<num2)
			System.out.print("El n�mero menor es el: "+ num1);
		else
			System.out.print("El n�mero menor es el: "+ num2);
		sc.close();
	}
}
