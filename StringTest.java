package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void Stringtest() {
		StringLength st=new StringLength();
		String s="shraddha";
		long len=s.length();
		assertEquals(8,len);
		
	}

}
