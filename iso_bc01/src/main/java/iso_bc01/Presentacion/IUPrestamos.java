package iso_bc01.Presentacion;

import iso_bc01.Dominio.Prestamo;
import iso_bc01.Dominio.Material;
import iso_bc01.Dominio.Estudiante;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IUPrestamos {

    // Solicita un préstamo (simulación)
    public Prestamo solicitarPrestamo(int idEstudiante, String tituloMaterial) {
        System.out.println("=== Crear Préstamo ===");

        // Crear estudiante ficticio
        Estudiante est = new Estudiante(
                "admin",
                "1234",
                "Juan",
                idEstudiante,
                "12345678X",
                "Pérez",
                "juan@test.com",
                null,
                null,
                null
        );

        // Crear material ficticio (solo con título)
        Material mat = new Material(
                tituloMaterial,
                "Autor desconocido",
                "ISBN",
                "Editorial",
                1,
                true,
                1,
                101
        );

        // Crear préstamo ficticio
        Prestamo p = new Prestamo();
        p.setId(1);
        p.setUnnamed_Estudiante_(est);
        p.setUnnamed_Material_(mat);
        p.setFechaInicio(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        p.setFechaLimite(LocalDate.now().plusDays(7).format(DateTimeFormatter.ISO_DATE));
        p.setDevuelto(false);

        return p;
    }

    // Muestra resultados
    public String mostrarResultados(String mensaje) {
        return "Resultado: " + mensaje;
    }
}
