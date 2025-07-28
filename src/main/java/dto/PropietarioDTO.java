/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author BrayanOcampo
 */
public class PropietarioDTO  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String documento;
    private String telefono;

    public PropietarioDTO(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }
    
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
    
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }
    
    /*public static PropietarioDTO desdeLineaArchivo(String linea) {
        String[] partes = linea.split(",");
        if (partes.length != 3) return null; // nombre, documento, telefono
        try {
            String nombre = partes[0].trim();
            String documento = partes[1].trim();
            String telefono = partes[2].trim();
            return new PropietarioDTO(nombre, documento, telefono);
        } catch (Exception e) {
            return null;
        }
    }
    
    public String toLineaArchivo() {
        return nombre + "," + documento + "," + telefono;
    }*/
    
        // Serialización personalizada
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(nombre);     // 1. Primero nombre
        out.writeUTF(documento);  // 2. Luego documento
        out.writeUTF(telefono);   // 3. Luego teléfono
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        nombre = in.readUTF();     // 1. Leer nombre
        documento = in.readUTF();  // 2. Leer documento
        telefono = in.readUTF();   // 3. Leer teléfono
    }
}
