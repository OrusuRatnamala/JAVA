package com.infinite.SpringBootMvc.repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.infinite.SpringBootMvc.model.Municipal;

@Repository
public class MunicipalDaoImpl implements IMuncipalDao {

	@Autowired
	SessionFactory sessionfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sessionfactory = sfactory;
	}

	@Override
	public List<Municipal> getAllComplains() {
		// TODO Auto-generated method stub
		Session scs = this.sessionfactory.getCurrentSession();
		List<Municipal> ls = scs.createQuery("from Municipal").list();
		return ls;
	}

	@Override
	public Municipal getMunicipal(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Municipal municipal = (Municipal) session.get(Municipal.class, id);
		return municipal;

	}

	@Override
	public Municipal addMunicipal(Municipal municipal) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		session.save(municipal);
		return municipal;
	}

	@Override
	public void updateMunicipal(Municipal municipal) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Hibernate.initialize(municipal);
		session.update(municipal);

	}

	@Override
	public void deleteMunicipal(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Municipal mc = (Municipal) session.load(Municipal.class, new Integer(id));
		if (null != mc) {
			session.delete(mc);

		}

	}
}
