/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author BrayanOcampo
 */

public class Consulta {

    //Atributos privados de la clase Consulta
    private String codigo;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String documentoProCons;
    private String nombreMascCons;
    //Constructor que recibe código y fecha en texto
    /*public Consulta(String codigo, String fecha) {
        //this.codigo = codigo;
        //this.fecha = fecha;
        setCodigo(codigo);
        setFecha(fecha);
    }*/

    public Consulta(String codigo, LocalDate fecha, String diagnostico, String tratamiento, String documentoProCons, String nombreMascCons) {
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

    //Muestra los detalles de la consulta y el veterinario que atendió
   /* public void MostrarDetallesConsulta(Veterinario vet) {
        System.out.println("------------ Datos de Consulta -------------");
        System.out.println("Código: " + this.codigo);
        System.out.println("Fecha: " + this.fecha);
        if(vet != null){
            System.out.println("|Veterinario encargado|: " + vet.getNombre() + " | Especialidad |: " + vet.getEspecialidad());
        }else{
            throw new IllegalArgumentException("Debe de haber un veterinario");
        }
    }*/

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
}