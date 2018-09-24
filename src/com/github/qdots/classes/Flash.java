package com.github.qdots.classes;

import java.util.ArrayList;

public class Flash {
private boolean professional;
private ArrayList<Flash> controlledFlashes;

public Flash(boolean provProfessional) {
	professional = provProfessional;
	controlledFlashes = new ArrayList<Flash>();
}

public boolean isProfessional() {
	return professional;
}

public boolean addControlledFlash(Flash flash) {
	if (flash != this) {
		if (professional == true) {
			boolean allreadyControling = false;
			for (Flash arrayFlash : controlledFlashes) {
				if (arrayFlash == flash) {
					allreadyControling = true;
				}
			}
			
			if (!allreadyControling) {
				controlledFlashes.add(flash);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
			
	} else {
		return false;
	}
}

}
