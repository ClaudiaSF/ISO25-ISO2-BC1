package iso_bc01.Presentacion;

import java.util.List;
import iso_bc01.Dominio.Suscripcion;
import iso_bc01.Dominio.GestorSuscripciones;

public class IUSuscripcionesProyectos {

    public List<Suscripcion> mostrarSuscripciones() {
        System.out.println("📋 Mostrando suscripciones a proyectos...");
        GestorSuscripciones gestor = new GestorSuscripciones();
        if (gestor.verificarSuscripcion()) {
            List<Suscripcion> suscripciones = gestor.obtenerSuscripciones();
            System.out.println("✅ " + suscripciones.size() + " suscripciones encontradas.");
            return suscripciones;
        } else {
            System.out.println("❌ No se puede acceder a las suscripciones.");
            return List.of();
        }
    }
}
