package by.epam.grodno.pronych.aircraft;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.epam.grodno.pronych.aircompany.AirCompany;
/*
* Define the hierarchy of aircraft. Create an airline.
* Calculate total capacity and load capacity.
* Sort aircraft.
* Find a plane in the company that matches the given range
* fuel consumption parameters.
 */

public class AirCompanyTest {
	AirCompany aircompany1;
	@Before
	public void setUpTestData() {
		aircompany1 = new AirCompany("BestFlightsEver");
    	aircompany1.addAirCraft(new CargoAirCraft("An52", 10, 10, 300, 10));
    	aircompany1.addAirCraft(new PassengersAirCraft("Boeing 747", 1000, 1000, 10000, 3, 100));
    	aircompany1.addAirCraft(new PassengersAirCraft("Tu134", 800, 800, 8300, 5, 100));
    	aircompany1.addAirCraft(new MilitaryAirCraft("Rocket", 100, 100, 15000, 50, 1000));
	}
	
	@After
	public void clearTestData() {
		aircompany1 = null;
	}
	
	@Test
	public void testCarryingCapacity() {
    	Assert.assertEquals(1910, aircompany1.getTotalCarryngCapacity());
	}

	@Test
	public void testCargoCapacity() {
    	Assert.assertEquals(1910, aircompany1.getTotalCargoCapacity());
	}

	@Test
	public void testGetAirCraftByFuelConsumption() {
    	int minRange = 2;
    	int maxRange = 4;
 	
    	List<AirCraft> listAircraft = aircompany1.getAirCraftByFuelConsuptionRange(minRange, maxRange);
    	System.out.println(listAircraft);
    	Assert.assertEquals(1, listAircraft.size());
    	Assert.assertEquals(new PassengersAirCraft("Boeing 747", 1000, 1000, 10000, 3, 100), listAircraft.get(0));
	}

	@Test
	public void testSortByFlightRange() {
    	aircompany1.sortByFlightRange();
    	List<AirCraft> listAircraft = aircompany1.getAirCrafts();
    	int currentFlightRange = 0;
    	for (AirCraft airCraft: listAircraft) {
    		System.out.println("c:"+currentFlightRange+" "+airCraft.getFlightRange());
    		Assert.assertTrue(currentFlightRange<=airCraft.getFlightRange());
    		currentFlightRange = airCraft.getFlightRange();
    	}
		if (listAircraft.size() == 0) {
			Assert.assertTrue(true);
		}
	}
}
