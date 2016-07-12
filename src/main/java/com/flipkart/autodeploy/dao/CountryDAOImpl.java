package com.flipkart.autodeploy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.flipkart.autodeploy.model.Country;

@Repository
public class CountryDAOImpl implements CountryDAO{
	
	private SessionFactory sessionFactory;
	private static final Logger logger = LoggerFactory.getLogger(Country.class);
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addCountry(Country country) {
		// TODO Auto-generated method stub
		Session sess = this.sessionFactory.getCurrentSession();
		sess.persist(country);
		logger.info("saved country : "+country);
		
		
	}

	@Override
	public List<Country> listCountries() {
		// TODO Auto-generated method stub
		Session sess = this.sessionFactory.getCurrentSession();
		List<Country> countries = sess.createQuery("from Country").list();
		logger.info("Got the countries");
		return countries;
		
	}
	
	

}
