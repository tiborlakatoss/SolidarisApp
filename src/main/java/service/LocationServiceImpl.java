package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.LocationDaoImpl;
import model.Location;

@Service
@Transactional
public class LocationServiceImpl {

	
	@Autowired
	private LocationDaoImpl locationDaoImpl;
	
	public List<Location> getAllLocations(){
		
		
	}
	
	
	
}
