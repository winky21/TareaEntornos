package ejercicios;

public class Aplicación2 {

	public static void main(String[] args) {
		
		Punto centro = new Punto (5,-3);
		Circulo base = new Circulo(centro,5);
		base.trasladar(2, 3);
		
		System.out.print("distancia del centro del círculo al origen de coordenadas: "+ centro.distancia(new Punto(0,0)));

	}
}
