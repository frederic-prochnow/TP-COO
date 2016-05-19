import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testXor2 {

	@Test 
	public void testa0b0r0() {
		Xor2 xor = new Xor2(Fixe.FALSE,Fixe.FALSE);
		assertFalse(xor.valeur());
	}
	@Test 
	public void testa0b1r0() {
		Xor2 xor = new Xor2(Fixe.FALSE,Fixe.TRUE);
		assertTrue(xor.valeur());
	}
	@Test 
	public void testa1b0r0() {
		Xor2 xor = new Xor2(Fixe.TRUE,Fixe.FALSE);
		assertTrue(xor.valeur());
	}
	@Test 
	public void testa1b1r1() {
		Xor2 xor = new Xor2(Fixe.TRUE,Fixe.TRUE);
		assertFalse(xor.valeur());
	}

}
