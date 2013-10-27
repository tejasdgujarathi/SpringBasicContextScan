package com.spring.trial;


import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;

	public Address() {
		System.out.println("Inside Address def constructor.");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
