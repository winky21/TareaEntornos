package ejercicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;


public class ejercicio5_U5 implements Ejercicios {
	public static void main(String[] args) throws IOException {
		BufferedReader ol = null;
		try {
			ol = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\EjerciciosStreams\\datos.txt"), "utf-8"));
			String linea;
			while ((linea = ol.readLine()) != null) {
				System.out.print(linea);

				RandomAccessFile r = null;
				try {
					r = new RandomAccessFile("C:\\\\EjerciciosStreams\\\\datosAleatorio.txt", "rw");
					r.writeChars(linea);
				} finally {
					r.close();
				}}
		} finally {
			fin(ol);}}

	public static void fin(BufferedReader ol) throws IOException {
		if (ol != null) {
			ol.close();
		}
	}}