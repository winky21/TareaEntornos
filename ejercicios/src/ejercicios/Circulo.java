package ejercicios;

public class Circulo {
	//Atributos
	private double radio;
	private Punto centro;
	
	//Constructores
	public Circulo() {
		setRadio(0.0);
		centro = new Punto();
	}
	public Circulo(Punto c, double r){
		setRadio(r);
		centro=c;
	}
	//Metodos
	public double radio(){
		return getRadio();
	}
	public Punto centro(){
		return centro;
	}
	public void radio(double r){
		r=getRadio();
	}
	public void centro(Punto c){
		c=centro;
	}
	public void trasladar(double a, double b){
		centro.trasladar(a, b);
		
	}
	public String toString() {
		return "el centro es:"+ centro +"y el radio es:"+ getRadio();
	}
	private double getRadio() {
		return radio;
	}
	private void setRadio(double radio) {
		this.radio = radio;
	}
}
