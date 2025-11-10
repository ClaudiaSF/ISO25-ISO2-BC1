package iso_bc01;

import iso_bc01.Dominio.*;
import iso_bc01.Presentacion.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenido al Sistema de Biblioteca ===");

        // --- LOGIN ---
        IULogin uiLogin = new IULogin();
        System.out.println("Iniciando sesión...");
        // Aquí puedes agregar validación de usuario si la clase IULogin la implementa.

        // --- BÚSQUEDA DE MATERIAL ---
        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IU_ReservarMaterial reservar = new IU_ReservarMaterial();
            Reserva reserva = reservar.capturarDatos();
            System.out.println("✅ Reserva realizada con éxito para: " + material.getTitulo());

            // --- PRÉSTAMO  ---
            // Nota: no se puede instanciar una interfaz; se usa una implementación concreta.
            IUPrestamos uiPrestamos = new IUPrestamos();
            Prestamo prestamo = uiPrestamos.solicitarPrestamo(12345, material.getTitulo());
            System.out.println(uiPrestamos.mostrarResultados("Préstamo creado para " + material.getTitulo()));

            // --- DEVOLUCIÓN  ---
            IUDevolucion uiDevolucion = new IUDevolucion();
            Devolucion devolucion = uiDevolucion.solicitarDevolucion(12345, material.getTitulo());
            System.out.println(uiDevolucion.mostrarResultados("Devolución registrada de " + material.getTitulo()));
        } else {
            System.out.println("❌ Material no encontrado. No se puede realizar la reserva.");
        }

        System.out.println("=== Fin del programa ===");
    }
}
