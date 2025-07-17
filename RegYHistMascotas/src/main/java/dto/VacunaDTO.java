/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;

/**
 *
 * @author BrayanOcampo
 */
public class VacunaDTO {
    
     private String tipo;
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
}
