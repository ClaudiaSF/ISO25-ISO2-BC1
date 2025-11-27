package iso_bc01.Dominio;

public class Derechos {

    private int id;
    private String tipoAcceso;
    private String nivelAcceso;

    public Derechos(int id, String tipoAcceso, String nivelAcceso) {
        this.id = id;
        this.tipoAcceso = tipoAcceso;
        this.nivelAcceso = nivelAcceso;
    }

    public void operacion() {
        throw new UnsupportedOperationException();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(String tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
