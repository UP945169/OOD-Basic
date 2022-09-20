package com.fdmgroup.Inheritence.Interface.Exercises;

import java.util.ArrayList;

public class Basket {
    ArrayList<BasketItem> basketItems = new ArrayList<>();

    public void addItem(BasketItem basketItem){
        basketItems.add(basketItem);
    }

    public void removeItem(BasketItem basketItem){
        basketItems.remove(basketItem);
    }

    public ArrayList<BasketItem> getAllItems(){
        return basketItems;
    }
}
