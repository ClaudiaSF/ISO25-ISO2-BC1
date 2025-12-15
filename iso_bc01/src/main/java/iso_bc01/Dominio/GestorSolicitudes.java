package iso_bc01.Dominio;

import java.util.*;

public class GestorSolicitudes {
    public Solicitud crearSolicitud(String tipoMaterial, Estudiante estudiante) {
        int id = (int)(Math.random()*1000)+1;
        String tipo = tipoMaterial == null ? "Generico" : tipoMaterial;
        String fecha = java.time.LocalDate.now().toString();
        return new Solicitud(id, estudiante, tipo, fecha);
    }

    public int comprobarTipoMaterial(String tipoMaterial) {
        if (tipoMaterial == null) return 0;
        if (tipoMaterial.toLowerCase().contains("libro")) return 1;
        if (tipoMaterial.toLowerCase().contains("revista")) return 2;
        return 0;
    }

    public List<Solicitud> obtenerSolicitud(int idEstudiante) {
        return new ArrayList<>();
    }
}
