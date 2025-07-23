/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.time.LocalDate;
import modelo.Consulta;
/**
 *
 * @author BrayanOcampo
 */
import java.util.ArrayList;

public class ConsultaDAO {

    private ArrayList<Consulta> consultas = new ArrayList<>();

    public ConsultaDAO() {}

    // Guarda una nueva consulta si no existe el mismo código
    public boolean guardarConsulta(Consulta consulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(consulta.getCodigo())) {
                return false; // Ya existe una consulta con ese código
            }
        }
        consultas.add(consulta);
        return true;
    }

    // Busca una consulta por su código
    public Consulta buscarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Elimina una consulta según su código
    public boolean eliminarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                consultas.remove(c);
                return true;
            }
        }
        return false;
    }

    // Edita una consulta existente, reemplazando sus datos
    public boolean editarConsulta(String codigo, Consulta nuevaConsulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                c.setFecha(nuevaConsulta.getFecha());
                c.setDiagnostico(nuevaConsulta.getDiagnostico());
                c.setTratamiento(nuevaConsulta.getTratamiento());
                c.setDocumentoProCons(nuevaConsulta.getDocumentoProCons());
                c.setNombreMascCons(nuevaConsulta.getNombreMascCons());
                return true;
            }
        }
        return false;
    }

    // Devuelve todas las consultas registradas
    public ArrayList<Consulta> obtenerTodas() {
        return new ArrayList<>(consultas);
    }
}



