package hn.examen2.examen2.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }
}
