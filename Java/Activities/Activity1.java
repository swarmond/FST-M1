package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car Hyundai = new Car();
		Hyundai.make = 2014;
		Hyundai.color = "Black";
		Hyundai.transmission = "Manual";
		Hyundai.displayCharacteristics();
		Hyundai.accelerate();
		Hyundai.brake();
		
	}

}
