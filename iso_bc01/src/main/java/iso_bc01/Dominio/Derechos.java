package iso_bc01.Dominio;

public class Derechos {

    private int id;
    private String tipoDerecho;
    private String nivelDerecho;

    public Derechos(int id, String tipoDerecho, String nivelDerecho) {
        this.id = id;
        this.tipoDerecho = tipoDerecho;
        this.nivelDerecho = nivelDerecho;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDerecho() {
        return tipoDerecho;
    }

    public void setTipoDerecho(String tipoDerecho) {
        this.tipoDerecho = tipoDerecho;
    }

    public String getNivelDerecho() {
        return nivelDerecho;
    }

    public void setNivelDerecho(String nivelDerecho) {
        this.nivelDerecho = nivelDerecho;
    }
}
