Sistema de gestión para una clínica veterinaria. Está desarrollado en Java con interfaz gráfica usando Swing, y utiliza el patrón MVC + DAO + DTO para una mejor estructura y organización del código.

El sistema permite registrar y manejar datos de propietarios, mascotas, consultas clínicas y vacunas. Toda la información se guarda usando serialización, aplicando también el patrón Singleton para asegurar una única instancia en la persistencia de datos.

Se incluye manejo de excepciones, tanto una personalizada (DatoInvalidoException) para validar los datos, como otras genéricas adaptadas al sistema.

Desde la interfaz gráfica, se pueden realizar registros, visualizar el historial clínico de cada mascota en una tabla y filtrar información específica según si se trata de una consulta o una vacuna.
