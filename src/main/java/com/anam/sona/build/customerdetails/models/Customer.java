package com.anam.sona.build.customerdetails.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@NamedQuery(name=Customer.FIND_ALL, query="SELECT p FROM Customer p")
public class Customer {
	
	public static final String FIND_ALL = "Customer.findAll";
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MOBILE")
	public String mobile;
	
	@Column(name = "EMAIL")
	public String email;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "GENDER")
	public char gender;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, String mobile, String email, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public char getgender() {
		return gender;
	}


	public void setgender(char gender) {
		this.gender = gender;
	}

	
}
