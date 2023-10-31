package com.infinite.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.infinite.spring.CAadhar;
import com.infinite.spring.model.Aadhar;

@Repository
public class IAadharDAOImpl implements IAadharDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void aadharinsert(Aadhar aadhar) {
		System.out.println("aadharinsert DAO");
		Session ses=this.sessionFactory.getCurrentSession();
		ses.save(aadhar);
			
	}

}
