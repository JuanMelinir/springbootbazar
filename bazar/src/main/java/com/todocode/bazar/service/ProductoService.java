package com.todocode.bazar.service;

import com.todocode.bazar.model.Producto;
import com.todocode.bazar.repository.IProductoRepository;
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
    public void editProducto(Producto producto) {
        this.createProducto(producto);
    }
}
