package hn.examen2.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen2.examen2.Dto.ReservaDto;
import hn.examen2.examen2.modelos.Reserva;
import hn.examen2.examen2.modelos.TipoVehiculo;
import hn.examen2.examen2.modelos.Vehiculo;
import hn.examen2.examen2.repositorios.ReservaRepository;
import hn.examen2.examen2.repositorios.VehiculoRepository;
import hn.examen2.examen2.servicios.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public String crearReserva(ReservaDto reservaDto) {
    Vehiculo vehiculo = this.vehiculoRepository.findById(reservaDto.getIdVehiculo()).get();

    if(vehiculo != null){
        if(vehiculo.getDisponible() == false){
            return "Vehiculo rentado";
        }
    }


        return "Creada";
    }
    
}
