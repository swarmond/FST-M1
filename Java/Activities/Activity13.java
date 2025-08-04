package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	    public static void main(String[] args) {
	        // Create objects
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();
	        Random indexGen = new Random();

	        System.out.println("Enter integer values (type any non-integer to stop):");

	        // Accept only integer values in a loop
	        while (scan.hasNextInt()) {
	            int number = scan.nextInt();
	            list.add(number);
	        }

	        // Convert ArrayList to array
	        Integer[] nums = list.toArray(new Integer[0]);

	        if (nums.length > 0) {
	            // Generate random index within bounds
	            int randomIndex = indexGen.nextInt(nums.length);

	            // Print the result
	            System.out.println("Random index generated: " + randomIndex);
	            System.out.println("Value at index " + randomIndex + ": " + nums[randomIndex]);
	        } else {
	            System.out.println("No integers were entered.");
	        }

	        scan.close();
	    }
}
