package activities;

public class Activity6 {
	
	public static void main(String[] args) {
		
		Plane plane = new Plane(10);
		plane.onboard("Swarnav");
		plane.onboard("Smita");
		plane.onboard("Abhay");
		
		System.out.println("The plane took off at: " + plane.takeOff());
		
		System.out.println("People on the plane: " + plane.getPassengers());
		
		plane.land();
		
		System.out.println("The plane landed at: " + plane.getLastTimeLanded());
		
		System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}
