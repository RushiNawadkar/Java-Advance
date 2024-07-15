package com.app.Entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="railway")
public class Railway {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rname;
	@Enumerated(EnumType.STRING)
	private Category cat;

	private LocalTime starttime;

	private LocalTime endtime;
	private String source;
	private String destination;
	private String station_code;
	private double distance;
	private String frequency;
	
	public Railway() {}
	
	public Long getId() {
		return id;
	}
	
	
	public Railway(Long id, String name, Category cat, LocalTime starttime, LocalTime endtime, String source,
			String destination, String station_code, double distance, String frequency) {
		super();
		this.id = id;
		this.rname = name;
		this.cat = cat;
		this.starttime = starttime;
		endtime = endtime;
		this.source = source;
		destination = destination;
		this.station_code = station_code;
		distance = distance;
		this.frequency = frequency;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return rname;
	}
	public void setName(String name) {
		this.rname = name;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public LocalTime getStarttime() {
		return starttime;
	}
	public void setStarttime(LocalTime starttime) {
		this.starttime = starttime;
	}
	public LocalTime getEndtime() {
		return endtime;
	}
	public void setEndtime(LocalTime endtime) {
		endtime = endtime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		destination = destination;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		distance = distance;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}


	@Override
	public String toString() {
		return "Railway [id=" + id + ", name=" + rname + ", cat=" + cat + ", starttime=" + starttime + ", Endtime="
				+ endtime + ", source=" + source + ", Destination=" + destination + ", station_code=" + station_code
				+ ", Distance=" + distance + ", frequency=" + frequency + "]";
	}
	
	
	
}
