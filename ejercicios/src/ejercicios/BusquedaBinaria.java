package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int [] v;
		int tama,dato,posicion;
		//pido por teclado el tamaño del array y los numeros por teclado
		Scanner sc =new Scanner(System.in);
		//vamos a pedir el tamaño del array 
		System.out.print("Introduzca el tamaño del vector: ");
		tama=sc.nextInt();
		
		v=new int[tama];
		
		//vamos a pedir los numeros por teclado y los guardamos en el array
		for (int i=0;i<v.length;i++) {
			System.out.print("Introduzca numero que se guarda en v[" + i+ "]= ");
			v[i]=sc.nextInt();
		}
		//vamos a pedir el numero a buscar por teclado
		System.out.print("Introduzca numero a buscar: ");
		dato=sc.nextInt();
		sc.close();
		//busqueda binaria
		System.out.println("está en el vector: " + Arrays.binarySearch(v, dato));
	}

}
