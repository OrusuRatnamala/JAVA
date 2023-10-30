package org.infinite.impl;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.infinite.daohelper.DaoHelper;
import org.infinite.pojo.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DisplayImpl {
	Session sessionObj;
	static SessionFactory sessionFactoryObj;
	org.hibernate.Transaction tx = null;

	public List<Product> displayRecords() {
		// TODO Auto-generated method stub
		List<Product> ls = null;
		String msg = null;
		try {
			BasicConfigurator.configure();
			sessionObj = DaoHelper.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			Query q = sessionObj.createQuery("from Product");
			ls = q.list();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			// sessionObj.close();
		}
		return ls;
	}

}
