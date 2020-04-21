package com.tobias.saul.util;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactory implements FactoryBean<Calendar>{
	
	private Calendar instance = Calendar.getInstance();
	
	@Override
	public Calendar getObject() throws Exception {
		// TODO Auto-generated method stub
		return this.instance;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Calendar.class;
	}
	
	public void addDays(int num) {
		this.instance.add(Calendar.DAY_OF_YEAR, num);
	}
	
	

}
