package com.example.cafeteria_apis.services;


import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.repositories.crud.RepositoryProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceProductos {

    @Autowired
    private RepositoryProducto repositoryProducto;

    public List<Productos> listar(){
        return repositoryProducto.getAll();
    }

    public Optional<Productos> getId(Integer id){
        return repositoryProducto.getId(id);

    }

    public Productos registrar(Productos p) {
        if (p.getId() != null) {
            return p;
        } else {
            return repositoryProducto.save(p);
        }
    }

    public boolean delete(Integer id){
        Optional<Productos> c=getId(id);
        if(c!=null){
            repositoryProducto.delete(c.get());
            return true;
        }
        return false;

    }

    public Productos update(Productos p){
        if(p.getId()!=null){
            Optional<Productos> g= repositoryProducto.getId(p.getId());
            if(g !=null){
                if(p.getNombre()!=null){
                    g.get().setNombre(p.getNombre());
                }if(p.getPeso()!=0){
                    g.get().setPeso(p.getPeso());
                }if(p.getPrecio()!=0){
                    g.get().setPrecio(p.getPrecio());
                }if(p.getReferencia()!=null){
                    g.get().setReferencia(p.getReferencia());
                }
                if(p.getStock()>=0){
                    g.get().setStock(p.getStock());
                }
                if(p.getCategoria()!=null){
                    g.get().setCategoria(p.getCategoria());
                }
                if(p.getFecha()!=null){
                    g.get().setFecha(p.getFecha());
                }
                return repositoryProducto.save(g.get());
            }
        }
        return p;
    }

}
