package com.fdmgroup.Casting.Exercises;

import java.util.ArrayList;

public class CalorieCounter {
    ArrayList<FoodItem> lowCalorieFood = new ArrayList<>();


    public void addLowCalorieFood(FoodItem foodItem){
        if(foodItem.getCalories() <= 500) {
            lowCalorieFood.add(foodItem);
        }
    }

    public ArrayList<FoodItem> getAllLowCalorieFoods(){
        return lowCalorieFood;
    }
}
