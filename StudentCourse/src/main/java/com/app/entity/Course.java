package com.app.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name= "Course")

public class Course extends BaseEntity implements Serializable {
	@Column(unique = true)
	private String title;
	private LocalDate sdate;
	private LocalDate edate;
	private double fees;
	private double minScore;
	
	public Course(String title, LocalDate sdate, LocalDate edate, double fees, double minScore) {
		super();
		this.title = title;
		this.sdate = sdate;
		this.edate = edate;
		this.fees = fees;
		this.minScore = minScore;
	}

	public Course() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getSdate() {
		return sdate;
	}

	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}

	public LocalDate getEdate() {
		return edate;
	}

	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getMinScore() {
		return minScore;
	}

	public void setMinScore(double minScore) {
		this.minScore = minScore;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", sdate=" + sdate + ", edate=" + edate + ", fees=" + fees + ", minScore="
				+ minScore + "]";
	}
	
	
	
	
	
	
	
	
	

}
