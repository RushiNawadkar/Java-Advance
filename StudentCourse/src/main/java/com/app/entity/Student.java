package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Student")
public class Student extends BaseEntity {
	//first name , last name , email , course id,score obtained.
	private String fname;
	private String lname;
	private String email;
	private double score;
	@ManyToOne
	@JoinColumn(name="Course_Id",nullable = false)
	private Course cid;
	
	public Student(String fname, String lname, String email, double score) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.score = score;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Course getCid() {
		return cid;
	}

	public void setCid(Course cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", email=" + email + ", score=" + score + ", cid=" + cid
				+ "]";
	}

	
	
	
	
	
	
}
