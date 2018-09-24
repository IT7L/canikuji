package com.github.qdots.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.github.qdots.classes.FestbrennweitenObjektiv;

public class Functionality_FestbrennweitenObjektiv {
private FestbrennweitenObjektiv objektiv;
	
	@Before public void initialize() {
		objektiv = new FestbrennweitenObjektiv(1.5f, 1.2f);
	}	
	
	
	@Test
	public void testGetFocalLength() {
		assertEquals(1.5f, objektiv.getFocalLength(), 0);
	}

	@Test
	public void testGetFilterThreadDiameter() {
		assertEquals(1.2f, objektiv.getFilterThreadDiameter(), 0);
	}

}
