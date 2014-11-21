package com.lalongooo.spring_hibernate.dao;

import java.util.List;

import com.lalongooo.spring_hibernate.entity.EntitySpring;

public interface EntitySpringDao {

	public void saveEntitySpring(EntitySpring es);
	
	public List<EntitySpring> loadEntitySpring(long id);
	
}
