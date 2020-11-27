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
    private String phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "occupying_the_room")
    private String occupying_the_room;

    @Column(name = "leaving_the_room")
    private String leaving_the_room;

    @Column(name = "room_type")
    private String room_type;

    @Column(name = "payment")
    private String payment;

    @Column(name = "username")
    private String username;



}
