package hn.examen2.examen2.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocliente")
    private int codigoCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente tipoCliente;
}
