package iso_bc01.Persistencia;

import java.sql.*;

public class MiAgente {

    // Singleton
    private static MiAgente instancia = null;
    private Connection conexion;

    // Constructor privado para singleton
    private MiAgente() {
        conectar();
    }

    // Método estático para obtener la instancia
    public static MiAgente getAgente() {
        if (instancia == null) {
            instancia = new MiAgente();
        }
        return instancia;
    }

    // Conexión a la base de datos
    private void conectar() {
        try {
            // Cambia estos datos por los de tu BD
            String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
            String user = "usuario";
            String password = "contraseña";
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retorna la conexión para uso externo
    public Connection getConnection() {
        return conexion;
    }

    // Métodos para operaciones SQL
    public int insert(String SQL) throws SQLException {
        try (Statement stmt = conexion.createStatement()) {
            return stmt.executeUpdate(SQL);
        }
    }

    public ResultSet select(String SQL) throws SQLException {
        Statement stmt = conexion.createStatement();
        return stmt.executeQuery(SQL);
    }

    public int update(String SQL) throws SQLException {
        try (Statement stmt = conexion.createStatement()) {
            return stmt.executeUpdate(SQL);
        }
    }

    public int delete(String SQL) throws SQLException {
        try (Statement stmt = conexion.createStatement()) {
            return stmt.executeUpdate(SQL);
        }
    }
}
