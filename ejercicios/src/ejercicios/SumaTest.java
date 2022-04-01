package ejercicios;

import static org.junit.Assert.*;


import org.junit.Test;

public class SumaTest {

	@Test
	public void test() {
		Suma S = new Suma(2, 3);
		assertTrue(S.sumar() == 5);
	}
}
