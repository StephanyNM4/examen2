package hn.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.modelos.TipoCliente;
import hn.examen2.examen2.modelos.TipoVehiculo;
import hn.examen2.examen2.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipoVehiculo")
public class TipoVehiculoController {

    // @Autowired
    // private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    // @PostMapping("/guardar")
    // public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
    //     return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    // }
}
