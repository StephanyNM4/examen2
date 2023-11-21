package hn.examen2.examen2.servicios;

import java.util.List;

import hn.examen2.examen2.modelos.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodos();

    public Cliente obtenerCliente(int idCliente);
}
