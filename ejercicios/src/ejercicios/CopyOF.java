package ejercicios;
import java.util.Arrays;
public class CopyOF {
	
	public static void main(String[] args) {
			
		int x[] = {5,2,1,6,8};
		int y[] = {4,1,8,3,10};
		int z[] = new int[x.length + y.length];
			
		System.arraycopy(x, 0, z, 0, x.length);
		System.arraycopy(y, 0, z, x.length, y.length);
			
		System.out.println(Arrays.toString(z));
			
		
		int w[] = new int[4];
			
		w = Arrays.copyOf(x, 4);
			
		System.out.println(Arrays.toString(w));
		}
	}

