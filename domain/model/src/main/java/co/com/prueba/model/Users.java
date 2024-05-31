package co.com.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "user_event_id", nullable = false)
    private int userEventId;


    public Users() {
    }

    public Users(int userId, int userEventId) {
        this.userId = userId;
        this.userEventId = userEventId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserEventId() {
        return userEventId;
    }

    public void setUserEventId(int userEventId) {
        this.userEventId = userEventId;
    }

}
