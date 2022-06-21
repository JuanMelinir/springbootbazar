package todocodeacademy.tpintegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todocodeacademy.tpintegrador.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto,Long> {

}
