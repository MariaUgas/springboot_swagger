package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaUtil {
	
	public static String fechaDeDay() {
		Date day= new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("YYYY-MM-dd");
		return formatter.format(day);
	}

}
