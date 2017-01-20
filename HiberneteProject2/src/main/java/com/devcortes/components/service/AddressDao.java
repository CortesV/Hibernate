package com.devcortes.components.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devcortes.components.entity.Address;
import com.devcortes.components.interfaces.IAddressDao;
import com.devcortes.components.service.request.AddressRequest;
import com.devcortes.service.HibernateUtil;

@Repository
public class AddressDao implements IAddressDao{
	
	
	
	@Override
	public List<Address> getAll() {
		Session session = null;
		ArrayList<Address> result = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			Query SQLQuery = session.createQuery("select address from Address address");
			result = (ArrayList<Address>)SQLQuery.list();			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
		return result;
	}

	@Override
	public void delete(Integer id) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			Address del = (Address) session.get(Address.class, id);
	        session.delete(del);			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
	}

	@Override
	public void update(Integer id, AddressRequest address) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			Address update = (Address) session.get(Address.class, id);
	        update.setAddress(address.getAddress());
	        update.setCity(address.getCity());
	        update.setPerson(address.getPerson());
	        session.update(update);			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		}
	}

	@Override
	public Address getById(Integer id) {
		Session session = null;
		Address result = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			result = (Address) session.get(Address.class, id);	
			
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		} 
        return result;
	}

	@Override
	public void add(AddressRequest address) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();			
			session.save(new Address(address.getAddress(), address.getCity(), address.getPerson()));		
		} finally {
			if (session.isOpen()) {
	            session.close();
	        }
		}
		
	}

}
