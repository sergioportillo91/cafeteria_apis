package com.example.cafeteria_apis.controllers;

import com.example.cafeteria_apis.models.Categorias;
import com.example.cafeteria_apis.models.Ventas;
import com.example.cafeteria_apis.services.ServiceVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class VentasController {

    @Autowired
    private ServiceVentas serviceVentas;

    @GetMapping("/all")
    public List<Ventas> getAll(){
        return serviceVentas.listar();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Ventas registrar(@RequestBody Ventas v){
        return  serviceVentas.registrar(v);
    }
}
