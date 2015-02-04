package com.test.project.domain;

import com.test.project.domain.common.Common;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends Common {

    @Column(name = "username", unique = true, nullable = false)
    /*@Size(min = 6, message = "wrong username")*/
    private String username;

    /*@Size(min = 8, message = "wrong pass")*/
    private String password;

    @Column(name = "email", unique = true, nullable = false)
    /*@Email*/
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
