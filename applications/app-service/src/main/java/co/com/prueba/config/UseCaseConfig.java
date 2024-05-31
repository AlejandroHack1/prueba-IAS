package co.com.prueba.config;

import co.com.prueba.model.gateways.EventRepository;
import co.com.prueba.usecase.EventUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public EventUseCase eventUseCase(EventRepository eventRepository){
        return new EventUseCase(eventRepository);
    }
}
