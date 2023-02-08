import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] intArray = CustomMethods.createRandomArray();
        boolean keepRunning = true;
        Scanner in = new Scanner(System.in);


        do {
        // Display the menu options
        System.out.println("*".repeat(30));
        System.out.println("* 1 - Display the array ");
        System.out.println("* 2 - Display the max and min values in the array");
        System.out.println("* 3 - Display the average and the distance of each individual number to the average");
        System.out.println("* 4 - Display the sum of elements with odd and even numbered indexes.");
        System.out.println("* 5 - Exit");
        System.out.println("*".repeat(30));
        System.out.print("Your choice:");

        // Take the choice from the user
        int choice = in.nextInt();
        System.out.println();

        // Display the array
        if (choice == 1) {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("Index " + i + ": " + intArray[i]);
            }
        }

        if (choice == 2) {
            System.out.println("Max value: " + CustomMethods.findMax(intArray));
            System.out.println("Min value: " + CustomMethods.findMin(intArray));
        }

        if (choice == 3) {
            
        }

        if (choice == 4) {
            System.out.println("Sum of even indexes: " + CustomMethods.findEven(intArray));
            System.out.println("Sum of odd indexes: " + CustomMethods.findOdd(intArray));
        }

        if (choice == 5) {
            keepRunning = false;
        }


    } while (keepRunning);

    in.close();
    }
}