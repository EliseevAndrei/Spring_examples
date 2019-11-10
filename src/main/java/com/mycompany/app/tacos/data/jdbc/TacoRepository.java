package com.mycompany.app.tacos.data.jdbc;

import com.mycompany.app.tacos.Taco;

public interface TacoRepository {

    Taco save(Taco design);

}
