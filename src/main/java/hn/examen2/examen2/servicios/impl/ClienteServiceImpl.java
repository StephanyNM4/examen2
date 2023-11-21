package hn.examen2.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen2.examen2.modelos.Cliente;
import hn.examen2.examen2.modelos.TipoCliente;
import hn.examen2.examen2.repositorios.ClienteRepository;
import hn.examen2.examen2.repositorios.TipoClienteRepository;
import hn.examen2.examen2.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        if(cliente.getTipoCliente() != null){
            int idTipoCliente = cliente.getTipoCliente().getIdTipoCliente();
            TipoCliente tipoCliente = this.tipoClienteRepository.findById(idTipoCliente).get();
            cliente.setTipoCliente(tipoCliente);
        }

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
