package com.example.cafeteria_apis.services;
import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.models.Ventas;
import com.example.cafeteria_apis.repositories.crud.RepositoryVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceVentas {

    @Autowired
    private RepositoryVentas repositoryVentas;

    public List<Ventas> listar(){
        return repositoryVentas.getAll();
    }

    public Ventas registrar(Ventas v) {
        if (v.getId() != null) {
            return v;
        } else {
            return repositoryVentas.save(v);
        }
    }
}
