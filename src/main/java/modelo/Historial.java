/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
<<<<<<< HEAD

=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
/**
 *
 * @author BrayanOcampo
 */
public class Historial {
    
<<<<<<< HEAD
      private ArrayList<Consulta> consultas;
     

    public Historial() {
        this.consultas = new ArrayList<>();
=======
      private ArrayList<AtencionClinica> atenciones;
     

    public Historial() {
        this.atenciones = new ArrayList<>();
    }
    
    public ArrayList<AtencionClinica> getAtenciones() {
        return atenciones;
    }

    public void setAtenciones(ArrayList<AtencionClinica> atenciones) {
        this.atenciones = atenciones;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
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