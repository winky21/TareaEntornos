package ejercicios;

public class Multiplicacion {
	int num1;
	int num2;
	
	public Multiplicacion(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int multiplicar() {
		int resultado = num1 * num2;
		return resultado;
	}
}
