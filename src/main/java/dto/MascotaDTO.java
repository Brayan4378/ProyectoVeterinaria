/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;
<<<<<<< HEAD

=======
import java.io.Serializable;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
/**
 *
 * @author BrayanOcampo
 */
<<<<<<< HEAD
public class MascotaDTO {
    
=======
public class MascotaDTO implements Serializable  {
    
    private static final long serialVersionUID = 1L;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
     //Atributos encapsulados
    private String nombre;
    private String especie;
    private int edad;
    private String id;
<<<<<<< HEAD
    //private ArrayList<Consulta> consultas = new ArrayList<>();
    //Se delega la responsabilidad del historial
    private String documentoProp;

    //Constructor
=======
    // Private ArrayList<Consulta> consultas = new ArrayList<>();
    // Se delega la responsabilidad del historial
    
    // Asociación debil con PropietarioDTO debido a que no tienen una relación por documentoProp, si se elimina una, la otra no se elimina
    private String documentoProp;

    // Constructor
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public MascotaDTO( String id, String nombre, String especie, int edad, String documentoProp) {
        /*this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;*/
        //Se usa setters con validación y se inicializa historial
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        setId(id);
        setDocumentoProp(documentoProp);
    }

    //Método para agregar una consulta
    /*public void agregarConsulta(Consulta cons) {
        consultas.add(cons);
    }*/
    //Se delega a la clase Historial
    /*public void agregarConsulta(Consulta cons) {
        if(cons == null){
            throw new IllegalArgumentException("Debes agregar una consulta, no puede ser nula");
        }
        historial.agregarConsulta(cons);
    }*/

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
    historial.mostrarConsultas(vet);
}*/

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
<<<<<<< HEAD
      if(documentoProp == null || documentoProp.length() < 5){
=======
      if(documentoProp == null || documentoProp.length() < 7){
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
            throw new IllegalArgumentException("Documento invalido, revise bien su documento");
        }
        this.documentoProp = documentoProp;
    }
    
<<<<<<< HEAD
    public static MascotaDTO desdeLineaArchivo(String linea) {
=======
    /*public static MascotaDTO desdeLineaArchivo(String linea) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
        String[] partes = linea.split(",");
        if (partes.length != 5) return null; // Ahora se esperan 4 partes: id, nombre, especie, edad
            try {
            int edad = Integer.parseInt(partes[3]);
            return new MascotaDTO(partes[0], partes[1], partes[2], edad, partes[4]);
        } catch (NumberFormatException e) {
            return null;
    }
}
    public String toLineaArchivo() {
<<<<<<< HEAD
    return id + "," + nombre + "," + especie + "," + edad + "," + documentoProp;
    }
=======
        return id + "," + nombre + "," + especie + "," + edad + "," + documentoProp;
    }*/
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
}
