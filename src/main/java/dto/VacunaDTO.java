/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;
import java.io.*;
/**
 *
 * @author BrayanOcampo
 */
public class VacunaDTO extends AtencionClinicaDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String tipoVacuna;
    private String dosis;

    public VacunaDTO(String codigo, LocalDate fecha, String idMascota, String dosis, String nombreVeterinario, String tipoVacuna) {
        super(codigo, fecha, idMascota, nombreVeterinario);
        this.tipoVacuna = tipoVacuna;
        this.dosis = dosis;
    }
    

    @Override
    public String getResumen() {
        return "Vacuna: " + tipoVacuna;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    
    
    /*@Override
    public String toLineaArchivo() {
        return "vacuna;" + codigo + "," + fecha + "," + idMascota + "," + dosis + "," + nombreVeterinario + "," + tipoVacuna;
    }
    
    public static VacunaDTO desdeLineaArchivo(String datos) {
        String[] partes = datos.split(",");
    if (partes.length == 6) {
        return new VacunaDTO(
            partes[0],                       // código
            LocalDate.parse(partes[1]),     // fecha
            partes[2],                       // idMascota
            partes[3],                       // dosis
            partes[4],                       // nombreVeterinario
            partes[5]                        // tipoVacuna
        );
    }
    return null;
}*/
    
 /*    private String tipo;
    private String codigo;
    private LocalDate fechaAplicacion;
    private LocalDate proximaDosis;



    // Constructor con parámetros
    public VacunaDTO(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        setTipo(tipo);
        setCodigo(codigo);
        setFechaAplicacion(fechaAplicacion);
        setProximaDosis(proximaDosis);
    }

    // Getter y Setter 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) {
            this.tipo = tipo;
        }
    }

    // Getter y Setter para lote
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isBlank()) {
            this.codigo = codigo;
        }
    }

    // Getter y Setter para fechaAplicacion
    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        if (fechaAplicacion != null) {
            this.fechaAplicacion = fechaAplicacion;
        }
    }

    // Getter y Setter para proximaDosis
    public LocalDate getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(LocalDate proximaDosis) {
        if (proximaDosis != null) {
            this.proximaDosis = proximaDosis;
        }
    }
}*/

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

}
