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
@Table( name = "employee")
public class Employee {
    @Id
    @Column(name = "username")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "zip_code")
    private Integer zip_code;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String house_number;

    @Column(name = "phone_number")
    private Integer phone_number;

    @Column(name = "email")
    private String email;



}
