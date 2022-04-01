package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Número real entre 0-10 y mostrar mensaje con la calificación alfabética correspondiente.

		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("Introduzca un número real entre el 0-10 para obtener la calificación:");
		num1=sc.nextInt();
		
		if(num1>=0 && num1<4)
			System.out.print("Insuficiente");
		if(num1>=4 && num1<6)
			System.out.print("Regular");
		if(num1>=6 && num1<7)
			System.out.print("Bien");
		if(num1>=7 && num1<9)
			System.out.print("Notable");
		if(num1>=9 && num1<=10)
			System.out.print("Sobresaliente");
		sc.close();
		
	}

}
