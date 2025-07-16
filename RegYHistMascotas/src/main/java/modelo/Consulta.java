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

    //Constructor que recibe código y fecha en texto
    public Consulta(String codigo, String fecha) {
        //this.codigo = codigo;
        //this.fecha = fecha;
        setCodigo(codigo);
        setFecha(fecha);
    }
    
    //Muestra los detalles de la consulta y el veterinario que atendió
    public void MostrarDetallesConsulta(Veterinario vet) {
        System.out.println("------------ Datos de Consulta -------------");
        System.out.println("Código: " + this.codigo);
        System.out.println("Fecha: " + this.fecha);
        if(vet != null){
            System.out.println("|Veterinario encargado|: " + vet.getNombre() + " | Especialidad |: " + vet.getEspecialidad());
        }else{
            throw new IllegalArgumentException("Debe de haber un veterinario");
        }
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
    public void setFecha(String fechaTexto) {
        try {
            this.fecha = LocalDate.parse(fechaTexto); // Formato YYYY-MM-DD
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido.");
        }
    }
}