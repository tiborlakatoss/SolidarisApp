package model;

import javax.persistence.Column;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class Location {

	@Id
	@Column(name = "CITY")
	private String cityLocation;
	@Column(name = "STREET")
	private String streetAddress;

	public Location() {
		super();

	}

	public Location(String cityLocation, String streetAdress) {
		super();
		this.cityLocation = cityLocation;
		this.streetAddress = streetAdress;
	}

	public String getCityLocation() {
		return cityLocation;

	}

	public void setCityLocation(String streetAdress) {
		this.streetAddress = streetAdress;
	}

	public String getStreetAdress() {
		return streetAddress;

	}

	public void setStreetAdress(String streetAdress) {
		this.streetAddress = streetAdress;
	}
}
