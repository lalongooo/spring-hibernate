package com.lalongooo.spring_hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.lalongooo.spring_hibernate.dao.EntitySpringDao;
import com.lalongooo.spring_hibernate.entity.EntitySpring;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EntitySpringDaoImpl implements EntitySpringDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveEntitySpring(EntitySpring es) {
		sessionFactory.getCurrentSession().save(es);
	}

	public List<EntitySpring> loadEntitySpring(long id) {
		return (List<EntitySpring>) this.sessionFactory.getCurrentSession()
				.createQuery("from EntitySpring product where product.id=?")
				.setParameter(0, id).list();
	}

}
