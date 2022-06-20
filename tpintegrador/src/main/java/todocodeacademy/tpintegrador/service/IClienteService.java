package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Cliente;
import todocodeacademy.tpintegrador.model.Producto;

import java.util.List;

public interface IClienteService {
    public void crearCliente();
    public List<Cliente> traerClientes();
}
