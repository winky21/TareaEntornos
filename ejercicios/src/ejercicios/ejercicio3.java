package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Pedir 2 números y mostrar en pantalla si el número es par o impar.

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Introducir 2 números a continuación:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1%2==0)
			System.out.print(" El primer número es par: " + num1 +" y ");
		else
			System.out.print(" El primer número es impar: " + num1 + " y ");
		if(num2%2==0)
			System.out.print(" El segundo número es par: " + num2);
		else
			System.out.print(" El segundo número es impar: " + num2);
		sc.close();
	}

}
