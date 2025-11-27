package iso_bc01.Dominio;

import java.util.List;

public class GestorBibliografiaRecomendada {
    public boolean verificarBibliografiaRecomendada() {
        return true;
    }

    public List<BibliografiaRecomendada> obtenerBibliografiaRecomendada() {
        BibliografiaRecomendada b1 = new BibliografiaRecomendada(1, "Libro A - R", "Autor A", "2020", "ISBN-A",
                "Lenguaje");
        BibliografiaRecomendada b2 = new BibliografiaRecomendada(2, "Libro B - R", "Autor B", "2021", "ISBN-B",
                "Matemáticas");
        BibliografiaRecomendada b3 = new BibliografiaRecomendada(3, "Libro C - R", "Autor C", "2022", "ISBN-C",
                "Ciencias");
        return List.of(b1, b2, b3);
    }

}
