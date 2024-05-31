package co.com.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", nullable = false)
    private int eventId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_date")
    private String eventDate;

    @Column(name = "event_location")
    private String eventLocation;

    public Events(){

    }

    public Events(int eventId, String eventName, String eventDate, String eventLocation){
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
}
