/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dto.MascotaDTO;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */
public class MascotaDAO {
    
    
    private ArrayList<MascotaDTO> mascotas = new ArrayList();

    public MascotaDAO() {
    }
    
    public ArrayList<MascotaDTO> getMascotas() {
    return mascotas;
}

   public boolean guardarMascota(MascotaDTO mascota){
       for (MascotaDTO m : mascotas ) {
           if( m.getId().equals(mascota.getId())){
               return false;
           }
       } 
       mascotas.add(mascota);
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
            return true;
        }
    }
    return false;
}
   
   public ArrayList<MascotaDTO> buscarPorDocumentoPropietario(String documento) {
        ArrayList<MascotaDTO> resultado = new ArrayList<>();
        for (MascotaDTO m : mascotas) {
            if (m.getDocumentoProp().equals(documento)) {
                resultado.add(m);
            }
        }
        return resultado;
    }
   
    
}
