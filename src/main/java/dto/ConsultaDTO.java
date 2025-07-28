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

//public class ConsultaDTO {
public class ConsultaDTO extends AtencionClinicaDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String diagnostico;
    private String tratamiento;

    public ConsultaDTO(String codigo, LocalDate fecha, String idMascota, String nombreVeterinario, String diagnostico, String tratamiento) {
        super(codigo, fecha, idMascota, nombreVeterinario);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    @Override
    public String getResumen() {
        return "Consulta: Diagnóstico = " + diagnostico + ", Tratamiento = " + tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    
   /* @Override
    public String toLineaArchivo() {
        return "consulta;" + getCodigo() + "," + getFecha() + "," + getIdMascota() + "," + getNombreVeterinario() + "," + diagnostico + "," + tratamiento;
    }


public static ConsultaDTO desdeLineaArchivo(String datos) {
    String[] partes = datos.split(",");
    if (partes.length == 6) {
        return new ConsultaDTO(
            partes[0],
            LocalDate.parse(partes[1]),
            partes[2],
            partes[3],
            partes[4],
            partes[5]
        );
    } 
    return null;
}*/

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        if (tratamiento == null || tratamiento.isBlank()){
            throw new IllegalArgumentException("Este campo no puede estar vacio");
        }
        this.tratamiento = tratamiento;
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.isBlank()){
            throw new IllegalArgumentException("Este campo no puede estar vacio");
        }
        this.diagnostico = diagnostico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }
}
    

    //Atributos privados de la clase Consulta
    /*private String codigo;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String idMascota;
    private String documentoProCons;
    private String nombreMascCons;
    //Constructor que recibe código y fecha en texto
    /*public Consulta(String codigo, String fecha) {
        //this.codigo = codigo;
        //this.fecha = fecha;
        setCodigo(codigo);
        setFecha(fecha);
    }*/

   /* public ConsultaDTO(String codigo, LocalDate fecha, String diagnostico, String tratamiento, String documentoProCons, String nombreMascCons) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.documentoProCons = documentoProCons;
        this.nombreMascCons = nombreMascCons;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        if(diagnostico == null || diagnostico.isBlank()){
            throw new IllegalArgumentException("Debe de haber un diagnostico, este no puede estar vacio");
        }
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        if(tratamiento == null || tratamiento.isBlank()){
            throw new IllegalArgumentException("Debe de estar asignado un tratamiento");
        }
        this.tratamiento = tratamiento;
    }

    public String getDocumentoProCons() {
        return documentoProCons;
    }

    public void setDocumentoProCons(String documentoProCons) {
        this.documentoProCons = documentoProCons;
    }

    public String getNombreMascCons() {
        return nombreMascCons;
    }

    public void setNombreMascCons(String nombreMascCons) {
        this.nombreMascCons = nombreMascCons;
    }

    //Getter para el código
    public String getCodigo() {
        return codigo;
    }

    //Getter para la fecha
    public LocalDate getFecha() {
        return fecha;
    }

    //Setter con validación para el código
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    //Setter que convierte y valida el formato de la fecha
    public void setFecha(LocalDate fechaTexto) {
      if (fecha == null) {
        throw new IllegalArgumentException("La fecha no puede ser nula.");
    }
    this.fecha = fecha;  
    }

    public String getIdMascota() {
        return idMascota;
    } */   

