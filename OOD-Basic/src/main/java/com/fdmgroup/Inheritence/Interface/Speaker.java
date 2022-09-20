package com.fdmgroup.Inheritence.Interface;

public class Speaker implements Chargable{
    @Override
    public void charge(double amps) {
        System.out.println("Speaker is charging with " + amps + " amps");
    }

    public void makeSound(){
        System.out.println("This speaker makes a sound");
    }
}
