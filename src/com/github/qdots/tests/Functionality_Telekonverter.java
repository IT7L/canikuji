package com.github.qdots.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.github.qdots.classes.Telekonverter;

public class Functionality_Telekonverter {
private Telekonverter objektiv;
	
	@Before public void initialize() {
		objektiv = new Telekonverter(5.0f, 1.2f);
	}	
	
	
	@Test
	public void testGetElongiationFactor() {
		assertEquals(5.0f, objektiv.getElongiationFactor(), 0);
	}

	@Test
	public void testGetFilterThreadDiameter() {
		assertEquals(1.2f, objektiv.getFilterThreadDiameter(), 0);
	}

}
