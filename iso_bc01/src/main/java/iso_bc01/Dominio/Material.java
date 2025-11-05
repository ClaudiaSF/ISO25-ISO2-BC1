package iso_bc01.Dominio;

public class Material {
    private String titulo;
    private String autor;
    private String ISBN;
    private String editorial;
    private int edicion;

    public Material(String titulo, String autor, String ISBN, String editorial, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.edicion = edicion;
    }
//getters
public String getTitulo() { return titulo; }
}
public String getAutor() { return Autor; }
}
public String getISBN() { return ISBN; }
}
public String getEditorial() { return Editorial; }
}
public String getEdicion() { return Edicion; }
}

//setters

public void setTitulo(String Titulo ) { this.titulo=Titulo ; }
}
public void setAutor(String Autor) { this.autor= Autor; }
}
public void setISBN(String isbn) { this.ISBN= isbn; }
}
public void setEditorial(String Editorial) { this.editorial= Editorial; }
}
public void setEdicion(int Edicion) { this.edicion= Edicion; }
}

