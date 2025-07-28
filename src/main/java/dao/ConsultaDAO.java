/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.time.LocalDate;
<<<<<<< HEAD
import modelo.Consulta;
=======
import dto.ConsultaDTO;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
/**
 *
 * @author BrayanOcampo
 */
import java.util.ArrayList;

public class ConsultaDAO {

<<<<<<< HEAD
    private ArrayList<Consulta> consultas = new ArrayList<>();
=======
   /* private ArrayList<ConsultaDTO> consultas = new ArrayList<>();
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875

    public ConsultaDAO() {}

    // Guarda una nueva consulta si no existe el mismo código
<<<<<<< HEAD
    public boolean guardarConsulta(Consulta consulta) {
        for (Consulta c : consultas) {
=======
    public boolean guardarConsulta(ConsultaDTO consulta) {
        for (ConsultaDTO c : consultas) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
            if (c.getCodigo().equals(consulta.getCodigo())) {
                return false; // Ya existe una consulta con ese código
            }
        }
        consultas.add(consulta);
        return true;
    }

    // Busca una consulta por su código
<<<<<<< HEAD
    public Consulta buscarConsulta(String codigo) {
        for (Consulta c : consultas) {
=======
    public ConsultaDTO buscarConsulta(String codigo) {
        for (ConsultaDTO c : consultas) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Elimina una consulta según su código
    public boolean eliminarConsulta(String codigo) {
<<<<<<< HEAD
        for (Consulta c : consultas) {
=======
        for (ConsultaDTO c : consultas) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
            if (c.getCodigo().equals(codigo)) {
                consultas.remove(c);
                return true;
            }
        }
        return false;
    }

    // Edita una consulta existente, reemplazando sus datos
<<<<<<< HEAD
    public boolean editarConsulta(String codigo, Consulta nuevaConsulta) {
        for (Consulta c : consultas) {
=======
    public boolean editarConsulta(String codigo, ConsultaDTO nuevaConsulta) {
        for (ConsultaDTO c : consultas) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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
<<<<<<< HEAD
    public ArrayList<Consulta> obtenerTodas() {
        return new ArrayList<>(consultas);
    }
=======
    public ArrayList<ConsultaDTO> obtenerTodas() {
        return new ArrayList<>(consultas);
    }*/
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
}



