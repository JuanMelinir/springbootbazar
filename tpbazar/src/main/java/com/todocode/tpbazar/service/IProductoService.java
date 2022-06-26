package com.todocode.tpbazar.service;

import com.todocode.tpbazar.model.Producto;

import java.util.List;

public interface IProductoService {

    public void createProducto(Producto producto);
    //método para traer a todos los productos
    //lectura
    public List<Producto> getProductos();

    //baja
    public void deleteProducto(Long id_producto);

    //lectura de un solo objeto
    public Producto findProducto(Long id_producto);

    //edición/modificación
    public void editProducto(Long id_producto,String nuevoNombre,String nuevaMarca,double nuevoCosto,double nuevaCantidad);
}
