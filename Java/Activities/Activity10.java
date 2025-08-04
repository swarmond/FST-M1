package activities;

import java.util.HashSet;

public class Activity10 {

	    public static void main(String[] args) {
	        // Create a HashSet
	        HashSet<String> hs = new HashSet<>();

	        // Add 6 objects to the HashSet
	        hs.add("Apple");
	        hs.add("Banana");
	        hs.add("Orange");
	        hs.add("Mango");
	        hs.add("Raspberry");
	        hs.add("Blueberry");

	        // Print the size of the HashSet
	        System.out.println("Size of HashSet: " + hs.size());
	        System.out.println("Hashset is: " + hs);

	        // Remove an element
	        hs.remove("Banana");
	        System.out.println("After removing 'Banana': " + hs.size());

	        // Try to remove an element that is not present
	        boolean isRemoved = hs.remove("Grapes");
	        System.out.println("Trying to remove 'Grapes': " + (isRemoved ? "Removed" : "Not found"));

	        // Use contains() method to check for an item
	        System.out.println("Does the Hashset contain 'Apple'? " + hs.contains("Apple"));
	        System.out.println("Does the Hashset contain 'Banana'? " + hs.contains("Banana"));

	        // Print the updated HashSet
	        System.out.println("Updated HashSet: " + hs);
	    }
}
