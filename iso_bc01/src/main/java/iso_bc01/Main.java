package iso_bc01;

import java.util.List;

import iso_bc01.Dominio.Bibliografia;
import iso_bc01.Dominio.BibliografiaRecomendada;
import iso_bc01.Dominio.Derechos;
import iso_bc01.Dominio.Devolucion;
import iso_bc01.Dominio.Estudiante;
import iso_bc01.Dominio.GestorAcceso;
import iso_bc01.Dominio.GestorBibliografia;
import iso_bc01.Dominio.GestorBibliografiaRecomendada;
import iso_bc01.Dominio.GestorBusqueda;
import iso_bc01.Dominio.GestorSolicitudes;
import iso_bc01.Dominio.GestorSuscripciones;
import iso_bc01.Dominio.Material;
import iso_bc01.Dominio.Prestamo;
import iso_bc01.Dominio.Reserva;
import iso_bc01.Dominio.Solicitud;
import iso_bc01.Dominio.Suscripcion;
import iso_bc01.Dominio.Usuario;
import iso_bc01.Presentacion.IUAcesso;
import iso_bc01.Presentacion.IUBibliografiaRecomendada;
import iso_bc01.Presentacion.IUBusquedaMaterial;
import iso_bc01.Presentacion.IUConsultarHistorial;
import iso_bc01.Presentacion.IUDerechos;
import iso_bc01.Presentacion.IUDevolucion;
import iso_bc01.Presentacion.IUGestionBibliografia;
import iso_bc01.Presentacion.IULogin;
import iso_bc01.Presentacion.IUParametros;
import iso_bc01.Presentacion.IUPermisos;
import iso_bc01.Presentacion.IUPrestamos;
import iso_bc01.Presentacion.IUReservarMaterial;
import iso_bc01.Presentacion.IURoles;
import iso_bc01.Presentacion.IUSolicitudMaterial;
import iso_bc01.Presentacion.IUSuscripcionesProyectos;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenido al Sistema de Biblioteca ===");

        // --- LOGIN ---
        IULogin uiLogin = new IULogin();
        System.out.println("Iniciando sesión...");
        // Simulamos autenticación exitosa
        Usuario usuario = new Usuario("admin", "1234");
        System.out.println("Usuario autenticado: " + usuario.get_username());

        // --- CONSULTAR CATÁLOGO GENERAL ---
        System.out.println("\n=== Consultar Catálogo General (RF 1) ===");
        IUBusquedaMaterial uiCatalogo = new IUBusquedaMaterial();
        GestorBusqueda gestorBusqueda = new GestorBusqueda();

        // --- BÚSQUEDA DE MATERIAL ---
        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IUReservarMaterial reservar = new IUReservarMaterial();
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

        // --- SOLICITAR MATERIAL NUEVO ---
        System.out.println("\n=== Solicitar Material Nuevo (RF 5) ===");
        IUSolicitudMaterial uiSolicitarMaterial = new IUSolicitudMaterial();
        Estudiante estudiante = new Estudiante("Juan Pérez", "2023001", null, 0, null, null, null, null, null, null);
        Solicitud solicitud = new Solicitud(1, estudiante, "Introducción a la Inteligencia Artificial",
                java.time.LocalDate.now().toString());
        boolean solicitudEnviada = new GestorSolicitudes().crearSolicitud("Libro", estudiante) != null;
        if (solicitudEnviada) {
            uiSolicitarMaterial.mostrarSolicitud();
        } else {
            System.out.println("❌ No se pudo enviar la solicitud de material nuevo.");
        }

        System.out.println("\n✅ Fin de la simulación del sistema de biblioteca.");

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

        System.out.println("\n✅ Fin de la simulación del sistema de biblioteca.");

        // --- ACCESO A RECURSOS ELECTRÓNICOS ---
        System.out.println("\n=== Acceso a Recursos Electrónicos ===");

        Usuario estudiante2 = new Usuario("estudiante1", "1234");
        IUAcesso uiAcceso = new IUAcesso();
        IUDerechos uiDerechos = new IUDerechos();

        System.out.println("El estudiante solicita acceso a un recurso electrónico...");

        // 1. Verificar identidad
        GestorAcceso gestorAcceso = new GestorAcceso();
        boolean identidadOK = gestorAcceso.verificarIdentidad(estudiante2);

        if (identidadOK) {
            System.out.println("Identidad verificada correctamente.");

            // 2. Comprobar derechos
            System.out.println("Comprobando derechos del usuario...");
            List<Derechos> derechos = gestorAcceso.comprobarDerechos(estudiante2);

            for (Derechos d : derechos) {
                System.out.println("Derecho: " + d.getTipoAcceso() + " - Nivel: " + d.getNivelAcceso());
            }

            // 3. Mostrar acceso generado por UI
            String resultado = uiAcceso.solicitarAcceso(estudiante2);
            System.out.println("Resultado final: " + resultado);

        } else {
            System.out.println("❌ Identidad no verificada. Acceso denegado.");
        }

        // --- GESTIÓN DE BIBLIOGRAFÍA ---
        System.out.println("\n=== Gestión de Bibliografía ===");
        IUGestionBibliografia uiBibliografia = new IUGestionBibliografia();
        GestorBibliografia gestorBibliografia = new GestorBibliografia();

        System.out.println("Listando bibliografía disponible...");
        List<Bibliografia> listaBiblio = gestorBibliografia.obtenerBibliografia();
        for (Bibliografia b : listaBiblio) {
            System.out.println("- " + b.getTitulo() + " (" + b.getAutor() + ")");
        }

        // --- BIBLIOGRAFÍA RECOMENDADA PARA ASIGNATURAS ---
        System.out.println("\n=== Bibliografía Recomendada por Asignaturas ===");
        IUBibliografiaRecomendada uiBiblioRec = new IUBibliografiaRecomendada();
        GestorBibliografiaRecomendada gestorAsignaturas = new GestorBibliografiaRecomendada();

        String asignatura = "Ingeniería de Software";
        System.out.println("Solicitando bibliografía recomendada para: " + asignatura);
        List<BibliografiaRecomendada> recomendados = gestorAsignaturas.obtenerBibliografiaRecomendada();
        uiBiblioRec.obtenerBibliografiaRecomendada();

        // --- SUSCRIPCIONES PARA PROYECTOS DE INVESTIGACIÓN ---
        System.out.println("\n=== Suscripciones para Proyectos de Investigación ===");
        IUSuscripcionesProyectos uiSuscripciones = new IUSuscripcionesProyectos();
        GestorSuscripciones gestorSuscripciones = new GestorSuscripciones();

        Suscripcion suscripcion = new Suscripcion(1, "Aplicación de ML en Bibliotecas", "Activo");
        System.out.println("Creando suscripción a recursos especializados para el proyecto: " + suscripcion.getId());

        System.out.println("\n✅ Fin de la simulación del sistema de biblioteca.");
    }

}
