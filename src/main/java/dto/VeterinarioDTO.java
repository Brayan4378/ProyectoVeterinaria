/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author BrayanOcampo
 */
public class VeterinarioDTO extends PersonaDTO {
    
    private String especialidad;

    //Constructor de la clase veterinario, recibe nombre y especialidad, inicializa el objeto para despues asignarle valores
    public VeterinarioDTO(String nombre, String especialidad) {
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
