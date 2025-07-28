/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dto.VeterinarioDTO;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */
public class VeterinarioDAO {

    private ArrayList<VeterinarioDTO> veterinarios;

    // Constructor: inicializa la lista
    public VeterinarioDAO() {
        veterinarios = new ArrayList<>();
    }

    public void precargarVeterinarios() {
        veterinarios.add(new VeterinarioDTO("Juan Cardona", "Medicina general"));
        veterinarios.add(new VeterinarioDTO("Kevin Chaves", "Cirugía"));
        veterinarios.add(new VeterinarioDTO("James Falcao", "Medicina externa"));
    }

    public ArrayList<VeterinarioDTO> obtenerVeterinarios() {
        return veterinarios;
    }
}