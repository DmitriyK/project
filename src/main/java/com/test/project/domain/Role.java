package com.test.project.domain;

import com.test.project.domain.common.Common;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role extends Common {

    private String rolename;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private List<User> users;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
