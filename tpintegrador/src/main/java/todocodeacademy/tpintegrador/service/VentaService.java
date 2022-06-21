package todocodeacademy.tpintegrador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todocodeacademy.tpintegrador.model.Venta;
import todocodeacademy.tpintegrador.repository.IClienteRepository;
import todocodeacademy.tpintegrador.repository.IVentaRepository;

import java.util.List;

@Service
public class VentaService implements IVentaService{
    @Autowired
    private IVentaRepository ventaRepository;
    @Override
    public void createVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public void deleteVenta(Long id_venta) {
        ventaRepository.deleteById(id_venta);
    }

    @Override
    public Venta findVenta(Long id_venta) {
        return ventaRepository.findById(id_venta).orElse(null);
    }

    @Override
    public void editVenta(Venta venta) {
        this.createVenta(venta);
    }
}
