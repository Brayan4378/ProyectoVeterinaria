/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.PropietarioDTO;
import java.util.ArrayList;
import Gestor.Gestor;

/**
 *
 * @author Brayan
 */
public class PropietarioDAO {

    private final String RUTA = "data/propietarios.dat";
    private final Gestor<PropietarioDTO> serializador;

    public PropietarioDAO() {
        this.serializador = Gestor.getInstancia();
    }

    // Guardar un nuevo propietario
    public boolean guardarPropietario(PropietarioDTO nuevo) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (PropietarioDTO p : lista) {
            if (p.getDocumento().equals(nuevo.getDocumento())) {
                return false; // Ya existe
            }
        }
        lista.add(nuevo);
        serializador.guardar(RUTA, lista);
        return true;
    }

    // Buscar propietario por documento
    public PropietarioDTO buscarPropietario(String documento) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (PropietarioDTO p : lista) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    // Editar propietario existente
    public boolean editarPropietario(String documentoActual, PropietarioDTO actualizado) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDocumento().equals(documentoActual)) {
                lista.set(i, actualizado);
                serializador.guardar(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    // Eliminar propietario
    public boolean eliminarPropietario(String documento) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDocumento().equals(documento)) {
                lista.remove(i);
                serializador.guardar(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    // Obtener todos los propietarios
    public ArrayList<PropietarioDTO> obtenerTodos() {
        return cargarTodos();
    }

    // Cargar todos los propietarios desde archivo
    private ArrayList<PropietarioDTO> cargarTodos() {
        return serializador.cargar(RUTA);
    }
}