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
        // Ejemplo: Usuario usuario = uiLogin.login();

        // --- BÚSQUEDA DE MATERIAL ---
        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IU_ReservarMaterial reservar = new IU_ReservarMaterial();
            Reserva reserva = reservar.capturarDatos();
            System.out.println("✅ Reserva realizada con éxito para: " + material.getTitulo());
        } else {
            System.out.println("❌ Material no encontrado. No se puede realizar la reserva.");
        }

        System.out.println("=== Fin del programa ===");
    }
}