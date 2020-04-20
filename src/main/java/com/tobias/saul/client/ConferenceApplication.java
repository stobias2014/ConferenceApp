package com.tobias.saul.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tobias.saul.service.SpeakerService;
import com.tobias.saul.service.SpeakerServiceImpl;

import con.tobias.saul.config.AppConfig;

public class ConferenceApplication {
	
	public static void main(String args[]) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//SpeakerService service =  new SpeakerServiceImpl();
		
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println("Speaker: " + service.findAll().get(0));
	}

}
