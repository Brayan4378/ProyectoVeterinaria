/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import dto.AtencionClinicaDTO;
import java.util.List;
import java.io.Serializable;

/**
 *
 * @author BrayanOcampo
 */
public class IDGenerator implements Serializable {
    
    private static int contadorConsulta = 0;
    private static int contadorMascota = 0;
    private static int contadorVacuna = 0;

    public static String generarCodigoConsulta(List<AtencionClinicaDTO> existentes) {
        int intento = contadorConsulta + 1;
        String codigo;

        do {
            codigo = "C" + intento;
            intento++;
        } while (codigoExiste(codigo, existentes));

        contadorConsulta = intento - 1;
        return codigo;
    }

    private static boolean codigoExiste(String codigo, List<AtencionClinicaDTO> existentes) {
        for (AtencionClinicaDTO a : existentes) {
            if (a.getCodigo() != null && a.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    
    public static String generarCodigoVacuna(List<AtencionClinicaDTO> existentes){
        int intento = contadorVacuna + 1;
        String codigo;
        
        do {
            codigo = "V" + intento;
            intento++;
        } while (codigoExiste(codigo, existentes));
        contadorVacuna = intento - 1;
        return codigo;
    }

    public static String generarCodigoMascota() {
        return "M" + (++contadorMascota);
    }   
}
