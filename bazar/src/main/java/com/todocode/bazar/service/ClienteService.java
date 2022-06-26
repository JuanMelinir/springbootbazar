package com.todocode.bazar.service;

import com.todocode.bazar.model.Cliente;
import com.todocode.bazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;
    @Override
    public void createCliente(Cliente cliente) {
       clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void deleteCliente(Long id_cliente) {
        clienteRepository.deleteById(id_cliente);
    }

    @Override
    public Cliente findCliente(Long id_cliente) {
        return clienteRepository.findById(id_cliente).orElse(null);
    }

    @Override
    public void editCliente(Cliente cliente) {
        this.createCliente(cliente);
    }
}
