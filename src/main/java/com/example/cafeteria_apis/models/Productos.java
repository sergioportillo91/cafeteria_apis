package com.example.cafeteria_apis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "producto")
public class Productos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String referencia;
    @Column(nullable = false)
    private int precio;
    @Column(nullable = false)
    private int peso;
    @Column(nullable = false)
    private int stock;
    @Column(nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="categoriaId")
    @JsonIgnoreProperties("productos")
    private Categorias categoria;



}
