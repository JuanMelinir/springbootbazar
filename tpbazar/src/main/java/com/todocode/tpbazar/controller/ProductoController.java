package com.todocode.tpbazar.controller;

import com.todocode.tpbazar.model.Cliente;
import com.todocode.tpbazar.model.Producto;
import com.todocode.tpbazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @PostMapping("/productos/crear")
    public String crearProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);

        return "Producto creado correctamente";

    }

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productoService.getProductos();
    }

    @GetMapping ("/productos/{id_producto}")
    public Producto findCliente(@PathVariable Long id_producto) {
        return productoService.findProducto(id_producto);

    }

    @DeleteMapping ("/productos/eliminar/{id_producto}")
    public void deleteProducto (@PathVariable Long id_producto) {
        productoService.deleteProducto(id_producto);

    }

    @PutMapping("/productos/editar/{id_producto}")
    public Producto editProducto (@PathVariable Long id_producto,
    @RequestParam(required=false,name="nombre") String nuevoNombre,
    @RequestParam(required=false,name="marca") String nuevaMarca,
    @RequestParam(required=false,name="costo") double nuevoCosto,
                              @RequestParam(required=false,name="cantidad") double nuevaCantidad){
        productoService.editProducto(id_producto,nuevoNombre,nuevaMarca,nuevoCosto,nuevaCantidad);
        Producto producto=productoService.findProducto(id_producto);
        return producto;

    }
}
