/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import modelo.Mascota;
import dao.MascotaDAO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */

public class MascotaControlador {

    private MascotaDAO dao;

    public MascotaControlador() {
        this.dao = new MascotaDAO();
    }

    public boolean registrarMascota(String id, String nombre, String especie, int edad, String documentoProp) {
        // Validaciones simples usando if y &&
        if ((id == null || id.isBlank()) ||
            (nombre == null || nombre.isBlank()) ||
            (especie == null || especie.isBlank()) ||
            (edad < 0) ||
            (documentoProp == null || documentoProp.isBlank())) {
            return false;
        }

        Mascota nueva = new Mascota(id, nombre, especie, edad);
        nueva.setDocumentoProp(documentoProp);
        return dao.guardarMascota(nueva);
    }

    public Mascota buscarMascota(String id) {
        if (id == null || id.isBlank()) {
            return null;
        }
        return dao.buscarMascota(id);
    }

    public boolean editarMascota(String id, String nuevoNombre, String nuevaEspecie, int nuevaEdad) {
        if ((id == null || id.isBlank()) ||
            (nuevoNombre == null || nuevoNombre.isBlank()) ||
            (nuevaEspecie == null || nuevaEspecie.isBlank()) ||
            (nuevaEdad < 0)) {
            return false;
        }

        Mascota actualizada = new Mascota(id, nuevoNombre, nuevaEspecie, nuevaEdad);
        return dao.editarMascota(id, actualizada);
    }

    public boolean eliminarMascota(String id) {
        if (id == null || id.isBlank()) {
            return false;
        }

        Mascota m = dao.buscarMascota(id);
        if (m != null) {
            return dao.eliminarMascota(m);
        }
        return false;
    }
    
    public ArrayList<Mascota> buscarPorDocumentoPropietario(String documento) {
    if (documento != null && !documento.equals("")) {
        return dao.buscarPorDocumentoPropietario(documento);
    }
    return new ArrayList<>();
}
    
    public ArrayList<Mascota> obtenerTodasMasc(){
        return dao.getMascotas();
    }
}

