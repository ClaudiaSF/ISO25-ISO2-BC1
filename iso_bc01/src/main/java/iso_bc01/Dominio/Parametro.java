package iso_bc01.Dominio;

import java.util.*;

public class Parametro {
    private String tipoParametro;
    private Usuario username;
    private int cantidadParametros;
    private List<String> idiomas;
    private List<String> horarios;
    private float limitesSesion;
    private List<String> politicasSeguridad;

    public Parametro(String tipoParametro, Usuario username, int cantidadParametros, float limitesSesion) {
        this.tipoParametro = tipoParametro;
        this.username = username;
        this.cantidadParametros = cantidadParametros;
        this.limitesSesion = limitesSesion;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public Usuario getUsername() {
        return username;
    }

    public void setUsername(Usuario username) {
        this.username = username;
    }

    public int getCantidadParametros() {
        return cantidadParametros;
    }

    public void setCantidadParametros(int cantidadParametros) {
        this.cantidadParametros = cantidadParametros;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }

    public float getLimitesSesion() {
        return limitesSesion;
    }

    public void setLimitesSesion(float limitesSesion) {
        this.limitesSesion = limitesSesion;
    }

    public List<String> getPoliticasSeguridad() {
        return politicasSeguridad;
    }

    public void setPoliticasSeguridad(List<String> politicasSeguridad) {
        this.politicasSeguridad = politicasSeguridad;
    }
}
