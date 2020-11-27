package com.gestion.compte.entities;

import javax.persistence.Entity;

@Entity
public class Course {
private long id;
private String name;
private long crediNumber;

public Course() {

}

public Course(String name, long crediNumber) {

	this.name = name;
	this.crediNumber = crediNumber;
}

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

public long getCrediNumber() {
	return crediNumber;
}

public void setCrediNumber(long crediNumber) {
	this.crediNumber = crediNumber;
}



}
