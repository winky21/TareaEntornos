package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Pedir n�mero entero y saber si es mayor de 100.
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduzca un n�mero entero:");
		num=sc.nextInt();
		if(num<100)
			System.out.print("El n�meo es menor que 100");
		if(num>100)
			System.out.print("El n�mero es mayor que 100");
			
    sc.close();
		
	}

}