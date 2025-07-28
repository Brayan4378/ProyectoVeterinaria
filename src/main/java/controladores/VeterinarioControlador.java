/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.VeterinarioDAO;
import dto.VeterinarioDTO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class VeterinarioControlador {

    private VeterinarioDAO dao;

 
    public VeterinarioControlador() {
        dao = new VeterinarioDAO();
        dao.precargarVeterinarios();
    }

    public ArrayList<VeterinarioDTO> obtenerVeterinarios() {
        return dao.obtenerVeterinarios();
    }

}