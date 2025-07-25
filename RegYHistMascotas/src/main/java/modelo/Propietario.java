/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class Propietario extends Persona {
    
    //Atributos protegidos de la clase propietario
    private String nombre;
    /*private int documento;
      private int telefono
    */
    private String documento;
    private String telefono;

    //Constructor de la clase Propietario, recibe nombre, documento y teléfono
    public Propietario(String nombre, String documento, String telefono) {
        super(nombre);
        /*this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;*/
        setDocumento(documento);
        setTelefono(telefono);
        
    }
    
    //Lista para guardar las mascotas del propietario
   // private ArrayList<Mascota> mascotas = new ArrayList();
    
    //Método para agregar una mascota a la lista 
   /* public void agregarMascota(Mascota m){
        if(m == null){
            throw new IllegalArgumentException("Debes de ingresar una mascota, esta no puede ser nula");
        }
        mascotas.add(m);
    }
/*
    /*Método para mostrar toda la información del propietario y sus mascotas
    public void mostrarInformacionCompleta(Veterinario vet){
        System.out.println("========== Ficha Clinica ========="); // Encabezado de la ficha
        System.out.println("Propietario: " + nombre + " Documento: " + documento + " Telefono: " + telefono); // Muestra los datos del propietario
    // Recorre todas las mascotas del propietario y muestra su historial
    for(Mascota m : mascotas) { //Recorre todas las mascotas del propietario
        m.mostrarHistorial(vet); // Llama al método mostrarHistorial de cada mascota con la info del vet
    }
}*/
   /* public void mostrarInformacionCompleta(Veterinario vet) {
    System.out.println("========== Ficha Clinica =========");
    System.out.println("Propietario: " + nombre + " Documento: " + documento + " Telefono: " + telefono);
    for (Mascota m : mascotas) {
        m.mostrarHistorial(vet);
    }
}*/
    
    @Override
    public void setNombre(String nombre) {
        //this.nombre = nombre;
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        //this.documento = documento;
        if(documento == null || documento.length() < 5){
            throw new IllegalArgumentException("Documento invalido, revise bien su documento");
        }
        this.documento = documento;
    }

    public void setTelefono(String telefono) {
        //this.telefono = telefono;
        if(telefono == null || telefono.length() < 7){
            throw new IllegalArgumentException("El numero no es valido, por favor verifique su numero telefonico");
        }
        this.telefono = telefono;
    }
    
   /* public ArrayList<Mascota> getMascotas() {
        // return mascotas;
        //copia defensiva
        return new ArrayList<>(mascotas);
    }*/

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
