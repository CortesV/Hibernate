package com.devcortes.components.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.stereotype.Repository;

import com.devcortes.components.entity.Phone;
import com.devcortes.components.interfaces.IPhoneDao;
import com.devcortes.components.service.request.PhoneRequest;
import com.devcortes.service.HibernateUtil;

@Repository("first")
public class PhoneDao implements IPhoneDao{

	@Override
	public List<Phone> getAll() {
		DetachedCriteria query = DetachedCriteria.forClass(Phone.class)
				.createAlias("phoneFeatures", "feature")
				.add(Restrictions.eq("feature.id", 1))
				.add(Restrictions.eq("producer", "qwerty"));	
		Session session = null;
		ArrayList<Phone> result = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			result = (ArrayList<Phone>)query.getExecutableCriteria(session).list();			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
		return result;		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id, PhoneRequest phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Phone getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(PhoneRequest phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Phone> getPages(Integer id) {		
		Session session = null;
		ArrayList<Phone> result = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			result = (ArrayList<Phone>)session.createCriteria(Phone.class)
					 .setFirstResult(0)
					 .setMaxResults(5)
					 .list();			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
		return result;
	}
	
	public  List<Phone> restrict(){
		Session session = null;
		ArrayList<Phone> result = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			result = (ArrayList<Phone>)session.createCriteria(Phone.class)
					 .add(Restrictions.eq("producer", "qwerty"))
					 .add(Restrictions.eq("model", "sdf"))
					 .add(Restrictions.between("owner", 1, 9))					 
					 .addOrder( Order.desc("owner") )
					 .list();			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
		return result;
	}

}
