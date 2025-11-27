package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;
import java.util.List;

public class IUMostrarParametros {

    private GestorParametros gestor;

    public IUMostrarParametros() {
        gestor = new GestorParametros();
    }

    public List<Parametro> mostrarParametros() {
        System.out.println("Lista de parámetros del sistema:");
        for (Parametro p : gestor.listarParametros()) {
            System.out.println("- " + p.getTipoParametro());
        }
        return gestor.listarParametros();
    }
}

