/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import modelo.Consulta;
import dao.ConsultaDAO;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */

public class ConsultaControlador {

    private ConsultaDAO dao;

    public ConsultaControlador() {
        this.dao = new ConsultaDAO();
    }

    public boolean registrarConsulta(String codigo, String fechaTexto) {
        // Validar que el código y la fecha no estén vacíos
        if (codigo == null || codigo.isBlank() || fechaTexto == null || fechaTexto.isBlank()) {
            return false;
        }
        // Validar formato de fecha (YYYY-MM-DD)
        if (!fechaTexto.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }
        // Crear consulta usando setters validados en la clase modelo
        Consulta c = new Consulta(codigo, fechaTexto);
        return dao.guardarConsulta(c);
    }

    public Consulta buscarConsulta(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            return null;
        }
        return dao.buscarConsulta(codigo);
    }

    public boolean eliminarConsulta(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            return false;
        }
        Consulta c = dao.buscarConsulta(codigo);
        if (c != null) {
            return dao.eliminarConsulta(codigo);
        }
        return false;
    }

    public boolean editarConsulta(String codigoOriginal, String nuevaFechaTexto) {
        if (codigoOriginal == null || codigoOriginal.isBlank() || nuevaFechaTexto == null || nuevaFechaTexto.isBlank()) {
            return false;
        }

        if (!nuevaFechaTexto.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        Consulta nueva = new Consulta(codigoOriginal, nuevaFechaTexto);
        return dao.editarConsulta(codigoOriginal, nueva);
    }
    
    public ArrayList<Consulta> obtenerTodas() {
        return dao.obtenerTodas();
    }
}

