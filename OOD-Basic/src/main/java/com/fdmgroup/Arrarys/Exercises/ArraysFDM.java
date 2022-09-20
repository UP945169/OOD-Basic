package com.fdmgroup.Arrarys.Exercises;

import java.util.Arrays;

public class ArraysFDM {
    public static void main(String[] args) {
        //1. Friends array
        String[] friends = {"JACK","OLIVER","HARRY","CHARLIE","ALFIE"};
        System.out.println(friends.length);
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);

        friends[4] = "JOHN";
        Arrays.sort(friends);
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);

        friends[1] = null;
        System.out.println(friends[0]);
        System.out.println(friends[1]);
        System.out.println(friends[2]);
        System.out.println(friends[3]);
        System.out.println(friends[4]);

        // 2. Poker Hand
        String[] pokerHand = new String[5];

        pokerHand[0] = "Queen of hearts";
        pokerHand[1] = "3 of Spades";
        pokerHand[2] = "3 of Diamonds";
        pokerHand[3] = "9 of hearts";
        pokerHand[4] = "6 of clubs";
    }
}
