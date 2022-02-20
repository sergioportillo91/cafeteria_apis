package com.example.cafeteria_apis.repositories.crud;

import com.example.cafeteria_apis.models.Categorias;
import com.example.cafeteria_apis.models.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryCategorias {

    @Autowired
    private  CrudRepositoryCategoria crudRepositoryCategoria;

    public List<Categorias> getAll() {
        return (List<Categorias>) crudRepositoryCategoria.findAll();
    }
    public Categorias save(Categorias c){
        return crudRepositoryCategoria.save(c);
    }
}
