package org.onlineshoppingportal.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.onlineshoppingportal.entity.Account;
import org.onlineshoppingportal.entity.Product;
import org.onlineshoppingportal.entity.Role;
import org.onlineshoppingportal.model.PaginationResult;
import org.onlineshoppingportal.model.ProductInfo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired

	private SessionFactory sessionFactory;

	public Product findProduct(String code) {

		Session session = sessionFactory.getCurrentSession();

		Criteria crit = session.createCriteria(Product.class);

		crit.add(Restrictions.eq("code", code));

		return (Product) crit.uniqueResult();

	}

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage,

			String likeName) {

		String sql = "Select new " + ProductInfo.class.getName() //

				+ "(p.code, p.name, p.price,p.quantity) " + " from "//

				+ Product.class.getName() + " p ";

		if (likeName != null && likeName.length() > 0) {

			sql += " Where lower(p.name) like :likeName ";

		}

		sql += " order by p.createDate desc ";

		//

		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery(sql);

		if (likeName != null && likeName.length() > 0) {

			query.setParameter("likeName", "%" + likeName.toLowerCase() + "%");

		}

		return new PaginationResult<ProductInfo>(query, page, maxResult, maxNavigationPage);

	}

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage) {

		return queryProducts(page, maxResult, maxNavigationPage, null);

	}

	public List<Product> getAllProducts() {

		Session session = sessionFactory.getCurrentSession();

		Criteria crit = session.createCriteria(Product.class);

		return crit.list();

	}

}
