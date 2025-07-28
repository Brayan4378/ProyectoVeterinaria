/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author BrayanOcampo
 */
public abstract class AtencionClinicaDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    protected String codigo;
    protected LocalDate fecha;
    protected String idMascota;
    protected String nombreVeterinario;

    public AtencionClinicaDTO(String codigo, LocalDate fecha, String idMascota, String nombreVeterinario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idMascota = idMascota;
        this.nombreVeterinario = nombreVeterinario;
    }

    public abstract String getResumen();

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
    
   /* public static AtencionClinicaDTO desdeLineaArchivo(String datos) {
        String[] partes = datos.split(",");
        if (partes.length >= 1) {
            if (partes[0].equals("CONSULTA") && partes.length == 7) {
                return new ConsultaDTO(
                    partes[1],
                    LocalDate.parse(partes[2]),
                    partes[3],
                    partes[4],
                    partes[5],
                    partes[6]
                );
            } else if (partes[0].equals("VACUNA") && partes.length == 6) {
                return new VacunaDTO(partes[0],
                     LocalDate.parse(partes[1]),
                     partes[2],
                     partes[3],
                     partes[4],
                     partes[5]);
            }
        }
        return null;
    }
    
    public abstract String toLineaArchivo();*/

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo = codigo;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha == null){
            throw new IllegalArgumentException("La fecha no puede estar vacia");
        }
        this.fecha = fecha;
    }

    public void setIdMascota(String idMascota) {
        if (idMascota == null || idMascota.isBlank()){
            throw new IllegalArgumentException("El id de la mascota no puede estar vacio");
        }
        this.idMascota = idMascota;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        if (nombreVeterinario == null || nombreVeterinario.isBlank()){
            throw new IllegalArgumentException("El nombre del veterinario no puede estar vacio");
        }
        this.nombreVeterinario = nombreVeterinario;
    }
}