public class ArrayOps {

    public static int arrayAv(int[] array){
        int total = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            total += i;
        }

        return total/array.length;
    }

    public static Integer[] diffAverageF(int[] array){
        Integer[] diffAverage = new Integer[array.length];

        for (int i = 0; i < array.length; i++){
            diffAverage[i] = array[i] - arrayAv(array);
        }

        return diffAverage;

    }
    
}