package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// N�mero real entre 0-10 y mostrar mensaje con la calificaci�n alfab�tica correspondiente.

		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("Introduzca un n�mero real entre el 0-10 para obtener la calificaci�n:");
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
