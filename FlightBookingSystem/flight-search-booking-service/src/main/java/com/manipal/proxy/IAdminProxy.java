package com.manipal.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.Fare;
import com.manipal.model.Fleet;
import com.manipal.model.Flight;
import com.manipal.model.FlightStatus;
import com.manipal.model.Location;

@RibbonClient(name= "Admin-service")
public interface IAdminProxy {
	@GetMapping("/flight/alldetails")
	public List<Flight> getAllFlightDetails();
	
	@GetMapping("/flight/find/{id}")
	public Flight getFlightDetailsById(@PathVariable int id);
	
	@GetMapping("/flight/location/alldetails")
	public List<Location> getAllLocationsDetails();
	
	@GetMapping("/flight/location/find/{id}")
	public Location getLocationDetailsById(@PathVariable int id);
	
	@GetMapping("/flight/fleet/alldetails")
	public List<Fleet> getAllFleetsDetails();
	
	@GetMapping("/flight/fleet/find/{id}")
	public Fleet getFleetDetailsById(@PathVariable int id);
	
	@GetMapping("/flight/fare/alldetails")
	public List<Fare> getAllFaresDetails();
	
	@GetMapping("/flight/fare/find/{id}")
	public Fare getFareDetailsById(@PathVariable int id);
	
	@GetMapping("/flight/status/alldetails")
	public List<FlightStatus> getAllStatusDetails();
	
	@GetMapping("/flight/status/find/{id}")
	public FlightStatus getStatusDetailsById(@PathVariable int id);
	
	
}
