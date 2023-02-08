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
}