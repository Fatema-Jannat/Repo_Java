package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Exercise {
    public static void main(String[] args) {

        //String var = "hello how are you? I am good.";
        //System.out.println(var.substring(23));

        int arrInt[] = new int[4];
        arrInt[0] = 11;
        arrInt[1] = 12;
        arrInt[2] = 13;
        arrInt[3] = 14;

        int arrLen = arrInt.length;
        System.out.println("Array length: " + arrLen);

        String greetings = "Hi, Welcome to Java Class Session!";
        String[] greetingsSplit = greetings.split(" ");
        System.out.println("List of words in the greeting: " + Arrays.toString(greetingsSplit));
        System.out.println("Total number of words in the 'greetings' String: " + greetings.split(" ").length);

        String[] greetingsSplit2 = greetings.split("a");
        /*If we make a cut where ever there's an 'a' in the String,
        it will remove the 'a' from the String and will print rest of the elements without including the 'a's, as substrings.
        */
        System.out.println("SubStrings after the split at 'a': " + Arrays.toString(greetingsSplit2));

        //To print the length of the String without using the length() method, you can use .length

        System.out.println("List of elements in the String: " + Arrays.toString(greetings.split("")));

        System.out.println("Length of the String is: " + greetings.split("").length);
        /*If noting is put including space inside the "", then it will print every elements in the string.
         Then we can use the .length to calculate the length of the String.*/

        String sentence = "happy new year"; //Change to Happy New Year
        System.out.println("Sentence value : " + sentence);

        String[] fullNameSplit = sentence.split(" ");

        fullNameSplit[0] = fullNameSplit[0].substring(0, 1).toUpperCase() + fullNameSplit[0].substring(1).toLowerCase() + " ";
        fullNameSplit[1] = fullNameSplit[1].substring(0, 1).toUpperCase() + fullNameSplit[1].substring(1).toLowerCase() + " ";
        fullNameSplit[2] = fullNameSplit[2].substring(0, 1).toUpperCase() + fullNameSplit[2].substring(1).toLowerCase() + " ";

        sentence = fullNameSplit[0] + fullNameSplit[1] + fullNameSplit[2];
        System.out.println("New Sentence Value: " + sentence);

        String strNew = "Hello Dear, How are you?"; //Assign result (boolean) as true if length os strNew is greater than 10 else assign false.

        int strNewLength = strNew.length();
        boolean result = strNewLength > 10 ? true : false;
        System.out.println("Result value: " + result);

        /*
         * String fullname = "";
         * String isEnrolled =
         * Assign "enrolled" if first-name length is greater than 7 or first-name starts with "A" else "Try later".
         */
        String fullName = "Fatema Jannat";
        int firstNameLength = fullName.split(" ")[0].length();
        String isEnrolled = firstNameLength > 7 || fullName.startsWith("A") ? "Enrolled" : "Try later";

        String newFullName = "alvin Smith";
        int newFullNameLength = newFullName.split(" ")[0].length();
        String newIsEnrolled = newFullNameLength > 7 || newFullName.toUpperCase().startsWith("A") ? "Enrolled" : "Try later";

        System.out.println("isEnrolled result: " + newIsEnrolled);

        String threeWords = "Good Morning beautiful people";
        int numberOfWords = threeWords.split(" ").length;
        String resultForThreeWords = numberOfWords == 3 ? "Yes" : "No";
        System.out.println("Check if the String contains three words only: " + resultForThreeWords);

        String wishingGreeting = "happy new year";
        String[] splitGreeting = wishingGreeting.split(" ");
        String abr = splitGreeting[0].substring(0, 1).toUpperCase() + splitGreeting[1].substring(0, 1).toUpperCase() + splitGreeting[2].substring(0, 1).toUpperCase();
        System.out.println("Abbreviation of happy new year: " + abr);

        int num = 13;
        if (num % 2 != 0) {
            System.out.println(num);
        } else {
            boolean numResult = false;
            System.out.println(numResult);
        }

        for (int i = 1; i <= 5; i++) {        //for(Initialization; Condition ; Increment )
            System.out.println("Hello");
        }
        System.out.println("Hello done");

        /** for (int j = 10; j>=1; j--){
         System.out.println("j = " + j);
         }
         */

        /** for (int j = 2; j<=10; j+=2) {
         System.out.println("j = " + j);
         }*/

        /** for (int j = 1; j <= 10; j += 2) {
         System.out.println("j = " + j);
         }*/

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }

        int number = 1;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
            } else {
                System.out.println("Odd: " + number);
            }
            number++;
        }

        int value = 15;
        while (value >= 1 && value <= 30) {

            if (value % 3 == 0 && value % 5 == 0) {
                System.out.println("The number " + value + " is divisible by both '3' and '5'");

            } else if (value % 3 == 0) {
                System.out.println("The number " + value + " is divisible by 3");

            } else if (value % 5 == 0) {
                System.out.println("The number " + value + " is divisible by 5");

            } else {
                System.out.println("The number is: " + value);

            }
            value++;
        }
        int g1 = 10;
        do {
            System.out.println("g1= " + g1);
            g1++;
        } while (g1 > 100);
        System.out.println("do-while loop ends");

        int[] numbers = {87, 90, 95, 120, 543};
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < numbers.length; i++)
            sum += numbers[i];


        System.out.println("Sum of given array is " + sum);
    int age = 14;
    switch (age){
        case 10:
            System.out.println("10");
            break;
        case 11:
            System.out.println("11");
            break;
        case 14:
            System.out.println("14");
            break;
        case 20:
            System.out.println("20");
            break;

    }
    int k =1;
    while (k <=5){
        System.out.println("a");
        k++;

    }

        /**
         # Take user input for Fans name
         and based on name, print his/her favorite sports name
         * Football
         Deepak
         * Soccer
         Alex
         * Cricket
         Ahsan, Shaira
         * Basketball
         Mahadi
         * Not a Fan of Sports
         Fatema
         * */

        Scanner input = new Scanner(System.in);

        // Enter Fan's name and press Enter
        System.out.println("Enter Fan's name: ");
        String name = input.nextLine();
        String sports;

        if(name.equalsIgnoreCase("Deepak")){
            sports="Football";
            System.out.println(name + "'s favorite sport is: " + sports);
        }else if(name.equalsIgnoreCase("Alex")){
            sports="Soccer";
            System.out.println(name + "'s favorite sport is: " + sports);
        }else if (name.equalsIgnoreCase("Ahsan") || name.equalsIgnoreCase("Shaira")){
            sports="Cricket";
            System.out.println(name + "'s favorite sport is: " + sports);
        }else if(name.equalsIgnoreCase("Mahadi")){
            sports="Basketball";
            System.out.println(name + "'s favorite sport is: " + sports);
        }else if(name.equalsIgnoreCase("Fatema")){
            sports="Not a Fan of Sports";
            System.out.println(name + "'s favorite sport is: " + sports);
        }else{
            System.out.println("Invalid Fan's name: "+ name);
        }
        String word = "Level";
        int length = word.length();
        String rev = "";

        for(int h= length -1; h >= 0; h--)
            rev = rev + word.charAt(h);
        if(word.equalsIgnoreCase(rev))
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is NOT a palindrome.");




    }
}





