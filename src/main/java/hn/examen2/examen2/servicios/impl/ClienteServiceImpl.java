package hn.examen2.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen2.examen2.modelos.Cliente;
import hn.examen2.examen2.repositorios.ClienteRepository;
import hn.examen2.examen2.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerCliente(int idCliente) {
        return this.clienteRepository.findById(idCliente).get();    
    }
}
