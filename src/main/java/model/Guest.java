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
}
