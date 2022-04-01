package ejercicios;

import java.io.File;
import java.io.IOException;

public class ejercicio1_U5 {
	public static void main(String[] args) throws IOException {
		File directorio = new File("C:/EjerciciosStreams");
		if (!directorio.exists()) {
			if (directorio.mkdirs()) {
				System.out.println("Directorio creado");
			}
		} else {
			System.out.println("El directorio ya existe");
		}
		File fichero1 = new File("C:/EjerciciosStreams/uno.java");
		if (!fichero1.exists()) {
			if (fichero1.createNewFile()) {
				System.out.println("Fichero creado");
			}
		} else {
			System.out.println("El directorio ya existe");
		}
		File fichero2 = new File("C:/EjerciciosStreams/dos.java");
		if (!fichero2.exists()) {
			if (fichero2.createNewFile()) {
				System.out.println("Fichero creado");
			}
		} else {
			System.out.println("El directorio ya existe");
		}
		File fichero3 = new File("C:/EjerciciosStreams/tres.java");
		if (!fichero3.exists()) {
			if (fichero3.createNewFile()) {
				System.out.println("Fichero creado");
			}
		} else {
			System.out.println("El directorio ya existe");
		}
	}

}