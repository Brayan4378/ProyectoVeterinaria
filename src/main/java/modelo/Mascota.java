/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// import java.util.ArrayList;


public class Mascota {

    //Atributos encapsulados
    private String nombre;
    private String especie;
    private int edad;
    private String id;
    //private ArrayList<Consulta> consultas = new ArrayList<>();
    
    // Asociación debil con PropietarioDTO debido a que no tienen una relación por documentoProp, si se elimina una, la otra no se elimina
    private String documentoProp;

    //Constructor
    public Mascota( String id, String nombre, String especie, int edad) {
        /*this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;*/
        //Se usa setters con validación y se inicializa historial
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        setId(id);
       // this.historial = new Historial(); //Se reemplaza la lista directa
    }

    //Método para agregar una consulta
    /*public void agregarConsulta(Consulta cons) {
        consultas.add(cons);
    }*/
    //Se delega a la clase Historial
   /* public void agregarConsulta(Consulta cons) {
        if(cons == null){
            throw new IllegalArgumentException("Debes agregar una consulta, no puede ser nula");
        }
        historial.agregarConsulta(cons);
    }

    //Muestra historial de la mascota
    /*public void mostrarHistorial(Veterinario vet) {
        System.out.println("| Mascota |" + "| Nombre |: " + nombre + " | Especie |: " + especie + " | Edad |: " + edad + " años");
        /*for (Consulta cons : consultas) {
            cons.MostrarDetallesConsulta(vet);
        }*/
        //Se delega la impresión a la clase Historial
       /* historial.mostrarConsultas();
    } */
    
  /*  public void mostrarHistorial(Veterinario vet) {
    System.out.println("| Mascota |" + "| Nombre |: " + nombre + " | Especie |: " + especie + " | Edad |: " + edad + " años");
    historial.mostrarConsultas(vet);*/


    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    //Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la mascota no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie no puede estar vacía.");
        }
        this.especie = especie;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public void setId(String id) {
        if(id == null || id.isBlank()){
           throw new IllegalArgumentException("El id no puede estar vacio."); 
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDocumentoProp() {
        return documentoProp;
    }

    public void setDocumentoProp(String documentoProp) {
      if(documentoProp == null || documentoProp.length() < 5){
            throw new IllegalArgumentException("Documento invalido, revise bien su documento");
        }
        this.documentoProp = documentoProp;
    }
  
}

