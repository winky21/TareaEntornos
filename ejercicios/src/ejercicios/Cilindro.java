package ejercicios;

public class Cilindro {
	//Atributos
	private double altura;
	private Circulo base;
	private Punto centro;
	
	//Constructores
	public Cilindro(){
		altura=0.0;
		centro = new Punto();
		base = new Circulo();
	}
	public Cilindro(Circulo b, double a){
		altura=a;
		base=b;
	}
	//Metodos
	public double altura() {
		return altura;
	}
	public Circulo base() {
		return base;
	}
	public void altura(double a) {
		altura=a;
	}
	public void base(Circulo b) {
		base=b;
	}
	public void trasladar(double a, double b) {
		centro.trasladar(a, b);
	}
	public String toString() {
		return "La altura es: "+ altura +"La base es: "+ base + "radio: "+ base.radio();
	}
}
