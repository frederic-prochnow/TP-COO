import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import digisim.*;

public class testOrN {
	@Test 
	public void test1n4() {
		OrN or = new OrN(4);
		or.getEntree(0).connectTo(Fixe.FALSE);
		or.getEntree(1).connectTo(Fixe.FALSE);
		or.getEntree(2).connectTo(Fixe.FALSE);
		or.getEntree(3).connectTo(Fixe.FALSE);
		assertFalse(or.valeur());
	}
	
	@Test 
	public void test2n4() {
		OrN or = new OrN(4);
		or.getEntree(0).connectTo(Fixe.FALSE);
		or.getEntree(1).connectTo(Fixe.TRUE);
		or.getEntree(2).connectTo(Fixe.FALSE);
		or.getEntree(3).connectTo(Fixe.TRUE);
		assertTrue(or.valeur());
	}
	@Test 
	public void test3n4() {
		OrN or = new OrN(4);
		or.getEntree(0).connectTo(Fixe.TRUE);
		or.getEntree(1).connectTo(Fixe.TRUE);
		or.getEntree(2).connectTo(Fixe.TRUE);
		or.getEntree(3).connectTo(Fixe.TRUE);
		assertTrue(or.valeur());
	}
	@Test 
	public void test4n8() {
		OrN or = new OrN(8);
		or.getEntree(0).connectTo(Fixe.TRUE);
		or.getEntree(1).connectTo(Fixe.TRUE);
		or.getEntree(2).connectTo(Fixe.TRUE);
		or.getEntree(3).connectTo(Fixe.TRUE);
		or.getEntree(4).connectTo(Fixe.FALSE);
		or.getEntree(5).connectTo(Fixe.TRUE);
		or.getEntree(6).connectTo(Fixe.FALSE);
		or.getEntree(7).connectTo(Fixe.TRUE);
		assertTrue(or.valeur());
	}

}
