package by.epam.grodno.pronych.aircompany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import by.epam.grodno.pronych.aircraft.AirCraft;
import by.epam.grodno.pronych.service.SortAirCraftByFlightRange;

public class AirCompany {
	private String name;
	final static Logger logger = Logger.getLogger(AirCompany.class);
	
	private List<AirCraft> airCrafts = new ArrayList<AirCraft>();

	public AirCompany(String name) {
		this.name = name;
	}

	public void addAirCraft(AirCraft airCraft) {
		airCrafts.add(airCraft);
		logger.info("add new aircraft:"+airCraft.toString()+" to company:"+this.getName());
	}
	
	public List<AirCraft> getAirCrafts() {
		return airCrafts;
	}

	public String getName() {
		return name;
	}

	public int getTotalCargoCapacity() {
		int result = 0;
		for(AirCraft airCraft:airCrafts){
			result += airCraft.getCargoCapacity();
		}
		return result;
	}
	
	public int getTotalCarryngCapacity() {
		int result = 0;
		for(AirCraft airCraft:airCrafts){
			result += airCraft.getCarryngCapacity();
		}
		return result;
	}

	public void sortByFlightRange() {
		logger.info("begin sort aircrafts in company:"+this.getName());
		Collections.sort(airCrafts, new SortAirCraftByFlightRange());
	}
	
	public List<AirCraft> getAirCraftByFuelConsuptionRange(int minRange, int maxRange) {
		List<AirCraft> resultList = new ArrayList<AirCraft>();
		logger.info("Searching aircraft by consumption:"+this.getName()+" from:"+minRange+" to:"+maxRange);
		for(AirCraft airCraft:airCrafts){
			int planeConsumption = airCraft.getFuelConsumption();
			if (planeConsumption >= minRange && planeConsumption <= maxRange) {
				resultList.add(airCraft);
			}
		}
		return resultList;
	}
	
}
