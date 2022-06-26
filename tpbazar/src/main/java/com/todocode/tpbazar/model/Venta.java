package com.todocode.tpbazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private double total;
    @OneToMany
    private List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name="idCliente",referencedColumnName = "id_cliente")
    private Cliente unCliente;

    public Venta(){

    }
    public Venta(LocalDate fecha,double total){
        this.fecha_venta=fecha;
        this.total=total;
    }
}
