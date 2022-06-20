package todocodeacademy.tpintegrador.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

public class Venta {
    @Getter
    @Setter
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private Double total;
    @OneToMany
    private List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name="idCliente",referencedColumnName = "id_cliente")
    private Cliente unCliente;
}
