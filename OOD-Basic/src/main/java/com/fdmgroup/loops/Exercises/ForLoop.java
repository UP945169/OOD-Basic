package com.fdmgroup.loops.Exercises;

public class ForLoop {
    public static void main(String[] args) {
        /*for (int i = 1; i < 1000000; i++) {
            System.out.print(i);
        }*/

        //2 Summing a million
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        System.out.println(sum);

        //3 odd numbers
        /*for (int i = 1; i <= 20; i+=2) {
            System.out.println(i);*/
        //4 three times table
        /*for (int i = 1; i < 12; i++) {
            System.out.println(i + " * 3 = " + (i *3));
        }*/

        //4 3 Times table
        for (int number = 1; number <= 12; number++) {
            System.out.println(number + " * 3 = " + (number *3 ));
            
        }

        //5 Incrementing alternate numbers
        int[] scores = {25, 15,99,75,47,59,82};

        for (int i = 1; i < scores.length; i+=2) {
            scores[i] += 1;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        //6 alternative letters
        char l;
        for (l = 'b'; l <'z' ; l+=2) {
            System.out.println(l);
        }

        //7 times tables
        for (int table = 2; table <=12; table++){
            System.out.println(table+" times table");
            for (int multiple = 1; multiple <=12; multiple++){
                int result = multiple * table;
                System.out.println(multiple+" x "+table+" = "+result);
            }
            System.out.println();
        }
    }
}
