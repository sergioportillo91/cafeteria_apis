package com.example.cafeteria_apis.repositories.crud;


import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.models.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryVentas {

    @Autowired
    private CrudRepositoryVentas crudRepositoryVentas;

    public List<Ventas> getAll() {
        return (List<Ventas>) crudRepositoryVentas.findAll();
    }
    public Ventas save(Ventas p){
        return crudRepositoryVentas.save(p);
    }


}
