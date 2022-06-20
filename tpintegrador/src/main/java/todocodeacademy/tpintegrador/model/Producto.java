package todocodeacademy.tpintegrador.model;

import lombok.Getter;
import lombok.Setter;

public class Producto {
    @Setter
    @Getter

    private Long  codigo_producto;
    private String nombre;
    private String marca;
    private double costo;
    private double cantidad;



}
