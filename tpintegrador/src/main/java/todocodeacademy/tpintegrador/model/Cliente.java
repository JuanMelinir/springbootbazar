package todocodeacademy.tpintegrador.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Cliente {

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
