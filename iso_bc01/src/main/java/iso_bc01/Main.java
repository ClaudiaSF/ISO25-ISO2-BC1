package iso_bc01;

import java.util.*;
import iso_bc01.Dominio.*;
import iso_bc01.Presentacion.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bienvenido al Sistema de Biblioteca ===");

        // --- LOGIN ---
        IULogin uiLogin = new IULogin();
        System.out.println("Iniciando sesion...");
        Usuario usuario = new Usuario("admin", "1234");
        System.out.println("Usuario autenticado: " + usuario.get_username());

        // --- BÚSQUEDA DE MATERIAL ---
        IUBusquedaMaterial uiBusqueda = new IUBusquedaMaterial();
        Material material = uiBusqueda.introducirTitulo("Diseño de Software");

        if (material != null) {
            System.out.println("✅ Material encontrado: " + material.getTitulo());

            // --- RESERVA DEL MATERIAL ---
            IUReservarMaterial reservar = new IUReservarMaterial();
            Reserva reserva = reservar.capturarDatos(material);
            reservar.mostrarInformacion(reserva);
            System.out.println("✅ Reserva realizada con exito para: " + material.getTitulo());

            // --- PRÉSTAMO ---
            IUPrestamos uiPrestamos = new IUPrestamos();
            Prestamo prestamo = uiPrestamos.solicitarPrestamo(12345, material.getTitulo());
            System.out.println(uiPrestamos.mostrarResultados("Prestamo creado para " + material.getTitulo()));

            // --- DEVOLUCIÓN ---
            IUDevolucion uiDevolucion = new IUDevolucion();
            Devolucion devolucion = uiDevolucion.solicitarDevolucion(12345, material.getTitulo());
            System.out.println(uiDevolucion.mostrarResultados("Devolucion registrada de " + material.getTitulo()));
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
        List<Prestamo> historial = uiHistorial.mostrarHistorial();

        // --- GESTIÓN DE BIBLIOGRAFÍA ---
        System.out.println("\n=== Gestión de Bibliografía ===");
        IUGestionBibliografia uiBibliografia = new IUGestionBibliografia();
        List<Bibliografia> bibliografias = uiBibliografia.mostrarBibliografias();

        DocenteInvestigador docente = new DocenteInvestigador(1, "Dr. Garcia", "garcia@uni.es");
        if (bibliografias == null || bibliografias.isEmpty()) {
            bibliografias = docente.verBibliografia();
        }
        if (bibliografias != null) {
            for (Bibliografia b : bibliografias) {
                System.out.println("📚 " + b.getTitulo() + " - " + b.getAutor() + " (" + b.getAnio() + ")");
            }
        }

        // --- BIBLIOGRAFÍA RECOMENDADA ---
        System.out.println("\n=== Bibliografía Recomendada ===");
        IUBibliografiaRecomendada uiBibRecomendada = new IUBibliografiaRecomendada();
        List<BibliografiaRecomendada> bibRecomendada = uiBibRecomendada.obtenerBibliografiaRecomendada();
        if (bibRecomendada == null || bibRecomendada.isEmpty()) {
            bibRecomendada = docente.verBibliografiaRecomendada();
        }
        if (bibRecomendada != null) {
            for (BibliografiaRecomendada br : bibRecomendada) {
                System.out.println("⭐ " + br.getTitulo() + " (" + br.getAsignatura() + ") - " + br.getAutor());
            }
        }

        // --- SUSCRIPCIONES A PROYECTOS ---
        System.out.println("\n=== Suscripciones a Proyectos ===");
        IUSuscripcionesProyectos uiSuscripciones = new IUSuscripcionesProyectos();
        List<Suscripcion> suscripciones = uiSuscripciones.mostrarSuscripciones();
        if (suscripciones == null || suscripciones.isEmpty()) {
            suscripciones = docente.verSuscripcionesProyectos();
        }
        if (suscripciones != null) {
            for (Suscripcion s : suscripciones) {
                System.out.println("📋 Proyecto: " + s.getProyecto() + " - Estado: " + s.getEstado());
            }
        }

        // --- INFORME DE HARDWARE ---
        System.out.println("\n=== Informe de Hardware ===");
        IUInformeHardware uiHardware = new IUInformeHardware();
        if (uiHardware.solicitarInformeHardware(usuario)) {
            InformeHardware informeHardware = uiHardware.mostrarInforme(usuario);
            System.out.println(informeHardware.toString());
            System.out.println("\n✅ Informe de recursos de hardware generado correctamente.");
        }

        // --- INFORME ELECTRÓNICO ---
        System.out.println("\n=== Informe Electrónico ===");
        IUInformeElectronico uiElectronico = new IUInformeElectronico();
        if (uiElectronico.solicitarInformeElectronico(usuario)) {
            InformeElectronico informeElectronico = uiElectronico.mostrarInforme(usuario);
            System.out.println(informeElectronico.toString());
            System.out.println("✅ Informe electrónico generado correctamente");
        }

        // --- INFORME OPERATIVO ---
        System.out.println("\n=== Informe Operativo ===");
        IUInformesOperativos uiOperativos = new IUInformesOperativos();
        if (uiOperativos.solicitarInformeOperativo(usuario)) {
            InformeOperativo informeOperativo = uiOperativos.mostrarInforme(usuario);
            System.out.println(informeOperativo.toString() + "\n✅ Informe operativo generado correctamente.");
        }

        // --- ACCESO A RECURSOS ELECTRÓNICOS ---
        System.out.println("\n=== Acceso a Recursos Electrónicos ===");
        Usuario estudiante = usuario;
        IUAcesso uiAcceso = new IUAcesso();
        IUDerechos uiDerechos = new IUDerechos();

        System.out.println("El usuario " + estudiante.get_username() + " solicita acceso a un recurso electronico...");

        GestorAcceso gestorAcceso = new GestorAcceso();
        boolean identidadOK = gestorAcceso.verificarIdentidad(estudiante);

        if (identidadOK) {
            System.out.println("Identidad verificada correctamente.");
            List<Derechos> derechos = gestorAcceso.comprobarDerechos(estudiante);
            for (Derechos d : derechos) {
                System.out.println("Derecho: " + d.getTipoDerecho() + " - Nivel: " + d.getNivelDerecho());
            }
            String resultado = uiAcceso.solicitarAcceso(estudiante);
            System.out.println("Resultado final: " + resultado);
        } else {
            System.out.println("❌ Identidad no verificada. Acceso denegado.");
        }

        // --- GENERAR ESTADÍSTICAS ---
        System.out.println("\n=== Generar Estadísticas ===");
        IUGenerarEstadistica uiEstadistica = new IUGenerarEstadistica();
        // usamos el usuario autenticado para comprobar permisos y mostrar las estadísticas
        uiEstadistica.solicitarEstadistica(usuario);

        System.out.println("\n✅ Fin de la simulacion del sistema de biblioteca.");
    }
}

