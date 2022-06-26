package com.todocode.tpbazar.service;

import com.todocode.tpbazar.model.Cliente;
import com.todocode.tpbazar.model.Producto;
import com.todocode.tpbazar.model.Venta;

import java.time.LocalDate;
import java.util.List;

public interface IVentaService {
    public void createVenta(Venta venta);
    //método para traer a todos las ventas
    //lectura
    public List<Venta> getVentas();

    //baja
    public void deleteVenta(Long id_venta);

    //lectura de un solo objeto
    public Venta findVenta(Long id_venta);

    //edición/modificación
    public void editVenta(Long id_venta, LocalDate nuevaFecha, double nuevoTotal, List<Producto> nuevaListaProductos, Cliente nuevoCliente);
}
