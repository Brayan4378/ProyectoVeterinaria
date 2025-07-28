/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

<<<<<<< HEAD

import dto.PersonaDTO;
import java.util.ArrayList;
import dto.PropietarioDTO;
import java.util.AbstractList;
import java.util.List;
import persistencia.*;

/**
 *
 * @author BrayanOcampo
 */
public class PropietarioDAO {
    
    private ArchivoManager archivo;
    private ArrayList<PropietarioDTO> propietarios = new ArrayList<>();

    public PropietarioDAO() {
        archivo = new ArchivoManager("data/propietarios.data");
        propietarios = obtenerTodos();
    }

        public void guardarEnArchivo(PropietarioDTO propietario) {
        archivo.escribirLinea(propietario.toLineaArchivo());
    }
        
    public boolean guardarPropietario(PropietarioDTO propietario){
        for (PropietarioDTO p : propietarios) {
            if (p.getDocumento().equals(propietario.getDocumento()) || p.getDocumento().equals(-1) || p.getDocumento().equals(200000000)) {
                return false;
            }
        }
        propietarios.add(propietario);
        guardarEnArchivo(propietario);
        return true;
    }

    public PropietarioDTO buscarPropietario(String documento) {
        for (PropietarioDTO p : propietarios) {
=======
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
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

<<<<<<< HEAD
    public boolean eliminarPropietario(String documento){
        for (PropietarioDTO p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                propietarios.remove(p);
                
=======
    // Editar propietario existente
    public boolean editarPropietario(String documentoActual, PropietarioDTO actualizado) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDocumento().equals(documentoActual)) {
                lista.set(i, actualizado);
                serializador.guardar(RUTA, lista);
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
                return true;
            }
        }
        return false;
    }

<<<<<<< HEAD
    public boolean editarPropietario(String documento, PropietarioDTO nuevoPropietario) {
        for (PropietarioDTO p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                p.setNombre(nuevoPropietario.getNombre());
                p.setTelefono(nuevoPropietario.getTelefono());
=======
    // Eliminar propietario
    public boolean eliminarPropietario(String documento) {
        ArrayList<PropietarioDTO> lista = cargarTodos();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDocumento().equals(documento)) {
                lista.remove(i);
                serializador.guardar(RUTA, lista);
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
                return true;
            }
        }
        return false;
    }
<<<<<<< HEAD
    
    public ArrayList<PropietarioDTO> obtenerTodos(){
        ArrayList<PropietarioDTO> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();
        
        for (String linea : lineas) {
            PropietarioDTO propietario = PropietarioDTO.desdeLineaArchivo(linea);
            lista.add(propietario);
        }
        return lista;
    }
    
    public void sobreescribirLista(ArrayList<PropietarioDTO> propietarios){
        List<String> lineas = new ArrayList<>();
        for (PropietarioDTO p : propietarios) {
            lineas.add(p.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }
}

=======

    // Obtener todos los propietarios
    public ArrayList<PropietarioDTO> obtenerTodos() {
        return cargarTodos();
    }

    // Cargar todos los propietarios desde archivo
    private ArrayList<PropietarioDTO> cargarTodos() {
        return serializador.cargar(RUTA);
    }
}
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
