package com.github.qdots.classes;

import java.util.ArrayList;

import com.github.qdots.interfaces.Linse;
import com.github.qdots.interfaces.StaticFocalLength;
import com.github.qdots.interfaces.ZoomFocalLength;

public class Kameragehäuse {
	private boolean professionalUsage;
	private ArrayList<Linse> lenses;
	private Flash flash;
	
	public Kameragehäuse(boolean isProfessional) {
		professionalUsage = isProfessional;
		lenses =  new ArrayList<Linse>();
	}
	
	public boolean isProfessionalUsage() {
		return professionalUsage;
	}
	
	public boolean addLense(Linse lense) {
		if (lense instanceof ZoomFocalLength || lense instanceof StaticFocalLength) {
			boolean containsLens = false;
			for (Linse arrayLense : lenses) {
				if (arrayLense instanceof ZoomFocalLength || arrayLense instanceof StaticFocalLength) {
					containsLens = true;
				}
			}
			
			if (!containsLens) {
				lenses.add(lense);
				return true;
			} else {
				return false;
			}
		} else {
			lenses.add(lense);
			return true;
		}
	}
	
	public boolean setFlash(Flash provFlash) { 
		if (provFlash.isProfessional() ==  isProfessionalUsage()) {
			flash = provFlash;
			return true;
		} else {
			return false;
		}
	}
}
