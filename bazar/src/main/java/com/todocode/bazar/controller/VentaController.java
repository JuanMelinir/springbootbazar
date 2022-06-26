package com.todocode.bazar.controller;

import com.todocode.bazar.model.Venta;
import com.todocode.bazar.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private IVentaService ventaService;

    @PostMapping("/ventas/crear")
    public String createVenta(@RequestBody Venta venta) {
        ventaService.createVenta(venta);

        return "Curso creado correctamente";

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
/*
    @PutMapping ("/ventas/editar/{id_venta}")
    public void editVenta (@PathVariable Long id_venta) {
        ventaService.createVenta(id_venta);

    }
*/

}
