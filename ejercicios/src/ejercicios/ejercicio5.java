package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Al introducir el n�mero de cr�ditos acumulados de un estudiante, muestra el grado en el que se encuentra.

		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("Introducir el n�mero de cr�ditos:");
		num1=sc.nextInt();
		
		if(num1<32)
			System.out.print("Primer a�o");
		if(num1>=32 && num1<=63)
			System.out.print("Segundo a�o");
		if(num1>=64 && num1<=95)
			System.out.print("Tercer a�o");
		if(num1>=96)
			System.out.print("Ultimo a�o");
		
		
		sc.close();
		
		
	}

}
