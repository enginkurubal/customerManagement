package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	Date dateOfBirth;
	String nationalityIdentityNumber;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityIdentityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityIdentityNumber = nationalityIdentityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityIdentityNumber() {
		return nationalityIdentityNumber;
	}

	public void setNationalityIdentityNumber(String nationalityIdentityNumber) {
		this.nationalityIdentityNumber = nationalityIdentityNumber;
	}
}
