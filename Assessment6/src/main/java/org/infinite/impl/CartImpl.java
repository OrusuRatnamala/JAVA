package org.infinite.impl;

import java.util.List;
import javax.transaction.Transaction;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.infinite.interfaces.ICart;
import org.infinite.daohelper.DaoHelper;
import org.infinite.pojo.Product;

public class CartImpl implements ICart {

	Session sessionObj;
	static SessionFactory sessionFactoryObj;
	org.hibernate.Transaction tx = null;

	public void insert() {
		// TODO Auto-generated method stub
		try {
			BasicConfigurator.configure();
			sessionObj = DaoHelper.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			Product p = new Product();
			p.setProductName(producname);
			p.setPrice(price);
			p.setQuantity(quantity);
			p.setTotal(Total);
			sessionObj.save(p);
			tx.commit();
		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			// Close hibernate session.
			// sessionObj.close();
		}
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public List<Product> display() {
		// TODO Auto-generated method stub
		List<Product> ls = null;
		String msg = null;
		try {
			BasicConfigurator.configure();
			sessionObj = DaoHelper.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			Query q = sessionObj.createQuery("from Cart");
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
