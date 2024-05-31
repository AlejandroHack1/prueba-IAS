package co.com.prueba.jpa.repositories;


import co.com.prueba.model.Events;
import org.springframework.data.repository.CrudRepository;

public interface JPARepository extends CrudRepository<Events, Integer> {
}
