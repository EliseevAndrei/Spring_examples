package com.mycompany.app.tacos.data.repository;

import com.mycompany.app.tacos.Role;
import com.mycompany.app.tacos.UserRoleEnum;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(UserRoleEnum name);

}
