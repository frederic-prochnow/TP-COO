import static org.junit.Assert.*;

import org.junit.Test;

import digisim.*;

public class testAndN {

	@Test 
	public void test1n4() {
		AndN and = new AndN(4);
		and.getEntree(0).connectTo(Fixe.FALSE);
		and.getEntree(1).connectTo(Fixe.FALSE);
		and.getEntree(2).connectTo(Fixe.FALSE);
		and.getEntree(3).connectTo(Fixe.FALSE);
		assertFalse(and.valeur());
	}
	
	@Test 
	public void test2n4() {
		AndN and = new AndN(4);
		and.getEntree(0).connectTo(Fixe.FALSE);
		and.getEntree(1).connectTo(Fixe.TRUE);
		and.getEntree(2).connectTo(Fixe.FALSE);
		and.getEntree(3).connectTo(Fixe.TRUE);
		assertFalse(and.valeur());
	}
	@Test 
	public void test3n4() {
		AndN and = new AndN(4);
		and.getEntree(0).connectTo(Fixe.TRUE);
		and.getEntree(1).connectTo(Fixe.TRUE);
		and.getEntree(2).connectTo(Fixe.TRUE);
		and.getEntree(3).connectTo(Fixe.TRUE);
		assertTrue(and.valeur());
	}
	@Test 
	public void test4n8() {
		AndN and = new AndN(8);
		and.getEntree(0).connectTo(Fixe.TRUE);
		and.getEntree(1).connectTo(Fixe.TRUE);
		and.getEntree(2).connectTo(Fixe.TRUE);
		and.getEntree(3).connectTo(Fixe.TRUE);
		and.getEntree(4).connectTo(Fixe.FALSE);
		and.getEntree(5).connectTo(Fixe.TRUE);
		and.getEntree(6).connectTo(Fixe.FALSE);
		and.getEntree(7).connectTo(Fixe.TRUE);
		assertFalse(and.valeur());
	}
}
