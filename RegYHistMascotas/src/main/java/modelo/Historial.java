/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class Historial {
    
      private ArrayList<Consulta> consultas;
     

    public Historial() {
        this.consultas = new ArrayList<>();
    }
    
     /* public void agregarConsulta(Consulta consulta) {
        if (consulta != null) {
            consultas.add(consulta);
        }
    }
}
    //private Veterinario vet;
    
    /*public void mostrarConsultas(Veterinario vet) {
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay consultas registradas", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            
            for (Consulta c : consultas) {
                c.MostrarDetallesConsulta(vet);
            }
        }
    }

    public ArrayList<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }
}

}
*/
}