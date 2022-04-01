package ejercicios;
	
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class ejercicio4_U5{
public static void main (String[] args) throws IOException{
	BufferedReader in =null;
	try {
	in =new BufferedReader(new InputStreamReader (new FileInputStream("C:\\EjerciciosStreams\\datos.txt"), "utf-8"));
	String linea;
	while ((linea=in.readLine())!=null) {
	System.out.print(linea);	
	}
	}finally {
		if (in!=null) {
			in.close();
		}
	}
}
}
	