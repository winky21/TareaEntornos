package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		// Dado un número del 1 al 7, escribir el día de la semana que le corresponde.
		
		Scanner sc = new Scanner(System.in);
		int num1;
		do {
		System.out.print(" Introducir un número:");
		num1=sc.nextInt();
		if(num1<1 || num1>7)
			System.out.print("Este día no existe.");
		}
		while (num1<1 || num1>7);
		if(num1==1)
			System.out.print("Lunes");
		if(num1==2)
			System.out.print("Martes");
		if(num1==3)
			System.out.print("Miércoles");
		if(num1==4)
			System.out.print("Jueves");
		if(num1==5)
			System.out.print("Viernes");
		if(num1==6)
			System.out.print("Sabado");
		if(num1==7)
			System.out.print("Domingo");
		sc.close();

	}

}
