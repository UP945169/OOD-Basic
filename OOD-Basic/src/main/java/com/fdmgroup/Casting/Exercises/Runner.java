package com.fdmgroup.Casting.Exercises;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Toy toy = new Toy(15,99,150,"Lego");
        Laptop lp = new Laptop(1000,"Macbook",4.50,32,1000);

        Snack sn1 = new Snack(2.50,"Snickers",5,20,1000);
        Snack sn2 = new Snack(2.50,"Mars",5,20,200);

        ReadyMeal rm1 = new ReadyMeal(3.00,"Tesco Curry", 700, "Indian");
        ReadyMeal rm2 = new ReadyMeal(1.70,"Tesco Pasta", 400, "Italian");

        Basket basket = new Basket();

        CalorieCounter calorieCounter = new CalorieCounter();

        basket.addItem(toy);
        basket.addItem(lp);
        basket.addItem(sn1);
        basket.addItem(sn2);
        basket.addItem(rm1);
        basket.addItem(rm2);

        System.out.println(basket.getAllItems());

        basket.removeItem(rm2);

        for (int i = 0; i < basket.getAllItems().size(); i++) {
            System.out.println(basket.getAllItems().get(i).getName());
        }

        calorieCounter.addLowCalorieFood(sn1);
        calorieCounter.addLowCalorieFood(sn2);
        calorieCounter.addLowCalorieFood(rm1);
        calorieCounter.addLowCalorieFood(rm2);

        for (int i = 0; i < calorieCounter.getAllLowCalorieFoods().size(); i++) {
            System.out.println(calorieCounter.getAllLowCalorieFoods().get(i).getCalories());
        }

        ArrayList<FoodItem> lowCalorieFoods = new ArrayList<>();

        lowCalorieFoods.addAll(calorieCounter.getAllLowCalorieFoods());

        //instance of to check is an item is a snack or a ready meal
        //loop through to cast down to either one and print them
    }
}
