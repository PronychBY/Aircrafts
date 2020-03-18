package by.epam.grodno.pronych.service;

import java.util.Comparator;
import by.epam.grodno.pronych.aircraft.AirCraft;

public class SortAirCraftByFlightRange implements Comparator<AirCraft> {
	public int compare(AirCraft a1, AirCraft a2) {
		//return new Integer(a1.getFlightRange()).compareTo(a2.getFlightRange());
		return a1.getFlightRange() - a2.getFlightRange();
	}
}
