package hn.examen2.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.modelos.Vehiculo;
import hn.examen2.examen2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PostMapping("/guardar")
    public Vehiculo guardarVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.guardarVehiculo(vehiculo);
    }

    @GetMapping("/obtenerTodos")
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/obtener")
    public Vehiculo buscarVehiculo(@RequestParam(name = "idVehiculo") int idVehiculo) {
        return this.vehiculoServiceImpl.buscarVehiculo(idVehiculo);
    }
}
