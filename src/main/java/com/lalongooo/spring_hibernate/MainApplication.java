package com.lalongooo.spring_hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lalongooo.spring_hibernate.dao.impl.EntitySpringDaoImpl;
import com.lalongooo.spring_hibernate.entity.EntitySpring;

public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

		EntitySpringDaoImpl esd = (EntitySpringDaoImpl) ctx .getBean("myEntitySpringDaoImpl");

		EntitySpring es = new EntitySpring();
		es.setBirthdate(new java.util.Date());
		es.setEmail("hdez.jeduardo@gmail.com");
		es.setLogin_count(50);
		es.setName("Jorge E. Hernandez");

		esd.saveEntitySpring(es);

	}
}
