/*
 * Click nbfs://nbhost/SystemFileTemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileTemplates/Classes/Class.java to edit this template
 */
package controladores;

import dao.HistorialDAO;
import dto.AtencionClinicaDTO;
import excepciones.DatoInvalidoException;
import java.util.ArrayList;
import dao.AtencionClinicaDAO;

/**
 *
 * @author Brayan
 */
public class HistorialControlador {

    private HistorialDAO dao;
    private AtencionClinicaDAO daoAtencion;

    public HistorialControlador() {
        this.dao = new HistorialDAO();
        this.daoAtencion = new AtencionClinicaDAO();
    }

    public ArrayList<AtencionClinicaDTO> filtrarAtencionesPorIdMascota(String idMascota) {
    ArrayList<AtencionClinicaDTO> filtro = new ArrayList<>();
    try {
        if (idMascota == null || idMascota.trim().isEmpty()) {
            throw new DatoInvalidoException("El ID de la mascota no puede estar vacío.");
        }
        for (AtencionClinicaDTO atencion : daoAtencion.obtenerTodas()) {
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