package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Location;
import service.LocationServiceImpl;

@Controller
@RequestMapping("/login")
public class LocationController {

	@Autowired
	private LocationServiceImpl locationServiceImpl;

	@RequestMapping("/location")
	public String location (ModelMap model) {
		System.out.println("Enttering LocationCOntroller.listLocation");

		List<Location> locations = locationServiceImpl.getAllLocations();

	}

}
