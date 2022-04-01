package ejercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void test() {
		Resta R = new Resta(4, 2);
		assertTrue(R.restar() == 2);
	}

}
