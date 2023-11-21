package hn.examen2.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import hn.examen2.examen2.modelos.TipoCliente;
import hn.examen2.examen2.repositorios.TipoClienteRepository;
import hn.examen2.examen2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(tipoCliente);
    }
    
}
