package com.github.qdots.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.github.qdots.classes.ZoomObjektiv;

public class Functionality_ZoomObjektiv {
private ZoomObjektiv objektiv;
	
	@Before public void initialize() {
		objektiv = new ZoomObjektiv(1.5f, 2.0f, 1.2f);
	}	

	@Test
	public void testGetMinFocalLength() {
		assertEquals(1.5f, objektiv.getMinFocalLength(), 0); 
	}

	@Test
	public void testGetMaxFocalLenght() {
		assertEquals(2.0f, objektiv.getMaxFocalLenght(), 0);
	}

	@Test
	public void testGetFilterThreadDiameter() {
		assertEquals(1.2f, objektiv.getFilterThreadDiameter(), 0);
	}

}
