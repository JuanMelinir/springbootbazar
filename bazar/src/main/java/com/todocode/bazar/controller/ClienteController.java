package com.todocode.bazar.controller;

import com.todocode.bazar.model.Cliente;
import com.todocode.bazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/clientes/crear")
    public String crearCurso(@RequestBody Cliente cliente) {
        clienteService.createCliente(cliente);

        return "Curso creado correctamente";

    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clienteService.getClientes();
    }

    @GetMapping ("/clientes/{id_cliente}")
    public Cliente findCliente(@PathVariable Long id_cliente) {
        return clienteService.findCliente(id_cliente);

    }

    @DeleteMapping ("/clientes/eliminar/{id_cliente}")
    public void deleteCliente (@PathVariable Long id_cliente) {
        clienteService.deleteCliente(id_cliente);

    }
/*
    @PutMapping ("/clientes/editar/{id_cliente}")
    public void editCliente (@PathVariable Long id_cliente) {
        clienteService.createCliente(id_cliente);

    }
*/
}
