package com.amh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="firtname")
	private String firtsname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="telephone")
	private String telephone;
	@Column(name="city")
	private String city;

	public Contact() {
		super();
	}

	public Contact(String firtsname, String lastname, String telephone, String city) {
		super();
		this.firtsname = firtsname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
