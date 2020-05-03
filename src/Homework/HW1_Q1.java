package Homework;
/* 1) Store below scenario value in an appropriate dataType variable, and print the same in console.
	1. number of hours in a day
	2. number of max no. of days in a years
	3. total number of employees in an organisation
	4. population in a country
	5. interest rate
	6. balance in a bank account
	7. does the sun rise from the west? Store answer
	8. initials of your name
	9. Your name
@Name: Fatema Jannat
@Date 04/27/2020
 */
public class HW1_Q1 {
    public static void main(String[] args) {
        byte numOfHours = 24; //Total number of hours in a day
        short numOfDays = 365; //Total number of max no. of days in a years
        int totalNumOfEmpl = 50; //total number of employees in an organisation
        long population = 1400000000L; //population in a country
        float interestRate = 18.23f; //interest rate
        double accBalance = 5000.00; //balance in a bank account
        char initial1 = 'F'; //First Initial
        char initial2 = 'J'; //Last Initial
        String name = "Fatema Jannat"; //Full name
        boolean sunRise = false; //Answer to #7 Question

        System.out.println("1. Number of hours in a day: " + numOfHours + " hours.");
        System.out.println("2. Number of max no. of days in a years: " +numOfDays +" days.");
        System.out.println("3. Total number of employees in an organisation: " + totalNumOfEmpl);
        System.out.println("4. Population in a country: " + population + " billion.");
        System.out.println("5. Interest Rate: " + interestRate +"%");
        System.out.println("6. Balance in a bank account: $"+ accBalance);
        System.out.println("7. Does the sun rise from the west? " + sunRise);
        System.out.println("8. Initials of your name: "+ initial1 + initial2);
        System.out.println("9. Your name: " + name);



    }
}
