//This activity will show the usage of testng.xml to execute multiple classes.
//[Optional] Create a package named suiteExample
//Create a new TestNG class file named DemoOne.java in the package.
//It will have two @Test methods

package activities;

import org.testng.annotations.Test;

public class Activity4DemoOne {
	 @Test
	 public void firstTestCase() {
	     System.out.println("I'm in first test case from DemoOne Class");
	 }

	 @Test
	 public void secondTestCase() {
	     System.out.println("I'm in second test case from DemoOne Class");
	 }

}
