package co.com.prueba.jpa;

import co.com.prueba.jpa.repositories.JPARepository;
import co.com.prueba.jpa.repositories.UserRepository;
import co.com.prueba.model.Events;
import co.com.prueba.model.Users;
import co.com.prueba.model.gateways.EventRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JPARepositoryAdapter implements EventRepository {

    private final JPARepository jpaRepository;
    private final UserRepository userRepository;

    public JPARepositoryAdapter(JPARepository jpaRepository, UserRepository userRepository) {
        this.jpaRepository = jpaRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Events> getAll() {
        return (List<Events>) jpaRepository.findAll();
    }

    @Override
    public Optional<Events> getById(int eventId) {
        return jpaRepository.findById(eventId);
    }

    @Override
    public Events save(Events events) {
        return jpaRepository.save(events);
    }

    @Override
    public void deleteById(int eventId) {
        jpaRepository.deleteById(eventId);
    }

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }
}
