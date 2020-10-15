package com.es.models;

import java.util.ArrayList;

public class Level {
	
	private long id;
	
	private ArrayList<Exercise> exercises;

	public Level(ArrayList<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Level(long id, ArrayList<Exercise> exercises) {
		super();
		this.id = id;
		this.exercises = exercises;
	}

	public long getId() {
		return id;
	}

	public ArrayList<Exercise> getExercises() {
		return exercises;
	}	
	
}
