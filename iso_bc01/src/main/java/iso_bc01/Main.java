package iso_bc01;

import iso_bc01.Dominio.*;
import iso_bc01.Presentacion.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenido al Sistema de Biblioteca ===");

        // --- LOGIN ---
        IULogin uiLogin = new IULogin();
        System.out.println("Iniciando sesión...");
        // Simulamos autenticación exitosa
        Usuario usuario = new Usuario("admin", "1234");
        System.out.println("Usuario autenticado: " + usuario.get_username());

        // --- BÚSQUEDA DE MATERIAL ---
        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IUReservarMaterial reservar = new IUReservarMaterial();
            Reserva reserva = reservar.capturarDatos();
            System.out.println("✅ Reserva realizada con éxito para: " + material.getTitulo());

            // --- PRÉSTAMO ---
            IUPrestamos uiPrestamos = new IUPrestamos();
            Prestamo prestamo = uiPrestamos.solicitarPrestamo(12345, material.getTitulo());
            System.out.println(uiPrestamos.mostrarResultados("Préstamo creado para " + material.getTitulo()));

            // --- DEVOLUCIÓN ---
            IUDevolucion uiDevolucion = new IUDevolucion();
            Devolucion devolucion = uiDevolucion.solicitarDevolucion(12345, material.getTitulo());
            System.out.println(uiDevolucion.mostrarResultados("Devolución registrada de " + material.getTitulo()));
        } else {
            System.out.println("❌ Material no encontrado. No se puede realizar la reserva.");
        }

        // --- GESTIÓN DE ROLES ---
        System.out.println("\n=== Gestión de Roles ===");
        IUMostrarRoles uiRoles = new IUMostrarRoles();
        uiRoles.mostrarRoles();

        // --- GESTIÓN DE PERMISOS ---
        System.out.println("\n=== Gestión de Permisos ===");
        IUMostrarPermisos uiPermisos = new IUMostrarPermisos();
        uiPermisos.mostrarPermisos();

        // --- GESTIÓN DE PARÁMETROS ---
        System.out.println("\n=== Gestión de Parámetros ===");
        IUMostrarParametros uiParametros = new IUMostrarParametros();
        uiParametros.mostrarParametros();

        System.out.println("\n✅ Fin de la simulación del sistema de biblioteca.");
    }
}
