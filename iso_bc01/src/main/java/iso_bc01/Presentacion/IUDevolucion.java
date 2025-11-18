package iso_bc01.Presentacion;

import iso_bc01.Dominio.Devolucion;
import iso_bc01.Dominio.Prestamo;
import iso_bc01.Dominio.Estudiante;
import iso_bc01.Dominio.Material;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IUDevolucion {

    // Solicita una devolución (simulación)
    public Devolucion solicitarDevolucion(int idEstudiante, String tituloMaterial) {
        System.out.println("=== Crear Devolución ===");

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

        // Crear material ficticio
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

        // Crear préstamo ficticio asociado a la devolución
        Prestamo prestamo = new Prestamo();
        prestamo.setId(1);
        prestamo.setUnnamed_Estudiante_(est);
        prestamo.setUnnamed_Material_(mat);
        prestamo.setFechaInicio(LocalDate.now().minusDays(7).format(DateTimeFormatter.ISO_DATE));
        prestamo.setFechaLimite(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        prestamo.setDevuelto(false);

        // Crear devolución
        Devolucion devolucion = new Devolucion();
        devolucion.setId(1);
        devolucion.setUnnamed_Estudiante_(est);
        devolucion.setUnnamed_Prestamo_(prestamo);
        devolucion.setFecha(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        devolucion.setObservaciones("Devolución registrada correctamente");

        return devolucion;
    }

    // Muestra resultados
    public String mostrarResultados(String msg) {
        return "Resultado: " + msg;
    }
}
