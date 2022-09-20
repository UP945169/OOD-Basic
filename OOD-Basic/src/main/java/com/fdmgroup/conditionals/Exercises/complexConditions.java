package com.fdmgroup.conditionals.Exercises;

public class complexConditions {
    public static void main(String[] args) {
        // 1. Valid account numbers
        int validNumber = 21896628;
        if (validNumber >= 10000000 && validNumber <= 99999999){
            System.out.println("Valid number");
        }
        else {
            System.out.println("Invalid number");
        }

        //2. airline codes
        String flightCode = "LH1234";
        flightCode = flightCode.substring(0,2);

        if(flightCode.equals("BA")){
            System.out.println("British Airways");
        }
        else {
            System.out.println("Not British Airways");
        }

        //3. Airline codes 2
        if(flightCode.equals("LH") || flightCode.equals("BA") || flightCode.equals("FR")){
            System.out.println("Valid airline");
        }
        else {
            System.out.println("Invalid Airline");
        }

        //4. Airline codes 3
        if( !flightCode.equals("LH") || !flightCode.equals("BA") || !flightCode.equals("FA")){
            System.out.println("unrecognised or invalid airline");
        }

        //5. Valid ID
        boolean validPassport = true;
        boolean validDrivingLicence = false;

        if(validPassport == true || validDrivingLicence == true){
            System.out.println("id verfied");
        }
        else{
            System.out.println("unable to verify id");
        }

        //6. older driver
        boolean hasLicence = true;
        boolean isDead = false;
        boolean hasPassedEyeTest = true;

        if(hasLicence == true && !isDead == true && hasPassedEyeTest == true){
            System.out.println("can drive");
        }
        else {
            System.out.println("not licenced to drive");
        }
    }
}
