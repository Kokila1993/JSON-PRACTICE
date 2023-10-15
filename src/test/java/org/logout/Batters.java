package org.logout;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Batters {
	
	private ArrayList<Batter> batter;

	public ArrayList<Batter> getBatter() {
		return batter;
	}

	public void setBatter(ArrayList<Batter> batter) {
		this.batter = batter;
	}

	
}
