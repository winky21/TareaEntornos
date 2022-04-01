package ejercicios;

import java.util.Arrays;

public class Tarea2 {
public static void main (String[] args) {
	int [] ar = {1,3,5,7,9};
	
	for (int i=0; i<ar.length;i++) {
	System.out.print(ar[i] +" ");
	}
// El for anterior lo cambio por lo siguiente:
	
	System.out.print(Arrays.toString(ar));
	
//Utilizo el metodo toString para que nos devuelva los datos del Array sin necesidad del for.
	
}}
