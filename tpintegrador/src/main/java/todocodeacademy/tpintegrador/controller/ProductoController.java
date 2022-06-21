package todocodeacademy.tpintegrador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todocodeacademy.tpintegrador.model.Producto;
import todocodeacademy.tpintegrador.service.IClienteService;
import todocodeacademy.tpintegrador.service.IProductoService;

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

    @GetMapping ("/productos/eliminar/{id_producto}")
    public void deleteProducto (@PathVariable Long id_producto) {
        productoService.deleteProducto(id_producto);

    }
/*
    @PutMapping("/productos/editar/{id_producto}")
    public void editPRoducto (@PathVariable Long id_producto) {
        productoService.createProducto(id_producto);

    }*/
}
