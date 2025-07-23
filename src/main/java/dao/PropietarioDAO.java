/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


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
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarPropietario(String documento){
        for (PropietarioDTO p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                propietarios.remove(p);
                
                return true;
            }
        }
        return false;
    }

    public boolean editarPropietario(String documento, PropietarioDTO nuevoPropietario) {
        for (PropietarioDTO p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                p.setNombre(nuevoPropietario.getNombre());
                p.setTelefono(nuevoPropietario.getTelefono());
                return true;
            }
        }
        return false;
    }
    
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

