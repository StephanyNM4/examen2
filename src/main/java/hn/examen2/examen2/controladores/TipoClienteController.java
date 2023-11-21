package hn.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.modelos.TipoCliente;
import hn.examen2.examen2.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {
        
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/guardar")
    public TipoCliente crearTipoCliente(@RequestParam(name = "descripcion") String descripcion) {
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
}
