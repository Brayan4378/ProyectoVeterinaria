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

public class Vacuna extends AtencionClinica implements Serializable{

    private static final long serialVersionUID = 1L;
    private String tipoVacuna;
    private String dosis;

    public Vacuna(String codigo, LocalDate fecha, String idMascota, String dosis, String nombreVeterinario, String tipoVacuna) {
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
    
    
    
    @Override
    public String toLineaArchivo() {
        return "vacuna;" + codigo + "," + fecha + "," + idMascota + "," + dosis + "," + nombreVeterinario + "," + tipoVacuna;
    }
    
    public static Vacuna desdeLineaArchivo(String datos) {
        String[] partes = datos.split(",");
    if (partes.length == 6) {
        return new Vacuna(
            partes[0],                       // código
            LocalDate.parse(partes[1]),     // fecha
            partes[2],                       // idMascota
            partes[3],                       // dosis
            partes[4],                       // nombreVeterinario
            partes[5]                        // tipoVacuna
        );
    }
    return null;
    }

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

