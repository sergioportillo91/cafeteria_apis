package com.example.cafeteria_apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "categoria")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private String nombre;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    private List<Productos> productos;

}
