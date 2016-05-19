import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testIncr1 {

	@Test 
	public void test1() {
		Incr1 incr1 = new Incr1();
		incr1.getEntreeA().connectTo(Fixe.FALSE);
		incr1.getRetenueIn().connectTo(Fixe.TRUE);
		assertTrue(incr1.getSomme().valeur());
	}
	
	@Test 
	public void test2() {
		Incr1 incr1 = new Incr1();
		incr1.getEntreeA().connectTo(Fixe.FALSE);
		incr1.getRetenueIn().connectTo(Fixe.TRUE);
		assertFalse(incr1.getRetenueOut().valeur());
	}
	@Test 
	public void test3() {
		Incr1 incr1 = new Incr1();
		incr1.getEntreeA().connectTo(Fixe.TRUE);
		incr1.getRetenueIn().connectTo(Fixe.TRUE);
		assertFalse(incr1.getSomme().valeur());
	}
	
	@Test 
	public void test4() {
		Incr1 incr1 = new Incr1();
		incr1.getEntreeA().connectTo(Fixe.TRUE);
		incr1.getRetenueIn().connectTo(Fixe.TRUE);
		assertTrue(incr1.getRetenueOut().valeur());
	}
}
