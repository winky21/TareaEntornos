package ejercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicacionTest {

	@Test
	public void test() {
		Multiplicacion M = new Multiplicacion(2, 6);
		assertTrue(M.multiplicar() == 12);
		
	}

}
