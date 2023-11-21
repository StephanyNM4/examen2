package hn.examen2.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen2.examen2.modelos.TipoVehiculo;
import hn.examen2.examen2.modelos.Vehiculo;
import hn.examen2.examen2.repositorios.TipoVehiculoRepository;
import hn.examen2.examen2.repositorios.VehiculoRepository;
import hn.examen2.examen2.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        if (vehiculo.getTipoVehiculo() != null) {
            int idTipoVehiculo = vehiculo.getTipoVehiculo().getIdTipoVehiculo();
            TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(idTipoVehiculo).get();
            vehiculo.setTipoVehiculo(tipoVehiculo);
        }


        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo buscarVehiculo(int idVehiculo) {
        return this.vehiculoRepository.findById(idVehiculo).get();
    }
    
}
