package iso_bc01.Presentacion;

import iso_bc01.Dominio.InformeOperativo;
import iso_bc01.Dominio.Usuario;

public class IUInformesOperativos {

    public boolean solicitarInformeOperativo(Usuario usuario) {
        System.out.println("⚙️ Solicitando informe operativo para " + usuario.get_username() + "...");
        return true;
    }

    public InformeOperativo mostrarInforme(Usuario usuario) {
        System.out.println("✅ Generando informe operativo...");
        InformeOperativo informe = new InformeOperativo(
            3, "2025-11-30", "Mensual", "comprobacion del sistema operativo"
        );
        System.out.println("Informe operativo generado");
        return informe;
    }
}
