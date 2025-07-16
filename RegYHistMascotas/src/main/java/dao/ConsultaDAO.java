/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Consulta;
/**
 *
 * @author BrayanOcampo
 */
import java.util.ArrayList;

public class ConsultaDAO {

    private ArrayList<Consulta> consultas = new ArrayList<>();

    public ConsultaDAO() {}

    public boolean guardarConsulta(Consulta consulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(consulta.getCodigo())) {
                return false; // Ya existe
            }
        }
        consultas.add(consulta);
        return true;
    }

    public Consulta buscarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                consultas.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean editarConsulta(String codigo, Consulta nuevaConsulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                c.setFecha(nuevaConsulta.getFecha().toString());
                return true;
            }
        }
        return false;
    }

    public ArrayList<Consulta> obtenerTodas() {
        return new ArrayList<>(consultas);
    }
}

