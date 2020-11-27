package com.gestion.compte.entities;

import javax.persistence.Entity;

@Entity
public class Student {
private long id;
private String firstName;
private String lastName;
private String adresse;
private String city;

public Student() {

}

public Student(String firstName, String lastName, String adresse, String city) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.adresse = adresse;
	this.city = city;
}

public long getId() {
	return id;
}

public void setId(long id) {
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

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}




}
