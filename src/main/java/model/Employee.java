package model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "EMPLOYEE")
public class Employee {

    @Id
    private String employeeUsername;

    @OneToOne(mappedBy = "permissionUser")
    private Permissions permissions;

    private String name;

    private Integer zip_code;

    private String city;

    private String street;

    private String house_number;

    private Integer phone_number;

    private String email;

    @OneToMany(mappedBy = "receptionist")
    List<Guest> guests = new ArrayList<>();

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
