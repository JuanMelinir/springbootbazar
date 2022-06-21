package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Cliente;
import todocodeacademy.tpintegrador.model.Producto;

import java.util.List;

public interface IProductoService {

    //alta
    public void createProducto(Producto producto);
    //método para traer a todos los productos
    //lectura
    public List<Producto> getProductos();

    //baja
    public void deleteProducto(Long id_producto);

    //lectura de un solo objeto
    public Producto findProducto(Long id_producto);

    //edición/modificación
    public void editProducto(Producto producto);
}


