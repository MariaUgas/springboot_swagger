package com.example.demo.dto;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( ignoreUnknown = true)
public class Localizacion {
	
	private String type;
	private Double[] coordinates;
	
	
	
	public Localizacion() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public Double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return " { type: " + type + ", coordinates: " + Arrays.toString(coordinates) + " }";
	}

	
	
	

}
