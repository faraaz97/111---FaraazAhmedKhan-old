package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT1")
public class Student1 {
	private long studentId;
	private String studentName;
	private Set<CoachingCentre> studentccName = new HashSet<CoachingCentre>(0);

	public Student1() {
	}

	public Student1(String studentName, Set<CoachingCentre> studentccName) {
	this.studentName = studentName;
	this.studentccName = studentccName;
	}

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
	return this.studentId;
	}

	public void setStudentId(long studentId) {
	this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
	return this.studentName;
	}

	public void setStudentName(String studentName) {
	this.studentName = studentName;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_CENTER", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CC_ID") })
	public Set<CoachingCentre> getStudentccName() {
	return this.studentccName;
	}

	public void setStudentccName(Set<CoachingCentre> studentccName) {
	this.studentccName = studentccName;
	}

	}

	


