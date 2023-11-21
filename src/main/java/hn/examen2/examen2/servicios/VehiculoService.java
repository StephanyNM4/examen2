package hn.examen2.examen2.servicios;

import java.util.List;

import hn.examen2.examen2.modelos.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo guardarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerVehiculos();

    public Vehiculo buscarVehiculo(int idVehiculo);

}
