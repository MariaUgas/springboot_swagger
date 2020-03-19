package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Caracteristicas {
	String type;
	Propiedades properties;
	Localizacion geometry;
	String id;
	
	
	public Caracteristicas() {
	
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Propiedades getProperties() {
		return properties;
	}
	public void setProperties(Propiedades properties) {
		this.properties = properties;
	}
	public Localizacion getGeometry() {
		return geometry;
	}
	public void setGeometry(Localizacion geometry) {
		this.geometry = geometry;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "{ type:" + type + ", properties: " + properties + ", geometry: " + geometry + ", id: " + id
				+ " }";
	}
	
	

}
