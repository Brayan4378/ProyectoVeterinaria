/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
<<<<<<< HEAD
=======
import java.io.*;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875

/**
 *
 * @author BrayanOcampo
 */

<<<<<<< HEAD
public class Consulta {

    //Atributos privados de la clase Consulta
    private String codigo;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String idMascota;
    private String documentoProCons;
    private String nombreMascCons;
=======
public class Consulta extends AtencionClinica implements Serializable {
    
    private static final long serialVersionUID = 1L;
    //Atributos privados de la clase Consulta
    private String diagnostico;
    private String tratamiento;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    //Constructor que recibe código y fecha en texto
    /*public Consulta(String codigo, String fecha) {
        //this.codigo = codigo;
        //this.fecha = fecha;
        setCodigo(codigo);
        setFecha(fecha);
    }*/

<<<<<<< HEAD
    public Consulta(String codigo, LocalDate fecha, String diagnostico, String tratamiento, String documentoProCons, String nombreMascCons) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.documentoProCons = documentoProCons;
        this.nombreMascCons = nombreMascCons;
=======
    public Consulta(String diagnostico, String tratamiento, String codigo, LocalDate fecha, String idMascota, String nombreVeterinario) {
        super(codigo, fecha, idMascota, nombreVeterinario);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

        @Override
    public String getResumen() {
        return "Consulta: Diagnóstico = " + diagnostico + ", Tratamiento = " + tratamiento;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    }

    public String getDiagnostico() {
        return diagnostico;
    }
<<<<<<< HEAD
=======
    
    @Override
    public String toLineaArchivo() {
        return "consulta;" + getCodigo() + "," + getFecha() + "," + getIdMascota() + "," + getNombreVeterinario() + "," + diagnostico + "," + tratamiento;
    }


public static Consulta desdeLineaArchivo(String datos) {
    String[] partes = datos.split(",");
    if (partes.length == 6) {
        return new Consulta(
            partes[0],
            partes[1],
            partes[2],
            LocalDate.parse(partes[3]),
            partes[4],
            partes[5]
        );
    } 
    return null;
}

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

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String getIdMascota() {
        return idMascota;
    }

    @Override
    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    @Override
    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }
 /*   public String getDiagnostico() {
        return diagnostico;
    }
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875

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
<<<<<<< HEAD
    public String getCodigo() {
=======
   /* public String getCodigo() {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
        return codigo;
    }

    //Getter para la fecha
    public LocalDate getFecha() {
        return fecha;
    }

    //Setter con validación para el código
<<<<<<< HEAD
    public void setCodigo(String codigo) {
=======
    /*public void setCodigo(String codigo) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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
<<<<<<< HEAD
    }  
    
=======
    }*/
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
}