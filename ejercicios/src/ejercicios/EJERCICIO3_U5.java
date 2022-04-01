package ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class EJERCICIO3_U5 {

	public static void main (String[] args) throws IOException{
		PrintWriter out = new PrintWriter ("C:\\EjerciciosStreams\\dos.java");
	
	Scanner sc = new Scanner (System.in);
	double base,altura;
	System.out.println("Introducir base triangulo: ");
	base=sc.nextDouble();
	System.out.println("introducir altura triangulo: ");
	altura=sc.nextDouble();
	double area=(base*altura)/2;
	out.println("el area del triangulo es: "+area);
	sc.close();
	out.close();
	}}

