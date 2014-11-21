package com.lalongooo.spring_hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ENTITY_SPRING")
public class EntitySpring {


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ENTITY_SPRINGSeq")
	@SequenceGenerator(name = "ENTITY_SPRINGSeq", sequenceName = "ENTITY_SPRING_SEQ", allocationSize = 1)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDATE")
	private Date birthdate;
	
	@Column(name = "LOGIN_COUNT")
	private long login_count;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public long getLogin_count() {
		return login_count;
	}

	public void setLogin_count(long login_count) {
		this.login_count = login_count;
	}
	
}
