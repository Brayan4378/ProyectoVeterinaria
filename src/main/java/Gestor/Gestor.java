/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class Gestor<T> {
    
    private static Gestor<?> instancia;

    // Constructor privado (Singleton)
    private Gestor() {}

    // Método para obtener instancia única (Singleton)
    @SuppressWarnings("unchecked")
    public static synchronized <T> Gestor<T> getInstancia() {
        if (instancia == null) {
            instancia = new Gestor<>();
        }
        return (Gestor<T>) instancia;
    }

    // Guarda una lista de objetos en un archivo
    public void guardar(String rutaArchivo, ArrayList<T> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            salida.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // Carga una lista de objetos desde un archivo
    public ArrayList<T> cargar(String rutaArchivo) {
        ArrayList<T> lista = new ArrayList<>();
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return lista; // Si no existe, devuelve lista vacia
        }
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            Object objeto = entrada.readObject();
            if (objeto instanceof ArrayList<?>) {
                lista = (ArrayList<T>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
        return lista;
    }
}
