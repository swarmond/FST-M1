package activities;

import java.util.ArrayList;

public class Activity9 {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of type String
	        ArrayList<String> myList = new ArrayList<>();

	        // Add 5 names to the ArrayList
	        myList.add("Swarnav");
	        myList.add("Sudeep");
	        myList.add("Sandeep");
	        myList.add("Devdeep");
	        myList.add("Mandeep");

	        // Print all the names using a for loop
	        System.out.println("All names in the list:");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }

	        // Retrieve the 3rd name (index 2) using get()
	        String thirdName = myList.get(2);
	        System.out.println("\nThe 3rd name in the list is: " + thirdName);

	        // Check if a name exists using contains()
	        String nameToCheck = "Naresh";
	        if (myList.contains(nameToCheck)) {
	            System.out.println(nameToCheck + " exists in the list.");
	        } else {
	            System.out.println(nameToCheck + " does not exist in the list.");
	        }

	        // Print the number of names using size()
	        System.out.println("Number of names in the list: " + myList.size());

	        // Remove a name from the list and print the new size
	        myList.remove("Devdeep");
	        System.out.println("After removing 'Devdeep', number of names in the list: " + myList.size());
	    }
}
