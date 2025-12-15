package iso_bc01.Presentacion;

import java.util.List;
import iso_bc01.Dominio.EstadisticaGlobal;
import iso_bc01.Dominio.GestorEstadisticas;
import iso_bc01.Dominio.Usuario;
import iso_bc01.Dominio.Permiso;

public class IUGenerarEstadistica {

	private GestorEstadisticas gestor = new GestorEstadisticas();

	public List<EstadisticaGlobal> mostrarEstadistica(Usuario usuarioActual) {
		List<EstadisticaGlobal> lista = gestor.generarEstadisticas();
		System.out.println("=== Estadísticas ===");
		for (EstadisticaGlobal e : lista) {
			System.out.println(e.toString());
		}
		Permiso permisoEliminar = new Permiso("Eliminar estadistica", usuarioActual, 1);
		boolean puedeBorrar = gestor.verificarPermisos(usuarioActual, permisoEliminar);
		System.out.println("Permiso para borrar: " + (puedeBorrar ? "SI" : "NO"));

		return lista;
	}

	
	public boolean solicitarEstadistica(Usuario usuarioActual) {
		try {
			mostrarEstadistica(usuarioActual);
			return true;
		} catch (Exception e) {
			System.err.println("Error al solicitar estadística: " + e.getMessage());
			return false;
		}
	}

}