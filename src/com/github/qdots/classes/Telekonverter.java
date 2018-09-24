package com.github.qdots.classes;

import com.github.qdots.interfaces.Linse;
import com.github.qdots.interfaces.TelekonverterElongationFactor;

public class Telekonverter implements Linse, TelekonverterElongationFactor{
	private float elongiationFactor;
	private float filterThreadDiameter;
	
	public Telekonverter(float provElongiationFactor, float provFilterThreadDiameter) {
		elongiationFactor = provElongiationFactor;
		filterThreadDiameter = provFilterThreadDiameter;
	}
	
	@Override
	public float getElongiationFactor() {
		return elongiationFactor;
	}

	@Override
	public float getFilterThreadDiameter() {
		return filterThreadDiameter;
	}

}
