package iso_bc01.Presentacion;

import iso_bc01.Dominio.*;
import java.util.*;

public class IU_MostrarParametros {

    private gestorParametros gestor;

    public IU_MostrarParametros() {
        gestor = new gestorParametros();
    }

    public List<Parametro> mostrarParametros() {
        System.out.println("Lista de parámetros del sistema:");
        for (Parametro p : gestor.listarParametros()) {
            System.out.println("- " + p.getTipoParametro());
        }
        return gestor.listarParametros();
    }
}
