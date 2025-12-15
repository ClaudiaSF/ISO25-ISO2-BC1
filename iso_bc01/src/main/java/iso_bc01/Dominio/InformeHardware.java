package iso_bc01.Dominio;

public class InformeHardware extends InformeOperativo {

	private int numeroEquipos;
	
	public InformeHardware(int id, String fechaGeneracion, String periodo, String contenido, int numeroEquipos) {
		super(id, fechaGeneracion, periodo, contenido);
		this.numeroEquipos = numeroEquipos;
	}

	public int getNumeroEquipos() {
		return numeroEquipos;
	}

	public void setNumeroEquipos(int numeroEquipos) {
		this.numeroEquipos = numeroEquipos;
	}

	@Override
	public String toString() {
		return "Numero de equipos: " + numeroEquipos + ", "
				+ ", ID: " + getId() + ", Fecha generacion: " + getFechaGeneracion() 
				+ ", Periodo: "+ getPeriodo() 
				+ ", Contenido: " + getContenido() ;
	}


}