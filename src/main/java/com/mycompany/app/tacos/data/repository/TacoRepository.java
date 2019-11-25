package com.mycompany.app.tacos.data.repository;

import com.mycompany.app.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
