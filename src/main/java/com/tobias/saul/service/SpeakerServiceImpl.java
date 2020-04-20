package com.tobias.saul.service;

import java.util.List;

import com.tobias.saul.model.Speaker;
import com.tobias.saul.repository.HibernateSpeakerRepositoryImpl;
import com.tobias.saul.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository speakerRepository;
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}
	
	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();
	}
	
	public void setRepository(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}

}
