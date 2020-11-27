package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "guests")
public class Guest {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private Integer phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "occupying_the_room")
    private Date occupying_the_room;

    @Column(name = "leaving_the_room")
    private Date leaving_the_room;

    @Column(name = "room_type")
    private String room_type;

    @Column(name = "payment")
    private Integer payment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "username")
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOccupying_the_room() {
        return occupying_the_room;
    }

    public void setOccupying_the_room(Date occupying_the_room) {
        this.occupying_the_room = occupying_the_room;
    }

    public Date getLeaving_the_room() {
        return leaving_the_room;
    }

    public void setLeaving_the_room(Date leaving_the_room) {
        this.leaving_the_room = leaving_the_room;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
