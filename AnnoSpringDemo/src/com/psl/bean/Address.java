package com.psl.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Address {

	@Value(value="nagpur")
	private String  city;
	@Value(value="ring road")
	private String  street;
	@Value(value="Airport")
	private String  landmark;
	
	public Address() {
		super();
		System.out.println("add constructor");
	}

	public Address(String city, String street, String landmark) {
		super();
		this.city = city;
		this.street = street;
		this.landmark = landmark;
		System.out.println("addr param const");
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
