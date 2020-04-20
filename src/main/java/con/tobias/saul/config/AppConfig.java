package con.tobias.saul.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tobias.saul.repository.HibernateSpeakerRepositoryImpl;
import com.tobias.saul.repository.SpeakerRepository;
import com.tobias.saul.service.SpeakerService;
import com.tobias.saul.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public SpeakerService speakerService() {
		//constructor injection
		SpeakerServiceImpl service = new SpeakerServiceImpl(speakerRepository());
		
		//setter injection
		//service.setRepository(speakerRepository());
		
		return service;
	}
	
	@Bean(name = "speakerRepository")
	public SpeakerRepository speakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	
	
}
