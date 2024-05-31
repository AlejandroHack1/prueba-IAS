package co.com.prueba.jpa.repositories;

import co.com.prueba.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
