package by.epam.grodno.pronych.aircraft;

public class PassengersAirCraft extends AirCraft {
	private int passengersCapacity;
	
	public PassengersAirCraft(String name, int cargoCapacity, int carryngCapacity, int flightRange,
			int fuelConsumption, int passengersCapacity) {
		super(name, cargoCapacity, carryngCapacity, flightRange, fuelConsumption);
		this.passengersCapacity = passengersCapacity;
	}

	public int getPassengersCapacity() {
		return passengersCapacity;
	}
	

}
