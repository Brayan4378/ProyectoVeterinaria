/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import dto.MascotaDTO;
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
        MascotaDTO existente = dao.buscarPorId(id);
        if ((id == null || id.isBlank()) ||
            (nombre == null || nombre.isBlank()) ||
            (especie == null || especie.isBlank()) ||
            (edad < 0) ||
            (documentoProp == null || documentoProp.isBlank())) {
            return false;
        }

        if (existente == null) {
            MascotaDTO mascota = new MascotaDTO(id, nombre, especie, edad, documentoProp);
            mascota.setDocumentoProp(documentoProp);
            return dao.guardarMascota(mascota);
        }
        return false;
    }

    public MascotaDTO buscarMascota(String id) {
        if (id == null || id.isBlank()) {
            return null;
        }
        return dao.buscarMascota(id);
    }

    public boolean editarMascota(String id, String nuevoNombre, String nuevaEspecie, int nuevaEdad) {
        if ((id == null || id.isBlank()) ||
            (nuevoNombre == null || nuevoNombre.isBlank()) ||
            (nuevaEspecie == null || nuevaEspecie.isBlank()) ||
            (nuevaEdad < 0) ) {
            return false;
        }

        MascotaDTO mascotaExistente = dao.buscarPorId(id);
        if (mascotaExistente == null) {
            return false;
        }
        
        MascotaDTO actualizada = new MascotaDTO(id, nuevoNombre, nuevaEspecie, nuevaEdad, mascotaExistente.getDocumentoProp());
            return dao.editarMascota(id, actualizada);
    }

    public boolean eliminarMascota(String id) {
        if (id == null || id.isBlank()) {
            return false;
        }

        MascotaDTO mascota = dao.buscarMascota(id);
        if (mascota != null) {
            return dao.eliminarMascota(mascota);
        }
        return false;
    }
    
    public MascotaDTO buscarPorIdYDocumento(String id, String documentoProp) {
        return dao.buscarPorIdYDocumento(id, documentoProp);
}
   
    public ArrayList<MascotaDTO> obtenerTodasMasc(){
        return dao.obtenerTodas();
    }
}

