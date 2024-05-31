package co.com.prueba.model.gateways;

import co.com.prueba.model.Events;
import co.com.prueba.model.Users;

import java.util.List;
import java.util.Optional;

public interface EventRepository {

    List<Events> getAll();

    Optional<Events> getById(int eventId);
    Events save(Events events);

    void deleteById(int eventId);

    Users save(Users users);
}
