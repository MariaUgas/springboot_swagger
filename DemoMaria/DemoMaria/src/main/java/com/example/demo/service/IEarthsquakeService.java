package com.example.demo.service;

import com.example.demo.dto.InfoSismo;

public interface IEarthsquakeService {
	
	public InfoSismo getEarthquakeBetweenDate(String fecha_inicial, String fecha_final) ;
	public InfoSismo getEarthquakeBetweenMagnitude(String magnitud_inicial, String magnitud_final) ;
	public InfoSismo postEarthquakeDay();
}
