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
@Table( name = "PERMISSION")
public class Permissions {

    @Id
    private String employeeUsername;

    @OneToOne
    @JoinColumn(name = "PERMISSION_USER")
    private Employee permissionUser;

    private String password;

    private Integer permission;

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public Employee getPermissionUser() {
        return permissionUser;
    }

    public void setPermissionUser(Employee permissionUser) {
        this.permissionUser = permissionUser;
    }

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


