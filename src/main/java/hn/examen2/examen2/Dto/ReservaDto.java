package hn.examen2.examen2.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDto {
    
    private String codigoCliente;
    private String idVehiculo;
    private String cantidadDias;

}
