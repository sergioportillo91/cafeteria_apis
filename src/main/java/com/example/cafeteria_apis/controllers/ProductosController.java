package com.example.cafeteria_apis.controllers;

import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.services.ServiceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ProductosController {

    @Autowired
    private ServiceProductos serviceProductos;

    @GetMapping("/all")
    public List<Productos> getAll(){
        return serviceProductos.listar();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Productos> buscarId(@PathVariable("id") Integer id){
        return serviceProductos.getId(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Productos registrar(@RequestBody Productos p){
        return  serviceProductos.registrar(p);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Productos update(@RequestBody Productos p){
        return serviceProductos.update(p);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id){
        return serviceProductos.delete(id);
    }

}
