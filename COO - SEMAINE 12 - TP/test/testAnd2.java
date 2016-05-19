import static org.junit.Assert.*;
import org.junit.Test;

import digisim.*;

public class testAnd2 {

	@Test 
	public void testa0b0r0() {
		And2 and = new And2();
		and.getEntreeA().connectTo(Fixe.FALSE);
		and.getEntreeB().connectTo(Fixe.FALSE);
		assertFalse(and.valeur());
	}
	@Test 
	public void testa0b1r0() {
		And2 and = new And2();
		and.getEntreeA().connectTo(Fixe.FALSE);
		and.getEntreeB().connectTo(Fixe.TRUE);
		assertFalse(and.valeur());
	}
	@Test 
	public void testa1b0r0() {
		And2 and = new And2();
		and.getEntreeA().connectTo(Fixe.TRUE);
		and.getEntreeB().connectTo(Fixe.FALSE);
		assertFalse(and.valeur());
	}
	@Test 
	public void testa1b1r1() {
		And2 and = new And2();
		and.getEntreeA().connectTo(Fixe.TRUE);
		and.getEntreeB().connectTo(Fixe.TRUE);
		assertTrue(and.valeur());
	}
}
