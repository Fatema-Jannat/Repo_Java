package Homework;

import java.text.DecimalFormat;

/**
 *
 * @Programmedby Fatema Jannat
 * @Date 05/05/2020
 * @Homework#3
 *
 */
public class HW3 {
    public static void main(String[] args) {

/**
 * Create variable to store student-score, and total-possible-score based on the percentage,
 * display grade to student
 * Grade A: 91-100
 * Grade B: 81-90
 * Grade C: 71-80
 * Grade D: 61-70
 * Grade E: 51-60
 * Grade F: less than or equal to 50
 */
//calculate percentage
//Your percentage: XX.yy and your grade is: A
        int studentScore = 40;
        double maxScore = 150.00;
        double percentage = (studentScore/maxScore)*100; //calculate percentage
        char grade;

        DecimalFormat df = new DecimalFormat("###.##"); //Decimal format

        if (percentage>=91 && percentage<=100){
                grade = 'A';
            System.out.println("Your percentage is: " + df.format(percentage) + " and your grade is: " + grade );

        }else if(percentage>=81 && percentage<=90){
            grade = 'B';
            System.out.println("Your percentage is: %.2f" + df.format(percentage) + " and your grade is: " + grade );

        }else if(percentage>=71 && percentage<=80){
            grade = 'C';
            System.out.println("Your percentage is: " + df.format(percentage) + " and your grade is: " + grade );

        }else if(percentage>=61 && percentage<=70){
            grade = 'D';
            System.out.println("Your percentage is: " + df.format(percentage) + " and your grade is: " + grade );

        }else if(percentage>=51 && percentage<=60){
            grade = 'E';
            System.out.println("Your percentage is: " + df.format(percentage) + " and your grade is: " + grade );

        }else if(percentage<=50){
            grade = 'F';
            System.out.println("Your percentage is: " + df.format(percentage) + " and your grade is: " + grade );

        }else{
            System.out.println("Invalid percentage: " + df.format(percentage));
        }


/**
 * Checking car mode (P, D, N, R)
 * if car mode is P and "you can park car"
 * if car mode is D drive car
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car mode is N you can "put car in car wash"
 * if car mode is R you can "revere the car"
 */
        char carMode = 'P';
        String driveType ="";

        switch (carMode) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                if(driveType.equalsIgnoreCase("Snow")){
                    System.out.println("You are on Snow mode");
                    
                }else if(driveType.equalsIgnoreCase("Sport")){
                    System.out.println("You are on Sport mode");

                }else if(driveType.equalsIgnoreCase("Eco")){
                    System.out.println("You are on Eco mode");
                }
                break;
            case 'N':
                System.out.println("Put car in car wash");
                break;
            case 'R':
                System.out.println("Reverse the car");
                break;
            default:
                System.out.println("Invalid entry: " + carMode + " " + driveType);
        }

/**
 * store value in an int variable
 * if number is divisible by 3, print "divisible by 3"
 * if number is divisible by 5, print "divisible by 5"
 * if number is divisible by 3 and 5, print "divisible by both"
 * if not divisible by 3 or 5, print the number
 *
 */
        int value = 15;

        if (value%3 == 0 && value%5 == 0) {
            System.out.println("The number " + value + " is divisible by both '3' and '5'");

        }else if (value%3 == 0) {
                System.out.println("The number " + value + " is divisible by 3");

        } else if (value%5 == 0) {
                System.out.println("The number " + value + " is divisible by 5");

        } else {
                System.out.println("The number is: " + value);
            }

        }
    }

