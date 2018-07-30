package edu.mum.fpp.test;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.mum.fpp.app.Prog3;

public class Prog3Test {
	
	//TDD - Test Driven Development
	
	//Step 1: Create the test case
	
	//Step 2: Code it to work
	
	//Step 3: Refactor it

	@Test
	public void testProg3() {
		
		Prog3 p1 = new Prog3();
		
		assertEquals(14, p1.computeSumToInt(1.27f, 3.881f, 9.6f));
		
		assertEquals(15, p1.computeSumWithRound(1.27f, 3.881f, 9.6f));
		
	}

}
