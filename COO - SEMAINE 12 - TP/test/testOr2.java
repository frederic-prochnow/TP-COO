import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testOr2 {

	@Test 
	public void testa0b0r0() {
		Or2 or = new Or2(Fixe.FALSE,Fixe.FALSE);
		assertFalse(or.valeur());
	}
	@Test 
	public void testa0b1r0() {
		Or2 or = new Or2(Fixe.FALSE,Fixe.TRUE);
		assertTrue(or.valeur());
	}
	@Test 
	public void testa1b0r0() {
		Or2 or = new Or2(Fixe.TRUE,Fixe.FALSE);
		assertTrue(or.valeur());
	}
	@Test 
	public void testa1b1r1() {
		Or2 or = new Or2(Fixe.TRUE,Fixe.TRUE);
		assertTrue(or.valeur());
	}

}
