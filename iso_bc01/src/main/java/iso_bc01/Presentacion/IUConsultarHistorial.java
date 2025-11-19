package iso_bc01.Presentacion;

import iso_bc01.Dominio.Prestamo;
import iso_bc01.Dominio.Material;
import iso_bc01.Dominio.Estudiante;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class IUConsultarHistorial {

    public List<Prestamo> mostrarHistorial() {
        System.out.println("=== Historial de Préstamos ===");

        List<Prestamo> historial = new ArrayList<>();

        // Crear estudiantes ficticios
        Estudiante est1 = new Estudiante(
                "admin", "1234", "Juan", 1, "12345678X", "Pérez", "juan@test.com", null, null, null
        );
        Estudiante est2 = new Estudiante(
                "user", "abcd", "Ana", 2, "87654321Y", "Gómez", "ana@test.com", null, null, null
        );

        // Crear materiales ficticios
        Material mat1 = new Material(
                "Diseño de Software", "Ian Sommerville", "978-3-16-148410-0", "Pearson", 1, true, 5, 101
        );
        Material mat2 = new Material(
                "Algoritmos", "Cormen", "978-0-262-03384-8", "MIT Press", 3, true, 3, 102
        );

        // Crear préstamos ficticios
        Prestamo p1 = new Prestamo();
        p1.setId(1);
        p1.setUnnamed_Estudiante_(est1);
        p1.setUnnamed_Material_(mat1);
        p1.setFechaInicio(LocalDate.now().minusDays(10).format(DateTimeFormatter.ISO_DATE));
        p1.setFechaLimite(LocalDate.now().minusDays(3).format(DateTimeFormatter.ISO_DATE));
        p1.setDevuelto(true);

        Prestamo p2 = new Prestamo();
        p2.setId(2);
        p2.setUnnamed_Estudiante_(est2);
        p2.setUnnamed_Material_(mat2);
        p2.setFechaInicio(LocalDate.now().minusDays(5).format(DateTimeFormatter.ISO_DATE));
        p2.setFechaLimite(LocalDate.now().plusDays(2).format(DateTimeFormatter.ISO_DATE));
        p2.setDevuelto(false);

        historial.add(p1);
        historial.add(p2);

        // Mostrar en consola
        for (Prestamo p : historial) {
            System.out.println("- Estudiante: " + p.getUnnamed_Estudiante_().getNombre() +
                               ", Material: " + p.getUnnamed_Material_().getTitulo() +
                               ", Devuelto: " + p.isDevuelto() +
                               ", Inicio: " + p.getFechaInicio() +
                               ", Límite: " + p.getFechaLimite());
        }

        return historial;
    }
}
