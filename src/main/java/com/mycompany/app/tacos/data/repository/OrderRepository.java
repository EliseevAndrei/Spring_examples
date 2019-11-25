package com.mycompany.app.tacos.data.repository;

import com.mycompany.app.tacos.Order;
import com.mycompany.app.tacos.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

    // tag::findByUser_paged[]
    List<Order> findByUserOrderByPlacedAtDesc(
            User user);
    // end::findByUser_paged[]

  /*
  // tag::findByUser[]
  List<Order> findByUserOrderByPlacedAtDesc(User user);
  // end::findByUser[]
   */

}
