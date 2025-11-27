package iso_bc01.Dominio;

public class Rol {
    private String tipoRol;
    private Usuario username;
    private String descripcion;

    public Rol(String tipoRol, Usuario username, String descripcion) {
        this.tipoRol = tipoRol;
        this.username = username;
        this.descripcion = descripcion;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public Usuario getUsername() {
        return username;
    }

    public void setUsername(Usuario username) {
        this.username = username;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
