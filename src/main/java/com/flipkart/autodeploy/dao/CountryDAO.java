package com.flipkart.autodeploy.dao;

import java.util.List;

import com.flipkart.autodeploy.model.Country;

public interface CountryDAO {
	
	public void addCountry(Country country);
	public List<Country> listCountries();
	
	
	
}
