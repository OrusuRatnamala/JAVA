package org.infinite.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.utils.HibernateUtils;
import org.infinite.pojo.Student;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("Yeswanth");
		student.setLastName("S");
		student.setClassName("Btecch");
		student.setRollNo("Bt/07/7456");
		student.setAge(27);
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new student record in the database.

			for (int i = 0; i <= 50; i++) {

				student = new Student();

				student.setFirstName("Yes" + i);

				student.setLastName("S" + i);

				student.setClassName("Btecch");

				student.setRollNo("Bt/07/" + 7456 + i);

				student.setAge(28);

				session.save(student);

				// Commit hibernate transaction if no exception occurs.

			}

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