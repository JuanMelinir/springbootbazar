package com.todocode.tpbazar.service;

import com.todocode.tpbazar.model.Cliente;

import java.util.List;

public interface IClienteService {

    public void createCliente(Cliente cliente);
    //método para traer a todos los clientes
    //lectura
    public List<Cliente> getClientes();

    //baja
    public void deleteCliente(Long id_cliente);

    //lectura de un solo objeto
    public Cliente findCliente(Long id_cliente);

    //edición/modificación
    public void editCliente(Long id_cliente,String nuevoNombre,String nuevoApellido,String nuevoDNI);
}
