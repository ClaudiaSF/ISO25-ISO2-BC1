package iso_bc01.Dominio;

import iso_bc01.Persistencia.MiAgente;
import java.sql.*;

public class GestorLogin {

    public Usuario verificarCredenciales(String username, String password) {
        try {
            MiAgente agente =  MiAgente.getAgente();
            String SQL = "SELECT * FROM usuarios WHERE username='" + username +
                         "' AND password='" + password + "'";
            ResultSet rs = agente.select(SQL);
            
            if (rs.next() ) {
                return new Usuario(username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
