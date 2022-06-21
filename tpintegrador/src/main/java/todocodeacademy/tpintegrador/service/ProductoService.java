package todocodeacademy.tpintegrador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todocodeacademy.tpintegrador.model.Producto;
import todocodeacademy.tpintegrador.repository.IClienteRepository;
import todocodeacademy.tpintegrador.repository.IProductoRepository;

import java.util.List;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoRepository productoRepository;
    @Override
    public void createProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void deleteProducto(Long id_producto) {
        productoRepository.deleteById(id_producto);
    }

    @Override
    public Producto findProducto(Long id_producto) {
        return productoRepository.findById(id_producto).orElse(null);
    }

    @Override
    public void editProducto(Producto producto) {
        this.createProducto(producto);
    }
}
