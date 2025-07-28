/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
<<<<<<< HEAD

=======
import java.io.*;
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
/**
 *
 * @author BrayanOcampo
 */

<<<<<<< HEAD
public class Vacuna {

    private String tipo;
    private String codigo;
    private LocalDate fechaAplicacion;
    private LocalDate proximaDosis;



    // Constructor con parámetros
    public Vacuna(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        setTipo(tipo);
        setCodigo(codigo);
        setFechaAplicacion(fechaAplicacion);
        setProximaDosis(proximaDosis);
    }

    // Getter y Setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) {
            this.tipo = tipo;
        }
    }

    // Getter y Setter para lote
=======
public class Vacuna extends AtencionClinica implements Serializable{

    private static final long serialVersionUID = 1L;
    private String tipoVacuna;
    private String dosis;

    public Vacuna(String codigo, LocalDate fecha, String idMascota, String dosis, String nombreVeterinario, String tipoVacuna) {
        super(codigo, fecha, idMascota, nombreVeterinario);
        this.tipoVacuna = tipoVacuna;
        this.dosis = dosis;
    }
    

    @Override
    public String getResumen() {
        return "Vacuna: " + tipoVacuna;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public String getDosis() {
        return dosis;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    
    
    @Override
    public String toLineaArchivo() {
        return "vacuna;" + codigo + "," + fecha + "," + idMascota + "," + dosis + "," + nombreVeterinario + "," + tipoVacuna;
    }
    
    public static Vacuna desdeLineaArchivo(String datos) {
        String[] partes = datos.split(",");
    if (partes.length == 6) {
        return new Vacuna(
            partes[0],                       // código
            LocalDate.parse(partes[1]),     // fecha
            partes[2],                       // idMascota
            partes[3],                       // dosis
            partes[4],                       // nombreVeterinario
            partes[5]                        // tipoVacuna
        );
    }
    return null;
    }

>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public String getCodigo() {
        return codigo;
    }

<<<<<<< HEAD
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isBlank()) {
            this.codigo = codigo;
        }
    }

    // Getter y Setter para fechaAplicacion
    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        if (fechaAplicacion != null) {
            this.fechaAplicacion = fechaAplicacion;
        }
    }

    // Getter y Setter para proximaDosis
    public LocalDate getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(LocalDate proximaDosis) {
        if (proximaDosis != null) {
            this.proximaDosis = proximaDosis;
        }
    }

    // Método auxiliar si se desea mostrar
    public String mostrarVacuna() {
        return "Tipo: " + tipo + " | Lote: " + codigo +
               " | Fecha Aplicación: " + fechaAplicacion +
               " | Próxima dosis: " + proximaDosis;
    }
}
=======
    public LocalDate getFecha() {
        return fecha;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

}

>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
