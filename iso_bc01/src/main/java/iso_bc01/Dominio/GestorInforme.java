package iso_bc01.Dominio;

public class GestorInforme {

	public boolean verificarUsuario(int aId) {
		return aId > 0;
	}

	public boolean validarSolicitud(Usuario aUsuario) {
		return aUsuario != null;
	}

	public InformeOperativo generarInformeOperativo(Usuario aUsuario) {
		return new InformeOperativo((int)(Math.random()*1000)+1, java.time.LocalDate.now().toString(), "Último mes", "Resumen operativo generado");
	}

	public InformeHardware generarInformeHardware(Usuario aUsuario) {
		return new InformeHardware((int)(Math.random()*1000)+1, java.time.LocalDate.now().toString(), "Último mes", "Informe hardware", 10);
	}

	public InformeElectronico generarInformeElectronicos(Usuario aUsuario) {
		return new InformeElectronico((int)(Math.random()*1000)+1, java.time.LocalDate.now().toString(), "Último mes", "Informe electrónico", 25);
	}
}