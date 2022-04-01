package ejercicios;

public class CuentaBancaria {
	//Atributos
	private double saldo;
	private String nrocuenta;
	private String titular;

	//Constructor
	public CuentaBancaria(double montoInicial, String num, String nombre) {
	this.saldo=montoInicial;
	this.nrocuenta=num;
	this.titular=nombre;
	}
	//Metodos
	public void depositar(double cantidad) {
		if (cantidad>0) {
			saldo +=cantidad;	
		}
	}
	public void retirar(double cantidad) {
		if (cantidad<saldo) {
			saldo -=cantidad;
		}
	}
	public double obtenersaldo() {
		return saldo;
	
}}
