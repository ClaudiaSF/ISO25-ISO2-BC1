package iso_bc01.Presentacion;

import iso_bc01.Dominio.InformeElectronico;
import iso_bc01.Dominio.Usuario;

public class IUInformeElectronico {

    public boolean solicitarInformeElectronico(Usuario usuario) {
        System.out.println("📚 Solicitando informe electrónico para " + usuario.get_username() + "...");
        return true;
    }

    public InformeElectronico mostrarInforme(Usuario usuario) {
        System.out.println("✅ Generando informe electrónico...");
        // ✅ Ahora con el parámetro numeroRecursos que requiere tu clase
        InformeElectronico informe = new InformeElectronico(
            2,           // id
            "2025-11-30", // fechaGeneracion
            "Mensual",    // periodo
            "Accesos a recursos electrónicos", // contenido
            1245         // numeroRecursos ✅
        );
        System.out.println("Informe electrónico generado con éxito");
        return informe;
    }
}
