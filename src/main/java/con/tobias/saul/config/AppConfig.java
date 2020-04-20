package con.tobias.saul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tobias.saul.repository.HibernateSpeakerRepositoryImpl;
import com.tobias.saul.repository.SpeakerRepository;
import com.tobias.saul.service.SpeakerService;
import com.tobias.saul.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "speakerService")
	public SpeakerService speakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//setter injection
		service.setRepository(speakerRepository());
		return service;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository speakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	
	
}
