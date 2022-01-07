package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	private long personId;
	private String name;
	private String aadhar;
	
	public Person() {
		
	}
	public Person(String name, String aadhar) {
		this.name=name;
		this.aadhar=aadhar;
	}
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	public long getPersonId() {
		return this.personId;
	}
	public void setPersonId(long personId) {
		this.personId=personId;
	}
	
	@Column(name="person_name",  nullable = false, length=250)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="person_aadhar", nullable = false, length=250)
	public String getAadhar() {
		return this.aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	

}
