package ejercicios;
import java.util.Scanner;
public class Rectangulo1 {

	public static void main(String[] args) {
		
		Rectangulo R;
		double largo, ancho;
		Scanner sc=new Scanner(System.in);
		System.out.print("Suministre a continuaci�n los valores para el largo y el ancho:");
		largo=sc.nextDouble();
		ancho=sc.nextDouble();
		R=new Rectangulo(largo,ancho);
		System.out.print("�rea: "+ R.area()+" - Per�metro: "+ R.perimetro());
		sc.close();
		
	}
}
