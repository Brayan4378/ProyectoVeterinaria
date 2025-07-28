<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
package persistencia;

import java.io.*;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

public class ArchivoManager {
    private File archivo;

    // Constructor que recibe la ruta del archivo
    public ArchivoManager(String rutaArchivo) {
=======
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchivoManager {
    /*private static final Map<String, ArchivoManager> instancias = new HashMap<>(); // Singleton por archivo
    private final File archivo;

    // 🔒 Constructor privado
    private ArchivoManager(String rutaArchivo) {
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
        this.archivo = new File(rutaArchivo);
        crearArchivoSiNoExiste();
    }

<<<<<<< HEAD
    // ✅ Verifica si el archivo existe, si no, lo crea
    private void crearArchivoSiNoExiste() {
        try {
            if (!archivo.exists()) {
                archivo.getParentFile().mkdirs(); // Crea directorio si no existe
=======
    // ✅ Método estático para obtener instancia por ruta
    public static ArchivoManager getInstancia(String rutaArchivo) {
        return instancias.computeIfAbsent(rutaArchivo, ruta -> new ArchivoManager(ruta));
    }

    private void crearArchivoSiNoExiste() {
        try {
            if (!archivo.exists()) {
                archivo.getParentFile().mkdirs();
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

<<<<<<< HEAD
    // ✅ Escribe una línea al final del archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public void escribirLinea(String linea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

<<<<<<< HEAD
    // ✅ Lee todas las líneas del archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public List<String> leerLineas() {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }

<<<<<<< HEAD
    // ✅ Sobrescribe el contenido completo del archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public void sobrescribirArchivo(List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al sobrescribir el archivo: " + e.getMessage());
        }
    }

<<<<<<< HEAD
    // ✅ Limpia el archivo sin eliminarlo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public void limpiarArchivo() {
        sobrescribirArchivo(new ArrayList<>());
    }

<<<<<<< HEAD
    // ✅ Elimina el archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public boolean eliminarArchivo() {
        return archivo.delete();
    }

<<<<<<< HEAD
    // ✅ Renombrar archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public boolean renombrarArchivo(String nuevoNombre) {
        File nuevoArchivo = new File(archivo.getParent(), nuevoNombre);
        return archivo.renameTo(nuevoArchivo);
    }

<<<<<<< HEAD
    // ✅ Obtener tamaño del archivo en bytes
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public long obtenerTamanioArchivo() {
        return archivo.length();
    }

<<<<<<< HEAD
    // ✅ Obtener ruta absoluta
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public String getRutaAbsoluta() {
        return archivo.getAbsolutePath();
    }

<<<<<<< HEAD
    // ✅ Saber si el archivo es un directorio
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public boolean esDirectorio() {
        return archivo.isDirectory();
    }

<<<<<<< HEAD
    // ✅ Obtener nombre del archivo
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public String getNombreArchivo() {
        return archivo.getName();
    }

<<<<<<< HEAD
    // ✅ Listar archivos de un directorio
=======
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
    public static List<String> listarArchivos(String rutaDirectorio) {
        File dir = new File(rutaDirectorio);
        List<String> archivos = new ArrayList<>();
        if (dir.exists() && dir.isDirectory()) {
            for (File archivo : dir.listFiles()) {
                archivos.add(archivo.getName());
            }
        }
        return archivos;
    }

<<<<<<< HEAD
    // ✅ Obtener la ruta del archivo gestionado
    public String getRuta() {
        return archivo.getPath();
    }
}

=======
    public String getRuta() {
        return archivo.getPath();
    }*/
}
>>>>>>> 5135cb6208e66fab6ac5b2201e395cec78a1b875
