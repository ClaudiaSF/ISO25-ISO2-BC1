package iso_bc01.Dominio;

import java.util.*;

public class GestorBibliografia {
    public boolean verificarBibliografia() {
        return true;
    }

    public List<Bibliografia> obtenerBibliografia() {
        Bibliografia b1 = new Bibliografia(1, "Clean Code", "Robert C. Martin", "2008", "978-0132350884");
        Bibliografia b2 = new Bibliografia(2, "Design Patterns", "Erich Gamma", "1994", "978-0201633610");
        Bibliografia b3 = new Bibliografia(3, "Refactoring", "Martin Fowler", "1999", "978-0201485677");
        return List.of(b1, b2, b3);
    }
}
