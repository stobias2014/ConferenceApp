package com.tobias.saul.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tobias.saul.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Autowired
	private Calendar cal;
	
	@Value("#{ T(java.lang.Math).random() * 100}")
	private double seedNum;
	
	@Override
	public List<Speaker> findAll() {
		
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Saul");
		speaker.setLastName("Tobias");
		speaker.setSeedNum(seedNum);
		
		System.out.println("cal " + cal.getTime());
		
		speakers.add(speaker);
		
		return speakers;
		
	}

}
