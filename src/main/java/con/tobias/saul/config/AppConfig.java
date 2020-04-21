package con.tobias.saul.config;

import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tobias.saul.repository.HibernateSpeakerRepositoryImpl;
import com.tobias.saul.repository.SpeakerRepository;
import com.tobias.saul.service.SpeakerService;
import com.tobias.saul.service.SpeakerServiceImpl;
import com.tobias.saul.util.CalendarFactory;

@Configuration
@ComponentScan({"com.tobias.saul"})
public class AppConfig {
	
	@Bean(name = "cal")
	public CalendarFactory calendarFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}
	
	@Bean
	public Calendar calendar() throws Exception{
		return calendarFactory().getObject();
	}
	
	/*
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public SpeakerService speakerService() {
		//constructor injection
		//SpeakerServiceImpl service = new SpeakerServiceImpl(speakerRepository());
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//setter injection
		//service.setRepository(speakerRepository());
		
		return service;
	}
	*/
	
	/*
	@Bean(name = "speakerRepository")
	public SpeakerRepository speakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	*/
	
	
}
