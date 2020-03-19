package com.example.demo.converter;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.dto.InfoSismo;
import com.example.demo.pojo.Sismo;

public class SismoConverter {
	
	
	public static List<Sismo> converterToListSismo(InfoSismo info){
		List<Sismo> listSismo=new ArrayList<>();
		
		for (int i = 0; i < info.getFeatures().length; i++) {
			Sismo sismo= new Sismo();
			sismo.setId(info.getFeatures()[i].getId());
			sismo.setMagnitude(info.getFeatures()[i].getProperties().getMag());
			sismo.setPlace(info.getFeatures()[i].getProperties().getPlace());
			sismo.setDay(new Date());
			listSismo.add(sismo);
		}
		
		return listSismo;
	}

}
