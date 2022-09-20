package com.fdmgroup.Casting.Exercises;

public class ReadyMeal implements BasketItem, FoodItem {
    private double price;

    private String name;

    private int calories;

    private String cuisineType;

    public ReadyMeal(double price, String name, int calories, String cuisineType) {
        this.price = price;
        this.name = name;
        this.calories = calories;
        this.cuisineType = cuisineType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
