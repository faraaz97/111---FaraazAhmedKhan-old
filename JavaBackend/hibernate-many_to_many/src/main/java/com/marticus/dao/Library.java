package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIBRARY")
public class Library {
	private long libraryId;
	private String libraryName;
	private Set<Books> books = new HashSet<Books>(0);

	public Library() {
	}
	public  Library(String libraryName) {
		this.libraryName = libraryName;
	} 
	public Library(String libraryName, Set<Books> books) {
		this.libraryName = libraryName;
		this.books = books;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "LIBRARY_ID")
	public long getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(long libraryId) {
		this.libraryId = libraryId;
	}
	
	@Column(name = "LIBRARY_NAME", nullable = false, length = 100)
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "LIBRARY_BOOKS", joinColumns = { @JoinColumn(name = "LIBRARY_ID") }, inverseJoinColumns = { @JoinColumn(name = "BOOK_ID") })
	public Set<Books> getBooks() {
		return this.books;
	}
	public void setBooks(Set<Books> books) {
		this.books = books;
	}

	}



