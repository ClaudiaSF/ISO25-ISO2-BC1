package iso_bc01.Presentacion;

import java.util.List;
import iso_bc01.Dominio.BibliografiaRecomendada;
import iso_bc01.Dominio.GestorBibliografiaRecomendada;

public class IUBibliografiaRecomendada {

    public List<BibliografiaRecomendada> obtenerBibliografiaRecomendada() {
        System.out.println("⭐ Mostrando bibliografía recomendada...");
        GestorBibliografiaRecomendada gestor = new GestorBibliografiaRecomendada();
        if (gestor.verificarBibliografiaRecomendada()) {
            List<BibliografiaRecomendada> bibRecomendada = gestor.obtenerBibliografiaRecomendada();
            System.out.println("✅ " + bibRecomendada.size() + " recomendaciones encontradas.");
            return bibRecomendada;
        } else {
            System.out.println("❌ No se puede acceder a las recomendaciones.");
            return List.of();
        }
    }
}
