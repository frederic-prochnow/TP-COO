import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import digisim.*;

public class testXorN {

	@Test 
	public void test1n4() {
		XorN xor = new XorN(4);
		xor.getEntree(0).connectTo(Fixe.FALSE);
		xor.getEntree(1).connectTo(Fixe.FALSE);
		xor.getEntree(2).connectTo(Fixe.FALSE);
		xor.getEntree(3).connectTo(Fixe.FALSE);
		assertFalse(xor.valeur());
	}
	
	@Test 
	public void test2n4() {
		XorN xor = new XorN(4);
		xor.getEntree(0).connectTo(Fixe.FALSE);
		xor.getEntree(1).connectTo(Fixe.TRUE);
		xor.getEntree(2).connectTo(Fixe.FALSE);
		xor.getEntree(3).connectTo(Fixe.TRUE);
		assertTrue(xor.valeur());
	}
	@Test 
	public void test3n4() {
		XorN xor = new XorN(4);
		xor.getEntree(0).connectTo(Fixe.TRUE);
		xor.getEntree(1).connectTo(Fixe.TRUE);
		xor.getEntree(2).connectTo(Fixe.TRUE);
		xor.getEntree(3).connectTo(Fixe.TRUE);
		assertFalse(xor.valeur());
	}
	@Test 
	public void test4n8() {
		XorN xor = new XorN(8);
		xor.getEntree(0).connectTo(Fixe.TRUE);
		xor.getEntree(1).connectTo(Fixe.TRUE);
		xor.getEntree(2).connectTo(Fixe.TRUE);
		xor.getEntree(3).connectTo(Fixe.TRUE);
		xor.getEntree(4).connectTo(Fixe.FALSE);
		xor.getEntree(5).connectTo(Fixe.TRUE);
		xor.getEntree(6).connectTo(Fixe.FALSE);
		xor.getEntree(7).connectTo(Fixe.TRUE);
		assertTrue(xor.valeur());
	}

}
