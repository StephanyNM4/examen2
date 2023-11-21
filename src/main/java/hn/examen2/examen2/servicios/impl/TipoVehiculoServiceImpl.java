package hn.examen2.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.examen2.examen2.modelos.TipoVehiculo;
import hn.examen2.examen2.repositorios.TipoVehiculoRepository;
import hn.examen2.examen2.servicios.TipoVehiculoService;

public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }


    
}
