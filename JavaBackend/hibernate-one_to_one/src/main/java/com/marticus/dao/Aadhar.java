package com.marticus.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AADHAR")

public class Aadhar {
	
	private long aadharId;
	private Person aadharNumber;
	
	public Aadhar() {
	}
		public Aadhar(long aadharId, Person aadharNumber) {
			this.aadharId=aadharId;
			this.aadharNumber=aadharNumber;
			
		}
		@Id
		@GeneratedValue
		@Column(name = "AADHAR_ID")
		public long getAadharId() {
			return this.aadharId;
		}
		public void setAadharId(long aadharId) {
			this.aadharId = aadharId;
		}
		
		
		@OneToOne(cascade = CascadeType.ALL)
		public Person getAadharNumber() {
			return this.aadharNumber;
		}
		public void setAadharNumber(Person aadharNumber) {
			this.aadharNumber = aadharNumber;
		}

		
}

	


