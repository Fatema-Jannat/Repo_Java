package Midterm;
/**
 *
 * @Programmedby Fatema Jannat
 * @Date 05/28/2020
 * @Midterm
 */

import java.util.Arrays;

public class Midterm {
    public static void main(String[] args) {
        //Question 1: Create a method to return an array after remove a specific value from a given int array.
        System.out.println("\nQuestion 1:");
        int arr[] = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.println("Original array: "+Arrays.toString(arr));
        int removeNumber = 24;
        int[]arrAfterRemovingNum = removeValue(arr, removeNumber);
        System.out.println("Returned array: "+Arrays.toString(arrAfterRemovingNum));

        //Question 2: Create a method to return missing smallest positive integer (greater than 0) from given array.
        System.out.println("\n\nQuestion 2:");
        int array[] = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        System.out.println("Given int array: "+Arrays.toString(array));
        System.out.println("Smallest missing positive int: "+smallestPositiveInt(array));

        }

    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     */
    public static int[] removeValue(int[] arr, int removeNumber) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != removeNumber)
                arr[index++]= arr[i];
        }
        return Arrays.copyOf(arr, index);
    }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * For array : {1, 3, 5, 4, 2, 7}
     * Method should return : 6
     * <p>
     * For array : {-1, -3, 4, 2}
     * Method should return : 1
     * <p>
     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * Method should return : 4
     */
    public static int smallestPositiveInt(int[] array) {
        int arrLength = array.length;
        boolean[] present = new boolean[arrLength + 1];

        for (int i = 0; i < arrLength; i++) {
            if (array[i] > 0 && array[i] <= arrLength)
                present[array[i]] = true;
        }
        for (int i = 1; i <= arrLength; i++)
            if (!present[i])
                return i;
            return arrLength + 1;
        }

}