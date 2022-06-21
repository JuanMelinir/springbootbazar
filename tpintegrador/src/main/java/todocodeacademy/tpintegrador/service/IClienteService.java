package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Cliente;
import todocodeacademy.tpintegrador.model.Producto;

import java.util.List;

public interface IClienteService {
    //alta
    public void createCliente(Cliente cliente);
    //método para traer a todos los clientes
    //lectura
    public List<Cliente> getClientes();

    //baja
    public void deleteCliente(Long id_cliente);

    //lectura de un solo objeto
    public Cliente findCliente(Long id_cliente);

    //edición/modificación
    public void editCliente(Cliente cliente);
}
