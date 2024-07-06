package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name= "Student")
public class Student {
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="fname", nullable = false)
	private String fname;
	@Column(name="lname", nullable = false)
	private String lname;
	@Column(name="email", nullable = false)
	private String email;
	private double score;
	@ManyToOne
	@JoinColumn(name="Course_Id",nullable = false)
	private Course cid;
	
	public Student() {
		super();
	}
	public Student( String fname, String lname, String email, double score, Course cid) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.score = score;
		this.cid = cid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", score=" + score
				+ ", cid=" + cid + "]";
	}
	
	
	
	
	
	
	
}
