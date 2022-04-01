package ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
public class ejercicio2_U5 {
	public static void main (String[] args) throws IOException{
		PrintWriter out =null;
		try {
			out =new PrintWriter("C:\\EjerciciosStreams\\uno.java");
			for (int i=0; i<=10;i++) {
				out.println(i);
			}
		}finally {
			if (out !=null) {
				out.close();
			}
}}}