package com.tobias.saul.repository;

import java.util.List;

import com.tobias.saul.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}