package iso_bc01.Dominio;

public class BibliografiaRecomendada extends Bibliografia {
    private String asignatura;

    public BibliografiaRecomendada(int id, String titulo, String autor, String anio, String enlace, String asignatura) {
        super(id, titulo, autor, anio, enlace);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
