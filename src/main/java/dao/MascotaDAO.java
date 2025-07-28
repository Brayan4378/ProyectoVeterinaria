/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
<<<<<<< HEAD
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

=======

import dto.MascotaDTO;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class MascotaDAO {

    private final String RUTA = "data/mascotas.dat";
    private ArrayList<MascotaDTO> listaMascotas;

    public MascotaDAO() {
        listaMascotas = cargarMascotas();
    }

    // Guardar una mascota
    public boolean guardarMascota(MascotaDTO mascota) {
        if (buscarMascota(mascota.getId()) == null) {
            listaMascotas.add(mascota);
            guardarMascotas();
            return true;
        }
        return false;
    }

    // Buscar por ID
    public MascotaDTO buscarMascota(String id) {
        for (MascotaDTO m : listaMascotas) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    // Editar una mascota
    public boolean editarMascota(String id, MascotaDTO actualizada) {
        for (int i = 0; i < listaMascotas.size(); i++) {
            if (listaMascotas.get(i).getId().equals(id)) {
                listaMascotas.set(i, actualizada);
                guardarMascotas();
                return true;
            }
        }
        return false;
    }

    // Eliminar una mascota
    public boolean eliminarMascota(MascotaDTO mascota) {
        boolean eliminado = listaMascotas.remove(mascota);
        if (eliminado) {
            guardarMascotas();
        }
        return eliminado;
    }

    // Buscar por ID y documento del propietario
    public MascotaDTO buscarPorIdYDocumento(String id, String documentoProp) {
        for (MascotaDTO m : listaMascotas) {
            if (m.getId().equals(id) && m.getDocumentoProp().equals(documentoProp)) {
                return m;
            }
        }
        return null;
    }

    // Obtener todas las mascotas
    public ArrayList<MascotaDTO> obtenerTodas() {
        return listaMascotas;
    }

    // Guardar lista completa al archivo
    private void guardarMascotas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA))) {
            oos.writeObject(listaMascotas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar lista completa desde archivo
    private ArrayList<MascotaDTO> cargarMascotas() {
        File archivo = new File(RUTA);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA))) {
            return (ArrayList<MascotaDTO>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); 
            return new ArrayList<>();
        }
    }
}
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
