package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestCase {

	@Test
	public void addtest() {
		Calculator cob=new Calculator();
		long ans=cob.add(7, 9);
		assertEquals(16,ans);
	}
	@Test
	public void multitest() {
		Calculator cob=new Calculator();
		long ans=cob.multi(7, 9);
		assertEquals(63,ans);
	}
	@Test
	public void divtest() {
		Calculator cob1=new Calculator();
		long ans=cob1.div(10,2);
		assertEquals(5,ans);
		
	}

}
