package com.es.models;

import java.util.ArrayList;

public class Exercise{
		
	private long id;
	private ArrayList<String> syllables;
	
	public Exercise(int id) {
		this.id = id;
	}
	
	public Exercise(int id, ArrayList<String>syllables) {
		this.id = id;
		this.syllables = syllables;
		
	}
	
	
	public long getId() {
		return id;
	}
	public ArrayList<String> getSyllables() {
		return syllables;
	}
	public void setSyllable(ArrayList<String> syllables) {
		this.syllables = syllables;
	}
		
}
