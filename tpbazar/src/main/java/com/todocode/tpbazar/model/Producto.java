package com.todocode.tpbazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long  codigo_producto;
    private String nombre;
    private String marca;
    private double costo;
    private double cantidad;
    public Producto(){

    }
    public Producto(String nombre,String marca,double costo,double cantidad){
        this.nombre=nombre;
        this.marca=marca;
        this.costo=costo;
        this.cantidad=cantidad;
    }
}
