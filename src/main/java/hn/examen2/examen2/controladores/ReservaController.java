package hn.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.Dto.ReservaDto;
import hn.examen2.examen2.repositorios.VehiculoRepository;
import hn.examen2.examen2.servicios.impl.ReservaServiceImpl;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PostMapping("/crearReserva")
    public String crearReserva(ReservaDto reservaDto) {
        return this.reservaServiceImpl.crearReserva(reservaDto);
    }
}
