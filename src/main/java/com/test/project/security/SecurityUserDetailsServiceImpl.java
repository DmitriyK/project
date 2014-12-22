package com.test.project.security;

import com.test.project.dao.iface.UserDao;
import com.test.project.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecurityUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.test.project.domain.User user = userDao.findByUserName(username);
        Set<Role> roleSet = new HashSet<>(1);
        roleSet.add(user.getRole());
        List<GrantedAuthority> authorities = buildUserAuthority(roleSet);
        return buildUserForAuthentication(user, authorities);
    }

    private User buildUserForAuthentication(com.test.project.domain.User user, List<GrantedAuthority> authorities) {
        return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<Role> roles) {
        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
        for (Role role : roles) {
            setAuths.add(new SimpleGrantedAuthority(role.getRolename()));
        }
        List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuths);
        return result;
    }
}
