package Homework;
/**
 *
 * Store your first name in a variable, and display the following:
 *     1. Display length of the first name.
 *     2. Does your name starts with "K" (Considering cases)
 *     3. First alphabet of your name
 *     4. Does your name ends with "M" (Ignoring cases)
 */
/**
 * @Programmed by Fatema Jannat
 * @Date 05/02/2020
 */

public class HW2 {
    public static void main(String[] args) {

        String firstName = "Fatema";
        //length
        int firstNameLength = firstName.length();
        System.out.println("1. Length of the first name is: " + firstNameLength); //Displays length of the first name.

        //2. Does your name starts with "K" (Considering cases)
        boolean verifyStartsWith = firstName.startsWith("K"); //starts-With
        System.out.println("2. Does your name starts with \"K\" (Considering cases): " + verifyStartsWith);

        //3. First alphabet of your name
        //charAt
        char firstLetterOfName = firstName.charAt(0);
        System.out.println("3. First alphabet of your name: " + firstLetterOfName);

        //4. Does your name ends with "M" (Ignoring cases)
        boolean ignoringCasesEndsWith = firstName.toUpperCase().endsWith("M"); //ends-With
        System.out.println("4. Does your name ends with \"M\" (Ignoring cases): " + ignoringCasesEndsWith);

/**
 *
 * String myStatment = "I am a good programmer";
 *     Use string methods to do following tasks:
 * 	    1. Fetch the last word of the sentence
 * 	    2. Display the total number of words in the myStatement.
 * 	    3. replace all the 'r' characters with 'f' characters.
 *
 */
        String myStatment = "I am a good programmer";
        //1. Fetch the last word of the sentence.
        String lastWord = myStatment.substring(myStatment.lastIndexOf(" ")+1);
        System.out.println("1. Fetch the last word of the sentence: " +lastWord);

        //2. Display the total number of words in the myStatement.
        System.out.println("2. Display the total number of words in the myStatement: " +myStatment.split(" ").length);

        //3. replace all the 'r' characters with 'f' characters.
        String replaceChars = myStatment.replace('r','f');
        System.out.println("3. replace all the 'r' characters with 'f' characters: " + replaceChars);

/**
 *
 *  * Store your first name in a string variable.
 *  * Calculate the length of your name, without using length() method of String class.
 */
        //String firstName = "Fatema";
        int count = 0;
        for (char c : firstName.toCharArray()) {
            count++;
        }
        System.out.println("1. The length of my First name, without using length() method of String class.: " + count);
    }
}
