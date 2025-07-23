package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		int[] numberArray = {10, 77, 10, 54, -11, 10};
		int searchNum = 10;
		int sumNum = 30;
		System.out.println("Result: " + result(numberArray, searchNum, sumNum));
	}
	
	public static boolean result(int[] numbers, int searchNum, int sumNum) {
		int temp_sum = 0;
		for (int number : numbers) {
			if(number == searchNum) {
				temp_sum += searchNum;
			}
			if(temp_sum > sumNum) {
				break;
			}
		}
		return temp_sum == sumNum;
		
	}

}
