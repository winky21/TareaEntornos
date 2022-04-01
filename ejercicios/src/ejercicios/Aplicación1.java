package ejercicios;

public class Aplicación1 {

	public static void main(String[] args) {
	
		Punto a = new Punto (3.0,2.0);
		Punto b = new Punto (1.0,2.0);
		a.trasladar(2, 3);		
		
	System.out.print("La distancia es: "+ a.distancia(b));

}}