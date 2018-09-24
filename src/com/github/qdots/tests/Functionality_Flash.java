package com.github.qdots.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.github.qdots.classes.Flash;

public class Functionality_Flash {
private Flash flash;
private Flash controlledFlash;
	
	@Before public void initialize() {
		flash = new Flash(true);
		controlledFlash = new Flash(false);
	}	
	@Test
	public void testIsProfessional() {
		assertEquals(true, flash.isProfessional());
	}

	@Test
	public void testAddControlledFlash() {
		boolean successfullyAdded = flash.addControlledFlash(controlledFlash);
		assertEquals(true, successfullyAdded);
	}

}
