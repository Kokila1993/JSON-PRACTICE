package org.array;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Batters {
	
	private ArrayList<Object> batter;

	public ArrayList<Object> getBatter() {
		return batter;
	}

	public void setBatter(ArrayList<Object> batter) {
		this.batter = batter;
	}

	
	public Batters(ArrayList<Object> batter) {
		super();
		this.batter = batter;
	}

	

	
	
}
