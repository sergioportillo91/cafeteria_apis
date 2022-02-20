package com.example.cafeteria_apis.models;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "venta")
public class Ventas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int id_producto;

    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false)
    private int total;

}
