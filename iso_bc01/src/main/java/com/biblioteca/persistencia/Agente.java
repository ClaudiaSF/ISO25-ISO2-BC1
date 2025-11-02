package com.biblioteca.persistencia;

import java.sql.*;

public class Agente {
    private static Agente miInstancia;
    private Connection conexion;

    private Agente() throws SQLException {
        conectar();
    }

    public static Agente getAgente() throws SQLException {
        if (miInstancia == null) {
            miInstancia = new Agente();
        }
        return miInstancia;
    }

    private void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String usuario = "root";
        String contrasena = "1234";
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }

    public int insert(String SQL) throws SQLException {
        Statement st = conexion.createStatement();
        return st.executeUpdate(SQL);
    }

    public int delete(String SQL) throws SQLException {
        Statement st = conexion.createStatement();
        return st.executeUpdate(SQL);
    }

    public ResultSet select(String SQL) throws SQLException {
        Statement st = conexion.createStatement();
        return st.executeQuery(SQL);
    }

    public int update(String SQL) throws SQLException {
        Statement st = conexion.createStatement();
        return st.executeUpdate(SQL);
    }
}

