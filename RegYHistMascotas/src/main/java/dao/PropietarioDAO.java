/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Propietario;

/**
 *
 * @author BrayanOcampo
 */
public class PropietarioDAO {
    
     private ArrayList<Propietario> propietarios = new ArrayList<>();

    public PropietarioDAO() {
    }

    public boolean guardarPropietario(Propietario propietario){
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(propietario.getDocumento()) || p.getDocumento().equals(-1) || p.getDocumento().equals(200000000)) {
                return false;
            }
        }
        propietarios.add(propietario);
        return true;
    }

    public Propietario buscarPropietario(String documento) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarPropietario(String documento){
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                propietarios.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean editarPropietario(String documento, Propietario nuevoPropietario) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                p.setNombre(nuevoPropietario.getNombre());
                p.setTelefono(nuevoPropietario.getTelefono());
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Propietario> obtenerTodos() {
        return new ArrayList<>(propietarios); // copia defensiva
    }
}

