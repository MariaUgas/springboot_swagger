package com.example.demo.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Sismo {
    
	
	@Id
	@Column( nullable=false)
	private String id;
	private Double magnitude;
	private String place;
	private Date day;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(Double magnitude) {
		this.magnitude = magnitude;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}



}
