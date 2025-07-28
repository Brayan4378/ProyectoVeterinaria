/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author BrayanOcampo
 */
public class PropietarioDTO extends PersonaDTO {
    private String documento;
    private String telefono;

    public PropietarioDTO(String nombre, String documento, String telefono) {
        super(nombre);
        setDocumento(documento);
        setTelefono(telefono);
    }
    
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
    
    public static PropietarioDTO desdeLineaArchivo(String linea) {
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
    }
}
