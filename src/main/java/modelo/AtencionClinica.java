/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.io.*;

/**
 *
 * @author BrayanOcampo
 */
public abstract class AtencionClinica implements Serializable {
    
    private static final long serialVersionUID = 1L;
    protected String codigo;
    protected LocalDate fecha;
    protected String idMascota;
    protected String nombreVeterinario;

    public AtencionClinica(String codigo, LocalDate fecha, String idMascota, String nombreVeterinario) {
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
    
    public static AtencionClinica desdeLineaArchivo(String datos) {
        String[] partes = datos.split(",");
        if (partes.length >= 1) {
            if (partes[0].equals("CONSULTA") && partes.length == 7) {
                return new Consulta(
                    partes[1],
                    partes[2],
                    partes[3],
                    LocalDate.parse(partes[4]),
                    partes[5],
                    partes[6]
                );
            } else if (partes[0].equals("VACUNA") && partes.length == 6) {
                return new Vacuna(partes[0],
                     LocalDate.parse(partes[1]),
                     partes[2],
                     partes[3],
                     partes[4],
                     partes[5]);
            }
        }
        return null;
    }
    
    public abstract String toLineaArchivo();

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

