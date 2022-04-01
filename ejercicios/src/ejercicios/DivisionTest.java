package ejercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		Division D = new Division(6, 3);
		assertTrue(D.dividir() == 2);
	}

}
