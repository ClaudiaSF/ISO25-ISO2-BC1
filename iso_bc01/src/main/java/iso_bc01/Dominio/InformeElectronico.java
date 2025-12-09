package iso_bc01.Dominio;

public class InformeElectronico extends InformeOperativo {
	private int numeroRecursos;
	
	public InformeElectronico(int id, String fechaGeneracion, String periodo, String contenido, int numeroRecursos) {
		super(id, fechaGeneracion, periodo, contenido);
		this.numeroRecursos = numeroRecursos;
	}

	
	public int getNumeroRecursos() {
		return numeroRecursos;
	}

	public void setNumeroRecursos(int numeroRecursos) {
		this.numeroRecursos = numeroRecursos;
	}

	@Override
	public String toString() {
		return "Numero de recursos: " + numeroRecursos + 
				", Id: " + getId() + ", Fecha Generacion: " + getFechaGeneracion() + ", Periodo: "
				+ getPeriodo() + ", Contenido: " + getContenido() ;
	}



}