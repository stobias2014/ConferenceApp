package com.tobias.saul.client;

import com.tobias.saul.service.SpeakerService;
import com.tobias.saul.service.SpeakerServiceImpl;

public class ConferenceApplication {
	
	public static void main(String args[]) {
		SpeakerService service = new SpeakerServiceImpl();
		
		System.out.println("Speaker: " + service.findAll().get(0));
	}

}
