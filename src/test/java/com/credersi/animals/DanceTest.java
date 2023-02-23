package com.credersi.animals;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DanceTest {

	@Test
	public void WolfImplementsDance() {
		Wolf wolf= new Wolf();
		assertEquals(wolf.dance(),25);
		
	}
	public int stroke (Purr purrer) {
		return purrer.purr();
	}
	
	@Test
	public void testPurr() {
		Purr cat = new Cat();
		Purr lynx = new Lynx ();
		
		assertEquals(this.stroke(cat), 25);
		assertEquals(this.stroke(lynx), 30);
		
	}
}
