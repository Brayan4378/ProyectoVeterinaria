/*
 * Click nbfs://nbhost/SystemFileTemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileTemplates/Classes/Class.java to edit this template
 */
package dao;

import dto.AtencionClinicaDTO;
import dto.HistorialDTO;
import excepciones.DatoInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class HistorialDAO {
    
    private HistorialDTO historial;
    private AtencionClinicaDAO dao;

    public HistorialDAO() {
        this.historial = new HistorialDTO();
        this.dao = new AtencionClinicaDAO();
    }

    // Metodo para filtrar todas las atenciones por medio del id de la mascota
    public ArrayList<AtencionClinicaDTO> filtrarAtencionesPorIdMascota(String idMascota) {
        ArrayList<AtencionClinicaDTO> filtro = dao.obtenerTodas();
        try {
            if (idMascota == null || idMascota.trim().isEmpty()) {
                throw new DatoInvalidoException("El ID de la mascota no puede estar vacío.");
            }

            for (AtencionClinicaDTO atencion : dao.obtenerTodas()) {
                if (atencion.getIdMascota().equalsIgnoreCase(idMascota.trim())) {
                    filtro.add(atencion);
                }
            }

        } catch (DatoInvalidoException e) {
            System.out.println("Error al filtrar atenciones: " + e.getMessage());
        }
        return filtro;
    }
}