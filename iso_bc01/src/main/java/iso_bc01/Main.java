package iso_bc01;

import java.util.List;

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
        IUBusqueda_Material uiBusqueda = new IUBusqueda_Material();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IU_ReservarMaterial reservar = new IU_ReservarMaterial();
            Reserva reserva = reservar.capturarDatos(material);
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
        IURoles uiRoles = new IURoles();
        uiRoles.mostrarRoles();

        // --- GESTIÓN DE PERMISOS ---
        System.out.println("\n=== Gestión de Permisos ===");
        IUPermisos uiPermisos = new IUPermisos();
        uiPermisos.mostrarPermisos();

        // --- GESTIÓN DE PARÁMETROS ---
        System.out.println("\n=== Gestión de Parámetros ===");
        IUParametros uiParametros = new IUParametros();
        uiParametros.mostrarParametros();

        // --- GESTIÓN DE CONSULTAR HISTORIAL ---
        System.out.println("\n=== Gestión de Consulta de Historial ===");
        IUConsultarHistorial uiHistorial = new IUConsultarHistorial();
        uiHistorial.mostrarHistorial();
        
        DocenteInvestigador docente = new DocenteInvestigador(1, "Dr. García", "garcia@uni.es");

        // --- GESTIÓN DE BIBLIOGRAFÍA ---
        System.out.println("\n=== Gestión de Bibliografía ===");
        IUGestionBibliografia uiBibliografia = new IUGestionBibliografia();
        List<Bibliografia> bibliografias = uiBibliografia.mostrarBibliografias();
        if (bibliografias.isEmpty()) {
            // fallback: mostrar a partir del docente para asegurar datos
            bibliografias = docente.verBibliografia();
        }
        for (Bibliografia b : bibliografias) {
            System.out.println("📚 " + b.getTitulo() + " - " + b.getAutor() + " (" + b.getAnio() + ")");
        }

        // --- BIBLIOGRAFÍA RECOMENDADA ---
        System.out.println("\n=== Bibliografía Recomendada ===");
        IUBibliografiaRecomendada uiBibRecomendada = new IUBibliografiaRecomendada();
        List<BibliografiaRecomendada> bibRecomendada = uiBibRecomendada.obtenerBibliografiaRecomendada();
        if (bibRecomendada.isEmpty()) {
            bibRecomendada = docente.verBibliografiaRecomendada();
        }
        for (BibliografiaRecomendada br : bibRecomendada) {
            System.out.println("⭐ " + br.getTitulo() + " (" + br.getAsignatura() + ") - " + br.getAutor());
        }

        // --- SUSCRIPCIONES A PROYECTOS ---
        System.out.println("\n=== Suscripciones a Proyectos ===");
        IUSuscripcionesProyectos uiSuscripciones = new IUSuscripcionesProyectos();
        List<Suscripcion> suscripciones = uiSuscripciones.mostrarSuscripciones();
        if (suscripciones.isEmpty()) {
            suscripciones = docente.verSuscripcionesProyectos();
        }
        for (Suscripcion s : suscripciones) {
            System.out.println("📋 Proyecto: " + s.getProyecto() + " - Estado: " + s.getEstado());
        }

        System.out.println("\n✅ Fin de la simulación del sistema de biblioteca.");

        // --- ACCESO A RECURSOS ELECTRÓNICOS ---
        System.out.println("\n=== Acceso a Recursos Electrónicos ===");

        // Usar el usuario autenticado previamente para consistencia
        Usuario estudiante = usuario;
        IUAcesso uiAcceso = new IUAcesso();
        IUDerechos uiDerechos = new IUDerechos();

        System.out.println("El usuario " + estudiante.get_username() + " solicita acceso a un recurso electrónico...");

        // 1. Verificar identidad
        GestorAcceso gestorAcceso = new GestorAcceso();
        boolean identidadOK = gestorAcceso.verificarIdentidad(estudiante);

        if (identidadOK) {
            System.out.println("Identidad verificada correctamente.");

            // 2. Comprobar derechos
            System.out.println("Comprobando derechos del usuario...");
            List<Derechos> derechos = gestorAcceso.comprobarDerechos(estudiante);

            for (Derechos d : derechos) {
                System.out.println("Derecho: " + d.getTipoAcceso() + " - Nivel: " + d.getNivelAcceso());
            }

            // 3. Mostrar acceso generado por UI
            String resultado = uiAcceso.solicitarAcceso(estudiante);
            System.out.println("Resultado final: " + resultado);

        } else {
            System.out.println("❌ Identidad no verificada. Acceso denegado.");
        }
    }
}
