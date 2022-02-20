package com.example.cafeteria_apis.repositories.crud;

import com.example.cafeteria_apis.models.Productos;
import org.springframework.data.repository.CrudRepository;

public interface CrudRepositoryProductos  extends CrudRepository<Productos,Integer> {
}
