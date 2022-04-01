package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Dados tres números, indicar cuál de ellos es el mayor.
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.print("Introducir 3 números a continuación: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.print("El mayor es el: " + num1);
		if(num2>num1 && num2>num3)
			System.out.print("El mayor es el: " + num2);
		if(num3>num1 && num3>num2)
			System.out.print("El mayor es el: " + num3);
		
		sc.close();	

	}

}
