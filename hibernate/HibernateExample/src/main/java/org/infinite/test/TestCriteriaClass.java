package org.infinite.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;
import org.infinite.pojo.Student;
import org.infinite.utils.HibernateUtils;

public class TestCriteriaClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*
		 * Student student = new Student();
		 * 
		 * student.setFirstName("Yeswanth");
		 * 
		 * student.setLastName("S");
		 * 
		 * student.setClassName("Btecch");
		 * 
		 * student.setRollNo("Bt/07/7456");
		 * 
		 * student.setAge(27);
		 */
		// Get the session object.

		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			// List<Student> ls =
			// session.createCriteria(Student.class).add(Restrictions.gt("studentId",
			// 2)).list();
			List<Student> ls = session.createCriteria(Student.class).add(Restrictions.between("studentId", 14, 20))
					.list();
			Criteria crit = session.createCriteria(Student.class);
			crit.setFirstResult(1);
			crit.setMaxResults(20);
			List<Student> result = crit.list();
			tx = session.beginTransaction();
			// Insert a new student record in the database.
			// session.save(student);
			// session.update(Student);
			// Commit hibernate transaction if no exception occurs.
			// tx.commit();
			for (Student z : ls) {
				System.out.println(z.getFirstName());
				System.out.println(z.getLastName());
				System.out.println(z.getRollNo());
				System.out.println("");
			}
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
