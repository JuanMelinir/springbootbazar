package todocodeacademy.tpintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todocodeacademy.tpintegrador.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente,Long> {
    public void crearCliente();
}
