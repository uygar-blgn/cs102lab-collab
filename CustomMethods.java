import java.util.Random;
import java.util.Scanner;

public class CustomMethods {
    
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int findEven(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2){
            sum += arr[i];
        }
        return sum;
    }

    public static int findOdd(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i = i + 2){
            sum += arr[i];
        }
        return sum;
    }
        
    public static int[] createRandomArray(){

        Random random = new Random();

        //Getting the array size from user
        System.out.println("Please write array size.");
        Scanner input = new Scanner(System.in);

        //Creating the array with given size
        int arraySize = input.nextInt();
        int array[] = new int[arraySize];

        //Initializing the array with random integers
        for (int i = 0; i < arraySize; i++)
        {
            array[i] = random.nextInt(0, 101);
        }

        return array;
     
    }

    public static int arrayAv(int[] array){
        int total = 0;

        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total/array.length;
    }

    public static int[] diffAverageF(int[] array){
        int[] diffAverage = new int[array.length];

        for (int i = 0; i < array.length; i++){
            diffAverage[i] = array[i] - arrayAv(array);
        }

        return diffAverage;

    }
}