package com.example.cafeteria_apis.controllers;

import com.example.cafeteria_apis.models.Categorias;
import com.example.cafeteria_apis.models.Productos;
import com.example.cafeteria_apis.services.ServiceCategorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoriasController {

    @Autowired
    private ServiceCategorias serviceCategorias;

    @GetMapping("/all")
    public List<Categorias> getAll(){
        return serviceCategorias.listar();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorias registrar(@RequestBody Categorias c){
        return  serviceCategorias.registrar(c);
    }
}
