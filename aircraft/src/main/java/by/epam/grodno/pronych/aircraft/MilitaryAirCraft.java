package by.epam.grodno.pronych.aircraft;

public class MilitaryAirCraft extends AirCraft {
	private int weaponPower;
	
	public MilitaryAirCraft(String name, int cargoCapacity, int carryngCapacity, int flightRange,
			int fuelConsumption, int weaponPower) {
		super(name, cargoCapacity, carryngCapacity, flightRange, fuelConsumption);
		this.weaponPower = weaponPower;
	}

	public int getWeaponPower() {
		return weaponPower;
	}

}
