package todocodeacademy.tpintegrador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import todocodeacademy.tpintegrador.repository.IClienteRepository;

@RestController
public class ClienteController {

    @Autowired
    IClienteRepository clienteRepository;

    @GetMapping("/crear")
    public void crear(){
        clienteRepository.crear();
    }
}
