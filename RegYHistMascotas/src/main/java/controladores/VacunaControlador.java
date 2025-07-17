/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import dao.VacunaDAO;
import dto.VacunaDTO;
import java.time.LocalDate;

/**
 *
 * @author BrayanOcampo
 */

public class VacunaControlador {

    private VacunaDAO dao;

    // Constructor
    public VacunaControlador(VacunaDAO dao) {
        this.dao = dao;
    }

    // Método para registrar vacuna
    public boolean registrarVacuna(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        if (tipo == null || tipo.isBlank() || lote == null || lote.isBlank() || fechaAplicacion == null || proximaDosis == null) {
            return false;
        }

        VacunaDTO nueva = new VacunaDTO(tipo, lote, fechaAplicacion, proximaDosis);
        return dao.guardarVacuna(nueva);
    }

    // Método para buscar vacuna
    public VacunaDTO buscarVacuna(String tipo, String lote) {
        if (tipo != null && lote != null && !tipo.isBlank() && !lote.isBlank()) {
            return dao.buscarVacuna(tipo, lote);
        }
        return null;
    }

    // Método para editar vacuna existente
    public boolean editarVacuna(String tipo, String lote, LocalDate nuevaFecha, LocalDate nuevaProxima) {
        if (tipo == null || lote == null || nuevaFecha == null || nuevaProxima == null) {
            return false;
        }

        VacunaDTO nueva = new VacunaDTO(tipo, lote, nuevaFecha, nuevaProxima);
        return dao.editarVacuna(tipo, lote, nueva);
    }

    // Método para eliminar vacuna
    public boolean eliminarVacuna(String tipo, String lote) {
        if (tipo != null && lote != null && !tipo.isBlank() && !lote.isBlank()) {
            return dao.eliminarVacuna(tipo, lote);
        }
        return false;
    }
}
