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
<<<<<<< HEAD
        // Validaciones simples usando if y &&
        MascotaDTO existente = dao.buscarPorId(id);
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
        if ((id == null || id.isBlank()) ||
            (nombre == null || nombre.isBlank()) ||
            (especie == null || especie.isBlank()) ||
            (edad < 0) ||
            (documentoProp == null || documentoProp.isBlank())) {
            return false;
        }

<<<<<<< HEAD
        if (existente == null) {
            MascotaDTO mascota = new MascotaDTO(id, nombre, especie, edad, documentoProp);
            mascota.setDocumentoProp(documentoProp);
=======
        MascotaDTO existente = dao.buscarMascota(id);
        if (existente == null) {
            MascotaDTO mascota = new MascotaDTO(id, nombre, especie, edad, documentoProp);
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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

<<<<<<< HEAD
        MascotaDTO mascotaExistente = dao.buscarPorId(id);
=======
        MascotaDTO mascotaExistente = dao.buscarMascota(id);
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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
<<<<<<< HEAD

=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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

