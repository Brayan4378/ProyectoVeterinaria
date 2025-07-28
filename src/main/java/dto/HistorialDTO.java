/*
 * Click nbfs://nbhost/SystemFileTemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileTemplates/Classes/Class.java to edit this template
 */
package dto;

import excepciones.DatoInvalidoException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class HistorialDTO implements Serializable {

    // Lista de atenciones clínicas 
    private ArrayList<AtencionClinicaDTO> atenciones;
    
    public HistorialDTO() {
        this.atenciones = new ArrayList<>();
    }

    // Getter
    public ArrayList<AtencionClinicaDTO> getAtenciones() {
        return atenciones;
    }
    
}