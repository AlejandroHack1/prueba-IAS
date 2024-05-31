package co.com.prueba.usecase;

import co.com.prueba.model.Events;
import co.com.prueba.model.gateways.EventRepository;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class EventUseCaseTest {

    @InjectMocks
    private EventUseCase eventUseCase;

    @Mock
    private EventRepository eventRepository;

    @Test
    void getAll() {
        List<Events> events = Arrays.asList(
                new Events(1,"evento1","event date","event location1"),
                new Events(1,"evento1","event date","event location1"));

        when(eventRepository.getAll()).thenReturn(events);

        List<Events> result = eventUseCase.getAll();

        assertEquals(result, events);
    }



    @Test
    void save() {
    }

    @Test
    void getById() {
    }

    @Test
    void deleteById() {
    }
}