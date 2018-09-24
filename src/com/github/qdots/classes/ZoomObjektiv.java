package com.github.qdots.classes;

import com.github.qdots.interfaces.Linse;
import com.github.qdots.interfaces.ZoomFocalLength;

public class ZoomObjektiv implements Linse, ZoomFocalLength{
private float minFocalLenght;
private float maxFocalLength;
private float filterThreadDiameter;

public ZoomObjektiv(float provMinFocalLength, float provMaxFocalLength, float provFilterThreadDiameter) {
	if (!(provMinFocalLength > 0) || !(provMaxFocalLength > 0)) {
		throw new AssertionError();
	}
	
	if (!((provMaxFocalLength - provMinFocalLength) > 0.049)) {
		throw new AssertionError();
	}
	
	minFocalLenght = provMinFocalLength;
	maxFocalLength = provMaxFocalLength;
	filterThreadDiameter = provFilterThreadDiameter;
}
	
	
	@Override
	public float getMinFocalLength() {
		return minFocalLenght;
	}

	@Override
	public float getMaxFocalLenght() {
		return maxFocalLength;
	}

	@Override
	public float getFilterThreadDiameter() {
		// TODO Auto-generated method stub
		return filterThreadDiameter;
	}
	
}
