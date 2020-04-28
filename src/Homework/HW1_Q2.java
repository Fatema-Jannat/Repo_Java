package Homework;
/*
2) Implement code to convert temperature values using below formulae:
°F = 9/5 ( °C) + 32
°F = 9/5 (K - 273) + 32
K = °C + 273
°C = K - 273
K = 5/9 (° F - 32) + 273

@Name: Fatema Jannat
@Date: 04/27/2020
 */

public class HW1_Q2 {
    public static void main(String[] args) {

        //°F = 9/5 ( °C) + 32 ---> ((9 * cTemp)/5) + 32
        double cTemp = 9.4;
        double fTemp = ((9 * cTemp) / 5)+ 32;
        System.out.println("Temperature in Fahrenheit = " + fTemp + " F"); //Celsius to Fahrenheit, cTemp value = 9.4

        //°F = 9/5 (K - 273) + 32 ---> (((kTemp - 273.15) * 9)/ 5) + 32
        double kTemp = 288.71;
        double fTemp2 = (((kTemp - 273.15) * 9)/ 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fTemp2 + " F"); //Kelvin to Fahrenheit, kTemp value = 288.71

        //K = °C + 273 ---> cTemp + 273
        double kTemp2 = cTemp + 273;
        System.out.println("Temperature in Kelvin = " + kTemp2 + " K"); //Celsius to Kelvin, cTemp value = 9.4

        //°C = K - 273 ---> kTemp -273
        double cTemp2 = kTemp -273;
        System.out.println("Temperature in Celsius = " +cTemp2 + " C"); //Kelvin to Celsius, kTemp value = 288.71

        //K = 5/9 (° F - 32) + 273 ---> (((fTemp - 32) * 5) / 9) + 273.15
        double kTemp3 = (((fTemp - 32) * 5) / 9) + 273.15;
        System.out.println("Temperature in Kelvin = " + kTemp3 + " K"); //Fahrenheit to Kelvin, fTemp value = 48.92




    }
}
