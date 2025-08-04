package activities;


import java.util.ArrayList;
import java.util.Date;

public class Plane {
	
	private ArrayList<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}

	public void onboard(String passengersName) {
		if(passengers.size() <= maxPassengers)
			this.passengers.add(passengersName);
		else {
			System.out.println("The plane is full.");
		}
	}
	
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date takeOff() {
		this.lastTimeTookOff = new Date();
		return lastTimeTookOff;
		
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	public ArrayList<String> getPassengers(){
		return passengers;
	}
}
