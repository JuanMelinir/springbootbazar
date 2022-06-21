package todocodeacademy.tpintegrador.service;

import todocodeacademy.tpintegrador.model.Cliente;
import todocodeacademy.tpintegrador.model.Producto;
import todocodeacademy.tpintegrador.model.Venta;

import java.util.List;

public interface IVentaService {
    //alta
    public void createVenta(Venta venta);
    //método para traer a todos las ventas
    //lectura
    public List<Venta> getVentas();

    //baja
    public void deleteVenta(Long id_venta);

    //lectura de un solo objeto
    public Venta findVenta(Long id_venta);

    //edición/modificación
    public void editVenta(Venta venta);
}
