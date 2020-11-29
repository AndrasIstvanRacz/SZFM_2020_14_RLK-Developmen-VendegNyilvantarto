package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

//@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "GUESTS")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer phone_number;

    private String email;

    private Date occupying_the_room;

    private Date leaving_the_room;

    private String room_type;

    private Integer payment;

    @ManyToOne
    @JoinColumn(name = "RECEPTIONIST")
    private Employee receptionist;

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

    public Employee getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Employee receptionist) {
        this.receptionist = receptionist;
    }
}
