package com.psl.bean;

public class Address {

	private String  city;
	private String  street;
	private String  landmark;
	
	public Address() {
		super();
		System.out.println("constructor");
	}

	public Address(String city, String street, String landmark) {
		super();
		this.city = city;
		this.street = street;
		this.landmark = landmark;
		System.out.println("param const");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", landmark="
				+ landmark + "]";
	}
	
	
	
}
