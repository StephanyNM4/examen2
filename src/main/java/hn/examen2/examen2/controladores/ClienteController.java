package hn.examen2.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.examen2.examen2.modelos.Cliente;
import hn.examen2.examen2.servicios.ClienteService;
import hn.examen2.examen2.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtenerTodos")
    public List<Cliente> obtenerTodos() {
        return this.clienteServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtener")
    public Cliente obtenerCliente(@RequestParam(name = "idCliente") int idCliente) {
        return this.clienteServiceImpl.obtenerCliente(idCliente);
    }
}
