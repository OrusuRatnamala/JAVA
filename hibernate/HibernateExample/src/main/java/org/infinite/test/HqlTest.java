package org.infinite.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.infinite.utils.HibernateUtils;

public class HqlTest {
	public static void main(String[] args) {
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		try {
			Query query = session.createQuery("update Student set  Last_Name=:last_name where  Student_Id=6");
			query.setString("last_name", "lokesh");
			int modifications = query.executeUpdate();
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