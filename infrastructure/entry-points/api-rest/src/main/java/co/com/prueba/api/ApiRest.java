package co.com.prueba.api;

import co.com.prueba.model.Events;
import co.com.prueba.model.Users;
import co.com.prueba.usecase.EventUseCase;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/iasapi", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiRest {

    private final EventUseCase eventUseCase;


    public ApiRest(EventUseCase eventUseCase) {
        this.eventUseCase = eventUseCase;
    }


    @GetMapping(path = "/events")
    public List<Events> getAll(){
        return eventUseCase.getAll();
    }

    @GetMapping(path = "/events/{id}")
    public Optional<Events> getById(@PathVariable("id") int id){

        return eventUseCase.getById(id);
    }

    @DeleteMapping(path = "/events/{id}")
    public void deleteById(@PathVariable("id") int id){
        eventUseCase.deleteById(id);
    }

    @PostMapping(path = "/events")
    public Events save(@RequestBody Events events){
        return eventUseCase.save(events);
    }

    @PostMapping(path = "/event/{id}/register")
    public ResponseEntity<?> User(@RequestBody Users user, @PathVariable("id") int id){

        Users userEvent = new Users(user.getUserId(), id);

        Optional<Events> event = eventUseCase.getById(id);

        if(event == null){
            return ResponseEntity.notFound().build();
        }

        else {
            eventUseCase.saveUser(userEvent);
            return ResponseEntity.ok().body("Usuario registrado al evento exitosamente");

        }

    }
}
