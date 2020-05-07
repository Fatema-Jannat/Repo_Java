package Practice;

import java.util.Arrays;

public class Practice_Exercise {
    public static void main(String[] args) {

        //String var = "hello how are you? I am good.";
        //System.out.println(var.substring(23));

        int arrInt [] = new int[4];
        arrInt[0]=11;
        arrInt[1]=12;
        arrInt[2]=13;
        arrInt[3]=14;

        int arrLen = arrInt.length;
        System.out.println("Array length: " +arrLen);

        String greetings = "Hi, Welcome to Java Class Session!";
        String[]greetingsSplit = greetings.split(" ");
        System.out.println("List of words in the greeting: " + Arrays.toString(greetingsSplit));
        System.out.println("Total number of words in the 'greetings' String: " + greetings.split(" ").length);

        String[]greetingsSplit2 = greetings.split("a");
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

        String[]fullNameSplit = sentence.split(" ");

        fullNameSplit[0] = fullNameSplit[0].substring(0,1).toUpperCase()+fullNameSplit[0].substring(1).toLowerCase() + " ";
        fullNameSplit[1] = fullNameSplit[1].substring(0,1).toUpperCase() + fullNameSplit[1].substring(1).toLowerCase() + " ";
        fullNameSplit[2] = fullNameSplit[2].substring(0,1).toUpperCase() + fullNameSplit[2].substring(1).toLowerCase() + " ";

        sentence = fullNameSplit[0] + fullNameSplit[1] + fullNameSplit[2];
        System.out.println("New Sentence Value: "+ sentence);

        String strNew = "Hello Dear, How are you?"; //Assign result (boolean) as true if length os strNew is greater than 10 else assign false.

        int strNewLength = strNew.length();
        boolean result = strNewLength>10?true:false;
        System.out.println("Result value: " + result);

        /*
         * String fullname = "";
         * String isEnrolled =
         * Assign "enrolled" if first-name length is greater than 7 or first-name starts with "A" else "Try later".
         */
        String fullName = "Fatema Jannat";
        int firstNameLength = fullName.split(" ")[0].length();
        String isEnrolled = firstNameLength>7 || fullName.startsWith("A")?"Enrolled":"Try later";

        String newFullName = "alvin Smith";
        int newFullNameLength = newFullName.split(" ")[0].length();
        String newIsEnrolled = newFullNameLength > 7||newFullName.toUpperCase().startsWith("A")?"Enrolled":"Try later";

        System.out.println("isEnrolled result: " + newIsEnrolled);

        String threeWords = "Good Morning beautiful people";
        int numberOfWords = threeWords.split(" ").length;
        String resultForThreeWords = numberOfWords==3?"Yes":"No";
        System.out.println("Check if the String contains three words only: " + resultForThreeWords);

        String wishingGreeting = "happy new year";
        String[] splitGreeting = wishingGreeting.split(" ");
        String abr = splitGreeting[0].substring(0,1).toUpperCase()+splitGreeting[1].substring(0,1).toUpperCase()+splitGreeting[2].substring(0,1).toUpperCase();
        System.out.println("Abbreviation of happy new year: " +abr);

        int num = 13;
        if(num%2 !=0){
            System.out.println(num);
        }else{
            boolean numResult = false;
            System.out.println(numResult);
        }




 }
 }
