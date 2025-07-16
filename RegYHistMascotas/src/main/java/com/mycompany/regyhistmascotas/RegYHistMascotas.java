package com.mycompany.regyhistmascotas;


/*import java.util.Scanner;
import modelo.*;


/**
 * Clase principal que gestiona el registro y visualización de propietarios,
 * mascotas y consultas médicas en una clínica veterinaria.
 * 
 * @author BrayanOcampo
 */
public class RegYHistMascotas {
    //Veterinario usado para mostrar el historial completo (último registrado)
    /*private static Veterinario vet;

    public static void main(String[] args) {   
        try (Scanner scanner = new Scanner(System.in)) {
            String opcion;
            
            do {
                System.out.println("-------- Ingrese sus datos a continuación --------");
                System.out.print("Nombre del propietario: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Documento del propietario: ");
                String documento = scanner.nextLine();
                
                System.out.print("Teléfono del propietario: ");
                String telefono = scanner.nextLine();
                
                //Se crea el objeto propietario
                Propietario propietario = new Propietario(nombre, documento, telefono);
                
                String agregarOtraMascota;
                
                do {
                    System.out.print("Nombre de la mascota: ");
                    String nombreMascota = scanner.nextLine();

                    System.out.print("Especie de la mascota: ");
                    String especie = scanner.nextLine();

                    System.out.print("Edad de la mascota: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    //Se crea el objeto mascota
                    Mascota mascota = new Mascota(nombreMascota, especie, edad);

                    String otraConsulta;
                    do {
                        //Genera un código único para la consulta
                        String codigo = IDGenerator.generarCodigoConsulta();

                        System.out.print("Fecha de la consulta (YYYY-MM-DD): ");
                        String fecha = scanner.nextLine();

                        //Selección del veterinario para esta consulta
                        System.out.println("Seleccione un veterinario:");
                        System.out.println("1. Juan - Cirugía general");
                        System.out.println("2. Kevin - Medicina Felina");
                        System.out.println("3. Francisco - Cirugía general");
                        System.out.print("Opción: ");
                        int opcionVet = scanner.nextInt();
                        scanner.nextLine(); 

                        //Asigna veterinario según la opción elegida
                        Veterinario veterinario;
                        switch (opcionVet) {
                            case 1 -> veterinario = new Veterinario("Juan", "Cirugía general");
                            case 2 -> veterinario = new Veterinario("Kevin", "Medicina Felina");
                            case 3 -> veterinario = new Veterinario("Francisco", "Cirugía general");
                            default -> {
                                System.out.println("Opción inválida.");
                                veterinario = new Veterinario("Desconocido", "Desconocida");
                            }
                        }

                        vet = veterinario; //Guarda el último veterinario registrado

                        //Se crea la consulta y se asocia a la mascota
                        Consulta consulta = new Consulta(codigo, fecha);
                        mascota.agregarConsulta(consulta); // Asociación con veterinario

                        //Muestra los detalles de la consulta realizada
                        consulta.MostrarDetallesConsulta(veterinario);

                        System.out.print("¿Desea agregar otra consulta para esta mascota? (s/n): ");
                        otraConsulta = scanner.nextLine();

                    } while (otraConsulta.equalsIgnoreCase("s"));

                    //Se llama el metodo para agregar la mascota
                    propietario.agregarMascota(mascota);

                    System.out.print("¿Desea agregar otra mascota para el mismo propietario? (s/n): ");
                    agregarOtraMascota = scanner.nextLine();

                } while (agregarOtraMascota.equalsIgnoreCase("s"));

                //Muestra el historial completo del propietario al final
                System.out.println("\n===== FICHA CLÍNICA COMPLETA =====");
                propietario.mostrarInformacionCompleta(vet);

                System.out.println("\n----------------------------------------\n");
                System.out.println("¿Desea iniciar un nuevo registro?");
                System.out.println("1. Sí");
                System.out.println("Cualquier otra tecla: No");
                System.out.print("Opción: ");
                opcion = scanner.nextLine();

            } while (opcion.equals("1")); //Repite si desea un nuevo registro
        }

        //Mensaje final de salida del sistema
        System.out.println("¡Hasta pronto!, gracias por preferirnos");
    }*/
}

