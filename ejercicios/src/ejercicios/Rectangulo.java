package ejercicios;

public class Rectangulo {

	private double largo;
	private double ancho;
	
	public Rectangulo(double largo, double ancho)
	{
		this.largo = largo;
		this.ancho = ancho;
	}
	//metodos
	public double area()
	{
		return largo*ancho;
	}
	public double perimetro()
	{
		return 2*(largo+ancho);
	}
}
