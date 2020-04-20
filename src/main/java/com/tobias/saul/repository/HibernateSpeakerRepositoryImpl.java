package com.tobias.saul.repository;

import java.util.ArrayList;
import java.util.List;

import com.tobias.saul.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Override
	public List<Speaker> findAll() {
		
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Saul");
		speaker.setLastName("Tobias");
		
		speakers.add(speaker);
		
		return speakers;
		
	}

}
