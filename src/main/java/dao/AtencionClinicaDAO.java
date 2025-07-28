/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.AtencionClinicaDTO;
import dto.ConsultaDTO;
import dto.VacunaDTO;
import Gestor.Gestor;

import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class AtencionClinicaDAO {

    private final String RUTA = "data/AtencionClinica.dat";
    private final Gestor<AtencionClinicaDTO> serializador;

    public AtencionClinicaDAO() {
        this.serializador = Gestor.getInstancia();
    }

    public boolean guardar(AtencionClinicaDTO atencion) {
        ArrayList<AtencionClinicaDTO> lista = cargarTodas();
        if (buscarPorCodigo(atencion.getCodigo()) == null) {
            lista.add(atencion);
            serializador.guardar(RUTA, lista);
            return true;
        }
        return false;
    }

    public boolean editar(AtencionClinicaDTO nuevaAtencion) {
        ArrayList<AtencionClinicaDTO> lista = cargarTodas();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(nuevaAtencion.getCodigo())) {
                lista.set(i, nuevaAtencion);
                serializador.guardar(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        ArrayList<AtencionClinicaDTO> lista = cargarTodas();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equals(codigo)) {
                lista.remove(i);
                serializador.guardar(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    public AtencionClinicaDTO buscarPorCodigo(String codigo) {
        ArrayList<AtencionClinicaDTO> lista = cargarTodas();
        for (AtencionClinicaDTO a : lista) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null;
    }

    public boolean existeCodigo(String codigo) {
        return buscarPorCodigo(codigo) != null;
    }

    public ArrayList<AtencionClinicaDTO> obtenerTodas() {
        return cargarTodas();
    }

    public ArrayList<ConsultaDTO> obtenerTodasConsultas() {
        ArrayList<ConsultaDTO> consultas = new ArrayList<>();
        for (AtencionClinicaDTO a : cargarTodas()) {
            if (a instanceof ConsultaDTO consulta) {
                consultas.add(consulta);
            }
        }
        return consultas;
    }

    public ArrayList<VacunaDTO> obtenerTodasVacunas() {
        ArrayList<VacunaDTO> vacunas = new ArrayList<>();
        for (AtencionClinicaDTO a : cargarTodas()) {
            if (a instanceof VacunaDTO vacuna) {
                vacunas.add(vacuna);
            }
        }
        return vacunas;
    }

    private ArrayList<AtencionClinicaDTO> cargarTodas() {
        ArrayList<AtencionClinicaDTO> lista = serializador.cargar(RUTA);
        return (lista != null) ? lista : new ArrayList<>();
    }
}