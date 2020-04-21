package com.tobias.saul.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobias.saul.model.Speaker;
import com.tobias.saul.repository.HibernateSpeakerRepositoryImpl;
import com.tobias.saul.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	
	@Autowired
	private SpeakerRepository speakerRepository;
	
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}
	
	//after construction, do this method
	//use for configuration after construction
	@PostConstruct
	private void initialize() {
		System.out.println("We're called after constructors");
	}
	
	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();
	}
	
	
	public void setRepository(SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl setter");
		this.speakerRepository = speakerRepository;
	}

}
