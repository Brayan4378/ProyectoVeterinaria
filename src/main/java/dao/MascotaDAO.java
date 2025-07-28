/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dto.MascotaDTO;
import java.util.ArrayList;
import java.util.List;
import persistencia.*;
/**
 *
 * @author BrayanOcampo
 */
public class MascotaDAO {
    
    private ArchivoManager archivo;
    private ArrayList<MascotaDTO> mascotas = new ArrayList();

    public MascotaDAO() {
        archivo = new ArchivoManager("data/mascotas.txt");
        mascotas = obtenerTodas();
    }
    
    
    public void guardarEnArchivo(MascotaDTO mascota) {
        archivo.escribirLinea(mascota.toLineaArchivo());
    }
    
   public boolean guardarMascota(MascotaDTO mascota){
       for (MascotaDTO m : mascotas ) {
           if( m.getId().equals(mascota.getId())){
               return false;
           }
       } 
       mascotas.add(mascota);
       guardarEnArchivo(mascota);
       return true;
   } 
    
   public MascotaDTO buscarMascota(String id) {
    for (MascotaDTO m : mascotas) {
        if (m.getId().equals(id)) {
            return m;
        }
    }
    return null;
}

   
   public boolean eliminarMascota(MascotaDTO mascota){
       for (MascotaDTO m : mascotas) {
           if( m.getId().equals(mascota.getId())){
               mascotas.remove(m);
               sobrescribirLista(mascotas);
               return true;
           }
       }
       return false;
   }
   
    public boolean editarMascota(String id, MascotaDTO mascota) {
        for (MascotaDTO m : mascotas) {
            if (m.getId().equals(id)) {
                m.setNombre(mascota.getNombre());
                m.setEspecie(mascota.getEspecie());
                m.setEdad(mascota.getEdad());
                sobrescribirLista(mascotas);
                return true;
            }
        }
    return false;
}
   
    private void sobrescribirLista(List<MascotaDTO> mascotas) {
        List<String> lineas = new ArrayList<>();
        for (MascotaDTO m : mascotas) {
            lineas.add(m.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }

    public ArrayList<MascotaDTO> obtenerTodas() {
        ArrayList<MascotaDTO> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();

    for (String linea : lineas) {
        MascotaDTO mascota = MascotaDTO.desdeLineaArchivo(linea);
        lista.add(mascota);
    }

    return lista; 
}
    
    public MascotaDTO buscarPorId(String id) {
        List<String> lineas = archivo.leerLineas();
        for (String linea : lineas) {
            MascotaDTO m = MascotaDTO.desdeLineaArchivo(linea);
        if (m.getId().equals(id)) {
            return m;
        }
    }
    return null;
}
    public MascotaDTO buscarPorIdYDocumento(String id, String documentoProp) {
    for (MascotaDTO m : mascotas) {
        if (m.getId().equals(id) && m.getDocumentoProp().equals(documentoProp)) {
            return m;
        }
    }
    return null;
}
    
}

