package iso_bc01.Presentacion;

import java.util.*;
import iso_bc01.Dominio.Estudiante;
import iso_bc01.Dominio.Solicitud;

public class IUSolicitudMaterial {

    public List<Solicitud> mostrarSolicitud() {
        System.out.println("=== Solicitudes de Material ===");

        List<Solicitud> solicitudes = new ArrayList<>();

        // Estudiante ficticio
        Estudiante est = new Estudiante(
                "admin",
                "1234",
                "Juan",
                1,
                "12345678X",
                "Pérez",
                "juan@test.com",
                null,
                null,
                null
        );

        String fechaSolicitud = java.time.LocalDate.now().toString();

        // Crear solicitudes ficticias
        Solicitud sol1 = new Solicitud(1, est, "Libro de programación", fechaSolicitud);
        Solicitud sol2 = new Solicitud(2, est, "Material de laboratorio", fechaSolicitud);

        solicitudes.add(sol1);
        solicitudes.add(sol2);

        // Mostrar por consola
        for (Solicitud s : solicitudes) {
            System.out.println(
                    "- " + s.getTipoMaterial() + " (ID: " + s.getId() + ", Fecha: " + s.getFechaSolicitud() + ")");
        }
        return solicitudes;
    }
}
