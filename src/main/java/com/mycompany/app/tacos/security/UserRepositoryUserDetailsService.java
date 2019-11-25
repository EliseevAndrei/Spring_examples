package com.mycompany.app.tacos.security;

import com.mycompany.app.tacos.Role;
import com.mycompany.app.tacos.User;
import com.mycompany.app.tacos.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public UserRepositoryUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user != null) {
            Set<GrantedAuthority> roles = new HashSet<>();
            for (Role role : user.getRoles()) {
                roles.add(new SimpleGrantedAuthority("ROLE_" + role.getName().name()));
            }
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(), user.getPassword(), roles);
        }
        throw new UsernameNotFoundException(
                "User '" + s + "' not found");
    }
}
