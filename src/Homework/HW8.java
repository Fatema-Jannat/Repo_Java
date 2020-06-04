package Homework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Programmedby Fatema Jannat
 * @Date 06/03/2020
 * @Homework#8
 *
 */

public class HW8 {
    public static void main(String[] args) {
        /**
         * Create a method, that will return all duplicates values in the given String array.
         * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
         * Result -> ["happy", "joy", "laugh"]
         *
         */
        List<String> words = new ArrayList<>();

        words.add("Happy");
        words.add("Peace");
        words.add("Joy");
        words.add("Grow");
        words.add("Laugh");
        words.add("Happy");
        words.add("Laugh");
        words.add("Joy");

        System.out.println("Given array: " + words);

        for (int i = 0; i < words.size(); i++) {
            if (words.lastIndexOf(words.get(i)) != i) {

                System.out.println("Duplicate values in the given String array are: " + words.get(i));

            }

        }
        /** Create a method, that will return the common elements/value in two given int-array
         * int[] arr1 = {11, 32, 43, 54, 65}
         * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
         * Result -> [11, 32, 43]
         *
         */

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(11);
        arr1.add(32);
        arr1.add(43);
        arr1.add(54);
        arr1.add(65);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(76);
        arr2.add(11);
        arr2.add(89);
        arr2.add(43);
        arr2.add(87);
        arr2.add(23);
        arr2.add(32);

        System.out.println("\n\nFirst int Array: " + arr1);
        System.out.println("Second int Array: " + arr2);

        List<Integer> result = new ArrayList<>();

        for (int commonElements : arr1) {
            if (arr2.contains(commonElements)) {
                result.add(commonElements);
            }
        }

        System.out.println("The common elements/value in given First and second arrays are: " + result);

    }

}
