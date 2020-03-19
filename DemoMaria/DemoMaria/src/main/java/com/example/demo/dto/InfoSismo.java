package com.example.demo.dto;



import java.util.Arrays;

import com.example.demo.dto.Caracteristicas;
import com.example.demo.dto.Metadata;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoSismo {
	String type;
	Caracteristicas[] features;
	Metadata metadata;
	
	
	
	public InfoSismo() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Caracteristicas[] getFeatures() {
		return features;
	}
	public void setFeatures(Caracteristicas[] features) {
		this.features = features;
	}
	
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "info_sismo { type: " + type + " metadata: " + metadata + ", features: " + Arrays.toString(features) + " }";
	}
	

	

}
