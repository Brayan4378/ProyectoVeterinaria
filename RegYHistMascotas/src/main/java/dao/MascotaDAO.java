/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Mascota;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */
public class MascotaDAO {
    
    
    private ArrayList<Mascota> mascotas = new ArrayList();

    public MascotaDAO() {
    }
    
    public ArrayList<Mascota> getMascotas() {
    return mascotas;
}

   public boolean guardarMascota(Mascota mascota){
       for (Mascota m : mascotas ) {
           if( m.getId().equals(mascota.getId())){
               return false;
           }
       } 
       mascotas.add(mascota);
       return true;
   } 
    
   public Mascota buscarMascota(String id) {
    for (Mascota m : mascotas) {
        if (m.getId().equals(id)) {
            return m;
        }
    }
    return null;
}

   
   public boolean eliminarMascota(Mascota mascota){
       for (Mascota m : mascotas) {
           if( m.getId().equals(mascota.getId())){
               mascotas.remove(m);
               return true;
           }
       }
       return false;
   }
   
   public boolean editarMascota(String id, Mascota mascota) {
    for (Mascota m : mascotas) {
        if (m.getId().equals(id)) {
            m.setNombre(mascota.getNombre());
            m.setEspecie(mascota.getEspecie());
            m.setEdad(mascota.getEdad());
            return true;
        }
    }
    return false;
}
   
   public ArrayList<Mascota> buscarPorDocumentoPropietario(String documento) {
        ArrayList<Mascota> resultado = new ArrayList<>();
        for (Mascota m : mascotas) {
            if (m.getDocumentoProp().equals(documento)) {
                resultado.add(m);
            }
        }
        return resultado;
    }
   
    
}
