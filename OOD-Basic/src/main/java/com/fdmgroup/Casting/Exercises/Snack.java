package com.fdmgroup.Casting.Exercises;

public class Snack implements FoodItem, BasketItem {

    private double price;

    private String name;

    private int fatContent;

    private int sugarContent;

    private int calories;

    public Snack(double price, String name, int fatContent, int sugarContent, int calories) {
        this.price = price;
        this.name = name;
        this.fatContent = fatContent;
        this.sugarContent = sugarContent;
        this.calories = calories;
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

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }
}
