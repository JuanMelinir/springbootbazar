package com.todocode.bazar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

public Cliente(String nobre,String apellido,String dni){
    this.nombre=nombre;
    this.apellido=apellido;
    this.dni=dni;
}
}
