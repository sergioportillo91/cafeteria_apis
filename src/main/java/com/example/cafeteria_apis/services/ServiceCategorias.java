package com.example.cafeteria_apis.services;


import com.example.cafeteria_apis.models.Categorias;
import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.repositories.crud.RepositoryCategorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategorias {

    @Autowired
    private RepositoryCategorias repositoryCategorias;

    public List<Categorias> listar(){
        return repositoryCategorias.getAll();
    }

    public Categorias registrar(Categorias c) {
        if (c.getId_categoria() != null) {
            return c;
        } else {
            return repositoryCategorias.save(c);
        }
    }
}
