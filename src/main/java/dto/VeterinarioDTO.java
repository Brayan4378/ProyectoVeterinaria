/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author BrayanOcampo
 */
<<<<<<< HEAD
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
=======
public class VeterinarioDTO {
    
    private String nombre;
    private String especialidad;

    public VeterinarioDTO(String nombre, String especialidad) {
        /*this.nombre = nombre;
        this.especialidad = especialidad;*/
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
<<<<<<< HEAD
=======
    
    /*@Override
    public String toString(){
        return nombre + " - " + especialidad;
    }*/
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
}
