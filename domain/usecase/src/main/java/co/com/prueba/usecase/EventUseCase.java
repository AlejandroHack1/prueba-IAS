package co.com.prueba.usecase;

import co.com.prueba.model.Events;
import co.com.prueba.model.Users;
import co.com.prueba.model.gateways.EventRepository;

import java.util.List;
import java.util.Optional;

public class EventUseCase {

    private final EventRepository eventRepository;

    public EventUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Events> getAll(){
        return eventRepository.getAll();
    }

    public Events save(Events events){
        return eventRepository.save(events);
    }

    public Users saveUser(Users users){
        return eventRepository.save(users);
    }

    public Optional<Events> getById(int eventId){
        return eventRepository.getById(eventId);
    }

    public void deleteById(int eventId){
        eventRepository.deleteById(eventId);
    }
}
