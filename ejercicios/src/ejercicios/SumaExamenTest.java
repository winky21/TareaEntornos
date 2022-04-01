package ejercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaExamenTest {
	
	@Test
	public void test() {
		SumaExamen S = new SumaExamen(10,5);
		assertTrue(S.sumar()==15);
	}
}

