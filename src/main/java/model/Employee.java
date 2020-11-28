package model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "employee")
public class Employee {

    @Id
    @Column(name = "username")
    private String employeeUsername;

    @OneToOne(mappedBy = "employee")
    private Permissions permissions;

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

    @OneToMany(mappedBy = "employee")
    Set<Guest> guests = new HashSet<>();

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + employeeUsername + '\'' +
                ", name='" + name + '\'' +
                ", zip_code=" + zip_code +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_number='" + house_number + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }




}
