package iso_bc01.Presentacion;

import iso_bc01.Dominio.Material;
import iso_bc01.Dominio.Reserva;
import iso_bc01.Dominio.Estudiante;
import java.util.*;

public class IUReservarMaterial {

    private final Scanner sc = new Scanner(System.in);

    // Crea un Material de prueba (sin pedir datos)
    public Material mostrarFormulario(String titulo) {
        System.out.println("=== " + titulo + " ===");
        System.out.println("Generando material ficticio para pruebas...");

        Material m = new Material(
                "Diseño de Software",
                "Ian Sommerville",
                "978-3-16-148410-0",
                "Pearson",
                1,
                true,
                5,
                101
        );

        System.out.println("Material encontrado: " + m.getTitulo());
        return m;
    }

    // Captura SOLO lo necesario y llena lo demás con datos ficticios
    public Reserva capturarDatos(Material material) {
        System.out.println("=== Datos de la Reserva ===");

        System.out.print("Ingrese fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        System.out.print("Ingrese hora (HH:MM): ");
        String hora = sc.nextLine();

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

        Reserva r = new Reserva();
        r.setMaterial(material);
        r.setEstudiante(est);
        r.setFecha(fecha);
        r.setHora(hora);
        r.setEstado("Pendiente");

        return r;
    }

    public void mostrarInformacion(Reserva r) {
        System.out.println("\n=== RESERVA CREADA ===");
        System.out.println("Material: " + r.getMaterial().getTitulo());
        System.out.println("Estudiante: " + r.getEstudiante().get_nombre() + " " + r.getEstudiante().get_apellidos());
        System.out.println("Fecha: " + r.getFecha());
        System.out.println("Hora: " + r.getHora());
        System.out.println("Estado: " + r.getEstado());
    }
}
