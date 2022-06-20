package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Producto;
import todocodeacademy.tpintegrador.model.Venta;

import java.util.List;

public interface IVentaService {
    public void crearVenta();
    public List<Venta> traerVentas();
    public List<Producto> traerProductos();
}
