package com.infinite.hibernate.diImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.infinite.daohelper.DaoHelper;
import org.infinite.hibernate.pojo.Student;
import com.infinite.hibernate.dinterface.IStudent;

public class StudentImpl implements IStudent {
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	public void createRecord(String name, String rollno, String course) {
		// TODO Auto-generated method stub
		try {
			sessionObj = (DaoHelper.buildSessionFactory().openSession());
			sessionObj.beginTransaction();
			Student st = new Student();
			/*
			 * st.setStudentName("Ratna"); st.setRollNumber("103351R");
			 * st.setCourse("JavaBackaend");
			 */
			st.setStudentName(name);
			st.setRollNumber(rollno);
			st.setCourse(course);

			sessionObj.save(st);
			sessionObj.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sessionObj.close();
		}
	}

	 public List<Student> displayRecords() {
	List<Student> result =null;
		 try {
				sessionObj = DaoHelper.buildSessionFactory().openSession();
				sessionObj.beginTransaction();
				Query qr = sessionObj.createQuery("from Student");
				result=qr.list();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sessionObj.close();
			}
			return result;
	 }

	// public void deleteAllRecords() { }
}