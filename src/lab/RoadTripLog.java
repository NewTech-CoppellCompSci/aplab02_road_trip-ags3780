package lab;

public class RoadTripLog {

	String tripName;
	double distance;
	double fuel;

	//constructor class that takes the title
	public RoadTripLog(String title) {

		//set the instance variables to the parameters
		this.tripName = title;
	}

	//constructor class that takes the title and distance
	public RoadTripLog(String tripName, double distance) {

		//set the instance variables to the parameters
		this.tripName = tripName;
		this.distance = distance;
	}

	//constructor class that takes the title, distance, and fuel
	public RoadTripLog(String title, double distance, double fuel) {

		//set the instance variables to the parameters
		this.tripName = title;
		this.distance = distance;
		this.fuel = fuel;
	}

	//method to add to the total distance
	public void addDistance(double totaldistance) {

		//take the parameter and add to the instance variable for distance
		this.distance += totaldistance;
	}

	//method to add fuel to the total fuel
	public void addFuel(double totalamount) {

		//take the parameter and add to the instance variable for fuel
		this.fuel += totalamount;
	}

	//method to get the total distance
	public double getTotalDistance() {

		//return the instances total distance
		return this.distance;
	}

	//method to get the total fuel
	public double getTotalFuel() {

		//return the instances total fuel
		return this.fuel;
	}

	//method to calculate the miles per gallon
	public double getMPG() {

		//use the equation distance/fuel = mpg
		double mpg = this.distance/this.fuel;
		//return the mpg
		return mpg;
	}

	//method to print the trip
	public String printTrip() {
		
		//return this string of info
		return "      -- OVERALL TRIP-- \n-----------------------------\n|Trip: " + this.tripName + "         |\n" + "|Distance:  " + this.distance + "            |\n" + "|Fuel Used: " + this.fuel + "             |\n" + "|MPG:       " + getMPG() + "|\n------------------------------";
	}
	
}