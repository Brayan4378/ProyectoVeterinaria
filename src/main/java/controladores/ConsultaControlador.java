/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import dto.ConsultaDTO;
import dao.ConsultaDAO;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */

public class ConsultaControlador {

    /* private final ConsultaDAO dao;

    public ConsultaControlador() {
        this.dao = new ConsultaDAO();
    }

    // Registra una nueva consulta
    public boolean registrarConsulta(String codigo, LocalDate fecha, String diagnostico, String tratamiento, String documentoProCons, String nombreMascCons) {
        // Validar campos obligatorios
        if (codigo == null || codigo.isBlank() || fecha == null || diagnostico == null || diagnostico.isBlank()) {
            return false;
        }
        // Crear la consulta
        ConsultaDTO consulta = new ConsultaDTO(codigo, fecha, diagnostico, tratamiento, documentoProCons, nombreMascCons);
        // Guardar en DAO
        return dao.guardarConsulta(consulta);
    }

    // Buscar consulta por código
    public ConsultaDTO buscarConsulta(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            return null;
        }
        return dao.buscarConsulta(codigo);
    }

    // Eliminar consulta por código
    public boolean eliminarConsulta(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            return false;
        }
        ConsultaDTO consulta = dao.buscarConsulta(codigo);
        if (consulta != null) {
            return dao.eliminarConsulta(codigo);
        }
        return false;
    }

    // Editar solo la fecha de una consulta existente
    public boolean editarConsulta(String codigo, String nuevaFechaTexto) {
        if (codigo == null || codigo.isBlank() || nuevaFechaTexto == null || nuevaFechaTexto.isBlank()) {
            return false;
        }

        // Validar formato de fecha (YYYY-MM-DD)
        if (!nuevaFechaTexto.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        // Convertir texto a LocalDate
        LocalDate nuevaFecha = LocalDate.parse(nuevaFechaTexto);

        // Obtener la consulta actual
        ConsultaDTO consultaExistente = dao.buscarConsulta(codigo);
        if (consultaExistente == null) {
            return false;
        }

        // Crear nueva consulta copiando datos existentes pero con nueva fecha
        ConsultaDTO nuevaConsulta = new ConsultaDTO(consultaExistente.getCodigo(), nuevaFecha, consultaExistente.getDiagnostico(), consultaExistente.getTratamiento(), consultaExistente.getDocumentoProCons(), consultaExistente.getNombreMascCons());
        // Editar en el DAO
        return dao.editarConsulta(codigo, nuevaConsulta);
    }

    // Obtener todas las consultas
    public ArrayList<ConsultaDTO> obtenerTodas() {
        return dao.obtenerTodas();
    }*/
}


