package org.infinite.test;

import java.sql.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.infinite.pojo.TimeTable;
import org.infinite.utils.HibernateUtils;


public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeTable tb = new TimeTable();//transient
		tb.setUserName("Harika");
		tb.setPassword("harika123");
		java.util.Date t = new java.util.Date();

		tb.setLogintmp(new java.sql.Timestamp(t.getTime()));
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new student record in the database.
			session.save(tb);
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}
}