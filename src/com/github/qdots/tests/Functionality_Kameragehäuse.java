package com.github.qdots.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.github.qdots.classes.Flash;
import com.github.qdots.classes.Kamerageh�use;
import com.github.qdots.classes.ZoomObjektiv;

public class Functionality_Kamerageh�use {
	private Kamerageh�use camera;
	private ZoomObjektiv objektiv;
	private Flash flash;
	
		
		@Before public void initialize() {
			camera = new Kamerageh�use(true);
			objektiv = new ZoomObjektiv(1.5f, 2.0f, 1.2f);
			flash = new Flash(true);
		}	
	@Test
	public void testIsProfessionalUsage() {
		assertEquals(true, camera.isProfessionalUsage());
	}

	@Test
	public void testAddLense() {
		boolean successfullyAddedLens = camera.addLense(objektiv);
		assertEquals(true, successfullyAddedLens);
	}

	@Test
	public void testSetFlash() {
		boolean successfullyAddedFlash = camera.setFlash(flash);
		assertEquals(true, successfullyAddedFlash);
	}

}
