package by.epam.grodno.pronych.aircraft;

import org.apache.log4j.Logger;

import by.epam.grodno.pronych.app.App;

public abstract class AirCraft {
    final static Logger logger = Logger.getLogger(App.class);
	
	private String name;
	private int cargoCapacity;
	private int carryngCapacity;
	private int flightRange;
	private int fuelConsumption;
	
	public AirCraft(String name, int cargoCapacity, 
			int carryngCapacity, int flightRange, 
			int fuelConsumption) {
		this.name = name;
		this.cargoCapacity = cargoCapacity;
		this.carryngCapacity = carryngCapacity;
		this.flightRange = flightRange;
		this.fuelConsumption = fuelConsumption;
		if (logger.isInfoEnabled()) {
			logger.info("Created new aircraft:"+name);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargoCapacity;
		result = prime * result + carryngCapacity;
		result = prime * result + flightRange;
		result = prime * result + fuelConsumption;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirCraft other = (AirCraft) obj;
		if (cargoCapacity != other.cargoCapacity)
			return false;
		if (carryngCapacity != other.carryngCapacity)
			return false;
		if (flightRange != other.flightRange)
			return false;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public int getCarryngCapacity() {
		return carryngCapacity;
	}

	public int getFlightRange() {
		return flightRange;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	@Override
	public String toString() {
		return "AirCraft [name=" + name + ", cargoCapacity=" + cargoCapacity + ", carryngCapacity=" + carryngCapacity
				+ ", flightRange=" + flightRange + ", fuelConsumption=" + fuelConsumption + "]";
	}
	
	
	
	
}
