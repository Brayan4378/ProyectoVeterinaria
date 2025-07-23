/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dto.VacunaDTO;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */

public class VacunaDAO {

    // Lista que almacena todas las vacunas registradas
    private ArrayList<VacunaDTO> vacunas = new ArrayList<>();

    // Constructor vacío
    public VacunaDAO() {}

    // Método para guardar una vacuna
    public boolean guardarVacuna(VacunaDTO vacuna) {
        if (vacuna != null) {
            vacunas.add(vacuna);
            return true;
        }
        return false;
    }

    // Buscar por tipo y codigo
    public VacunaDTO buscarVacuna(String tipo, String lote) {
        for (VacunaDTO v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(lote)) {
                return v;
            }
        }
        return null;
    }

    // Eliminar vacuna por tipo y codigo 
    public boolean eliminarVacuna(String tipo, String lote) {
        for (VacunaDTO v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(lote)) {
                vacunas.remove(v);
                return true;
            }
        }
        return false;
    }

    // Editar datos de una vacuna
    public boolean editarVacuna(String tipo, String codigo, VacunaDTO nueva) {
        for (VacunaDTO v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(codigo)) {
                v.setFechaAplicacion(nueva.getFechaAplicacion());
                v.setProximaDosis(nueva.getProximaDosis());
                return true;
            }
        }
        return false;
    }

    // Obtener todas las vacunas 
    public ArrayList<VacunaDTO> obtenerTodas() {
        return new ArrayList<>(vacunas);
    }
}


