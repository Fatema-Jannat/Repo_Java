package Homework;

import javax.swing.*;

/**
 *
 * @Programmedby Fatema Jannat
 * @Date 05/11/2020
 * @Homework#4
 *
 */
public class HW4 {
    /**
     * Write code to create abbreviation for any given string
     * Example: String msg = "Outfit of the day" //
     * Expected: OOTD //GM HAGDTY
     * String msg = "have a great day to you"
     * <p>
     * //code
     * <p>
     * sout("Abbreviation : " + abr);
     */
/*    String msg = "have a great day to you";
      String abr = "";
      //code
      System.out.println("Abbreviation: "+abr);
*/

    public static void main(String[] args) {
        String messageAbr = "Outfit of the day";
        String [] splitMessage = messageAbr.split(" ");

        for(int i=0; i < splitMessage.length;i++){
            String abr = splitMessage[i].substring(0,1).toUpperCase();

            System.out.println("Abbreviation: "+abr);
        }


/** String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
    System.out.println("Line (Before modification) : "+line);
    //code
    System.out.println("Line (After modification) : "+line);
    */
    String line = "once upOn a tiMe in the UNIVERSE";
    String[] splitLine = line.split(" ");

    System.out.println("Line (Before modification) : "+line);

    for(int i=0; i < splitLine.length;i++) {
        String lineAfter = splitLine[i].substring(0, 1).toUpperCase() + splitLine[i].substring(1).toLowerCase();

        System.out.println("Line (After modification) : " + lineAfter);
    }
/**
 * reverse a string
    String message = "happy holidays"; //syadiloh yppah
    String reverseMessage = "";
    System.out.println("Message : "+message);
    // code
    System.out.println("Message in reverse: "+reverseMessage);
 */
        String message = "happy holidays";
        String reverseMessage = "";

        System.out.println("Message : "+ message);
        for(int i = message.length()-1; i>=0; i--){
            reverseMessage = reverseMessage + message.charAt(i);
        }

        System.out.println("The reversed string of the '"+ message +"' is: " +reverseMessage);

    /**
     * Check if word is palindrome
     * String word = "level";  //ecar
     * boolean result = false;
     * //code
     * System.out.println("is "+word +" a palindrome: "+result);
     *
     * */
        String word = "mom";
        int length = word.length();
        String rev = "";

        for(int i= length -1; i >= 0; i--)
            rev = rev + word.charAt(i);
        if(word.equals(rev))
            System.out.println(word + " is a palindrome.");
            else
            System.out.println(word + " is NOT a palindrome.");

        }
    }


