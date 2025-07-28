/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author BrayanOcampo
 */
<<<<<<< HEAD
public class Veterinario extends Persona {
    
    //Atributos protegidos de la clase veterinario
=======
public class Veterinario  {
    
    //Atributos protegidos de la clase veterinario
    private String nombre;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    private String especialidad;

    //Constructor de la clase veterinario, recibe nombre y especialidad, inicializa el objeto para despues asignarle valores
    public Veterinario(String nombre, String especialidad) {
        /*this.nombre = nombre;
        this.especialidad = especialidad;*/
<<<<<<< HEAD
        super(nombre);
        setEspecialidad(especialidad);
    }

    @Override
=======
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
    
   
}
