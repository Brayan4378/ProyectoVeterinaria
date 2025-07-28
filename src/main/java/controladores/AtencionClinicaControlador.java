/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.AtencionClinicaDAO;
import dto.AtencionClinicaDTO;
import dto.ConsultaDTO;
import dto.VacunaDTO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class AtencionClinicaControlador {

    private AtencionClinicaDAO dao;

    public AtencionClinicaControlador() {
        this.dao = new AtencionClinicaDAO();
    }

    // Guarda una nueva atención clínica
    public boolean registrarAtencion(AtencionClinicaDTO atencion) {
        return dao.guardar(atencion);
    }

    // Busca una atención clínica por su código
    public AtencionClinicaDTO buscarAtencion(String codigo) {
        return dao.buscarPorCodigo(codigo);
    }

    // Edita una atención clínica existente
    public boolean editarAtencion(AtencionClinicaDTO atencion) {
        return dao.editar(atencion);
    }

    // Elimina una atención clínica por su código
    public boolean eliminarAtencion(String codigo) {
        return dao.eliminar(codigo);
    }

    // Lista todas las atenciones clínicas
    public ArrayList<AtencionClinicaDTO> listarAtenciones() {
        return dao.obtenerTodas();
    }
    
    public ConsultaDTO buscarConsulta(String idConsulta) {
        ArrayList<ConsultaDTO> listaConsultas = dao.obtenerTodasConsultas();
    for (ConsultaDTO c : listaConsultas) {
        if (c.getCodigo().equals(idConsulta)) {
            return c; // Retorna la consulta encontrada
        }
    }
    return null; // No se encontró la consulta
    }
    
    public VacunaDTO buscarVacuna(String idVacuna){
        ArrayList<VacunaDTO> listaVacunas = dao.obtenerTodasVacunas();    
    for (VacunaDTO v : listaVacunas) {
        if (v.getCodigo().equals(idVacuna)){
            return v;
        }  
        } 
        return null;
    }

    // Obtiene solo las atenciones de tipo Consulta
    public ArrayList<ConsultaDTO> obtenerConsultas() {
        ArrayList<ConsultaDTO> consultas = new ArrayList<>();
        for (Object obj : dao.obtenerTodasConsultas()) {
            if (obj instanceof ConsultaDTO consultaDTO) {
                consultas.add(consultaDTO);
            }
        }
        return consultas;
    }

    // Obtiene solo las atenciones de tipo Vacuna
    public ArrayList<VacunaDTO> obtenerVacunas() {
        ArrayList<VacunaDTO> vacunas = new ArrayList<>();
        for (Object obj : dao.obtenerTodasVacunas()) {
            if (obj instanceof VacunaDTO vacunaDTO) {
                vacunas.add(vacunaDTO);
            }
        }
        return vacunas;
    }
}