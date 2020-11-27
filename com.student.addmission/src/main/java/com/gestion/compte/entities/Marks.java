package com.gestion.compte.entities;

import javax.persistence.Entity;

@Entity
public class Marks {
private long id;
private Student st;
private Course  cs;
private String session;
private int marks1;
private int marks2;

public Marks() {

}

public Marks(Student st, Course cs, String session, int marks1, int marks2) {
	
	this.st = st;
	this.cs = cs;
	this.session = session;
	this.marks1 = marks1;
	this.marks2 = marks2;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public Student getSt() {
	return st;
}

public void setSt(Student st) {
	this.st = st;
}

public Course getCs() {
	return cs;
}

public void setCs(Course cs) {
	this.cs = cs;
}

public String getSession() {
	return session;
}

public void setSession(String session) {
	this.session = session;
}

public int getMarks1() {
	return marks1;
}

public void setMarks1(int marks1) {
	this.marks1 = marks1;
}

public int getMarks2() {
	return marks2;
}

public void setMarks2(int marks2) {
	this.marks2 = marks2;
}



}
