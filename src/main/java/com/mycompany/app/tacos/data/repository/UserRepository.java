package com.mycompany.app.tacos.data.repository;

import com.mycompany.app.tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
