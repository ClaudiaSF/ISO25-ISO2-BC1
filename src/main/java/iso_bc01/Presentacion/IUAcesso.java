package iso_bc01.Presentacion;

import iso_bc01.Dominio.Usuario;

public class IUAcesso {

    public String solicitarAcceso(Usuario usuario) {

        System.out.println("=== Solicitud de Acceso ===");
        System.out.println("Usuario: " + usuario.get_username());

        // Simulación ficticia
        boolean identidadCorrecta = true;
        String nivelAcceso = "ALTO";

        if (identidadCorrecta) {
            System.out.println("Identidad verificada. Acceso concedido.");
            System.out.println("Nivel de acceso asignado: " + nivelAcceso);
            return "ACCESO CONCEDIDO (" + nivelAcceso + ")";
        } else {
            System.out.println("Identidad NO verificada. Acceso denegado.");
            return "ACCESO DENEGADO";
        }
    }
}
