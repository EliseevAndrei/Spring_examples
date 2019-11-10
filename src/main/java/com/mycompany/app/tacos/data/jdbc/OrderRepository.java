package com.mycompany.app.tacos.data.jdbc;

import com.mycompany.app.tacos.Order;

public interface OrderRepository {

    Order save(Order order);

}
