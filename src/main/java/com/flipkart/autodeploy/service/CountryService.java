package com.flipkart.autodeploy.service;

import java.util.List;

import com.flipkart.autodeploy.model.Country;

public interface CountryService {
	
	public void addCountry(Country country);
	public List<Country> listCountries();
		
}
