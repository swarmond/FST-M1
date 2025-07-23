package activities;

public class Activity3 {
	
	public static void main(String[] args) {
		double seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		double EarthAge = seconds/EarthSeconds;
		double MercuryAge = EarthAge/MercurySeconds;
		double VenusAge = EarthAge/VenusSeconds;
		double MarsAge = EarthAge/MarsSeconds;
		double JupiterAge = EarthAge/JupiterSeconds;
		double SaturnAge = EarthAge/SaturnSeconds;
		double UranusAge = EarthAge/UranusSeconds;
		double NeptuneAge = EarthAge/NeptuneSeconds;
		
		System.out.println("The Age on Earth is: " + EarthAge + "years");
		System.out.println("The Age on Mercury is: " + MercuryAge + "years");
		System.out.println("The Age on Venus is: " + VenusAge + "years");
		System.out.println("The Age on Mars is: " + MarsAge + "years");
		System.out.println("The Age on Jupiter is: " + JupiterAge + "years");
		System.out.println("The Age on Saturn is: " + SaturnAge + "years");
		System.out.println("The Age on Uranus is: " + UranusAge + "years");
		System.out.println("The Age on Neptune is: " + NeptuneAge + "years");
	}
	
	

}
