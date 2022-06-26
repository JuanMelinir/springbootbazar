package com.todocode.tpbazar.controller;

import com.todocode.tpbazar.model.Cliente;
import com.todocode.tpbazar.service.IClienteService;
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
        return "Cliente creado correctamente";

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
    public String deleteCliente (@PathVariable Long id_cliente) {
        clienteService.deleteCliente(id_cliente);
        return "Cliente eliminado correctamente";
    }

    @PutMapping ("/clientes/editar/{id_cliente}")
    public Cliente editCliente (@PathVariable Long id_cliente,
    @RequestParam(required=false,name="nombre") String nuevoNombre,
    @RequestParam(required=false,name="apellido") String nuevoApellido,
    @RequestParam(required=false,name="dni") String nuevoDNI) {
        clienteService.editCliente(id_cliente,nuevoNombre,nuevoApellido,nuevoDNI);
        Cliente cliente=clienteService.findCliente(id_cliente);
        return cliente;
    }

}
