/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Vacuna;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */

public class VacunaDAO {

    // Lista que almacena todas las vacunas registradas
    private ArrayList<Vacuna> vacunas = new ArrayList<>();

    // Constructor vacío
    public VacunaDAO() {}

    // Método para guardar una vacuna
    public boolean guardarVacuna(Vacuna vacuna) {
        if (vacuna != null) {
            vacunas.add(vacuna);
            return true;
        }
        return false;
    }

    // Buscar por tipo y codigo
    public Vacuna buscarVacuna(String tipo, String lote) {
        for (Vacuna v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(lote)) {
                return v;
            }
        }
        return null;
    }

    // Eliminar vacuna por tipo y codigo 
    public boolean eliminarVacuna(String tipo, String lote) {
        for (Vacuna v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(lote)) {
                vacunas.remove(v);
                return true;
            }
        }
        return false;
    }

    // Editar datos de una vacuna
    public boolean editarVacuna(String tipo, String codigo, Vacuna nueva) {
        for (Vacuna v : vacunas) {
            if (v.getTipo().equals(tipo) && v.getCodigo().equals(codigo)) {
                v.setFechaAplicacion(nueva.getFechaAplicacion());
                v.setProximaDosis(nueva.getProximaDosis());
                return true;
            }
        }
        return false;
    }

    // Obtener todas las vacunas 
    public ArrayList<Vacuna> obtenerTodas() {
        return new ArrayList<>(vacunas);
    }
}


