package ejercicios;
public class CuentaBancaria2 {
	//Atributos
	private String numero;
	private double saldo;
	private Cliente titular;
	
	//Constructor
	public CuentaBancaria2(double saldo, String numero, Cliente titular) {
		this.saldo=saldo;
		this.numero=numero;
		this.titular=titular;}
	
	//Metodos ingreso y reintegro
	public void ingreso(double cantidad) {
		if (cantidad>0) {
			saldo=saldo+cantidad;}}
	public void reintegro(double cantidad) {
		if (cantidad<saldo)
			saldo=saldo-cantidad;
		
	//Metodos de consulta y modificación
		}
	public String getNumero() {
		return numero;}
	public void setNumero(String numero) {
		this.numero = numero;}
	public double getSaldo() {
		return saldo;}
	public void setSaldo(double saldo) {
		this.saldo = saldo;}
	public Cliente getTitular() {
		return titular;}
	public void setTitular(Cliente titular) {
		this.titular = titular;}
	
	//Metodo dni
	public Cliente getdni(Cliente dni) {
		return dni;
		}}
