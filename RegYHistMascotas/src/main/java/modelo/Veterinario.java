/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author BrayanOcampo
 */
public class Veterinario extends Persona {
    
    //Atributos protegidos de la clase veterinario
    private String nombre;
    private String especialidad;

    //Constructor de la clase veterinario, recibe nombre y especialidad, inicializa el objeto para despues asignarle valores
    public Veterinario(String nombre, String especialidad) {
        /*this.nombre = nombre;
        this.especialidad = especialidad;*/
        super(nombre);
        setEspecialidad(especialidad);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
   
}
