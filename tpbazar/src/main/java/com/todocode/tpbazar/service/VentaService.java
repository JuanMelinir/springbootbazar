package com.todocode.tpbazar.service;

import com.todocode.tpbazar.model.Cliente;
import com.todocode.tpbazar.model.Producto;
import com.todocode.tpbazar.model.Venta;
import com.todocode.tpbazar.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository ventaRepository;
    @Override
    public void createVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public void deleteVenta(Long id_venta) {
        ventaRepository.deleteById(id_venta);
    }

    @Override
    public Venta findVenta(Long id_venta) {
        return ventaRepository.findById(id_venta).orElse(null);
    }

    @Override
    public void editVenta(Long id_venta, LocalDate nuevaFecha, double nuevoTotal, List<Producto> nuevaListaProductos, Cliente nuevoCliente) {
        Venta venta=this.findVenta(id_venta);
        venta.setFecha_venta(nuevaFecha);
        venta.setTotal(nuevoTotal);
        venta.setListaProductos(nuevaListaProductos);
        venta.setUnCliente(nuevoCliente);
        this.createVenta(venta);
    }
}
