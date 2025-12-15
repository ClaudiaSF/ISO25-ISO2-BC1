package iso_bc01.Presentacion;

import iso_bc01.Dominio.InformeHardware;
import iso_bc01.Dominio.Usuario;

public class IUInformeHardware {

    public boolean solicitarInformeHardware(Usuario usuario) {
        System.out.println("📊 Solicitando informe de hardware para " + usuario.get_username() + "...");
        return true;
    }

    public InformeHardware mostrarInforme(Usuario usuario) {
        System.out.println("✅ Generando informe de hardware...");
        InformeHardware informe = new InformeHardware(
            1, "2025-11-30", "Mensual", "se ha comprobado su funcionamiento", 45
        );
        System.out.println("Informe generado: " );
        return informe;
    }
}
