package iso_bc01.Dominio;

public class Permiso {
    private String tipoPermiso;
    private Usuario username;
    private int cantidadPermisos;

    public Permiso(String tipoPermiso, Usuario username, int cantidadPermisos) {
        this.tipoPermiso = tipoPermiso;
        this.username = username;
        this.cantidadPermisos = cantidadPermisos;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public Usuario getUsername() {
        return username;
    }

    public void setUsername(Usuario username) {
        this.username = username;
    }

    public int getCantidadPermisos() {
        return cantidadPermisos;
    }

    public void setCantidadPermisos(int cantidadPermisos) {
        this.cantidadPermisos = cantidadPermisos;
    }
}

