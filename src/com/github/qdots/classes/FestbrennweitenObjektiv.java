package com.github.qdots.classes;

import com.github.qdots.interfaces.Linse;
import com.github.qdots.interfaces.StaticFocalLength;

public class FestbrennweitenObjektiv implements Linse, StaticFocalLength{
private float focalLength;
private float filterThreadDiameter;
	
	public FestbrennweitenObjektiv(float provFocalLength, float provFilterThreadDiameter) {
		if (!(provFocalLength > 0)) {
			throw new AssertionError();
		}
		
		focalLength = provFocalLength;
		filterThreadDiameter = provFilterThreadDiameter;
	}

	@Override
	public float getFocalLength() {
		// TODO Auto-generated method stub
		return focalLength;
	}

	@Override
	public float getFilterThreadDiameter() {
		return filterThreadDiameter;
	}

}
