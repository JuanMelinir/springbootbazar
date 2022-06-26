package com.todocode.tpbazar.service;

import com.todocode.tpbazar.model.Producto;
import com.todocode.tpbazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void editProducto(Long id_producto,String nuevoNombre,String nuevaMarca,double nuevoCosto,double nuevaCantidad) {
        Producto producto=this.findProducto(id_producto);
        producto.setNombre(nuevoNombre);
        producto.setMarca(nuevaMarca);
        producto.setCosto(nuevoCosto);
        producto.setCantidad(nuevaCantidad);
        this.createProducto(producto);
    }
}
