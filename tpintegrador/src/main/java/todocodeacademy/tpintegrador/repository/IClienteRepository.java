package todocodeacademy.tpintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todocodeacademy.tpintegrador.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente,Long> {

}