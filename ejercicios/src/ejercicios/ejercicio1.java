package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Pedir número entero y saber si es mayor de 100.
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduzca un número entero:");
		num=sc.nextInt();
		if(num<100)
			System.out.print("El númeo es menor que 100");
		if(num>100)
			System.out.print("El número es mayor que 100");
			
    sc.close();
		
	}

}