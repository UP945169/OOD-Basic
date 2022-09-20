package com.fdmgroup.staticKeyword;

public class Trainee {
	private String name;
	private static int numberOfTrainees;
	private final int id;

	public Trainee(){
		numberOfTrainees = getNumberOfTrainees() + 1;
		id = numberOfTrainees;
	}

	public String getName() {
		return name;
	}

	public static int getNumberOfTrainees() {
		return numberOfTrainees;
	}

	public static void setNumberOfTrainees(int numberOfTrainees) {
		Trainee.numberOfTrainees = numberOfTrainees;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
