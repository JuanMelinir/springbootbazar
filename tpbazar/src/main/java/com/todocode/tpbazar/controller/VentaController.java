package com.todocode.tpbazar.controller;

import com.todocode.tpbazar.model.Cliente;
import com.todocode.tpbazar.model.Producto;
import com.todocode.tpbazar.model.Venta;
import com.todocode.tpbazar.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private IVentaService ventaService;

    @PostMapping("/ventas/crear")
    public String createVenta(@RequestBody Venta venta) {
        ventaService.createVenta(venta);

        return "Venta creada correctamente";

    }

    @GetMapping("/ventas")
    public List<Venta> getVentas() {
        return ventaService.getVentas();
    }

    @GetMapping ("/ventas/{id_venta}")
    public Venta findVenta(@PathVariable Long id_venta) {
        return ventaService.findVenta(id_venta);

    }

    @DeleteMapping ("/ventas/eliminar/{id_venta}")
    public void deleteVenta (@PathVariable Long id_venta) {
        ventaService.deleteVenta(id_venta);

    }
    @GetMapping ("/ventas/editar/{id_venta}")
    public Venta editVenta(@PathVariable Long id_venta,
                           @RequestParam(required=false,name="fecha_venta") LocalDate nuevaFecha,
                           @RequestParam(required=false,name="total") double nuevoTotal,
                           @RequestParam(required=false,name="listaProductos") List<Producto> nuevaListaProductos,
                           @RequestParam(required=false,name="unCliente") Cliente nuevoCliente){
        ventaService.editVenta(id_venta,nuevaFecha,nuevoTotal,nuevaListaProductos,nuevoCliente);
        Venta venta=ventaService.findVenta(id_venta);
        return venta;

    }
}
