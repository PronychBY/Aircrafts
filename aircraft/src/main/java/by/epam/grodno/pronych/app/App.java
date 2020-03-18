package by.epam.grodno.pronych.app;

import java.util.List;

import org.apache.log4j.Logger;

import by.epam.grodno.pronych.aircompany.AirCompany;
import by.epam.grodno.pronych.aircraft.*;

/*
* Define the hierarchy of aircraft. Create an airline.
* Calculate total capacity and load capacity.
* Sort aircraft.
* Find a plane in the company that matches the given range
* fuel consumption parameters.
 */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

	public static void main( String[] args )
    {
    	//initializing
    	logger.info("initialiting ");
    	AirCompany aircompany1 = new AirCompany("BestFlightsEver");
    	aircompany1.addAirCraft(new CargoAirCraft("An52", 10, 10, 300, 10));
    	aircompany1.addAirCraft(new PassengersAirCraft("Boeing 747", 1000, 1000, 10000, 3, 100));
    	aircompany1.addAirCraft(new PassengersAirCraft("Tu134", 800, 800, 8300, 5, 100));
    	aircompany1.addAirCraft(new MilitaryAirCraft("Rocket", 100, 100, 15000, 50, 1000));
		

    	//logic
    	logger.info("doing logic");
    	
    	System.out.println(aircompany1);
    	
    	//Посчитать общую вместимость 
    	System.out.println("Общая вместительность:"+aircompany1.getTotalCarryngCapacity());
    	//Посчитать общую грузоподъемность 
    	System.out.println("Общая грузоподъемность:"+aircompany1.getTotalCargoCapacity());
    	//Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
    	int minRange = 2;
    	int maxRange = 50;
    	List<AirCraft> aircrafts = aircompany1.getAirCraftByFuelConsuptionRange(minRange, maxRange);
    	System.out.println("Самолеты по потреблению горючего:"+minRange+"-"+maxRange+": "+aircrafts);
    	
    	//Провести сортировку самолетов компании по дальности полета
    	System.out.println("Самолеты без сортировки:"+aircompany1.getAirCrafts());
    	aircompany1.sortByFlightRange();
    	System.out.println("Самолеты по дальности полета:"+aircompany1.getAirCrafts());
    	
    	
    }
}
