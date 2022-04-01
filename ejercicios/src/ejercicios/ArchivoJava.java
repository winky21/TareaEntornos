package ejercicios;
import java.util.Scanner;
	import java.util.Arrays;
public class ArchivoJava {
	
		public static void main(String[] args) {
			int [] x;
			int [] y;
			int tama;
		
			Scanner sc =new Scanner(System.in);
			System.out.print("Introduzca el tamaño del Array X: ");
			tama=sc.nextInt();
			
			x=new int[tama];
			for (int i=0;i<x.length;i++) {
				System.out.print("Introduzca numero que se guarda en x[" + i+ "]= ");
				x[i]=sc.nextInt();
			}
			
			System.out.print("Introduzca el tamaño del Array Y: ");
			tama=sc.nextInt();
			
			y=new int[tama];
			for (int i=0;i<y.length;i++) {
				System.out.print("Introduzca numero que se guarda en y[" + i+ "]= ");
				y[i]=sc.nextInt();
			}
			
			System.out.println(Arrays.toString(x));
			System.out.println(Arrays.toString(y));
			System.out.println(Arrays.equals(x, y));
			sc.close();
		}
	}

