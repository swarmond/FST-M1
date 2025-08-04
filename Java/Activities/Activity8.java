package activities;

public class Activity8 {
	
	public static void main(String[] args) {
		
		try {
			Activity8.exceptionTest("Will print to Console");
			Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException msg) {
            System.out.println("Inside catch block: " + msg.getMessage());
		}
	}

	private static void exceptionTest(String string) throws CustomException{
		if(string == null) {
			throw new CustomException("String value is null");
		}
		else {
			System.out.println(string);
		}
		
	}

}
