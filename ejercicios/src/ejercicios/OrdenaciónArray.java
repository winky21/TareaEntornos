package ejercicios;
import java.util.Arrays;
import java.util.Scanner;
	
public class Ordenaci�nArray {
	
		public static void main(String[] args) {
			
			int [] v;
			int tama;
			
			Scanner sc =new Scanner(System.in);
			//vamos a pedir el tama�o del array 
			System.out.print("Introduzca el tama�o del vector: ");
			tama=sc.nextInt();
			
			v=new int[tama];
			
			//vamos a pedir los numeros por teclado y los guardamos en el array
			for (int i=0;i<v.length;i++) {
				System.out.print("Introduzca numero que se guarda en v[" + i+ "]= ");
				v[i]=sc.nextInt();
			}
			sc.close();
			//el array antes de ordenarse
			System.out.println("Los elementos del array antes de ordenarlos son: ");
			for (int i=0;i<v.length;i++) {
				System.out.print(v[i] +" ");
			}
			System.out.println();
			
			//la parte de ordenar el array con el algoritmo de seleccion
			Arrays.sort(v);
			
			//el array despues de ordenarse
			System.out.println("Los elementos del array despues de ordenarlos son: ");
			for (int i=0;i<v.length;i++) {
				System.out.print(v[i] +" ");
			}
			System.out.println();
			   
		}
	}

