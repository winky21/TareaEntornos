package ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class mainPunto {
public static void main(String[] args) {
// A continuación introduzco datos:	
	Punto uno = new Punto (4,5);
	Punto dos = new Punto (3,8);
	Punto tres = new Punto (5,7);
	
	Set <Punto> puntos = new HashSet<Punto>();
	puntos.add(uno);
	puntos.add(dos);
	puntos.add(tres);
	for(Punto punto: puntos) {
		System.out.print("("+punto.toString()+")");
	}
}
}
