package com.fdmgroup.staticKeyword;

public class Runner {

	public static void main(String[] args) {
		Trainee trainee1 = new Trainee();
		Trainee trainee2 = new Trainee();
		Trainee trainee3 = new Trainee();

		System.out.println(trainee1.getNumberOfTrainees());
		System.out.println(trainee2.getNumberOfTrainees());
		System.out.println(trainee3.getNumberOfTrainees());

		System.out.println(Trainee.getNumberOfTrainees());
	}

}
