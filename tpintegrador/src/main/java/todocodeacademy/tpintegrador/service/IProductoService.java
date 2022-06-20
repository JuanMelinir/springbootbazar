package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Producto;

import java.util.List;

public interface IProductoService {
    public void crearProducto();
    public List<Producto> traerProductos();
}
