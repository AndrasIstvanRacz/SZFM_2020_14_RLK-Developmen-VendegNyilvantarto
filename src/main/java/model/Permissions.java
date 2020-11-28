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
@Table( name = "PERMISSION")
public class Permissions {

    @Id
    private String employeeUsername;

    @OneToOne
    @JoinColumn(name = "PERMISSION_USER")
    private Employee permissionUser;

    private String password;

    private Integer permission;

}


