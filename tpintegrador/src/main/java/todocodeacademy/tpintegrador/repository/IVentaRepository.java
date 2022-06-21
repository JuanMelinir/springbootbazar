package todocodeacademy.tpintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todocodeacademy.tpintegrador.model.Venta;

public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
