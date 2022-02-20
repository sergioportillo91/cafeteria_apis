package com.example.cafeteria_apis.repositories.crud;

import com.example.cafeteria_apis.models.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryProducto {

    @Autowired
    private CrudRepositoryProductos crudRepositoryProductos;

    public List<Productos> getAll() {
        return (List<Productos>) crudRepositoryProductos.findAll();
    }
    public Productos save(Productos p){
        return crudRepositoryProductos.save(p);
    }

    public Optional<Productos> getId(Integer id) {
        return crudRepositoryProductos.findById(id);
    }

    public void Update(Productos P){
        crudRepositoryProductos.save(P);
    }

    public void delete(Productos p){
        crudRepositoryProductos.delete(p);
    }



}
