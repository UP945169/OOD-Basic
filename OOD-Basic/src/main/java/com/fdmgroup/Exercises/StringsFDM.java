package com.fdmgroup.Exercises;

public class StringsFDM {
    public static void main(String[] args) {
        String message = "Hello this is java";
        System.out.println(message);

        // 2. Full name

        String firstName = "Susruth ";
        String secondName = "Puppala";
        String fullName = firstName +  secondName;

        System.out.println(fullName);

        // 3. Personal Message

        String name = " Susruth";
        System.out.println("Hello" + name + ", would you like to learn some Java today?");

        // 4. Name operations

        String nameforQuestion4 = "Abhirama Susruth Puppala";
        System.out.println(nameforQuestion4.length());
        System.out.println(nameforQuestion4.toUpperCase());
        System.out.println(nameforQuestion4.charAt(0));
        System.out.println(nameforQuestion4.charAt(23));

        // 4. Sentence operations

        String sentenceOperations = "This is a sentence";
        System.out.println(sentenceOperations.indexOf(" "));
        System.out.println(sentenceOperations.lastIndexOf(" "));
        System.out.println(sentenceOperations.indexOf("x"));
        System.out.println(sentenceOperations.substring(0,4));
        System.out.println(sentenceOperations.substring(10));
        System.out.println(sentenceOperations.substring(5,9));
        System.out.println(sentenceOperations.contains("a"));
        System.out.println(sentenceOperations.contains("x"));
        sentenceOperations = "Is this a sentence?";
        System.out.println(sentenceOperations);
        System.out.println(sentenceOperations.replaceFirst("t", "T"));

    }
}
