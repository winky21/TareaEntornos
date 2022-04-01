package ejercicios;

public class Aplicación3 {

	public static void main(String[] args) {
		
		Punto centro = new Punto(4,1);
		Circulo base = new Circulo(centro, 3);
		Cilindro cilindro = new Cilindro(base,2);
		
		//area
		double area;
		area=2*((Math.PI)*Math.pow(base.radio(),2))+2*(Math.PI)*base.radio()*cilindro.altura();
		System.out.print("El area del cilindro es: "+ area);
		
		//volumen
		double volumen;
		volumen=((Math.PI)*Math.pow(base.radio(), 2)*cilindro.altura());
		System.out.print("El volumen del cilindro es: "+ volumen);
	}
}
