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
@Table( name = "permissions")
public class Permissions {

    @Id
    private String employeeUsername;

    @OneToOne
    @MapsId
    @JoinColumn(name = "username")
    private Employee employee;

    @Column(name = "password")
    private String password;

    @Column(name = "permission")
    private Integer permission;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }
}


