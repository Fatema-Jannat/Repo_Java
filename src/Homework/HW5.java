package Homework;
/**
 *
 * @Programmedby Fatema Jannat
 * @Date 05/13/2020
 * @Homework#5
 *
 */
public class HW5 {
    public static void main(String[] args) {
        //Tells the position of a name in a given array
        String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"};
        String nameToSearch = "philip";
        System.out.println(positionOfName(names, nameToSearch));

        //Finds the average of an int-array
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("Average of the given array: " + average(arr, n));

        //Finds the maximum value in a given int-array
        int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
        int t = numbers.length;
        System.out.println("Maximum value in the given array: " + largestValue(numbers, t));

        //Tells the name of student with maximum marks/score.
        int[] scores = {90, 89, 191, 100, 81};
        String[] studentNames = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        System.out.println(studentWithMaxScore(scores, studentNames));
    }
    /**
     * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
     * <p>
     * philip is on position-4
     * happy is not present in the array
     */
    public static String positionOfName(String[] arrayOfNames, String nameToSearch){
        int position = 0;
        String positionString="";
        for(int i=0; i<arrayOfNames.length;i++){
            if(arrayOfNames[i].equalsIgnoreCase(nameToSearch)){
                position = i+1;
                break;
            }
        }
        if(position>0){
            positionString = nameToSearch + " is on position-" + position;
        }else{
            positionString = nameToSearch + " is not present in the array.";
        }
        return positionString;
    }

    /**
     * Create a method to find average of an int-array
     * Average of the given array: 123
     */
    public static double average(int a[], int n) {
            // Find sum of array element
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += a[i];

            return sum / n;
        }

    /**
     * Create a method to find maximum value in the given int-array
     * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
     *
     * Maximum value in the given array: 189
     */
    public static int largestValue(int[]array, int t) {
        int maxValue = array[0];
        for (int i = 1; i < t; i++)
            if (array[i]> maxValue)
                maxValue = array[i];

        return maxValue;
    }

    /**
     * Create a method that will tell the name of student with maximum marks/score.
     * int[] scores = {90, 89, 191, 100, 81};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     *
     * Jesse scored the maximum score(191)
     */
    public static String studentWithMaxScore(int[]scores, String[] names){
            int maxScore = scores[0];
            int scoreIndex=0;
            String maxResult ="";
            for(int i = 1; i< scores.length; i++){
                if (maxScore<scores[i]){
                    maxScore=scores[i];
                    scoreIndex=i;
                }
            }
            maxResult = names[scoreIndex] + " scored the maximum score (" + maxScore + ")";
            return maxResult;
        }
    }






